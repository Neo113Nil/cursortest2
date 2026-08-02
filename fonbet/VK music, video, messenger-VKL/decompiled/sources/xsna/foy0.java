package xsna;

/* loaded from: classes13.dex */
public final class foy0 implements Runnable {
    public final /* synthetic */ szy0 b;
    public final /* synthetic */ dpy0 c;

    public foy0(dpy0 dpy0Var, szy0 szy0Var) {
        this.c = dpy0Var;
        this.b = szy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c.c) {
            this.c.a.onComplete(this.b);
        }
    }
}
