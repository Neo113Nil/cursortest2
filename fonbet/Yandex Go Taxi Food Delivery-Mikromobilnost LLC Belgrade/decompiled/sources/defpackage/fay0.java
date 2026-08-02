package defpackage;

/* loaded from: classes6.dex */
public final class fay0 {
    public final CharSequence a;
    public final CharSequence b;
    public final obm c;
    public final String d;
    public final String e;
    public final a0c0 f;
    public final u611 g;
    public final String h;
    public final String i;

    public fay0(CharSequence charSequence, CharSequence charSequence2, obm obmVar, String str, String str2, a0c0 a0c0Var, u611 u611Var, String str3, String str4) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = obmVar;
        this.d = str;
        this.e = str2;
        this.f = a0c0Var;
        this.g = u611Var;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fay0)) {
            return false;
        }
        fay0 fay0Var = (fay0) obj;
        return jl40.l(this.a, fay0Var.a) && jl40.l(this.b, fay0Var.b) && jl40.l(this.c, fay0Var.c) && jl40.l(this.d, fay0Var.d) && jl40.l(this.e, fay0Var.e) && jl40.l(this.f, fay0Var.f) && jl40.l(this.g, fay0Var.g) && jl40.l(this.h, fay0Var.h) && jl40.l(this.i, fay0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        obm obmVar = this.c;
        int hashCode3 = (hashCode2 + (obmVar == null ? 0 : obmVar.a.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a0c0 a0c0Var = this.f;
        int hashCode6 = (hashCode5 + (a0c0Var == null ? 0 : a0c0Var.hashCode())) * 31;
        u611 u611Var = this.g;
        int hashCode7 = (hashCode6 + (u611Var == null ? 0 : u611Var.hashCode())) * 31;
        String str3 = this.h;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "TaxiSectionData(title=", ", subtitle=", ", icon=");
        r.append(this.c);
        r.append(", iconTag=");
        r.append(this.d);
        r.append(", endText=");
        r.append(this.e);
        r.append(", eta=");
        r.append(this.f);
        r.append(", feedback=");
        r.append(this.g);
        r.append(", tariffName=");
        r.append((Object) this.h);
        r.append(", price=");
        return oyr.t(r, this.i, ", durationText=null)");
    }
}
