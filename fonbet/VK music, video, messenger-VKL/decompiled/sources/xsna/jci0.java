package xsna;

/* compiled from: SelectionController.kt */
/* loaded from: classes11.dex */
public final class jci0 implements huf0 {
    public final long b;
    public final mei0 c;
    public final long d;
    public lyk0 e = lyk0.d;
    public cai0 f;
    public final q630 g;

    public jci0(long j, mei0 mei0Var, long j2) {
        this.b = j;
        this.c = mei0Var;
        this.d = j2;
        gd70 gd70Var = new gd70(this, 25);
        lci0 lci0Var = new lci0(gd70Var, mei0Var, j);
        mci0 mci0Var = new mci0(gd70Var, mei0Var, j);
        kci0 kci0Var = new kci0(mci0Var, lci0Var);
        plb0 plb0Var = skn0.a;
        okn0 okn0Var = new okn0(mci0Var, lci0Var, null, kci0Var, 4);
        ulb0.a.getClass();
        this.g = e7b0.c(okn0Var, y000.c);
    }

    @Override // xsna.huf0
    public final void d() {
        cai0 cai0Var = this.f;
        if (cai0Var != null) {
            this.c.h(cai0Var);
            this.f = null;
        }
    }

    @Override // xsna.huf0
    public final void e() {
        this.f = this.c.f(new x640(this.b, new so40(this, 21), new p1d0(this, 12)));
    }

    @Override // xsna.huf0
    public final void f() {
        cai0 cai0Var = this.f;
        if (cai0Var != null) {
            this.c.h(cai0Var);
            this.f = null;
        }
    }
}
