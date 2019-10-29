package com.app.service301

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button facebook yang di klik akan menampil kan halaman facebook.com
        btn_fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com"))
            startActivity(i)

        })

//button instagram yang akan menampilkan halaman www.instagram.com
        btn_ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.instagram.com"))
            startActivity(i)
        })


        //mendeklarasikan variabel mediaplayer dan menggil data mp3
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.yogi)

        //button yang berfungsi untuk memutar mp3
        btn_play.setOnClickListener { MediaPlayer?.start() }

        //button untuk melakukan pause
        btn_pause.setOnClickListener { MediaPlayer?.pause()}

        //button yang memberhentikan mp3
        btn_stop.setOnClickListener { MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)}





    }
    }

