package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class khi {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public khi(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khi)) {
            return false;
        }
        khi khiVar = (khi) obj;
        return jl40.l(this.a, khiVar.a) && jl40.l(this.b, khiVar.b) && jl40.l(this.c, khiVar.c) && jl40.l(this.d, khiVar.d) && jl40.l(this.e, khiVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryPaidInsuranceSummaryListItemModel(title=", this.a, ", subtitle=", this.b, ", iconTag=");
        g8e.D(v, this.c, ", iconSymbol=", this.d, ", trailText=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
