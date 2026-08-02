package defpackage;

import com.yandex.go.experiments.zoneinfo.ScheduledOrderExperiment;
import com.yandex.go.experiments.zoneinfo.a;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.experiment.l;
import com.yandex.go.scooters.data.model.ScootersAlternativeOfferExperiment;
import com.yandex.go.scooters.data.model.i;
import com.yandex.go.scooters.deposit.experiments.model.ScootersDepositCommunicationExperiment;
import com.yandex.go.scooters.deposit.experiments.model.b;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment$Ui$ControlPanel$Banner$$serializer;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment$Ui$InfoItem$$serializer;
import com.yandex.go.scooters.ignition.data.model.d;
import com.yandex.go.scooters.ignition.data.model.g;
import com.yandex.go.scooters.ignition.data.model.h;
import defpackage.wnn0;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;
import ru.yandex.taxi.scooters.experiments.a0;
import ru.yandex.taxi.scooters.experiments.o;
import ru.yandex.taxi.scooters.experiments.p;
import ru.yandex.taxi.scooters.experiments.r;
import ru.yandex.taxi.scooters.experiments.s;
import ru.yandex.taxi.scooters.experiments.u;

/* loaded from: classes8.dex */
public final /* synthetic */ class jrl0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ jrl0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                l lVar = SafetyCenterExperiment.SafetyCenterButton.Companion;
                return SafetyCenterExperiment.ButtonType.Companion.serializer();
            case 1:
                return vez0.g("com.yandex.go.safety.center.experiment.SafetyCenterExperiment.Strategy", SafetyCenterExperiment.Strategy.values(), new String[]{"always", "never", "only_with_trusted_contacts", null}, new Annotation[][]{null, null, null, null});
            case 2:
                a7u0 a7u0Var = n1m0.a;
                return null;
            case 3:
                return new oke(qoi0.a(v5x.class), null, new KSerializer[0]);
            case 4:
                return new k8u(auu0.a, new oke(qoi0.a(kr.class), null, new KSerializer[0]), 1);
            case 5:
                a aVar = ScheduledOrderExperiment.Companion;
                return new p53(auu0.a, 0);
            case 6:
                i iVar = ScootersAlternativeOfferExperiment.Companion;
                return new p53(auu0.a, 0);
            case 7:
                u uVar = ScootersCardV2.ChargeConfig.Companion;
                return jsq0.Companion.serializer(ScootersCardV2.ChargeConfig.ValueOption.Companion.serializer());
            case 8:
                u uVar2 = ScootersCardV2.ChargeConfig.Companion;
                return ScootersCardV2.ChargeConfig.ValueOption.Companion.serializer();
            case 9:
                o oVar = p.Companion;
                return ScootersCardV2.ChargeConfig.ValueOption.Companion.serializer();
            case 10:
                r rVar = s.Companion;
                return ScootersCardV2.ChargeConfig.ValueOption.Companion.serializer();
            case 11:
                return vez0.g("ru.yandex.taxi.scooters.experiments.ScootersCardV2.ChargeConfig.ValueOption", ScootersCardV2.ChargeConfig.ValueOption.values(), new String[]{"none", RemoteBioParameters.TIME, "percents", "distance"}, new Annotation[][]{null, null, null, null});
            case 12:
                l7n0 l7n0Var = ScootersClientInsuranceNewExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 13:
                a0 a0Var = ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.Companion;
                return new p53(pnz.a, 0);
            case 14:
                h9n0 h9n0Var = i9n0.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 15:
                b bVar = ScootersDepositCommunicationExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 16:
                tnn0 tnn0Var = wnn0.Companion;
                return new p53(unn0.a, 0);
            case 17:
                vnn0 vnn0Var = wnn0.a.Companion;
                return new p53(auu0.a, 0);
            case 18:
                com.yandex.go.scooters.ignition.data.model.a aVar2 = ScootersIgnitionExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 19:
                com.yandex.go.scooters.ignition.data.model.a aVar3 = ScootersIgnitionExperiment.Companion;
                return new p53(new p53(auu0.a, 0), 0);
            case 20:
                com.yandex.go.scooters.ignition.data.model.a aVar4 = ScootersIgnitionExperiment.Companion;
                return ScootersIgnitionExperiment.RestartStrategy.Companion.serializer();
            case 21:
                com.yandex.go.scooters.ignition.data.model.a aVar5 = ScootersIgnitionExperiment.Companion;
                return ScootersIgnitionExperiment.TechnicalLoggingLevel.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment.RestartStrategy", ScootersIgnitionExperiment.RestartStrategy.values(), new String[]{"app_create", "activity_create"}, new Annotation[][]{null, null});
            case 23:
                return vez0.g("com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment.TechnicalLoggingLevel", ScootersIgnitionExperiment.TechnicalLoggingLevel.values(), new String[]{"full", "full_without_empty_scan", "full_without_scan", "full_without_empty_scan_request_response", "full_without_scan_request_response", "nothing"}, new Annotation[][]{null, null, null, null, null, null});
            case 24:
                d dVar = ScootersIgnitionExperiment.Ui.Companion;
                return new p53(ScootersIgnitionExperiment$Ui$InfoItem$$serializer.INSTANCE, 0);
            case 25:
                h hVar = ScootersIgnitionExperiment.Ui.ControlPanel.Companion;
                return new p53(ScootersIgnitionExperiment$Ui$ControlPanel$Banner$$serializer.INSTANCE, 0);
            case 26:
                return vez0.g("com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment.Ui.ControlPanel.ActionType", ScootersIgnitionExperiment.Ui.ControlPanel.ActionType.values(), new String[]{"promotion", "start_ride"}, new Annotation[][]{null, null});
            case 27:
                g gVar = ScootersIgnitionExperiment.Ui.ControlPanel.Banner.Companion;
                return ScootersIgnitionExperiment.Ui.ControlPanel.ActionType.Companion.serializer();
            case 28:
                com.yandex.go.scooters.ignition.data.model.l lVar2 = ScootersIgnitionExperiment.Ui.InfoItem.Companion;
                return ScootersIgnitionExperiment.Ui.InfoItem.ActionType.Companion.serializer();
            default:
                return vez0.g("com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment.Ui.InfoItem.ActionType", ScootersIgnitionExperiment.Ui.InfoItem.ActionType.values(), new String[]{null, "promotion", "legal_terms", "beta"}, new Annotation[][]{null, null, null, null});
        }
    }
}
