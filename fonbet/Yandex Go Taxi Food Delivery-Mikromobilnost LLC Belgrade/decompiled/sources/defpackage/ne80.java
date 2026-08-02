package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ne80 {
    public final ti80 a;
    public final lg80 b;
    public final String c;
    public final String d;
    public final svj e;
    public final boolean f;
    public final String g;
    public final Boolean h;

    public ne80(ti80 ti80Var, lg80 lg80Var, String str, String str2, svj svjVar, boolean z, String str3, Boolean bool) {
        this.a = ti80Var;
        this.b = lg80Var;
        this.c = str;
        this.d = str2;
        this.e = svjVar;
        this.f = z;
        this.g = str3;
        this.h = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne80)) {
            return false;
        }
        ne80 ne80Var = (ne80) obj;
        return jl40.l(this.a, ne80Var.a) && jl40.l(this.b, ne80Var.b) && jl40.l(this.c, ne80Var.c) && jl40.l(this.d, ne80Var.d) && jl40.l(this.e, ne80Var.e) && this.f == ne80Var.f && jl40.l(this.g, ne80Var.g) && jl40.l(this.h, ne80Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int e = unr0.e((this.e.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.f);
        String str3 = this.g;
        int hashCode3 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.h;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationCardFlexDataParams(id=");
        sb.append(this.a);
        sb.append(", cardMode=");
        sb.append(this.b);
        sb.append(", yclid=");
        g8e.D(sb, this.c, ", bannerId=", this.d, ", source=");
        sb.append(this.e);
        sb.append(", canShowV2Card=");
        sb.append(this.f);
        sb.append(", permalinkSource=");
        sb.append(this.g);
        sb.append(", isPaid=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public /* synthetic */ ne80(ti80 ti80Var, lg80 lg80Var, String str, String str2, svj svjVar, boolean z) {
        this(ti80Var, lg80Var, str, str2, svjVar, z, null, null);
    }
}
