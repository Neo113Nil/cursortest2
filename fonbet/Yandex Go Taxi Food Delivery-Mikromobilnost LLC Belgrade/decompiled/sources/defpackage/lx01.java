package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$TransportCardStatus;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lx01 {
    public final String a;
    public final TransitRoutesHubAnalytics$TransportCardStatus b;
    public final kx01 c;
    public final MapBuilder d;

    public lx01(String str, TransitRoutesHubAnalytics$TransportCardStatus transitRoutesHubAnalytics$TransportCardStatus, kx01 kx01Var) {
        this.a = str;
        this.b = transitRoutesHubAnalytics$TransportCardStatus;
        this.c = kx01Var;
        MapBuilder mapBuilder = new MapBuilder();
        if (str != null) {
            mapBuilder.put("card_id", str);
        }
        if (transitRoutesHubAnalytics$TransportCardStatus != null) {
            mapBuilder.put("card_status", transitRoutesHubAnalytics$TransportCardStatus.getEventValue());
        }
        if (kx01Var != null) {
            mapBuilder.put("card_balance", kx01Var.d);
        }
        this.d = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx01)) {
            return false;
        }
        lx01 lx01Var = (lx01) obj;
        return jl40.l(this.a, lx01Var.a) && this.b == lx01Var.b && jl40.l(this.c, lx01Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TransitRoutesHubAnalytics$TransportCardStatus transitRoutesHubAnalytics$TransportCardStatus = this.b;
        int hashCode2 = (hashCode + (transitRoutesHubAnalytics$TransportCardStatus == null ? 0 : transitRoutesHubAnalytics$TransportCardStatus.hashCode())) * 31;
        kx01 kx01Var = this.c;
        return hashCode2 + (kx01Var != null ? kx01Var.hashCode() : 0);
    }

    public final String toString() {
        return "TransportCardItem(cardId=" + this.a + ", cardStatus=" + this.b + ", cardBalance=" + this.c + Extension.C_BRAKE;
    }

    public lx01() {
        this(null, null, null);
    }
}
