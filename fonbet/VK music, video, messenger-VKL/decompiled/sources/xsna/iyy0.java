package xsna;

/* loaded from: classes13.dex */
public final class iyy0 implements Runnable {
    public final /* synthetic */ szy0 b;
    public final /* synthetic */ pyy0 c;

    public iyy0(pyy0 pyy0Var, szy0 szy0Var) {
        this.c = pyy0Var;
        this.b = szy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c.c) {
            this.c.a.onSuccess(this.b.e());
        }
    }
}
