package defpackage;

import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse;
import com.yandex.go.taxi.order.net.taxi.dto.response.i;
import com.yandex.go.taxi.order.net.xiva.UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry;

/* loaded from: classes14.dex */
public final class p721 implements fk41 {
    public final String a;
    public final TaxiRouteResponse.DriverInfo b;
    public final UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry c;

    static {
        i iVar = TaxiRouteResponse.DriverRouteGeometryPolyline.Companion;
    }

    public p721(String str, TaxiRouteResponse.DriverInfo driverInfo, UpdatePositionWebSocketMessageMapper$UpdatePositionGeometry updatePositionWebSocketMessageMapper$UpdatePositionGeometry) {
        this.a = str;
        this.b = driverInfo;
        this.c = updatePositionWebSocketMessageMapper$UpdatePositionGeometry;
    }
}
