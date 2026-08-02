package yads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import xsna.at6;
import xsna.dxt;
import xsna.he6;
import xsna.u8p;
import xsna.zs6;

/* loaded from: classes10.dex */
public final class gk3 {
    public final Handler a;
    public final hk3 b;

    public gk3(Handler handler, xn0 xn0Var) {
        this.a = (Handler) ni.a(handler);
        this.b = xn0Var;
    }

    public final void a(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: xsna.zxy0
                @Override // java.lang.Runnable
                public final void run() {
                    yads.gk3.this.b(str, j, j2);
                }
            });
        }
    }

    public final void b(pa0 pa0Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new xsna.e50(12, this, pa0Var));
        }
    }

    public final void c(pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        hk3 hk3Var = this.b;
        int i = mc3.a;
        xn0 xn0Var = (xn0) hk3Var;
        ((kb0) xn0Var.a.o).c(pa0Var);
        xn0Var.a.getClass();
        xn0Var.a.getClass();
    }

    public final void d(pa0 pa0Var) {
        hk3 hk3Var = this.b;
        int i = mc3.a;
        xn0 xn0Var = (xn0) hk3Var;
        xn0Var.a.getClass();
        ((kb0) xn0Var.a.o).d(pa0Var);
    }

    public final void a(String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new he6(12, this, str));
        }
    }

    public final void b(String str, long j, long j2) {
        hk3 hk3Var = this.b;
        int i = mc3.a;
        ((kb0) ((xn0) hk3Var).a.o).b(str, j, j2);
    }

    public final void a(pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new dxt(7, this, pa0Var));
        }
    }

    public final void b(String str) {
        hk3 hk3Var = this.b;
        int i = mc3.a;
        ((kb0) ((xn0) hk3Var).a.o).b(str);
    }

    public final void a(final int i, final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: xsna.xxy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.b(i, j);
                }
            });
        }
    }

    public final void c(final int i, final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: xsna.ayy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a(j, i);
                }
            });
        }
    }

    public final void a(nx0 nx0Var, va0 va0Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new u8p(this, nx0Var, va0Var, 4));
        }
    }

    public final void b(int i, long j) {
        hk3 hk3Var = this.b;
        int i2 = mc3.a;
        ((kb0) ((xn0) hk3Var).a.o).a(i, j);
    }

    public final void a(Object obj, long j) {
        hk3 hk3Var = this.b;
        int i = mc3.a;
        ((xn0) hk3Var).a(obj, j);
    }

    public final void a(long j, int i) {
        hk3 hk3Var = this.b;
        int i2 = mc3.a;
        ((kb0) ((xn0) hk3Var).a.o).b(i, j);
    }

    public final void b(nx0 nx0Var, va0 va0Var) {
        hk3 hk3Var = this.b;
        int i = mc3.a;
        hk3Var.getClass();
        xn0 xn0Var = (xn0) this.b;
        xn0Var.a.getClass();
        ((kb0) xn0Var.a.o).b(nx0Var, va0Var);
    }

    public final void a(Exception exc) {
        hk3 hk3Var = this.b;
        int i = mc3.a;
        ((kb0) ((xn0) hk3Var).a.o).c(exc);
    }

    public final void b(Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new at6(12, this, exc));
        }
    }

    public final void a(sk3 sk3Var) {
        hk3 hk3Var = this.b;
        int i = mc3.a;
        ((xn0) hk3Var).a(sk3Var);
    }

    public final void b(sk3 sk3Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new zs6(10, this, sk3Var));
        }
    }

    public final void a(final Surface surface) {
        if (this.a != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.a.post(new Runnable() { // from class: xsna.yxy0
                @Override // java.lang.Runnable
                public final void run() {
                    yads.gk3.this.a(surface, elapsedRealtime);
                }
            });
        }
    }
}
