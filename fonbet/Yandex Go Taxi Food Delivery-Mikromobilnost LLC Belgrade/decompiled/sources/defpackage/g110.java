package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto$$serializer;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.MasstransitOrdersParams;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.MasstransitOrdersResponse;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.OrdersStatus;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.c;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.d;
import com.yandex.go.payments.api.shared.model.MenuEntryPoints;
import com.yandex.go.payments.api.shared.model.b;
import com.yandex.mob.api.model.MobAvailabilityCheckStrategyName;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.messenger.domain.MessengerChatOwner;
import ru.yandex.taxi.plus.api.dto.MenuType;
import ru.yandex.taxi.plus.api.dto.state.plaque.c0;
import ru.yandex.taxi.plus.api.dto.state.plaque.e0;
import ru.yandex.taxi.plus.api.dto.state.plaque.i;
import ru.yandex.taxi.plus.api.dto.state.plaque.w;
import ru.yandex.taxi.plus.api.dto.state.plaque.y;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes9.dex */
public final /* synthetic */ class g110 implements sls {
    public final /* synthetic */ int a;

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                j110 j110Var = k110.Companion;
                return new k8u(auu0.a, t231.a, 1);
            case 1:
                j110 j110Var2 = k110.Companion;
                return new p53(qiu0.a, 0);
            case 2:
                l210 l210Var = i210.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 3:
                c cVar = MasstransitOrdersParams.Companion;
                return OrdersStatus.Companion.serializer();
            case 4:
                d dVar = MasstransitOrdersResponse.Companion;
                return new p53(MasstransitOrderDto$$serializer.INSTANCE, 0);
            case 5:
                return new od01();
            case 6:
                a610 a610Var = d610.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 7:
                return new p53(auu0.a, 0);
            case 8:
                return new p53(auu0.a, 0);
            case 9:
                a7u0 a7u0Var = f810.a;
                return Boolean.FALSE;
            case 10:
                return ya30.a;
            case 11:
                b bVar = MenuEntryPoints.Companion;
                return new p53(auu0.a, 0);
            case 12:
                return vez0.g("ru.yandex.taxi.plus.api.dto.MenuType", MenuType.values(), new String[]{"NATIVE", "WEBVIEW"}, new Annotation[][]{null, null});
            case 13:
                return vez0.g("ru.yandex.taxi.messenger.domain.MessengerChatOwner", MessengerChatOwner.values(), new String[]{TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, "marketplace"}, new Annotation[][]{null, null, null});
            case 14:
                return Integer.valueOf(r0i0.MessengerStyle);
            case 15:
                t220 t220Var = u220.Companion;
                return new p53(y150.a, 0);
            case 16:
                ug20 ug20Var = e0.Companion;
                return new p53(i.a, 0);
            case 17:
                ug20 ug20Var2 = e0.Companion;
                return new p53(y.a, 0);
            case 18:
                ug20 ug20Var3 = e0.Companion;
                return new p53(c0.a, 0);
            case 19:
                ug20 ug20Var4 = e0.Companion;
                return new p53(w.a, 0);
            case 20:
                yi20 yi20Var = zi20.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 21:
                yi20 yi20Var2 = zi20.Companion;
                return new p53(auu0.a, 1);
            case 22:
                yk20 yk20Var = zk20.Companion;
                return new p53(yl20.a, 0);
            case 23:
                yk20 yk20Var2 = zk20.Companion;
                return new p53(qke.n(bn20.a), 0);
            case 24:
                yk20 yk20Var3 = zk20.Companion;
                return new p53(auu0.a, 0);
            case 25:
                zl20 zl20Var = am20.Companion;
                return MobAvailabilityCheckStrategyName.Companion.serializer();
            case 26:
                return vez0.g("com.yandex.mob.api.model.MobAvailabilityCheckStrategyName", MobAvailabilityCheckStrategyName.values(), new String[]{"active_and_first", "first_second_next", "all_in_list"}, new Annotation[][]{null, null, null});
            case 27:
                dm20 dm20Var = em20.Companion;
                return new p53(auu0.a, 1);
            case 28:
                return new p53(jq20.a, 0);
            default:
                return new k8u(auu0.a, ql20.a, 1);
        }
    }

    public /* synthetic */ g110(int i) {
        this.a = i;
    }
}
