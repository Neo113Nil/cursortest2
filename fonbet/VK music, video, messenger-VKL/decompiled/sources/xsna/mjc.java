package xsna;

/* compiled from: Clickable.kt */
/* loaded from: classes11.dex */
final class mjc extends d730<ujc> {
    public final sg50 a;
    public final guw b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final plg0 f;
    public final gzs<s3q0> g;

    public mjc() {
        throw null;
    }

    public mjc(sg50 sg50Var, guw guwVar, boolean z, boolean z2, String str, plg0 plg0Var, gzs gzsVar) {
        this.a = sg50Var;
        this.b = guwVar;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = plg0Var;
        this.g = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mjc.class != obj.getClass()) {
            return false;
        }
        mjc mjcVar = (mjc) obj;
        return epx.f(this.a, mjcVar.a) && epx.f(this.b, mjcVar.b) && this.c == mjcVar.c && this.d == mjcVar.d && epx.f(this.e, mjcVar.e) && epx.f(this.f, mjcVar.f) && this.g == mjcVar.g;
    }

    public final int hashCode() {
        sg50 sg50Var = this.a;
        int hashCode = (sg50Var != null ? sg50Var.hashCode() : 0) * 31;
        guw guwVar = this.b;
        int b = qoy.b(qoy.b((hashCode + (guwVar != null ? guwVar.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode2 = (b + (str != null ? str.hashCode() : 0)) * 31;
        plg0 plg0Var = this.f;
        return this.g.hashCode() + ((hashCode2 + (plg0Var != null ? Integer.hashCode(plg0Var.a) : 0)) * 31);
    }

    @Override // xsna.d730
    public final ujc r() {
        return new ujc(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // xsna.d730
    public final void s(ujc ujcVar) {
        ujcVar.x2(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
