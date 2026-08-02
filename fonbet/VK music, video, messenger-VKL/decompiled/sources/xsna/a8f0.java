package xsna;

/* compiled from: Snapshot.kt */
/* loaded from: classes11.dex */
public final class a8f0 extends dak0 {
    public final izs<Object, s3q0> e;
    public int f;

    public a8f0(long j, kak0 kak0Var, izs<Object, s3q0> izsVar) {
        super(j, kak0Var);
        this.e = izsVar;
        this.f = 1;
    }

    @Override // xsna.dak0
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        super.c();
    }

    @Override // xsna.dak0
    public final izs e() {
        return this.e;
    }

    @Override // xsna.dak0
    public final boolean f() {
        return true;
    }

    @Override // xsna.dak0
    public final izs<Object, s3q0> i() {
        return null;
    }

    @Override // xsna.dak0
    public final void k() {
        this.f++;
    }

    @Override // xsna.dak0
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // xsna.dak0
    public final void n(muk0 muk0Var) {
        lak0 lak0Var = qak0.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // xsna.dak0
    public final dak0 u(izs<Object, s3q0> izsVar) {
        qak0.c(this);
        return new c160(this.b, this.a, qak0.k(izsVar, this.e, true), this);
    }

    @Override // xsna.dak0
    public final void m() {
    }
}
