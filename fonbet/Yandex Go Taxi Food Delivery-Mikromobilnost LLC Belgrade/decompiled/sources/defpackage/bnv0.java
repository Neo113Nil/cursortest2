package defpackage;

import android.graphics.drawable.ColorDrawable;
import com.adjust.sdk.Constants;
import com.yandex.go.slot.dto.SlotItemDto$$serializer;
import com.yandex.go.superapp.discovery.map.impl.data.entities.network.SuperAppDiscoveryMapLayerDto;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.flex.SuperAppDiscoveryMapMainScreenStateRequestParams;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment$Button$$serializer;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType;
import com.yandex.go.superapp.discovery.map.impl.experiments.l;
import com.yandex.go.superapp.discovery.map.impl.experiments.n;
import com.yandex.go.superapp.discovery.map.impl.experiments.o;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment$ServiceSearchBarConfig$$serializer;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.b;
import com.yandex.go.taxi.summary.models.SummaryVerticalHeaderExperiment;
import com.yandex.go.taxi.summary.models.d;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.communications.model.widgets.a;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;
import ru.yandex.taxi.summary.promotions.models.b1;
import ru.yandex.taxi.summary.promotions.models.d1;
import ru.yandex.taxi.summary.promotions.models.j;
import ru.yandex.taxi.summary.promotions.models.m;
import ru.yandex.taxi.summary.promotions.models.m0;
import ru.yandex.taxi.summary.promotions.models.t;
import ru.yandex.taxi.summary.promotions.models.t0;
import ru.yandex.taxi.summary.promotions.models.u0;
import ru.yandex.taxi.summary.promotions.models.x;
import ru.yandex.taxi.summary.promotions.models.x0;
import ru.yandex.taxi.summary.promotions.models.y0;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class bnv0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ bnv0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                m mVar = SummaryPromotionsParam.c.Companion;
                return new k8u(auu0.a, new p53(j.a, 0), 1);
            case 1:
                return vez0.g("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam.Type", SummaryPromotionsParam.Type.values(), new String[]{"maas", null}, new Annotation[][]{null, null});
            case 2:
                t tVar = SummaryPromotionsResponse.a.Companion;
                return jsq0.Companion.serializer(SummaryPromotionsResponse.DisplayOnType.Companion.serializer());
            case 3:
                t tVar2 = SummaryPromotionsResponse.a.Companion;
                return new p53(auu0.a, 0);
            case 4:
                t tVar3 = SummaryPromotionsResponse.a.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 5:
                x xVar = SummaryPromotionsResponse.a.c.Companion;
                return SummaryPromotionsResponse.OfferAvailability.Companion.serializer();
            case 6:
                return vez0.g("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse.OfferAvailability", SummaryPromotionsResponse.OfferAvailability.values(), new String[]{"all", "original", "alternative"}, new Annotation[][]{null, null, null});
            case 7:
                m0 m0Var = SummaryPromotionsResponse.c.Companion;
                return new p53(auu0.a, 0);
            case 8:
                t0 t0Var = u0.Companion;
                return jsq0.Companion.serializer(SummaryPromotionsResponse.DisplayOnType.Companion.serializer());
            case 9:
                t0 t0Var2 = u0.Companion;
                return new p53(SlotItemDto$$serializer.INSTANCE, 0);
            case 10:
                t0 t0Var3 = u0.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 11:
                x0 x0Var = y0.Companion;
                return jsq0.Companion.serializer(SummaryPromotionsResponse.DisplayOnType.Companion.serializer());
            case 12:
                x0 x0Var2 = y0.Companion;
                return new p53(v9u0.a, 0);
            case 13:
                b1 b1Var = SummaryPromotionsResponse.f.Companion;
                return new p53(a.a, 0);
            case 14:
                b1 b1Var2 = SummaryPromotionsResponse.f.Companion;
                return new p53(a.a, 0);
            case 15:
                d1 d1Var = SummaryPromotionsResponse.g.Companion;
                return new p53(auu0.a, 0);
            case 16:
                d dVar = SummaryVerticalHeaderExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 17:
                com.yandex.go.superapp.discovery.map.impl.experiments.j jVar = SuperAppDiscoveryMapExperiment.SearchBarConfig.Companion;
                return new p53(SuperAppDiscoveryMapExperiment$Button$$serializer.INSTANCE, 0);
            case 18:
                com.yandex.go.superapp.discovery.map.impl.experiments.j jVar2 = SuperAppDiscoveryMapExperiment.SearchBarConfig.Companion;
                return new p53(SuperAppDiscoveryMapExperiment$Button$$serializer.INSTANCE, 0);
            case 19:
                return new o4o("com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment.SearchbarAction.Close", l.INSTANCE, new Annotation[0]);
            case 20:
                return vez0.g("com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment.SearchbarAction.SearchbarActionType", SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType.values(), new String[]{null, null, "superapp_search", Constants.DEEPLINK}, new Annotation[][]{null, null, null, null});
            case 21:
                return new o4o("com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment.SearchbarAction.SuperappSearch", n.INSTANCE, new Annotation[0]);
            case 22:
                return new o4o("com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment.SearchbarAction.Unknown", o.INSTANCE, new Annotation[0]);
            case 23:
                return new ColorDrawable(0);
            case 24:
                return vez0.g("com.yandex.go.superapp.discovery.map.impl.data.entities.network.SuperAppDiscoveryMapLayerDto", SuperAppDiscoveryMapLayerDto.values(), new String[]{"places", "transport", "scooters", TariffOrderFlow.ORDER_FLOW_TAXI_KEY, "chargers"}, new Annotation[][]{null, null, null, null, null});
            case 25:
                com.yandex.go.superapp.discovery.map.impl.domain.entities.flex.d dVar2 = SuperAppDiscoveryMapMainScreenStateRequestParams.Companion;
                return SuperAppDiscoveryMapLayerDto.Companion.serializer();
            case 26:
                return new rwp0(RoutePointType.DISCOVERY_ORGANIZATION, false);
            case 27:
                b bVar = SuperAppDiscoveryMapV2Experiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 28:
                b bVar2 = SuperAppDiscoveryMapV2Experiment.Companion;
                return SuperAppDiscoveryMapLayerDto.Companion.serializer();
            default:
                b bVar3 = SuperAppDiscoveryMapV2Experiment.Companion;
                return new p53(SuperAppDiscoveryMapV2Experiment$ServiceSearchBarConfig$$serializer.INSTANCE, 0);
        }
    }
}
