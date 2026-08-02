package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.payments.experiments.RidePaymentMethodSelectAfterBindingExperiment;
import com.yandex.go.payments.experiments.h;
import com.yandex.go.routestats.BackendFormat$$serializer;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment$Bubble$$serializer;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.g;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.j;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.l;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.m;
import com.yandex.go.zone.dto.objects.ServiceLevel$$serializer;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;
import ru.yandex.taxi.requirements.models.net.experiment.a;
import ru.yandex.taxi.requirements.models.net.experiment.c;

/* loaded from: classes9.dex */
public final /* synthetic */ class eqj0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ eqj0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                gqj0 gqj0Var = c.Companion;
                return new k8u(auu0.a, fpj0.a, 1);
            case 1:
                gqj0 gqj0Var2 = c.Companion;
                return new k8u(auu0.a, opj0.a, 1);
            case 2:
                gqj0 gqj0Var3 = c.Companion;
                return new p53(auu0.a, 0);
            case 3:
                gqj0 gqj0Var4 = c.Companion;
                return new k8u(auu0.a, a.a, 1);
            case 4:
                gqj0 gqj0Var5 = c.Companion;
                return new p53(auu0.a, 0);
            case 5:
                gqj0 gqj0Var6 = c.Companion;
                return new p53(auu0.a, 0);
            case 6:
                gqj0 gqj0Var7 = c.Companion;
                return new p53(auu0.a, 0);
            case 7:
                return new ygd0();
            case 8:
                return vez0.g("com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType", RideCardPresentationType.values(), new String[]{null, "compact", "details", "sharing"}, new Annotation[][]{null, null, null, null});
            case 9:
                h hVar = RidePaymentMethodSelectAfterBindingExperiment.Companion;
                return new p53(PaymentMethod$Type.Companion.serializer(), 0);
            case 10:
                return new trk0(null, 3);
            case 11:
                return new urk0();
            case 12:
                com.yandex.go.taxi.order.models.api.response.typed_experiments.h hVar2 = RoadObjectSettingsExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 13:
                com.yandex.go.taxi.order.models.api.response.typed_experiments.h hVar3 = RoadObjectSettingsExperiment.Companion;
                return new p53(j.f, 0);
            case 14:
                com.yandex.go.taxi.order.models.api.response.typed_experiments.h hVar4 = RoadObjectSettingsExperiment.Companion;
                return new p53(RoadObjectSettingsExperiment$Bubble$$serializer.INSTANCE, 0);
            case 15:
                g gVar = RoadObjectSettingsExperiment.Bubble.Companion;
                return RoadObjectSettingsExperiment.RoadObjectType.Companion.serializer();
            case 16:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment.RoadObjectType", RoadObjectSettingsExperiment.RoadObjectType.values(), new String[]{null, "traffic_light"}, new Annotation[][]{null, null});
            case 17:
                l lVar = RoadObjectSettingsExperiment.TrafficLight.Companion;
                return jsq0.Companion.serializer(DriveState.Companion.serializer());
            case 18:
                return new o4o("com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment.Unknown", m.INSTANCE, new Annotation[0]);
            case 19:
                zzk0 zzk0Var = d0l0.Companion;
                return new p53(Address.Companion.serializer(), 0);
            case 20:
                f5l0 f5l0Var = g5l0.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 21:
                return vez0.g("ru.yandex.taxi.persuggest.domain.model.RoutePointType", RoutePointType.values(), new String[]{"a", "b", "mid", "eats", "chargers", "scooters", "favorite", "city_suggest", "discovery", "superapp_discovery_map", "navigator_a", "navigator_b", "transport_a", "transport_b", "menu_point_a", "menu_point_b", "ndd_a", "ndd_b"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 22:
                xal0 xal0Var = yal0.Companion;
                return new p53(ServiceLevel$$serializer.INSTANCE, 0);
            case 23:
                xal0 xal0Var2 = yal0.Companion;
                return new p53(fl60.a, 0);
            case 24:
                xal0 xal0Var3 = yal0.Companion;
                return new p53(wbl0.a, 0);
            case 25:
                xal0 xal0Var4 = yal0.Companion;
                return new p53(auu0.a, 1);
            case 26:
                xal0 xal0Var5 = yal0.Companion;
                return new k8u(auu0.a, BackendFormat$$serializer.INSTANCE, 1);
            case 27:
                return new p53(auu0.a, 0);
            case 28:
                return new p53(b0t.a, 0);
            default:
                return RequirementsParam.Companion.serializer();
        }
    }
}
