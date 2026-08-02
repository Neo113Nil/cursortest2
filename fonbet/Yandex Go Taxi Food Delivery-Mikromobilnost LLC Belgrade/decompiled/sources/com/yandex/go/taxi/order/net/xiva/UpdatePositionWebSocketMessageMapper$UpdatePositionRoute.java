package com.yandex.go.taxi.order.net.xiva;

import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/net/xiva/UpdatePositionWebSocketMessageMapper$UpdatePositionRoute", "", "Companion", "$serializer", "com/yandex/go/taxi/order/net/xiva/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UpdatePositionWebSocketMessageMapper$UpdatePositionRoute {
    public static final g Companion = new g();
    public final TaxiRouteResponse.DriverInfo a;
    public final UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry b;

    static {
        com.yandex.go.taxi.order.net.taxi.dto.response.i iVar = TaxiRouteResponse.DriverRouteGeometryPolyline.Companion;
    }

    public /* synthetic */ UpdatePositionWebSocketMessageMapper$UpdatePositionRoute(int i, TaxiRouteResponse.DriverInfo driverInfo, UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry updatePositionWebSocketMessageMapper$UpdatePositionGeometry) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = driverInfo;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = updatePositionWebSocketMessageMapper$UpdatePositionGeometry;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePositionWebSocketMessageMapper$UpdatePositionRoute)) {
            return false;
        }
        UpdatePositionWebSocketMessageMapper$UpdatePositionRoute updatePositionWebSocketMessageMapper$UpdatePositionRoute = (UpdatePositionWebSocketMessageMapper$UpdatePositionRoute) obj;
        return jl40.l(this.a, updatePositionWebSocketMessageMapper$UpdatePositionRoute.a) && jl40.l(this.b, updatePositionWebSocketMessageMapper$UpdatePositionRoute.b);
    }

    public final int hashCode() {
        TaxiRouteResponse.DriverInfo driverInfo = this.a;
        int hashCode = (driverInfo == null ? 0 : driverInfo.hashCode()) * 31;
        UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry updatePositionWebSocketMessageMapper$UpdatePositionGeometry = this.b;
        return hashCode + (updatePositionWebSocketMessageMapper$UpdatePositionGeometry != null ? updatePositionWebSocketMessageMapper$UpdatePositionGeometry.hashCode() : 0);
    }

    public final String toString() {
        return "UpdatePositionRoute(driver=" + this.a + ", geometry=" + this.b + Extension.C_BRAKE;
    }

    public UpdatePositionWebSocketMessageMapper$UpdatePositionRoute() {
        this.a = null;
        this.b = null;
    }
}
