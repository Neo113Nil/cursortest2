package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$DetailedMultimodalRoute;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$DetailedTransportRoute;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$DriveRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$MasstransitPayment;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$MasstransitTickets;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$NavigatorRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$ScooterMultimodalRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$ScootersRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$SelectOffer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$TaxiOption;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$TaxiOrder;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$TaxiRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$TransportCardBind;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$TransportCardDeposit;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$TransportRoutesRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$WalkingNavigationRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.q0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class oyu extends xqt {
    public static final oyu e = new oyu();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, q0.INSTANCE.serializer(), qoi0.a(q0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("detailed_transport_route", HubItemActionV2$DetailedTransportRoute.Companion.serializer(), qoi0.a(HubItemActionV2$DetailedTransportRoute.class)), new f9("taxi_redirect", HubItemActionV2$TaxiRedirect.Companion.serializer(), qoi0.a(HubItemActionV2$TaxiRedirect.class)), new f9("drive_redirect", HubItemActionV2$DriveRedirect.Companion.serializer(), qoi0.a(HubItemActionV2$DriveRedirect.class)), new f9("scooters_redirect", HubItemActionV2$ScootersRedirect.Companion.serializer(), qoi0.a(HubItemActionV2$ScootersRedirect.class)), new f9("navigator_redirect", HubItemActionV2$NavigatorRedirect.Companion.serializer(), qoi0.a(HubItemActionV2$NavigatorRedirect.class)), new f9("transport_routes_redirect", HubItemActionV2$TransportRoutesRedirect.Companion.serializer(), qoi0.a(HubItemActionV2$TransportRoutesRedirect.class)), new f9("taxi_order_action", HubItemActionV2$TaxiOrder.Companion.serializer(), qoi0.a(HubItemActionV2$TaxiOrder.class)), new f9("select_offer_action", HubItemActionV2$SelectOffer.Companion.serializer(), qoi0.a(HubItemActionV2$SelectOffer.class)), new f9("walking_navigation_redirect", HubItemActionV2$WalkingNavigationRedirect.Companion.serializer(), qoi0.a(HubItemActionV2$WalkingNavigationRedirect.class)), new f9("multimodal_route_action", HubItemActionV2$DetailedMultimodalRoute.Companion.serializer(), qoi0.a(HubItemActionV2$DetailedMultimodalRoute.class)), new f9("scooter_multimodal_redirect", HubItemActionV2$ScooterMultimodalRedirect.Companion.serializer(), qoi0.a(HubItemActionV2$ScooterMultimodalRedirect.class)), new f9("masstransit_payment_action", HubItemActionV2$MasstransitPayment.Companion.serializer(), qoi0.a(HubItemActionV2$MasstransitPayment.class)), new f9("masstransit_tickets_action", HubItemActionV2$MasstransitTickets.Companion.serializer(), qoi0.a(HubItemActionV2$MasstransitTickets.class)), new f9("transport_card_bind_action", HubItemActionV2$TransportCardBind.Companion.serializer(), qoi0.a(HubItemActionV2$TransportCardBind.class)), new f9("transport_card_deposit_action", HubItemActionV2$TransportCardDeposit.Companion.serializer(), qoi0.a(HubItemActionV2$TransportCardDeposit.class)), new f9("taxi_option_action", HubItemActionV2$TaxiOption.Companion.serializer(), qoi0.a(HubItemActionV2$TaxiOption.class)));
    }
}
