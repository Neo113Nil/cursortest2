package xsna;

/* compiled from: HorizontalListItem.kt */
/* loaded from: classes17.dex */
public final class gev {
    public final uco a;
    public final s890 b;
    public final s890 c;

    public gev(uco ucoVar, s890 s890Var, u890 u890Var, int i) {
        ucoVar = (i & 1) != 0 ? null : ucoVar;
        u890Var = (i & 4) != 0 ? null : u890Var;
        this.a = ucoVar;
        this.b = s890Var;
        this.c = u890Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gev)) {
            return false;
        }
        gev gevVar = (gev) obj;
        return epx.f(this.a, gevVar.a) && epx.f(this.b, gevVar.b) && epx.f(this.c, gevVar.c) && pco.b(Float.NaN, Float.NaN);
    }

    public final int hashCode() {
        uco ucoVar = this.a;
        int hashCode = (ucoVar == null ? 0 : Long.hashCode(ucoVar.a)) * 31;
        s890 s890Var = this.b;
        int hashCode2 = (hashCode + (s890Var == null ? 0 : s890Var.hashCode())) * 31;
        s890 s890Var2 = this.c;
        return Float.hashCode(Float.NaN) + ((hashCode2 + (s890Var2 != null ? s890Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Params(contentSize=" + this.a + ", padding=" + this.b + ", visualContentPadding=" + this.c + ", visualAndTextGap=" + ((Object) pco.c(Float.NaN)) + ')';
    }
}
