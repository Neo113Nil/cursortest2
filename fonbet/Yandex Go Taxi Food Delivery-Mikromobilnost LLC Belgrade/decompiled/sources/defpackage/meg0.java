package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class meg0 {
    public final String a;
    public final String b;
    public final ay21 c;
    public final String d;

    public meg0(String str, String str2, ay21 ay21Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = ay21Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meg0)) {
            return false;
        }
        meg0 meg0Var = (meg0) obj;
        return jl40.l(this.a, meg0Var.a) && jl40.l(this.b, meg0Var.b) && this.c.equals(meg0Var.c) && jl40.l(this.d, meg0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Success(vehicleId=", this.a, ", qrUrl=", this.b, ", utmParams=");
        v.append(this.c);
        v.append(", fullDeeplinkUrl=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
