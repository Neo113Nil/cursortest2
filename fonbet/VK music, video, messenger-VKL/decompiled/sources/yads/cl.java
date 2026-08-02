package yads;

import android.os.Handler;
import xsna.at6;
import xsna.dhs;
import xsna.he6;
import xsna.wq8;
import xsna.zs6;

/* loaded from: classes10.dex */
public final class cl {
    public final Handler a;
    public final dl b;

    public cl(Handler handler, xn0 xn0Var) {
        this.a = (Handler) ni.a(handler);
        this.b = xn0Var;
    }

    public final void a(Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new at6(11, this, exc));
        }
    }

    public final void b(Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new wq8(10, this, exc));
        }
    }

    public final void c(Exception exc) {
        dl dlVar = this.b;
        int i = mc3.a;
        ((kb0) ((xn0) dlVar).a.o).a(exc);
    }

    public final void d(Exception exc) {
        dl dlVar = this.b;
        int i = mc3.a;
        ((kb0) ((xn0) dlVar).a.o).b(exc);
    }

    public final void a(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: xsna.gmy0
                @Override // java.lang.Runnable
                public final void run() {
                    yads.cl.this.b(str, j, j2);
                }
            });
        }
    }

    public final void b(pa0 pa0Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new he6(9, this, pa0Var));
        }
    }

    public final void a(String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new xsna.e50(11, this, str));
        }
    }

    public final void b(String str, long j, long j2) {
        dl dlVar = this.b;
        int i = mc3.a;
        ((kb0) ((xn0) dlVar).a.o).a(str, j, j2);
    }

    public final void c(pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        dl dlVar = this.b;
        int i = mc3.a;
        xn0 xn0Var = (xn0) dlVar;
        ((kb0) xn0Var.a.o).a(pa0Var);
        xn0Var.a.getClass();
        xn0Var.a.getClass();
    }

    public final void d(pa0 pa0Var) {
        dl dlVar = this.b;
        int i = mc3.a;
        xn0 xn0Var = (xn0) dlVar;
        xn0Var.a.getClass();
        ((kb0) xn0Var.a.o).b(pa0Var);
    }

    public final void a(pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new zs6(9, this, pa0Var));
        }
    }

    public final void b(String str) {
        dl dlVar = this.b;
        int i = mc3.a;
        ((kb0) ((xn0) dlVar).a.o).a(str);
    }

    public final void a(nx0 nx0Var, va0 va0Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new dhs(this, nx0Var, va0Var, 4));
        }
    }

    public final void a(long j) {
        dl dlVar = this.b;
        int i = mc3.a;
        ((kb0) ((xn0) dlVar).a.o).a(j);
    }

    public final void b(nx0 nx0Var, va0 va0Var) {
        dl dlVar = this.b;
        int i = mc3.a;
        dlVar.getClass();
        xn0 xn0Var = (xn0) this.b;
        xn0Var.a.getClass();
        ((kb0) xn0Var.a.o).a(nx0Var, va0Var);
    }

    public final void a(boolean z) {
        dl dlVar = this.b;
        int i = mc3.a;
        ((xn0) dlVar).a(z);
    }

    public final void a(int i, long j, long j2) {
        dl dlVar = this.b;
        int i2 = mc3.a;
        ((kb0) ((xn0) dlVar).a.o).a(i, j, j2);
    }

    public final void b(final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: xsna.dmy0
                @Override // java.lang.Runnable
                public final void run() {
                    yads.cl.this.a(j);
                }
            });
        }
    }

    public final void b(final boolean z) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: xsna.fmy0
                @Override // java.lang.Runnable
                public final void run() {
                    yads.cl.this.a(z);
                }
            });
        }
    }

    public final void b(final int i, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: xsna.emy0
                @Override // java.lang.Runnable
                public final void run() {
                    yads.cl.this.a(i, j, j2);
                }
            });
        }
    }
}
