package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class d1z0 {
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;

    public d1z0(String str, String str2, String str3, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1z0)) {
            return false;
        }
        d1z0 d1z0Var = (d1z0) obj;
        return jl40.l(this.a, d1z0Var.a) && jl40.l(this.b, d1z0Var.b) && jl40.l(this.c, d1z0Var.c) && jl40.l(this.d, d1z0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Payload(ticketId=", this.a, ", ticketBody=", this.b, ", savedBarcode=");
        v.append(this.c);
        v.append(", nfcAvailable=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
