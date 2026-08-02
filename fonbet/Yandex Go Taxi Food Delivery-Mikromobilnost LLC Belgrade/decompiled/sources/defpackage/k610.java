package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class k610 {
    public static final k610 f = new k610("", null, null, "", false);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public k610(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k610)) {
            return false;
        }
        k610 k610Var = (k610) obj;
        return jl40.l(this.a, k610Var.a) && jl40.l(this.b, k610Var.b) && jl40.l(this.c, k610Var.c) && jl40.l(this.d, k610Var.d) && this.e == k610Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MasterCardCashbackPromoModel(title=", this.a, ", subtitle=", this.b, ", iconUrl=");
        g8e.D(v, this.c, ", bannerId=", this.d, ", isVisible=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
