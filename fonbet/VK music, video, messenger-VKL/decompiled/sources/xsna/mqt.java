package xsna;

import com.vk.dto.profile.MetroStation;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MarketGetAddressesRequest.kt */
/* loaded from: classes15.dex */
public final class mqt {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final Map<Integer, MetroStation> c;

    public mqt(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Map map) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqt)) {
            return false;
        }
        mqt mqtVar = (mqt) obj;
        return this.a.equals(mqtVar.a) && this.b.equals(mqtVar.b) && epx.f(this.c, mqtVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf3.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetCitiesCountriesMetroStationsResponse(webCitiesMap=");
        sb.append(this.a);
        sb.append(", webCountriesMap=");
        sb.append(this.b);
        sb.append(", metroStationsMap=");
        return cjl0.a(sb, this.c, ')');
    }
}
