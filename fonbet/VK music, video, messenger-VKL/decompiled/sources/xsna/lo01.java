package xsna;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class lo01 extends sl01 {
    public final /* synthetic */ as01 c;

    public lo01(as01 as01Var) {
        this.c = as01Var;
    }

    @Override // xsna.sl01
    public final void a() {
        synchronized (this.c.f) {
            try {
                if (this.c.k.get() > 0 && this.c.k.decrementAndGet() > 0) {
                    this.c.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                as01 as01Var = this.c;
                if (as01Var.m != null) {
                    as01Var.b.c("Unbind from service.", new Object[0]);
                    as01 as01Var2 = this.c;
                    as01Var2.a.unbindService(as01Var2.l);
                    as01 as01Var3 = this.c;
                    as01Var3.g = false;
                    as01Var3.m = null;
                    as01Var3.l = null;
                }
                this.c.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
