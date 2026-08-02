package xsna;

import android.os.Handler;
import android.os.Looper;
import xsna.t24;
import xsna.yoh0;

/* compiled from: SearchController.java */
/* loaded from: classes3.dex */
public abstract class yoh0 extends t24 {
    public final Handler k = new Handler(Looper.getMainLooper());
    public final a l = new a();
    public final xoh0 m = new t24.d() { // from class: xsna.xoh0
        @Override // xsna.t24.d
        public final void a(String str) {
            yoh0 yoh0Var = yoh0.this;
            Handler handler = yoh0Var.k;
            yoh0.a aVar = yoh0Var.l;
            handler.removeCallbacks(aVar);
            handler.postDelayed(aVar, 400L);
        }
    };
    public final i3u n = new i3u(this, 11);

    /* compiled from: SearchController.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            yoh0.this.Gn();
        }
    }

    @Override // xsna.t24
    public void Dn() {
        this.k.removeCallbacks(this.l);
    }

    public abstract void Gn();

    @Override // xsna.t24, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.j.j1(this.m);
        this.j.k0(null);
    }

    @Override // xsna.t24, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.j.l0(this.m);
        this.j.k0(this.n);
    }

    public void Fn() {
    }
}
