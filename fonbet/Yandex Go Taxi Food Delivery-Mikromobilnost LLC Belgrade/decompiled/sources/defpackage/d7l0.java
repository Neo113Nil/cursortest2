package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalBikeRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalElectroBikeRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalPedestrianRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalScooterRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalTaxiTransportRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalTransportRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.b2;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class d7l0 extends xqt {
    public static final d7l0 e = new d7l0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, b2.INSTANCE.serializer(), qoi0.a(b2.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("pedestrian", RoutePartItemDto$MultimodalPedestrianRoutePart.Companion.serializer(), qoi0.a(RoutePartItemDto$MultimodalPedestrianRoutePart.class)), new f9("scooter", RoutePartItemDto$MultimodalScooterRoutePart.Companion.serializer(), qoi0.a(RoutePartItemDto$MultimodalScooterRoutePart.class)), new f9("bike", RoutePartItemDto$MultimodalBikeRoutePart.Companion.serializer(), qoi0.a(RoutePartItemDto$MultimodalBikeRoutePart.class)), new f9("electro_bike", RoutePartItemDto$MultimodalElectroBikeRoutePart.Companion.serializer(), qoi0.a(RoutePartItemDto$MultimodalElectroBikeRoutePart.class)), new f9("transport", RoutePartItemDto$MultimodalTransportRoutePart.Companion.serializer(), qoi0.a(RoutePartItemDto$MultimodalTransportRoutePart.class)), new f9("taxi_transport", RoutePartItemDto$MultimodalTaxiTransportRoutePart.Companion.serializer(), qoi0.a(RoutePartItemDto$MultimodalTaxiTransportRoutePart.class)));
    }
}
