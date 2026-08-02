package defpackage;

/* loaded from: classes10.dex */
public final class jgv {
    public final mxf0 a;
    public final k7x0 b;

    public jgv(mxf0 mxf0Var, k7x0 k7x0Var) {
        this.a = mxf0Var;
        this.b = k7x0Var;
    }

    public final String a(n7v n7vVar) {
        if (n7vVar == null) {
            return null;
        }
        String str = n7vVar.c;
        if (str == null) {
            str = n7vVar.b;
        }
        if (str != null) {
            return ((m7x0) this.b).a(str);
        }
        return this.a.a(n7vVar.e, n7vVar.a);
    }

    public final boolean b(n7v n7vVar) {
        String a = a(n7vVar);
        return !(a == null || evu0.J(a));
    }
}
