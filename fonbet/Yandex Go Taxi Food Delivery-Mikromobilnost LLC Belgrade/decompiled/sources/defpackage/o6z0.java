package defpackage;

/* loaded from: classes10.dex */
public final class o6z0 implements xyl0 {
    public final xyl0 a;
    public final long b;

    public o6z0(xyl0 xyl0Var, long j) {
        this.a = xyl0Var;
        this.b = j;
    }

    @Override // defpackage.xyl0
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.xyl0
    public final boolean isReady() {
        return this.a.isReady();
    }

    @Override // defpackage.xyl0
    public final int q(o7s o7sVar, nyg nygVar, int i) {
        int q = this.a.q(o7sVar, nygVar, i);
        if (q == -4) {
            nygVar.y += this.b;
        }
        return q;
    }

    @Override // defpackage.xyl0
    public final int r(long j) {
        return this.a.r(j - this.b);
    }
}
