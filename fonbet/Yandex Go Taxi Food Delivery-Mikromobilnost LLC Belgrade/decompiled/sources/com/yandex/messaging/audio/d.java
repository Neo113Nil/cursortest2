package com.yandex.messaging.audio;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.messaging.audio.d;
import com.yandex.messaging.views.WaveformView;
import defpackage.b1s;
import defpackage.bwu0;
import defpackage.eo1;
import defpackage.g8e;
import defpackage.ike;
import defpackage.izc0;
import defpackage.j24;
import defpackage.l1b1;
import defpackage.m810;
import defpackage.mrj;
import defpackage.nm60;
import defpackage.o400;
import defpackage.oyh0;
import defpackage.pj91;
import defpackage.rh3;
import defpackage.sh3;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tyc0;
import defpackage.uyj;
import defpackage.vqc;
import defpackage.wwu0;
import defpackage.z83;

/* loaded from: classes15.dex */
public final class d {
    public final tyc0 a;
    public final WaveformView b;
    public final TextView c;
    public final ike d;
    public final mrj e;
    public j24 f;
    public b1s g;
    public rh3 h;
    public izc0 i;

    public d(tyc0 tyc0Var, ImageView imageView, ImageView imageView2, ImageView imageView3, WaveformView waveformView, TextView textView) {
        this.a = tyc0Var;
        this.b = waveformView;
        this.c = textView;
        sjh sjhVar = uyj.a;
        this.d = g8e.f(o400.a.x);
        mrj mrjVar = new mrj(17, imageView, imageView2, imageView3);
        mrjVar.A();
        this.e = mrjVar;
        waveformView.setOnProgressChanged(new eo1(12, this));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.messaging.audio.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d dVar = d.this;
                izc0 izc0Var = dVar.i;
                if (izc0Var == null) {
                    z83.i();
                } else {
                    tyc0 tyc0Var2 = dVar.a;
                    tje.N(tyc0Var2.h, null, null, new PlayerHolder$play$1(tyc0Var2, izc0Var, null), 3);
                }
            }
        });
        final int i = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: lg3
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                d dVar = this.b;
                switch (i2) {
                    case 0:
                        dVar.a.a();
                        break;
                    default:
                        tyc0 tyc0Var2 = dVar.a;
                        e1k e1kVar = (e1k) tyc0Var2.f.get(dVar.h);
                        if (e1kVar != null) {
                            e1kVar.close();
                        }
                        dVar.e.E();
                        break;
                }
            }
        });
        final int i2 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: lg3
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        dVar.a.a();
                        break;
                    default:
                        tyc0 tyc0Var2 = dVar.a;
                        e1k e1kVar = (e1k) tyc0Var2.f.get(dVar.h);
                        if (e1kVar != null) {
                            e1kVar.close();
                        }
                        dVar.e.E();
                        break;
                }
            }
        });
        pj91.i(oyh0.f68voice_messages_play_button_chat_window_content_des, imageView);
        pj91.i(oyh0.f67voice_messages_pause_button_chat_window_content_des, imageView2);
        Uri uri = Uri.EMPTY;
        l1b1 bwu0Var = uri != null ? new bwu0(uri) : nm60.a;
        wwu0 wwu0Var = new wwu0(bwu0Var, 0L);
        bwu0Var.j(wwu0Var);
        this.h = wwu0Var;
    }

    public final void a(izc0 izc0Var) {
        this.i = izc0Var;
        if (izc0Var != null) {
            tje.N(this.d, null, null, new AudioPlayerViewController$playlist$1$1(izc0Var, this, null), 3);
        }
    }

    public final void b() {
        sh3 sh3Var = (sh3) this.h;
        int b = m810.b((((int) sh3Var.b) - ((int) sh3Var.c)) / 1000.0f);
        if (b < 0) {
            b = 0;
        }
        long a = vqc.a(0, b, 0, 11);
        this.c.setText((a / 60000) / 60 > 0 ? vqc.c(a, "HH:mm:ss") : vqc.c(a, "mm:ss"));
    }
}
