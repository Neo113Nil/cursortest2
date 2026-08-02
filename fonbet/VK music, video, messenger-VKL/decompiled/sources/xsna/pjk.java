package xsna;

/* compiled from: CrossfadePlayerListener.kt */
/* loaded from: classes3.dex */
public final class pjk extends vtl {
    public final fiq c;
    public final hx40 d;
    public final aw40 e;

    public pjk(fiq fiqVar, px40 px40Var, hx40 hx40Var, aw40 aw40Var) {
        super(px40Var);
        this.c = fiqVar;
        this.d = hx40Var;
        this.e = aw40Var;
    }

    @Override // xsna.vtl, xsna.px40
    public final void i(ly40 ly40Var) {
        super.i(ly40Var);
        hx40 hx40Var = this.d;
        if (hx40Var.k) {
            return;
        }
        long j = ly40Var.b;
        fiq fiqVar = this.c;
        if (fiqVar.c() == null) {
            return;
        }
        long b = fiqVar.c().b();
        long l = hx40Var.l();
        long a = fiqVar.c().a();
        if (l < fiqVar.c().c() || !this.e.g()) {
            return;
        }
        long j2 = l - a;
        if (new q500(j2 - b, j2 + b).f(j)) {
            hx40Var.o(true);
            G();
        }
    }
}
