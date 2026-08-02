package xsna;

/* compiled from: Snapshot.kt */
/* loaded from: classes11.dex */
public final class c160 extends dak0 {
    public final izs<Object, s3q0> e;
    public final dak0 f;

    public c160(long j, kak0 kak0Var, izs<Object, s3q0> izsVar, dak0 dak0Var) {
        super(j, kak0Var);
        this.e = izsVar;
        this.f = dak0Var;
        dak0Var.k();
    }

    @Override // xsna.dak0
    public final void c() {
        if (this.c) {
            return;
        }
        long j = this.b;
        dak0 dak0Var = this.f;
        if (j != dak0Var.g()) {
            a();
        }
        dak0Var.l();
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
        bis.p();
        throw null;
    }

    @Override // xsna.dak0
    public final void l() {
        bis.p();
        throw null;
    }

    @Override // xsna.dak0
    public final void n(muk0 muk0Var) {
        lak0 lak0Var = qak0.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // xsna.dak0
    public final dak0 u(izs izsVar) {
        return new c160(this.b, this.a, qak0.k(izsVar, this.e, true), this.f);
    }

    @Override // xsna.dak0
    public final void m() {
    }
}
