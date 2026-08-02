package xsna;

/* compiled from: Snapshot.kt */
/* loaded from: classes11.dex */
public final class nop0 extends dak0 {
    public final dak0 e;
    public final boolean f;
    public final boolean g;
    public izs<Object, s3q0> h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nop0(dak0 dak0Var, izs<Object, s3q0> izsVar, boolean z, boolean z2) {
        super(0L, kak0.f);
        izs<Object, s3q0> e;
        lak0 lak0Var = qak0.a;
        this.e = dak0Var;
        this.f = z;
        this.g = z2;
        this.h = qak0.k(izsVar, (dak0Var == null || (e = dak0Var.e()) == null) ? qak0.j.e : e, z);
        this.i = ey2.f();
    }

    @Override // xsna.dak0
    public final void c() {
        dak0 dak0Var;
        this.c = true;
        if (!this.g || (dak0Var = this.e) == null) {
            return;
        }
        dak0Var.c();
    }

    @Override // xsna.dak0
    public final kak0 d() {
        return v().d();
    }

    @Override // xsna.dak0
    public final izs e() {
        return this.h;
    }

    @Override // xsna.dak0
    public final boolean f() {
        return v().f();
    }

    @Override // xsna.dak0
    public final long g() {
        return v().g();
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
    public final void m() {
        v().m();
    }

    @Override // xsna.dak0
    public final void n(muk0 muk0Var) {
        v().n(muk0Var);
    }

    @Override // xsna.dak0
    public final dak0 u(izs<Object, s3q0> izsVar) {
        izs<Object, s3q0> k = qak0.k(izsVar, this.h, true);
        return !this.f ? qak0.g(v().u(null), k, true) : v().u(k);
    }

    public final dak0 v() {
        dak0 dak0Var = this.e;
        return dak0Var == null ? qak0.j : dak0Var;
    }

    public final long w() {
        return this.i;
    }

    public final void x(izs<Object, s3q0> izsVar) {
        this.h = izsVar;
    }
}
