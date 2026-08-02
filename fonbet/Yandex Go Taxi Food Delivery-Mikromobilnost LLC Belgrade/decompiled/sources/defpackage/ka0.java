package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ka0 {
    public final String a;
    public final Integer b;
    public final zzs c;
    public final String d;
    public final String e;

    public ka0(String str, Integer num, zzs zzsVar, String str2, String str3) {
        this.a = str;
        this.b = num;
        this.c = zzsVar;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka0)) {
            return false;
        }
        ka0 ka0Var = (ka0) obj;
        return jl40.l(this.a, ka0Var.a) && jl40.l(this.b, ka0Var.b) && jl40.l(this.c, ka0Var.c) && jl40.l(this.d, ka0Var.d) && jl40.l(this.e, ka0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        zzs zzsVar = this.c;
        int hashCode3 = (hashCode2 + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = n.q("AddCardParams(serviceToken=", this.b, this.a, ", regionId=", ", geoPoint=");
        q.append(this.c);
        q.append(", overrideCountryCode=");
        q.append(this.d);
        q.append(", overrideCurrencyCode=");
        return oyr.t(q, this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ ka0(zzs zzsVar, Integer num, String str) {
        this(str, num, zzsVar, null, null);
    }
}
