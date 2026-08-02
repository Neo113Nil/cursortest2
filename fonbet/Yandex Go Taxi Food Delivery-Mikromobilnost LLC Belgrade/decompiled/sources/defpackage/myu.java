package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAction$DetailedTransportRoute;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAction$DriveRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAction$ScootersRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAction$TaxiRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.s;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class myu extends xqt {
    public static final myu e = new myu();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, s.INSTANCE.serializer(), qoi0.a(s.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("detailed_transport_route", HubItemAction$DetailedTransportRoute.Companion.serializer(), qoi0.a(HubItemAction$DetailedTransportRoute.class)), new f9("taxi_redirect", HubItemAction$TaxiRedirect.Companion.serializer(), qoi0.a(HubItemAction$TaxiRedirect.class)), new f9("drive_redirect", HubItemAction$DriveRedirect.Companion.serializer(), qoi0.a(HubItemAction$DriveRedirect.class)), new f9("scooters_redirect", HubItemAction$ScootersRedirect.Companion.serializer(), qoi0.a(HubItemAction$ScootersRedirect.class)));
    }
}
