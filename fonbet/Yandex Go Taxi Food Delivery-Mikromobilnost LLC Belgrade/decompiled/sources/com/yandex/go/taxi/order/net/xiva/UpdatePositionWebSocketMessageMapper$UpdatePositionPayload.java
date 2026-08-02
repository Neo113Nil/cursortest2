package com.yandex.go.taxi.order.net.xiva;

import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/net/xiva/UpdatePositionWebSocketMessageMapper$UpdatePositionPayload", "", "Companion", "$serializer", "com/yandex/go/taxi/order/net/xiva/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UpdatePositionWebSocketMessageMapper$UpdatePositionPayload {
    public static final f Companion = new f();
    public final String a;
    public final UpdatePositionWebSocketMessageMapper$UpdatePositionRoute b;

    static {
        com.yandex.go.taxi.order.net.taxi.dto.response.i iVar = TaxiRouteResponse.DriverRouteGeometryPolyline.Companion;
    }

    public /* synthetic */ UpdatePositionWebSocketMessageMapper$UpdatePositionPayload(int i, String str, UpdatePositionWebSocketMessageMapper$UpdatePositionRoute updatePositionWebSocketMessageMapper$UpdatePositionRoute) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = updatePositionWebSocketMessageMapper$UpdatePositionRoute;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePositionWebSocketMessageMapper$UpdatePositionPayload)) {
            return false;
        }
        UpdatePositionWebSocketMessageMapper$UpdatePositionPayload updatePositionWebSocketMessageMapper$UpdatePositionPayload = (UpdatePositionWebSocketMessageMapper$UpdatePositionPayload) obj;
        return jl40.l(this.a, updatePositionWebSocketMessageMapper$UpdatePositionPayload.a) && jl40.l(this.b, updatePositionWebSocketMessageMapper$UpdatePositionPayload.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UpdatePositionWebSocketMessageMapper$UpdatePositionRoute updatePositionWebSocketMessageMapper$UpdatePositionRoute = this.b;
        return hashCode + (updatePositionWebSocketMessageMapper$UpdatePositionRoute != null ? updatePositionWebSocketMessageMapper$UpdatePositionRoute.hashCode() : 0);
    }

    public final String toString() {
        return "UpdatePositionPayload(orderId=" + this.a + ", route=" + this.b + Extension.C_BRAKE;
    }

    public UpdatePositionWebSocketMessageMapper$UpdatePositionPayload() {
        this.a = null;
        this.b = null;
    }
}
