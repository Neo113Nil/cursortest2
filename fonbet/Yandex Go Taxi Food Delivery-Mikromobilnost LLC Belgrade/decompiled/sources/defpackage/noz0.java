package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class noz0 {
    public static final noz0 e = new noz0("", null, "", null);
    public final String a;
    public final Boolean b;
    public final String c;
    public final hqz0 d;

    public noz0(String str, Boolean bool, String str2, hqz0 hqz0Var) {
        this.a = str;
        this.b = bool;
        this.c = str2;
        this.d = hqz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noz0)) {
            return false;
        }
        noz0 noz0Var = (noz0) obj;
        return jl40.l(this.a, noz0Var.a) && jl40.l(this.b, noz0Var.b) && jl40.l(this.c, noz0Var.c) && jl40.l(this.d, noz0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int b = unr0.b((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.c);
        hqz0 hqz0Var = this.d;
        return b + (hqz0Var != null ? hqz0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TollRoadDescriptionInfo(price=" + this.a + ", isAutoPayment=" + this.b + ", originalPrice=" + this.c + ", discountInfo=" + this.d + Extension.C_BRAKE;
    }
}
