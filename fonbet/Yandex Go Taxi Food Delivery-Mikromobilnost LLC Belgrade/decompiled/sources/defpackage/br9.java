package defpackage;

import com.yandex.go.chargers.offer.ChargersOfferOpenReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class br9 {
    public final tsa a;
    public final ChargersOfferOpenReason b;
    public final String c;

    public br9(tsa tsaVar, ChargersOfferOpenReason chargersOfferOpenReason, String str) {
        this.a = tsaVar;
        this.b = chargersOfferOpenReason;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br9)) {
            return false;
        }
        br9 br9Var = (br9) obj;
        return this.a.equals(br9Var.a) && this.b == br9Var.b && jl40.l(this.c, br9Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenOffer(number=");
        sb.append(this.a);
        sb.append(", chargersOfferOpenReason=");
        sb.append(this.b);
        sb.append(", deeplinkValue=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
