package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$AddDestinationElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$AddRoutePointElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$CancelElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$CompleteButtonElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$DestinationElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$DetailsElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$PaymentElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$RideSupportElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$RoutePointElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$SectionDetailElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$SourceElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$UserRequirementElement;
import com.yandex.go.taxi.order.models.api.response.a2;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class es70 extends xqt {
    public static final es70 e = new es70();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, a2.INSTANCE.serializer(), qoi0.a(a2.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("source", OrderDetailsCardResponse$CardElement$SourceElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$SourceElement.class)), new f9("add_route_point", OrderDetailsCardResponse$CardElement$AddRoutePointElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$AddRoutePointElement.class)), new f9("route_point", OrderDetailsCardResponse$CardElement$RoutePointElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$RoutePointElement.class)), new f9("add_destination", OrderDetailsCardResponse$CardElement$AddDestinationElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$AddDestinationElement.class)), new f9("destination", OrderDetailsCardResponse$CardElement$DestinationElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$DestinationElement.class)), new f9("payment_method", OrderDetailsCardResponse$CardElement$PaymentElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$PaymentElement.class)), new f9(FoldersConfig.SUPPORT_FILTER_ID, OrderDetailsCardResponse$CardElement$RideSupportElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$RideSupportElement.class)), new f9("details", OrderDetailsCardResponse$CardElement$DetailsElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$DetailsElement.class)), new f9("cancel", OrderDetailsCardResponse$CardElement$CancelElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$CancelElement.class)), new f9("section_detail", OrderDetailsCardResponse$CardElement$SectionDetailElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$SectionDetailElement.class)), new f9("requirement", OrderDetailsCardResponse$CardElement$UserRequirementElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$UserRequirementElement.class)), new f9("complete_button", OrderDetailsCardResponse$CardElement$CompleteButtonElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$CompleteButtonElement.class)), new f9("driver_phone_number", OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement.class)));
    }
}
