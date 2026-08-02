package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ox81 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public ox81(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox81)) {
            return false;
        }
        ox81 ox81Var = (ox81) obj;
        return jl40.l(this.a, ox81Var.a) && jl40.l(this.b, ox81Var.b) && jl40.l(this.c, ox81Var.c) && jl40.l(this.d, ox81Var.d) && jl40.l(this.e, ox81Var.e) && jl40.l(this.f, ox81Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AdditionalInfo(creativeId=", this.a, ", campaignId=", this.b, ", placeId=");
        g8e.D(v, this.c, ", offerId=", this.d, ", additionalText=");
        return g8e.r(v, this.e, ", performanceOpeningUrl=", this.f, Extension.C_BRAKE);
    }
}
