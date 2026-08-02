package xsna;

/* compiled from: OpinionDeps.kt */
/* loaded from: classes6.dex */
public final class bt80 {
    public final ykm0 a;
    public final eu3 b;
    public final String c;
    public final v2l0 d;

    public bt80(ykm0 ykm0Var, eu3 eu3Var, String str, v2l0 v2l0Var) {
        this.a = ykm0Var;
        this.b = eu3Var;
        this.c = str;
        this.d = v2l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt80)) {
            return false;
        }
        bt80 bt80Var = (bt80) obj;
        return epx.f(this.a, bt80Var.a) && epx.f(this.b, bt80Var.b) && epx.f(this.c, bt80Var.c) && epx.f(this.d, bt80Var.d);
    }

    public final int hashCode() {
        int a = urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        v2l0 v2l0Var = this.d;
        return a + (v2l0Var == null ? 0 : v2l0Var.hashCode());
    }

    public final String toString() {
        return "OpinionDeps(dataProvider=" + this.a + ", params=" + this.b + ", style=" + this.c + ", colors=" + this.d + ')';
    }
}
