package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fq51 {
    public final String a;
    public final String b;
    public final String c;

    public fq51(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq51)) {
            return false;
        }
        fq51 fq51Var = (fq51) obj;
        return jl40.l(this.a, fq51Var.a) && jl40.l(this.b, fq51Var.b) && jl40.l(this.c, fq51Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("YbCardPromoButtonInfo(title=", this.a, ", subtitle=", this.b, ", action="), this.c, Extension.C_BRAKE);
    }
}
