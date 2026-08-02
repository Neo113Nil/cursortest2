package defpackage;

import com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.response.SimplifiedPaymentStatus;
import com.yandex.go.address.models.Address;
import com.yandex.go.shortcuts.impl.experiments.OrderNotificationsSettingsExperiment;
import com.yandex.go.shortcuts.impl.experiments.b;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.experiments.orderdetails.d;
import com.yandex.go.taxi.order.models.api.cost_center.CostCenterParam$$serializer;
import com.yandex.go.taxi.order.models.api.objects.OrderPushNotification;
import com.yandex.go.taxi.order.models.api.objects.p0;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.OrderDetailsSectionTitlesExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.OrderShareSettingsExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.c;
import com.yandex.go.taxi.order.models.api.ride_support.OrderRideSupportNotification;
import com.yandex.go.taxi.order.models.api.ride_support.OrderRideSupportNotification$SupportItemDto$$serializer;
import com.yandex.go.taxi.order.models.api.ride_support.a;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.net.taxi.dto.request.OrderDraftParam$CallTypePreferences;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.orderforanother.model.FormedFrom;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

/* loaded from: classes14.dex */
public final /* synthetic */ class fs70 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ fs70(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                d dVar = OrderDetailsDriverExperiment.Companion;
                return new p53(auu0.a, 0);
            case 1:
                c cVar = OrderDetailsSectionTitlesExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 2:
                return new p53(auu0.a, 1);
            case 3:
                return new p53(Address.Companion.serializer(), 0);
            case 4:
                return new p53(auu0.a, 0);
            case 5:
                return new p53(auu0.a, 0);
            case 6:
                return OrderDraftParam$CallTypePreferences.Companion.serializer();
            case 7:
                return new p53(CostCenterParam$$serializer.INSTANCE, 0);
            case 8:
                return RequirementsParam.Companion.serializer();
            case 9:
                return new k8u(auu0.a, kbj0.a, 1);
            case 10:
                return new p53(auu0.a, 0);
            case 11:
                return vez0.g("ru.yandex.taxi.net.taxi.dto.request.OrderDraftParam.CallTypePreferences", OrderDraftParam$CallTypePreferences.values(), new String[]{"inapp_only", "prefer_dont_call"}, new Annotation[][]{null, null});
            case 12:
                return "Failed to opt order clid";
            case 13:
                return FormedFrom.Companion.serializer();
            case 14:
                return "webMessenger";
            case 15:
                return "renderOrderHolders";
            case 16:
                return "orderPromotionPopupRouter";
            case 17:
                return "mapOverlayInvalidation";
            case 18:
                vx70 vx70Var = wx70.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 19:
                return "onMasstransitRoutesError";
            case 20:
                return "Error while polling";
            case 21:
                return SimplifiedPaymentStatus.Companion.serializer();
            case 22:
                return SimplifiedPaymentStatus.Companion.serializer();
            case 23:
                b bVar = OrderNotificationsSettingsExperiment.Companion;
                return jsq0.Companion.serializer(DriveState.Companion.serializer());
            case 24:
                return "Error while observe order updates";
            case 25:
                p0 p0Var = OrderPushNotification.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 26:
                a580 a580Var = b580.Companion;
                return new p53(auu0.a, 0);
            case 27:
                a aVar = OrderRideSupportNotification.Companion;
                return new p53(OrderRideSupportNotification$SupportItemDto$$serializer.INSTANCE, 0);
            case 28:
                return "send order";
            default:
                com.yandex.go.taxi.order.models.api.response.typed_experiments.d dVar2 = OrderShareSettingsExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
        }
    }
}
