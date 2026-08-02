package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class g940 implements i940 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final String f;
    public final CharSequence g;

    public g940(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g940)) {
            return false;
        }
        g940 g940Var = (g940) obj;
        return jl40.l(this.a, g940Var.a) && jl40.l(this.b, g940Var.b) && jl40.l(this.c, g940Var.c) && jl40.l(this.d, g940Var.d) && jl40.l(this.e, g940Var.e) && jl40.l(this.f, g940Var.f) && jl40.l(this.g, g940Var.g);
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
        Boolean bool = this.e;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f;
        return this.g.hashCode() + ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OpenActivation(orderId=", this.a, ", ticketId=", this.b, ", ticketBody=");
        g8e.D(v, this.c, ", savedBarcode=", this.d, ", nfcAvailable=");
        v.append(this.e);
        v.append(", onboardingId=");
        v.append(this.f);
        v.append(", onSuccessMessageText=");
        return xvz.n(v, this.g, Extension.C_BRAKE);
    }
}
