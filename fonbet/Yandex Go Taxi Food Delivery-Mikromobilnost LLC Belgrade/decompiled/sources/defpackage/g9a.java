package defpackage;

import com.yandex.go.chargers.offer.ChargersOfferOpenReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class g9a {
    public final tsa a;
    public final ChargersOfferOpenReason b;
    public final String c;

    public g9a(tsa tsaVar, ChargersOfferOpenReason chargersOfferOpenReason, String str) {
        this.a = tsaVar;
        this.b = chargersOfferOpenReason;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9a)) {
            return false;
        }
        g9a g9aVar = (g9a) obj;
        return jl40.l(this.a, g9aVar.a) && this.b == g9aVar.b && jl40.l(this.c, g9aVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Payload(stationNumber=");
        sb.append(this.a);
        sb.append(", openReason=");
        sb.append(this.b);
        sb.append(", deeplinkValue=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
