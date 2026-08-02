package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.preorder.tollroad.analytics.RoadSelectionCardAnalytics$RouteTypeV2;

/* loaded from: classes6.dex */
public final class ptk0 {
    public final RoadSelectionCardAnalytics$RouteTypeV2 a;
    public final int b;
    public final String c;
    public final MapBuilder d;

    public ptk0(RoadSelectionCardAnalytics$RouteTypeV2 roadSelectionCardAnalytics$RouteTypeV2, int i, String str) {
        this.a = roadSelectionCardAnalytics$RouteTypeV2;
        this.b = i;
        this.c = str;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("route_type", roadSelectionCardAnalytics$RouteTypeV2.getEventValue());
        mapBuilder.put("route_time", Integer.valueOf(i));
        if (str != null) {
            mapBuilder.put("offer_id", str);
        }
        this.d = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptk0)) {
            return false;
        }
        ptk0 ptk0Var = (ptk0) obj;
        return this.a == ptk0Var.a && this.b == ptk0Var.b && jl40.l(this.c, ptk0Var.c);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteV2(routeType=");
        sb.append(this.a);
        sb.append(", routeTime=");
        sb.append(this.b);
        sb.append(", offerId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
