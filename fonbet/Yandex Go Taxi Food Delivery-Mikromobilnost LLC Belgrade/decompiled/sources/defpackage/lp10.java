package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lp10 {
    public final List a;
    public final List b;
    public final String c;

    public lp10(String str, List list, List list2) {
        this.a = list;
        this.b = list2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp10)) {
            return false;
        }
        lp10 lp10Var = (lp10) obj;
        return jl40.l(this.a, lp10Var.a) && this.b.equals(lp10Var.b) && jl40.l(this.c, lp10Var.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(qv10.v("MerchantOffersPageEntity(screenItems=", this.a, ", remainingOfferIds=", this.b, ", mlRequestId="), this.c, Extension.C_BRAKE);
    }
}
