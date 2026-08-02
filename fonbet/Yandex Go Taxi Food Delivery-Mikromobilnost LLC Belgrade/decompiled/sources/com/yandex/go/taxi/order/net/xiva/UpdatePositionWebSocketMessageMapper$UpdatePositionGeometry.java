package com.yandex.go.taxi.order.net.xiva;

import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/net/xiva/UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry", "", "Companion", "$serializer", "com/yandex/go/taxi/order/net/xiva/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry {
    public static final e Companion = new e();
    public final String a;
    public final TaxiRouteResponse.DriverRouteGeometryPolyline b;

    static {
        com.yandex.go.taxi.order.net.taxi.dto.response.i iVar = TaxiRouteResponse.DriverRouteGeometryPolyline.Companion;
    }

    public /* synthetic */ UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry(int i, String str, TaxiRouteResponse.DriverRouteGeometryPolyline driverRouteGeometryPolyline) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = new TaxiRouteResponse.DriverRouteGeometryPolyline(0);
        } else {
            this.b = driverRouteGeometryPolyline;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry)) {
            return false;
        }
        UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry updatePositionWebSocketMessageMapper$UpdatePositionGeometry = (UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry) obj;
        return jl40.l(this.a, updatePositionWebSocketMessageMapper$UpdatePositionGeometry.a) && jl40.l(this.b, updatePositionWebSocketMessageMapper$UpdatePositionGeometry.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdatePositionGeometry(id=" + this.a + ", polyline=" + this.b + Extension.C_BRAKE;
    }

    public UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry() {
        TaxiRouteResponse.DriverRouteGeometryPolyline driverRouteGeometryPolyline = new TaxiRouteResponse.DriverRouteGeometryPolyline(0);
        this.a = null;
        this.b = driverRouteGeometryPolyline;
    }
}
