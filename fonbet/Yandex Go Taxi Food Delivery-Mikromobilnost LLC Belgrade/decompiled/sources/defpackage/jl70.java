package defpackage;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemDto$$serializer;
import com.yandex.go.masstransit.sdk.order.impl.orders.OrderDetailPresentationDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.p;
import com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders;
import com.yandex.go.taxi.order.chat.api.data.model.Message$$serializer;
import com.yandex.go.taxi.order.chat.api.data.model.OrderChatResponse;
import com.yandex.go.taxi.order.chat.api.data.model.Suggestion$$serializer;
import com.yandex.go.taxi.order.chat.api.data.model.e;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsButtonExperiment;
import com.yandex.go.taxi.order.experiments.orderdetails.a;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification$Button$$serializer;
import com.yandex.go.taxi.order.models.api.cancel.f0;
import com.yandex.go.taxi.order.models.api.cancel.j0;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto$ChangesPayload$$serializer;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto$PendingChangeDto$$serializer;
import com.yandex.go.taxi.order.models.api.response.OrderCommitResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.a1;
import com.yandex.go.taxi.order.models.api.response.a2;
import com.yandex.go.taxi.order.models.api.response.b1;
import com.yandex.go.taxi.order.models.api.response.d1;
import com.yandex.go.taxi.order.models.api.response.e2;
import com.yandex.go.taxi.order.models.api.response.h1;
import com.yandex.go.taxi.order.models.api.response.l1;
import com.yandex.go.taxi.order.models.api.response.m1;
import com.yandex.go.taxi.order.models.api.response.y0;
import com.yandex.go.taxi.order.models.api.response.z0;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final /* synthetic */ class jl70 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ jl70(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                f0 f0Var = OrderCancelNotification.Buttons.Companion;
                return new p53(OrderCancelNotification$Button$$serializer.INSTANCE, 0);
            case 1:
                j0 j0Var = OrderCancelNotification.Style.Companion;
                return OrderCancelNotification.Style.IconAlignment.Companion.serializer();
            case 2:
                return vez0.g("com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification.Style.IconAlignment", OrderCancelNotification.Style.IconAlignment.values(), new String[]{"leading", "center", "full_size"}, new Annotation[][]{null, null, null});
            case 3:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderCancelPresenter");
            case 4:
                return "error create cancel state";
            case 5:
                z0 z0Var = OrderChangesDto.Companion;
                return new p53(OrderChangesDto$ChangesPayload$$serializer.INSTANCE, 0);
            case 6:
                y0 y0Var = OrderChangesDto.ChangesPayload.Companion;
                return new p53(OrderChangesDto$PendingChangeDto$$serializer.INSTANCE, 0);
            case 7:
                a1 a1Var = OrderChangesDto.Notification.Companion;
                return ChangeOrderNotificationActionResponse.Companion.serializer();
            case 8:
                b1 b1Var = OrderChangesDto.PendingChangeDto.Companion;
                return OrderChangesDto.Status.Companion.serializer();
            case 9:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.OrderChangesDto.Status", OrderChangesDto.Status.values(), new String[]{"success", "pending", "failed", "unavailable"}, new Annotation[][]{null, null, null, null});
            case 10:
                e eVar = OrderChatResponse.Companion;
                return new p53(Message$$serializer.INSTANCE, 0);
            case 11:
                e eVar2 = OrderChatResponse.Companion;
                return new p53(Suggestion$$serializer.INSTANCE, 0);
            case 12:
                e eVar3 = OrderChatResponse.Companion;
                return new p53(auu0.a, 0);
            case 13:
                return new p53(auu0.a, 0);
            case 14:
                d1 d1Var = OrderCommitResponse.Companion;
                return DriveState.Companion.serializer();
            case 15:
                d1 d1Var2 = OrderCommitResponse.Companion;
                return CanMakeMoreOrders.Companion.serializer();
            case 16:
                return "Got null zone for cancelled order while trying to resolve it";
            case 17:
                return "Exception occurred while trying to get translations for cancel key set";
            case 18:
                return "Missing user id during cancel order";
            case 19:
                return "Can't be here with null geoPoint";
            case 20:
                return "Error while pre-loading image";
            case 21:
                return "too many requests launch fallback failed";
            case 22:
                return "Failed to get zone by name";
            case 23:
                p pVar = OrderDetailPresentationDto.Companion;
                return new p53(MasstransitSlotItemDto$$serializer.INSTANCE, 0);
            case 24:
                a aVar = OrderDetailsButtonExperiment.Companion;
                return new p53(auu0.a, 0);
            case 25:
                e2 e2Var = OrderDetailsCardResponse.Companion;
                return new p53(es70.e, 0);
            case 26:
                return new o4o("com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse.AccessoryResponse.Unknown", h1.INSTANCE, new Annotation[0]);
            case 27:
                return new o4o("com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse.CardElement.Action.OpenRideSupportNotification", l1.INSTANCE, new Annotation[0]);
            case 28:
                return new o4o("com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse.CardElement.Action.Unsupported", m1.INSTANCE, new Annotation[0]);
            default:
                return new o4o("com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse.CardElement.UnknownType", a2.INSTANCE, new Annotation[0]);
        }
    }
}
