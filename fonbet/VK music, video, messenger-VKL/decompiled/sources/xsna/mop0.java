package xsna;

/* compiled from: Snapshot.kt */
/* loaded from: classes11.dex */
public final class mop0 extends uh50 {
    public final uh50 o;
    public final boolean p;
    public final boolean q;
    public izs<Object, s3q0> r;
    public izs<Object, s3q0> s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mop0(uh50 uh50Var, izs<Object, s3q0> izsVar, izs<Object, s3q0> izsVar2, boolean z, boolean z2) {
        super(0L, kak0.f, qak0.k(izsVar, (uh50Var == null || (r0 = uh50Var.e()) == null) ? qak0.j.e : r0, z), qak0.l(izsVar2, (uh50Var == null || (r9 = uh50Var.i()) == null) ? qak0.j.f : r9));
        izs<Object, s3q0> i;
        izs<Object, s3q0> e;
        lak0 lak0Var = qak0.a;
        this.o = uh50Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = ey2.f();
    }

    @Override // xsna.uh50
    public final void B(qh50<muk0> qh50Var) {
        bis.p();
        throw null;
    }

    @Override // xsna.uh50
    public final uh50 C(izs<Object, s3q0> izsVar, izs<Object, s3q0> izsVar2) {
        izs<Object, s3q0> k = qak0.k(izsVar, this.r, true);
        izs<Object, s3q0> l = qak0.l(izsVar2, this.s);
        return !this.p ? new mop0(D().C(null, l), k, l, false, true) : D().C(k, l);
    }

    public final uh50 D() {
        uh50 uh50Var = this.o;
        return uh50Var == null ? qak0.j : uh50Var;
    }

    public final long E() {
        return this.t;
    }

    public final void F(izs<Object, s3q0> izsVar) {
        this.r = izsVar;
    }

    public final void G(izs<Object, s3q0> izsVar) {
        this.s = izsVar;
    }

    @Override // xsna.uh50, xsna.dak0
    public final void c() {
        uh50 uh50Var;
        this.c = true;
        if (!this.q || (uh50Var = this.o) == null) {
            return;
        }
        uh50Var.c();
    }

    @Override // xsna.dak0
    public final kak0 d() {
        return D().d();
    }

    @Override // xsna.uh50, xsna.dak0
    public final izs e() {
        return this.r;
    }

    @Override // xsna.uh50, xsna.dak0
    public final boolean f() {
        return D().f();
    }

    @Override // xsna.dak0
    public final long g() {
        return D().g();
    }

    @Override // xsna.uh50, xsna.dak0
    public final int h() {
        return D().h();
    }

    @Override // xsna.uh50, xsna.dak0
    public final izs<Object, s3q0> i() {
        return this.s;
    }

    @Override // xsna.uh50, xsna.dak0
    public final void k() {
        bis.p();
        throw null;
    }

    @Override // xsna.uh50, xsna.dak0
    public final void l() {
        bis.p();
        throw null;
    }

    @Override // xsna.uh50, xsna.dak0
    public final void m() {
        D().m();
    }

    @Override // xsna.uh50, xsna.dak0
    public final void n(muk0 muk0Var) {
        D().n(muk0Var);
    }

    @Override // xsna.dak0
    public final void r(kak0 kak0Var) {
        bis.p();
        throw null;
    }

    @Override // xsna.dak0
    public final void s(long j) {
        bis.p();
        throw null;
    }

    @Override // xsna.uh50, xsna.dak0
    public final void t(int i) {
        D().t(i);
    }

    @Override // xsna.uh50, xsna.dak0
    public final dak0 u(izs<Object, s3q0> izsVar) {
        izs<Object, s3q0> k = qak0.k(izsVar, this.r, true);
        return !this.p ? qak0.g(D().u(null), k, true) : D().u(k);
    }

    @Override // xsna.uh50
    public final eak0 w() {
        return D().w();
    }

    @Override // xsna.uh50
    public final qh50<muk0> x() {
        return D().x();
    }

    @Override // xsna.uh50
    /* renamed from: y */
    public final izs<Object, s3q0> e() {
        return this.r;
    }
}
