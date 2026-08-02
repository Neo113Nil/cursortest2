package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class vh01 implements Runnable {
    public final /* synthetic */ v701 b;
    public final /* synthetic */ xh01 c;

    public vh01(xh01 xh01Var, v701 v701Var) {
        this.c = xh01Var;
        this.b = v701Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            try {
                this.c.b = false;
                if (!this.c.d.q()) {
                    k901 k901Var = ((mb01) this.c.d.b).j;
                    mb01.k(k901Var);
                    k901Var.p.a("Connected to remote service");
                    yh01 yh01Var = this.c.d;
                    v701 v701Var = this.b;
                    yh01Var.k();
                    exc0.i(v701Var);
                    yh01Var.g = v701Var;
                    yh01Var.v();
                    yh01Var.u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
