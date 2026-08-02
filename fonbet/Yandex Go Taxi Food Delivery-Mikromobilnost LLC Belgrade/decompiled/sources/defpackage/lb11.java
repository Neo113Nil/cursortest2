package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.analytic.TransportVerticalAnalytics$TransportCardStatus;

/* loaded from: classes6.dex */
public final class lb11 {
    public final String a;
    public final TransportVerticalAnalytics$TransportCardStatus b;
    public final kb11 c;
    public final MapBuilder d;

    public lb11(String str, TransportVerticalAnalytics$TransportCardStatus transportVerticalAnalytics$TransportCardStatus, kb11 kb11Var) {
        this.a = str;
        this.b = transportVerticalAnalytics$TransportCardStatus;
        this.c = kb11Var;
        MapBuilder mapBuilder = new MapBuilder();
        if (str != null) {
            mapBuilder.put("card_id", str);
        }
        if (transportVerticalAnalytics$TransportCardStatus != null) {
            mapBuilder.put("card_status", transportVerticalAnalytics$TransportCardStatus.getEventValue());
        }
        if (kb11Var != null) {
            mapBuilder.put("card_balance", kb11Var.d);
        }
        this.d = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb11)) {
            return false;
        }
        lb11 lb11Var = (lb11) obj;
        return jl40.l(this.a, lb11Var.a) && this.b == lb11Var.b && jl40.l(this.c, lb11Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TransportVerticalAnalytics$TransportCardStatus transportVerticalAnalytics$TransportCardStatus = this.b;
        int hashCode2 = (hashCode + (transportVerticalAnalytics$TransportCardStatus == null ? 0 : transportVerticalAnalytics$TransportCardStatus.hashCode())) * 31;
        kb11 kb11Var = this.c;
        return hashCode2 + (kb11Var != null ? kb11Var.hashCode() : 0);
    }

    public final String toString() {
        return "TransportCardItem(cardId=" + this.a + ", cardStatus=" + this.b + ", cardBalance=" + this.c + Extension.C_BRAKE;
    }

    public lb11() {
        this(null, null, null);
    }
}
