package defpackage;

import com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders;
import com.yandex.go.overdraft.data.model.OrderStatus;
import com.yandex.go.overdraft.data.model.OrderStatus$AddressName$$serializer;
import com.yandex.go.overdraft.data.model.OrderStatus$PayableService$$serializer;
import com.yandex.go.overdraft.data.model.x;
import com.yandex.go.taxi.order.models.api.objects.ButtonModifierDTO$$serializer;
import com.yandex.go.taxi.order.models.api.objects.MapObject$$serializer;
import com.yandex.go.taxi.order.models.api.objects.PaymentChange$$serializer;
import com.yandex.go.taxi.order.models.api.response.AllowedChange$$serializer;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo$CostBreakdown$$serializer;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo$ExtraInfo$$serializer;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo$Modal$$serializer;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo$PlusInfo$PlusInfoTemplate$$serializer;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$CompanionsSearch$TravelCompanion$$serializer;
import com.yandex.go.taxi.order.models.api.response.TravelCompanion$$serializer;
import com.yandex.go.taxi.order.models.api.response.TravelCompanionPoint$$serializer;
import com.yandex.go.taxi.order.models.api.response.f2;
import com.yandex.go.taxi.order.models.api.response.l2;
import com.yandex.go.taxi.order.models.api.response.o2;
import com.yandex.go.taxi.order.models.api.response.q2;
import com.yandex.go.taxi.order.models.api.response.u2;
import com.yandex.go.taxi.order.models.api.response.w2;
import com.yandex.go.zone.dto.objects.CustomEndpoint$$serializer;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final /* synthetic */ class c680 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ c680(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return "Cant resolve destination for summary redirect";
            case 1:
                return "tracking screen doesn't exists";
            case 2:
                return "Missing active order";
            case 3:
                return "orderHolder not found";
            case 4:
                return "navigation failure";
            case 5:
                x xVar = OrderStatus.Companion;
                return new p53(OrderStatus$PayableService$$serializer.INSTANCE, 0);
            case 6:
                x xVar2 = OrderStatus.Companion;
                return new p53(OrderStatus$AddressName$$serializer.INSTANCE, 0);
            case 7:
                return "Failed to ensure foreground";
            case 8:
                return "Try to reorder unmonitored order";
            case 9:
                return String.format("Failed to cancel job: %s", Arrays.copyOf(new Object[]{"pull_order_status"}, 1));
            case 10:
                o2 o2Var = OrderStatusInfo.Companion;
                return DriveState.Companion.serializer();
            case 11:
                o2 o2Var2 = OrderStatusInfo.Companion;
                return new p53(TravelCompanionPoint$$serializer.INSTANCE, 0);
            case 12:
                o2 o2Var3 = OrderStatusInfo.Companion;
                return new p53(SearchInfoResponse$CompanionsSearch$TravelCompanion$$serializer.INSTANCE, 0);
            case 13:
                o2 o2Var4 = OrderStatusInfo.Companion;
                return new p53(MapObject$$serializer.INSTANCE, 0);
            case 14:
                o2 o2Var5 = OrderStatusInfo.Companion;
                return new p53(AllowedChange$$serializer.INSTANCE, 0);
            case 15:
                o2 o2Var6 = OrderStatusInfo.Companion;
                return OrderStatusInfo.CancelledBy.Companion.serializer();
            case 16:
                o2 o2Var7 = OrderStatusInfo.Companion;
                return new p53(PaymentChange$$serializer.INSTANCE, 0);
            case 17:
                o2 o2Var8 = OrderStatusInfo.Companion;
                return new p53(ButtonModifierDTO$$serializer.INSTANCE, 0);
            case 18:
                o2 o2Var9 = OrderStatusInfo.Companion;
                return CanMakeMoreOrders.Companion.serializer();
            case 19:
                o2 o2Var10 = OrderStatusInfo.Companion;
                return new p53(CustomEndpoint$$serializer.INSTANCE, 0);
            case 20:
                o2 o2Var11 = OrderStatusInfo.Companion;
                return new p53(TravelCompanion$$serializer.INSTANCE, 0);
            case 21:
                f2 f2Var = OrderStatusInfo.AlternativeDestination.Companion;
                return new p53(b0t.a, 0);
            case 22:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.OrderStatusInfo.CancelledBy", OrderStatusInfo.CancelledBy.values(), new String[]{"user", "park", "timeout"}, new Annotation[][]{null, null, null});
            case 23:
                l2 l2Var = OrderStatusInfo.CashbackDetails.Action.Companion;
                return OrderStatusInfo.CashbackDetails.ActionType.Companion.serializer();
            case 24:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.OrderStatusInfo.CashbackDetails.ActionType", OrderStatusInfo.CashbackDetails.ActionType.values(), new String[]{"buy_plus"}, new Annotation[][]{null});
            case 25:
                q2 q2Var = OrderStatusInfo.CostMessageDetails.Companion;
                return new p53(OrderStatusInfo$ExtraInfo$$serializer.INSTANCE, 0);
            case 26:
                q2 q2Var2 = OrderStatusInfo.CostMessageDetails.Companion;
                return new p53(OrderStatusInfo$CostBreakdown$$serializer.INSTANCE, 0);
            case 27:
                u2 u2Var = OrderStatusInfo.ModalsContent.Companion;
                return new p53(OrderStatusInfo$Modal$$serializer.INSTANCE, 0);
            case 28:
                w2 w2Var = OrderStatusInfo.PlusInfo.Companion;
                return new p53(OrderStatusInfo$PlusInfo$PlusInfoTemplate$$serializer.INSTANCE, 0);
            default:
                w2 w2Var2 = OrderStatusInfo.PlusInfo.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
        }
    }
}
