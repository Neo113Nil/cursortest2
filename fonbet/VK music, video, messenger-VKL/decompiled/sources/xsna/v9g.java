package xsna;

/* compiled from: Clickable.kt */
/* loaded from: classes11.dex */
final class v9g extends d730<w9g> {
    public final sg50 a;
    public final guw b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final plg0 f;
    public final gzs<s3q0> g;
    public final gzs<s3q0> h;
    public final boolean i;

    public v9g() {
        throw null;
    }

    public v9g(sg50 sg50Var, guw guwVar, boolean z, boolean z2, String str, plg0 plg0Var, gzs gzsVar, gzs gzsVar2) {
        this.a = sg50Var;
        this.b = guwVar;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = plg0Var;
        this.g = gzsVar;
        this.h = gzsVar2;
        this.i = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v9g.class != obj.getClass()) {
            return false;
        }
        v9g v9gVar = (v9g) obj;
        return epx.f(this.a, v9gVar.a) && epx.f(this.b, v9gVar.b) && this.c == v9gVar.c && this.d == v9gVar.d && epx.f(this.e, v9gVar.e) && epx.f(this.f, v9gVar.f) && this.g == v9gVar.g && this.h == v9gVar.h && this.i == v9gVar.i;
    }

    public final int hashCode() {
        sg50 sg50Var = this.a;
        int hashCode = (sg50Var != null ? sg50Var.hashCode() : 0) * 31;
        guw guwVar = this.b;
        int b = qoy.b(qoy.b((hashCode + (guwVar != null ? guwVar.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode2 = (b + (str != null ? str.hashCode() : 0)) * 31;
        plg0 plg0Var = this.f;
        int a = sf3.a((hashCode2 + (plg0Var != null ? Integer.hashCode(plg0Var.a) : 0)) * 31, 961, this.g);
        gzs<s3q0> gzsVar = this.h;
        return Boolean.hashCode(this.i) + ((a + (gzsVar != null ? gzsVar.hashCode() : 0)) * 961);
    }

    @Override // xsna.d730
    public final w9g r() {
        return new w9g(this.g, this.h, this.i, this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // xsna.d730
    public final void s(w9g w9gVar) {
        boolean z;
        w9g w9gVar2 = w9gVar;
        w9gVar2.O = this.i;
        boolean z2 = w9gVar2.N == null;
        gzs<s3q0> gzsVar = this.h;
        if (z2 != (gzsVar == null)) {
            w9gVar2.n2();
            itl.f(w9gVar2).R();
            z = true;
        } else {
            z = false;
        }
        w9gVar2.N = gzsVar;
        boolean z3 = w9gVar2.w;
        boolean z4 = this.d;
        if (z3 != z4) {
            z = true;
        }
        w9gVar2.x2(this.a, this.b, this.c, z4, this.e, this.f, this.g);
        if (z) {
            tkn0 tkn0Var = w9gVar2.A;
            if (tkn0Var != null) {
                tkn0Var.x0();
                s3q0 s3q0Var = s3q0.a;
            }
            w9gVar2.y2(false);
            w9gVar2.y2(true);
        }
    }
}
