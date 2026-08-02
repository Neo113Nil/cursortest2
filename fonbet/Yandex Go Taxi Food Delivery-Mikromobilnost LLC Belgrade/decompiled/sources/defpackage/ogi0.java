package defpackage;

/* loaded from: classes4.dex */
public abstract class ogi0 {
    public lgi0 a;
    public final xr1 b;
    public final xr1 c;
    public final c06 d;

    public ogi0(xr1 xr1Var, xr1 xr1Var2, c06 c06Var) {
        this.b = xr1Var;
        this.c = xr1Var2;
        this.d = c06Var;
    }

    public final c06 a(jgi0 jgi0Var) {
        w40 b = b(jgi0Var);
        c06 c06Var = this.d;
        return new c06((u2) c06Var.a, ((kyv) b.a).n(((r87) c06Var.b).getInputStream()), 0);
    }

    public abstract w40 b(jgi0 jgi0Var);
}
