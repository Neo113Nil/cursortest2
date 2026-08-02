package defpackage;

import com.yandex.go.preorder.source.altpins.Alternatives$RoutePartItemDto$MultimodalBikeRoutePart;
import com.yandex.go.preorder.source.altpins.Alternatives$RoutePartItemDto$MultimodalElectroBikeRoutePart;
import com.yandex.go.preorder.source.altpins.Alternatives$RoutePartItemDto$MultimodalScooterRoutePart;
import com.yandex.go.preorder.source.altpins.Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart;
import com.yandex.go.preorder.source.altpins.Alternatives$RoutePartItemDto$MultimodalTransportRoutePart;
import com.yandex.go.preorder.source.altpins.e1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class my1 extends xqt {
    public static final my1 e = new my1();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e1.INSTANCE.serializer(), qoi0.a(e1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("scooter", Alternatives$RoutePartItemDto$MultimodalScooterRoutePart.Companion.serializer(), qoi0.a(Alternatives$RoutePartItemDto$MultimodalScooterRoutePart.class)), new f9("bike", Alternatives$RoutePartItemDto$MultimodalBikeRoutePart.Companion.serializer(), qoi0.a(Alternatives$RoutePartItemDto$MultimodalBikeRoutePart.class)), new f9("electro_bike", Alternatives$RoutePartItemDto$MultimodalElectroBikeRoutePart.Companion.serializer(), qoi0.a(Alternatives$RoutePartItemDto$MultimodalElectroBikeRoutePart.class)), new f9("transport", Alternatives$RoutePartItemDto$MultimodalTransportRoutePart.Companion.serializer(), qoi0.a(Alternatives$RoutePartItemDto$MultimodalTransportRoutePart.class)), new f9("taxi_transport", Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart.Companion.serializer(), qoi0.a(Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart.class)));
    }
}
