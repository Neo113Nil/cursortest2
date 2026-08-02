package xsna;

/* loaded from: classes13.dex */
public final class g5o0<TResult> {
    public final szy0<TResult> a = new szy0<>();

    public final void a(Exception exc) {
        szy0<TResult> szy0Var = this.a;
        synchronized (szy0Var.a) {
            try {
                if (!szy0Var.b) {
                    szy0Var.b = true;
                    szy0Var.d = exc;
                    szy0Var.a.notifyAll();
                    szy0Var.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(TResult tresult) {
        szy0<TResult> szy0Var = this.a;
        synchronized (szy0Var.a) {
            try {
                if (!szy0Var.b) {
                    szy0Var.b = true;
                    szy0Var.c = tresult;
                    szy0Var.a.notifyAll();
                    szy0Var.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
