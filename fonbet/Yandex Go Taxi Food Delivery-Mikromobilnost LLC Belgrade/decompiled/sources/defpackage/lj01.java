package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lj01 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public lj01(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj01)) {
            return false;
        }
        lj01 lj01Var = (lj01) obj;
        return this.a.equals(lj01Var.a) && jl40.l(this.b, lj01Var.b) && jl40.l(this.c, lj01Var.c) && jl40.l(this.d, lj01Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("CrossBorderAmountData(sendingAmount=", this.a, ", receivingAmount=", this.b, ", currencyCode="), this.c, ", exchangeRate=", this.d, Extension.C_BRAKE);
    }
}
