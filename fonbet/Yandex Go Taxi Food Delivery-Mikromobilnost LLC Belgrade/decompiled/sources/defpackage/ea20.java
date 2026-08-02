package defpackage;

/* loaded from: classes4.dex */
public final class ea20 {
    public final tt5 a;
    public final String b;
    public final fa20 c;
    public final o501 d;

    public ea20(tt5 tt5Var, String str, fa20 fa20Var, o501 o501Var) {
        this.a = tt5Var;
        this.b = str;
        this.c = fa20Var;
        this.d = o501Var;
    }

    public final void a(String str, Object obj, da20 da20Var) {
        this.a.m(this.b, this.c.h(new x920(str, obj)), da20Var == null ? null : new de5(1, this, da20Var));
    }

    public final void b(ca20 ca20Var) {
        int i = 7;
        String str = this.b;
        o501 o501Var = this.d;
        tt5 tt5Var = this.a;
        if (o501Var != null) {
            tt5Var.h(str, ca20Var != null ? new ht10(i, this, ca20Var) : null, o501Var);
        } else {
            tt5Var.j(str, ca20Var != null ? new ht10(i, this, ca20Var) : null);
        }
    }

    public ea20(tt5 tt5Var, String str) {
        this(tt5Var, str, wzt0.b, null);
    }
}
