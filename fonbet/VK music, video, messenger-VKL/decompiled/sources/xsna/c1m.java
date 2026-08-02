package xsna;

/* compiled from: WindowInsetsSize.kt */
/* loaded from: classes11.dex */
public final class c1m extends k4x implements noy {
    public zpx0 r;
    public ryt0 s;
    public zpx0 t;

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        ryt0 ryt0Var = this.s;
        zpx0 zpx0Var = this.t;
        ryt0Var.getClass();
        int a = zpx0Var.a(ep10Var);
        jgp jgpVar = jgp.b;
        if (a == 0) {
            return ep10Var.Q(0, 0, jgpVar, new ht(20));
        }
        tra0 N = zo10Var.N(o6j.b(0, j, 0, a, a, 3));
        return ep10Var.Q(N.b, a, jgpVar, new o1e(N, 12));
    }

    @Override // xsna.k4x
    public final void j2() {
        this.t = new r2q(this.r, this.p);
        super.j2();
        itl.f(this).Q();
    }

    @Override // xsna.k4x
    public final zpx0 i2(zpx0 zpx0Var) {
        return zpx0Var;
    }
}
