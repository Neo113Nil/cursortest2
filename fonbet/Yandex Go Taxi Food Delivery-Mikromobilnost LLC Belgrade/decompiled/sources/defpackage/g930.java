package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class g930 {
    public final String a;
    public final j930 b;
    public final String c;
    public final Boolean d;
    public final String e;

    public g930(String str, j930 j930Var, String str2, Boolean bool, String str3) {
        this.a = str;
        this.b = j930Var;
        this.c = str2;
        this.d = bool;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g930)) {
            return false;
        }
        g930 g930Var = (g930) obj;
        return jl40.l(this.a, g930Var.a) && jl40.l(this.b, g930Var.b) && jl40.l(this.c, g930Var.c) && jl40.l(this.d, g930Var.d) && jl40.l(this.e, g930Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j930 j930Var = this.b;
        int hashCode2 = (hashCode + (j930Var == null ? 0 : j930Var.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.e;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MosmetroOtpInit(key=");
        sb.append(this.a);
        sb.append(", passwordParameters=");
        sb.append(this.b);
        sb.append(", retriesAfter=");
        tse0.A(sb, this.c, ", userRegistered=", this.d, ", phoneNumberMasked=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
