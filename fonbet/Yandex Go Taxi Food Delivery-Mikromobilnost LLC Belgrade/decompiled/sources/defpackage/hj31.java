package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hj31 {
    public final String a;
    public final String b;
    public final boolean c;
    public final v4v d;
    public final String e;
    public final ldc f;
    public final String g;
    public final ldc h;
    public final String i;

    public hj31(String str, String str2, boolean z, lvi0 lvi0Var, String str3, ldc ldcVar, String str4, ldc ldcVar2, String str5) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = lvi0Var;
        this.e = str3;
        this.f = ldcVar;
        this.g = str4;
        this.h = ldcVar2;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj31)) {
            return false;
        }
        hj31 hj31Var = (hj31) obj;
        return jl40.l(this.a, hj31Var.a) && jl40.l(this.b, hj31Var.b) && this.c == hj31Var.c && jl40.l(this.d, hj31Var.d) && jl40.l(this.e, hj31Var.e) && jl40.l(this.f, hj31Var.f) && jl40.l(this.g, hj31Var.g) && jl40.l(this.h, hj31Var.h) && this.i.equals(hj31Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int e = unr0.e((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        v4v v4vVar = this.d;
        int b = unr0.b((e + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31, 31, this.e);
        ldc ldcVar = this.f;
        int hashCode2 = (b + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ldc ldcVar2 = this.h;
        return this.i.hashCode() + ((hashCode3 + (ldcVar2 != null ? Long.hashCode(ldcVar2.a) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("VerticalTimelineItemState(leadTitle=", this.a, ", leadSubtitle=", this.b, ", isActive=");
        v.append(this.c);
        v.append(", icon=");
        v.append(this.d);
        v.append(", title=");
        v.append(this.e);
        v.append(", titleColor=");
        v.append(this.f);
        v.append(", subtitle=");
        v.append(this.g);
        v.append(", subtitleColor=");
        v.append(this.h);
        v.append(", contentDescriptionText=");
        return oyr.t(v, this.i, Extension.C_BRAKE);
    }
}
