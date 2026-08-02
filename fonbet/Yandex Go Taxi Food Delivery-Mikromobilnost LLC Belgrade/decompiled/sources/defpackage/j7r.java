package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j7r {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public j7r(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7r)) {
            return false;
        }
        j7r j7rVar = (j7r) obj;
        return jl40.l(this.a, j7rVar.a) && jl40.l(this.b, j7rVar.b) && jl40.l(this.c, j7rVar.c) && jl40.l(this.d, j7rVar.d) && jl40.l(this.e, j7rVar.e) && jl40.l(this.f, j7rVar.f) && jl40.l(this.g, j7rVar.g);
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
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("FinalizePaymentChoiceParams(paymentMethodId=", this.a, ", paymentMethodType=", this.b, ", imageUrlLight=");
        g8e.D(v, this.c, ", imageUrlDark=", this.d, ", title=");
        g8e.D(v, this.e, ", amount=", this.f, ", trustId=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
