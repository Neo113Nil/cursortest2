package xsna;

/* compiled from: ClipsHostDisplayAdapter.kt */
/* loaded from: classes17.dex */
public final class ufe implements yfe, age, wfe, sfe {
    public final zfe b;
    public final bge c;
    public final xfe d;
    public final tfe e;

    public ufe(String str, urf urfVar, soe soeVar) {
        zfe zfeVar = new zfe(str, urfVar);
        bge bgeVar = new bge(str, urfVar);
        xfe xfeVar = new xfe(str, urfVar);
        tfe tfeVar = new tfe(str, soeVar);
        this.b = zfeVar;
        this.c = bgeVar;
        this.d = xfeVar;
        this.e = tfeVar;
    }

    @Override // xsna.wfe
    public final void a() {
        this.d.a();
    }

    @Override // xsna.sfe
    public final boolean b() {
        return this.e.b();
    }

    @Override // xsna.age
    public final void c(String str) {
        this.c.c(str);
    }

    @Override // xsna.wfe
    public final void j(hjj0 hjj0Var) {
        this.d.j(hjj0Var);
    }

    @Override // xsna.yfe
    public final void m(String str) {
        this.b.m(str);
    }
}
