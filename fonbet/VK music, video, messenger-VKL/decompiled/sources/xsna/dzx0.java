package xsna;

import android.os.Looper;

/* compiled from: Workers.java */
/* loaded from: classes3.dex */
public class dzx0 {
    public static final /* synthetic */ int g = 0;
    public volatile czx0 b;
    public Thread e;
    public boolean c = false;
    public final Object d = new Object();
    public final a f = new a();

    /* compiled from: Workers.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Looper.prepare();
            dzx0 dzx0Var = dzx0.this;
            dzx0Var.b = dzx0Var.h();
            synchronized (dzx0.this.d) {
                dzx0 dzx0Var2 = dzx0.this;
                dzx0Var2.c = true;
                dzx0Var2.d.notify();
            }
            Looper.loop();
            dzx0 dzx0Var3 = dzx0.this;
            dzx0Var3.c = false;
            dzx0Var3.b = null;
        }
    }

    public czx0 h() {
        return new czx0(this);
    }

    public final boolean i() {
        Thread thread;
        return this.c && (thread = this.e) != null && thread.isAlive();
    }

    public final void j(int i) {
        if (this.c) {
            return;
        }
        if (this.e == null) {
            this.e = new Thread(this.f, lhg.a(i, "vk-video-render-thread-"));
        }
        this.e.start();
        synchronized (this.d) {
            while (!this.c) {
                try {
                    this.d.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
