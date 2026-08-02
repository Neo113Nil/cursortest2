package defpackage;

/* loaded from: classes7.dex */
public final class ip71 {
    public final fe81 a;
    public final d881 b;
    public final ai71 c;

    public ip71(fe81 fe81Var, d881 d881Var) {
        ai71 ai71Var = new ai71();
        this.a = fe81Var;
        this.b = d881Var;
        this.c = ai71Var;
    }

    public final hn71 a() {
        d881 d881Var = this.b;
        qb71 qb71Var = (qb71) d881Var.q;
        if (qb71Var == null) {
            qb71Var = null;
        }
        hn71 d = this.c.d(this.a, d881Var, qb71Var);
        d.r(g771.a, "adapter");
        d.c = d881Var.i;
        return d;
    }
}
