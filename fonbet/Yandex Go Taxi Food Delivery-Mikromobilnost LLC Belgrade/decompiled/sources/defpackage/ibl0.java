package defpackage;

import com.yandex.go.analytics.rythm.experiments.RythmEventGroupsExperiment;
import com.yandex.go.analytics.rythm.experiments.RythmEventGroupsExperiment$Configuration$$serializer;
import com.yandex.go.route.experiment.RouteTariffVehicleTypeExperiment;
import com.yandex.go.route.experiment.c;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment$Button$$serializer;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment$Instruction$$serializer;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment$SafetyCenterButton$$serializer;
import com.yandex.go.safety.center.experiment.b;
import com.yandex.go.safety.center.experiment.f;
import com.yandex.go.safety.center.experiment.h;
import com.yandex.go.safety.center.experiment.j;
import com.yandex.go.zone.dto.objects.ServiceLevel$Branding$$serializer;
import com.yandex.go.zone.dto.objects.VerticalTariffDto$$serializer;
import com.yandex.go.zone.dto.objects.VerticalType;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.net.taxi.dto.request.a;
import ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class ibl0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ibl0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new p53(imx0.a, 0);
            case 1:
                return jsq0.Companion.serializer(VerticalType.Companion.serializer());
            case 2:
                return new p53(auu0.a, 0);
            case 3:
                return new p53(vlw0.a, 0);
            case 4:
                return new p53(a.a, 0);
            case 5:
                mbl0 mbl0Var = RouteStatsPrefetchExperiment.Companion;
                return RouteStatsPrefetchExperiment.PrefetchMode.Companion.serializer();
            case 6:
                return vez0.g("ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchExperiment.PrefetchMode", RouteStatsPrefetchExperiment.PrefetchMode.values(), new String[]{BackendConfig.Restrictions.DISABLED, "only_first", "first_two", "all"}, new Annotation[][]{null, null, null, null});
            case 7:
                xbl0 xbl0Var = ybl0.Companion;
                return VerticalType.Companion.serializer();
            case 8:
                xbl0 xbl0Var2 = ybl0.Companion;
                return new p53(VerticalTariffDto$$serializer.INSTANCE, 0);
            case 9:
                acl0 acl0Var = bcl0.Companion;
                return new p53(dq40.a, 0);
            case 10:
                acl0 acl0Var2 = bcl0.Companion;
                return new p53(auu0.a, 0);
            case 11:
                acl0 acl0Var3 = bcl0.Companion;
                return new p53(ServiceLevel$Branding$$serializer.INSTANCE, 0);
            case 12:
                c cVar = RouteTariffVehicleTypeExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, qke.n(auu0Var), 1);
            case 13:
                ujl0 ujl0Var = vjl0.Companion;
                return new p53(ypn.e, 0);
            case 14:
                com.yandex.go.analytics.rythm.experiments.a aVar = RythmEventGroupsExperiment.Companion;
                return new k8u(auu0.a, RythmEventGroupsExperiment$Configuration$$serializer.INSTANCE, 1);
            case 15:
                f fVar = SafetyCenterExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 16:
                f fVar2 = SafetyCenterExperiment.Companion;
                return jsq0.Companion.serializer(SafetyCenterExperiment.ButtonPlace.Companion.serializer());
            case 17:
                f fVar3 = SafetyCenterExperiment.Companion;
                return new p53(SafetyCenterExperiment$Instruction$$serializer.INSTANCE, 0);
            case 18:
                f fVar4 = SafetyCenterExperiment.Companion;
                return new p53(SafetyCenterExperiment$SafetyCenterButton$$serializer.INSTANCE, 0);
            case 19:
                return vez0.g("com.yandex.go.safety.center.experiment.SafetyCenterExperiment.Action", SafetyCenterExperiment.Action.values(), new String[]{"call_emergency", "call_driver", "contact_support", "call_any_number"}, new Annotation[][]{null, null, null, null});
            case 20:
                b bVar = SafetyCenterExperiment.Button.Companion;
                return SafetyCenterExperiment.ButtonStyle.Companion.serializer();
            case 21:
                b bVar2 = SafetyCenterExperiment.Button.Companion;
                return SafetyCenterExperiment.Action.Companion.serializer();
            case 22:
                b bVar3 = SafetyCenterExperiment.Button.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 23:
                b bVar4 = SafetyCenterExperiment.Button.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 24:
                return vez0.g("com.yandex.go.safety.center.experiment.SafetyCenterExperiment.ButtonPlace", SafetyCenterExperiment.ButtonPlace.values(), new String[]{"ride_details", "sidebar"}, new Annotation[][]{null, null});
            case 25:
                return vez0.g("com.yandex.go.safety.center.experiment.SafetyCenterExperiment.ButtonStyle", SafetyCenterExperiment.ButtonStyle.values(), new String[]{"red", "yellow", "gray"}, new Annotation[][]{null, null, null});
            case 26:
                return vez0.g("com.yandex.go.safety.center.experiment.SafetyCenterExperiment.ButtonType", SafetyCenterExperiment.ButtonType.values(), new String[]{"emergency", "faq", ContactsFragment.WEBVIEW_NAME, "share_route"}, new Annotation[][]{null, null, null, null});
            case 27:
                h hVar = SafetyCenterExperiment.EmergencyTicket.Companion;
                return SafetyCenterExperiment.Strategy.Companion.serializer();
            case 28:
                j jVar = SafetyCenterExperiment.Instruction.Companion;
                return new p53(auu0.a, 0);
            default:
                j jVar2 = SafetyCenterExperiment.Instruction.Companion;
                return new p53(SafetyCenterExperiment$Button$$serializer.INSTANCE, 0);
        }
    }
}
