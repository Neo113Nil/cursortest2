package xsna;

/* compiled from: Selectable.kt */
/* loaded from: classes11.dex */
final class gai0 extends d730<pai0> {
    public final boolean a;
    public final sg50 b;
    public final guw c;
    public final boolean d;
    public final boolean e;
    public final plg0 f;
    public final gzs<s3q0> g;

    public gai0() {
        throw null;
    }

    public gai0(boolean z, sg50 sg50Var, guw guwVar, boolean z2, boolean z3, plg0 plg0Var, gzs gzsVar) {
        this.a = z;
        this.b = sg50Var;
        this.c = guwVar;
        this.d = z2;
        this.e = z3;
        this.f = plg0Var;
        this.g = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gai0.class != obj.getClass()) {
            return false;
        }
        gai0 gai0Var = (gai0) obj;
        return this.a == gai0Var.a && epx.f(this.b, gai0Var.b) && epx.f(this.c, gai0Var.c) && this.d == gai0Var.d && this.e == gai0Var.e && epx.f(this.f, gai0Var.f) && this.g == gai0Var.g;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        sg50 sg50Var = this.b;
        int hashCode2 = (hashCode + (sg50Var != null ? sg50Var.hashCode() : 0)) * 31;
        guw guwVar = this.c;
        int b = qoy.b(qoy.b((hashCode2 + (guwVar != null ? guwVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        plg0 plg0Var = this.f;
        return this.g.hashCode() + ((b + (plg0Var != null ? Integer.hashCode(plg0Var.a) : 0)) * 31);
    }

    @Override // xsna.d730
    public final pai0 r() {
        pai0 pai0Var = new pai0(this.b, this.c, this.d, this.e, null, this.f, this.g);
        pai0Var.P = this.a;
        return pai0Var;
    }

    @Override // xsna.d730
    public final void s(pai0 pai0Var) {
        pai0 pai0Var2 = pai0Var;
        boolean z = pai0Var2.P;
        boolean z2 = this.a;
        if (z != z2) {
            pai0Var2.P = z2;
            itl.f(pai0Var2).R();
        }
        pai0Var2.x2(this.b, this.c, this.d, this.e, null, this.f, this.g);
    }
}
