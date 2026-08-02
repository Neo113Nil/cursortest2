package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jci {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public jci(String str, String str2, String str3, String str4, String str5, String str6) {
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
        if (!(obj instanceof jci)) {
            return false;
        }
        jci jciVar = (jci) obj;
        return jl40.l(this.a, jciVar.a) && jl40.l(this.b, jciVar.b) && jl40.l(this.c, jciVar.c) && jl40.l(this.d, jciVar.d) && jl40.l(this.e, jciVar.e) && jl40.l(this.f, jciVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryIntervalsListItem(title=", this.a, ", subtitle=", this.b, ", trailTitle=");
        g8e.D(v, this.c, ", badgeText=", this.d, ", imageUrl=");
        return g8e.r(v, this.e, ", imageTag=", this.f, Extension.C_BRAKE);
    }
}
