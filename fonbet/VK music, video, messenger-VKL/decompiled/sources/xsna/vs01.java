package xsna;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class vs01 extends xq01 {
    public final /* synthetic */ uvz0 c;

    public vs01(uvz0 uvz0Var) {
        this.c = uvz0Var;
    }

    @Override // xsna.xq01
    public final void c() {
        synchronized (this.c.f) {
            try {
                if (this.c.k.get() > 0 && this.c.k.decrementAndGet() > 0) {
                    this.c.b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                uvz0 uvz0Var = this.c;
                if (uvz0Var.m != null) {
                    uvz0Var.b.d("Unbind from service.", new Object[0]);
                    uvz0 uvz0Var2 = this.c;
                    uvz0Var2.a.unbindService(uvz0Var2.l);
                    uvz0 uvz0Var3 = this.c;
                    uvz0Var3.g = false;
                    uvz0Var3.m = null;
                    uvz0Var3.l = null;
                }
                this.c.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
