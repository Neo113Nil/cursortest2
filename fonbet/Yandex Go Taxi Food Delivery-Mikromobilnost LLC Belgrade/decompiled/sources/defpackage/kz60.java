package defpackage;

import com.yandex.go.flex.common.api.actions.OpenSettingsAction;
import com.yandex.go.flex.common.api.actions.OpenWebAction;
import com.yandex.go.flex.common.api.actions.OpenWebAction$WebCallback$$serializer;
import com.yandex.go.flex.common.api.actions.d0;
import com.yandex.go.flex.common.api.actions.e0;
import com.yandex.go.flex.common.api.actions.g0;
import com.yandex.go.flex.common.api.actions.i0;
import com.yandex.go.flex.main_screen.data.widgets.orders.OrdersWidgetSection;
import com.yandex.go.flex.main_screen.presentation.actions.OpenInfoListAction;
import com.yandex.go.flex.main_screen.presentation.actions.OpenInfoListAction$InfoItem$$serializer;
import com.yandex.go.flex.main_screen.presentation.actions.a;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.OrdersStatus;
import com.yandex.go.order.ui.order_list_modal_height.data.OrderListModalRatioHeightExperiment;
import com.yandex.go.ridetech.locationsdk.experiment.dto.OnJumpOrDivergenceSimpleDto;
import com.yandex.go.ridetech.locationsdk.experiment.dto.b;
import com.yandex.go.shortcuts.experiments.OrderShortcutsParamsExperiment;
import com.yandex.go.shortcuts.experiments.OrderShortcutsParamsExperiment$Param$$serializer;
import com.yandex.go.suggest.impl.data.flex.actions.PatchSearchRequestResultDataAction;
import com.yandex.go.taxi.experiments.AlternativeOverride$$serializer;
import com.yandex.go.taxi.experiments.OverrideInactiveTariffsExperiment;
import com.yandex.go.taxi.experiments.j;
import com.yandex.go.taxi.order.cache.api.data.model.OrderCacheParams;
import com.yandex.go.taxi.order.cache.api.data.model.OrderCacheParams$$serializer;
import com.yandex.go.taxi.order.cache.api.data.model.OrderType;
import com.yandex.go.taxi.order.cache.data.model.OrderDetailsPresentationInfoSerializable;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.experiments.OnlyV2RideCardExperiment;
import com.yandex.go.taxi.order.experiments.c;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsPresentationExperiment;
import com.yandex.go.taxi.order.experiments.orderdetails.e;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.requirements.models.net.OptionViewStyleDto;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final /* synthetic */ class kz60 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ kz60(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                b bVar = OnJumpOrDivergenceSimpleDto.Companion;
                return new p53(new p53(auu0.a, 1), 0);
            case 1:
                b bVar2 = OnJumpOrDivergenceSimpleDto.Companion;
                return new p53(new p53(auu0.a, 1), 0);
            case 2:
                return gtq0.a();
            case 3:
                c cVar = OnlyV2RideCardExperiment.Companion;
                return new p53(RideCardPresentationType.Companion.serializer(), 0);
            case 4:
                a aVar = OpenInfoListAction.Companion;
                return new p53(OpenInfoListAction$InfoItem$$serializer.INSTANCE, 0);
            case 5:
                d0 d0Var = OpenSettingsAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 6:
                return new o4o("com.yandex.go.flex.common.api.actions.OpenSuperappSearchAction", e0.INSTANCE, new Annotation[]{new tfr()});
            case 7:
                g0 g0Var = OpenWebAction.Companion;
                return OpenWebAction.AuthType.Companion.serializer();
            case 8:
                g0 g0Var2 = OpenWebAction.Companion;
                return new p53(OpenWebAction$WebCallback$$serializer.INSTANCE, 0);
            case 9:
                ie70 ie70Var = je70.Companion;
                return new k8u(h6w.a, auu0.a, 1);
            case 10:
                ie70 ie70Var2 = je70.Companion;
                return OptionViewStyleDto.Companion.serializer();
            case 11:
                return vez0.g("ru.yandex.taxi.requirements.models.net.OptionViewStyleDto", OptionViewStyleDto.values(), new String[]{"check", "spinner", null}, new Annotation[][]{null, null, null});
            case 12:
                xg70 xg70Var = yg70.Companion;
                return new p53(he70.a, 0);
            case 13:
                return vez0.g("com.yandex.go.taxi.order.cache.api.data.model.OrderCacheParams.Service", OrderCacheParams.Service.values(), new String[]{TariffOrderFlow.ORDER_FLOW_TAXI_KEY, "linked", "scooters", TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, "logistics", "eats", null}, new Annotation[][]{null, null, null, null, null, null, null});
            case 14:
                return new w740();
            case 15:
                e eVar = OrderDetailsPresentationExperiment.Companion;
                return jsq0.Companion.serializer(DriveState.Companion.serializer());
            case 16:
                e eVar2 = OrderDetailsPresentationExperiment.Companion;
                return new p53(auu0.a, 0);
            case 17:
                e eVar3 = OrderDetailsPresentationExperiment.Companion;
                return nsq0.Companion.serializer(OrderCacheParams.Service.Companion.serializer(), OrderCacheParams$$serializer.INSTANCE);
            case 18:
                com.yandex.go.taxi.order.cache.data.model.a aVar2 = OrderDetailsPresentationInfoSerializable.Companion;
                return OrderCacheParams.Service.Companion.serializer();
            case 19:
                com.yandex.go.taxi.order.cache.data.model.a aVar3 = OrderDetailsPresentationInfoSerializable.Companion;
                return OrderType.Companion.serializer();
            case 20:
                com.yandex.go.order.ui.order_list_modal_height.data.a aVar4 = OrderListModalRatioHeightExperiment.Companion;
                return new p53(lz20.a, 0);
            case 21:
                com.yandex.go.shortcuts.experiments.a aVar5 = OrderShortcutsParamsExperiment.Companion;
                return new k8u(auu0.a, OrderShortcutsParamsExperiment$Param$$serializer.INSTANCE, 1);
            case 22:
                return "SpecificOrderComponent was leaked";
            case 23:
                return vez0.g("com.yandex.go.masstransit.sdk.order.impl.orders.network.OrdersStatus", OrdersStatus.values(), new String[]{ClidProvider.APP_ACTIVE, "all"}, new Annotation[][]{null, null});
            case 24:
                com.yandex.go.flex.main_screen.data.widgets.orders.b bVar3 = OrdersWidgetSection.Companion;
                return new k8u(auu0.a, new oke(qoi0.a(kr.class), null, new KSerializer[0]), 1);
            case 25:
                return new o4o("OrganizationDiscoveryAction", i0.INSTANCE, new Annotation[]{new tfr()});
            case 26:
                j jVar = OverrideInactiveTariffsExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, new k8u(auu0Var, new k8u(auu0Var, AlternativeOverride$$serializer.INSTANCE, 1), 1), 1);
            case 27:
                ed90 ed90Var = jd90.Companion;
                return new p53(qke.n(new oke(qoi0.a(fd90.class), null, new KSerializer[0])), 0);
            case 28:
                ro90 ro90Var = so90.Companion;
                return new p53(auu0.a, 0);
            default:
                com.yandex.go.suggest.impl.data.flex.actions.b bVar4 = PatchSearchRequestResultDataAction.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
        }
    }
}
