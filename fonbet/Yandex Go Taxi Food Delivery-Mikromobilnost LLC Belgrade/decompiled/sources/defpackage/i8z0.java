package defpackage;

/* loaded from: classes4.dex */
public final class i8z0 extends o2 {
    public final l2 a = new l2(1);
    public final nt10 b;
    public final l2 c;
    public final w1 w;
    public final gzo x;

    public i8z0(nt10 nt10Var, l2 l2Var, w1 w1Var, gzo gzoVar) {
        this.b = nt10Var;
        this.c = l2Var;
        this.w = w1Var;
        this.x = gzoVar;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(6);
        c2Var.a(this.a);
        c2Var.a(this.b);
        l2 l2Var = this.c;
        if (l2Var != null) {
            c2Var.a(l2Var);
        }
        w1 w1Var = this.w;
        if (w1Var != null && w1Var.y()) {
            c2Var.a(w1Var);
        }
        gzo gzoVar = this.x;
        if (gzoVar != null) {
            c2Var.a(new oqf(2, 128, 0, gzoVar, 0));
        }
        return new jqf(c2Var);
    }
}
