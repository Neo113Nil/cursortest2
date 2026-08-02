package defpackage;

import com.squareup.moshi.Moshi;
import com.yandex.go.call_center.api.model.CallCenter$$serializer;
import com.yandex.go.call_center.api.model.ContactOptions;
import com.yandex.go.call_center.api.model.c;
import com.yandex.go.copter.experiment.CopterInfoExperiment;
import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import com.yandex.go.copter.experiment.CopterOrderFlowExperiment$RoutePointSettings$$serializer;
import com.yandex.go.copter.experiment.e;
import com.yandex.go.masstransit.sdk.order.impl.orders.ConsumedAnimationsData;
import com.yandex.go.masstransit.sdk.order.impl.orders.b;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.payments.data.model.response.b0;
import com.yandex.go.payments.shared.antifraud.experiments.CorpAntiFraudExperiment;
import com.yandex.go.taxi.order.change.common.data.ConfirmChangeResponse;
import com.yandex.go.taxi.order.change.common.data.a;
import com.yandex.go.taxi.order.models.api.response.AllowedChange$$serializer;
import com.yandex.go.taxi.order.models.api.response.ConfirmationNotification;
import com.yandex.go.taxi.order.models.api.response.ContentAccordionDto;
import com.yandex.go.taxi.order.models.api.response.ContractItem;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import com.yandex.go.taxi.order.models.api.response.e0;
import com.yandex.go.taxi.order.models.api.response.f0;
import com.yandex.go.taxi.order.models.api.response.g0;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.tee;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.eatskit.dto.ConnectionError;
import ru.yandex.taxi.eatskit.dto.ConnectionStatus;
import ru.yandex.taxi.scooters.data.model.ButtonAction;
import ru.yandex.taxi.scooters.data.model.ControlAction;

/* loaded from: classes14.dex */
public final /* synthetic */ class m3e implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ m3e(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a aVar = ConfirmChangeResponse.Companion;
                return OrderChangesDto.Status.Companion.serializer();
            case 1:
                e0 e0Var = ConfirmationNotification.Companion;
                return new p53(AllowedChange$$serializer.INSTANCE, 0);
            case 2:
                return ConnectionStatus.Companion.serializer();
            case 3:
                return ConnectionError.Companion.serializer();
            case 4:
                return vez0.g("ru.yandex.taxi.eatskit.dto.ConnectionError", ConnectionError.values(), new String[]{"permissionDenied", "bluetoothOff", "courierNotFound", "unknown"}, new Annotation[][]{null, null, null, null});
            case 5:
                return vez0.g("ru.yandex.taxi.eatskit.dto.ConnectionStatus", ConnectionStatus.values(), new String[]{"connected", "timeout", "permissionError", "unknown"}, new Annotation[][]{null, null, null, null});
            case 6:
                b bVar = ConsumedAnimationsData.Companion;
                return new p53(auu0.a, 1);
            case 7:
                b bVar2 = ConsumedAnimationsData.Companion;
                return new p53(auu0.a, 1);
            case 8:
                c cVar = ContactOptions.Companion;
                return new p53(CallCenter$$serializer.INSTANCE, 0);
            case 9:
                ree reeVar = tee.Companion;
                return new p53(pee.a, 0);
            case 10:
                qee qeeVar = tee.a.Companion;
                return vez0.g("ru.yandex.taxi.scooters.data.model.ButtonAction", ButtonAction.values(), new String[]{"try_again", FoldersConfig.SUPPORT_FILTER_ID, "payment_methods"}, new Annotation[][]{null, null, null});
            case 11:
                f0 f0Var = ContentAccordionDto.Companion;
                return new p53(auu0.a, 0);
            case 12:
                qwd qwdVar = vee.a;
                return Float.valueOf(1.0f);
            case 13:
                g0 g0Var = ContractItem.Companion;
                return ContractItem.ContractItemType.Companion.serializer();
            case 14:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.ContractItem.ContractItemType", ContractItem.ContractItemType.values(), new String[]{"check", "cost_string", "string", null}, new Annotation[][]{null, null, null, null});
            case 15:
                return vez0.g("ru.yandex.taxi.scooters.data.model.ControlAction", ControlAction.values(), new String[]{"unlock-doors-hood", "blink-n-horn"}, new Annotation[][]{null, null});
            case 16:
                return ControlAction.Companion.serializer();
            case 17:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                return simpleDateFormat;
            case 18:
                com.yandex.go.copter.experiment.a aVar2 = CopterInfoExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 19:
                com.yandex.go.copter.experiment.a aVar3 = CopterInfoExperiment.Companion;
                return new p53(CopterOrderFlowExperiment$RoutePointSettings$$serializer.INSTANCE, 0);
            case 20:
                e eVar = CopterOrderFlowExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 21:
                e eVar2 = CopterOrderFlowExperiment.Companion;
                return new p53(CopterOrderFlowExperiment$RoutePointSettings$$serializer.INSTANCE, 0);
            case 22:
                return new Moshi.Builder().build();
            case 23:
                b0 b0Var = CorpAccount.Companion;
                return new p53(ru.yandex.taxi.costcenters.api.a.a, 0);
            case 24:
                com.yandex.go.payments.shared.antifraud.experiments.c cVar2 = CorpAntiFraudExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 25:
                com.yandex.go.payments.shared.antifraud.experiments.b bVar3 = CorpAntiFraudExperiment.ClientInfoParams.Companion;
                return new p53(auu0.a, 0);
            case 26:
                iwe iweVar = CostCenterField.Companion;
                return new p53(auu0.a, 0);
            case 27:
                iwe iweVar2 = CostCenterField.Companion;
                return CostCenterField.InputFormat.Companion.serializer();
            case 28:
                iwe iweVar3 = CostCenterField.Companion;
                return new p53(ru.yandex.taxi.costcenters.api.b.a, 0);
            default:
                return vez0.g("ru.yandex.taxi.costcenters.api.CostCenterField.InputFormat", CostCenterField.InputFormat.values(), new String[]{"text", "mixed", "select"}, new Annotation[][]{null, null, null});
        }
    }
}
