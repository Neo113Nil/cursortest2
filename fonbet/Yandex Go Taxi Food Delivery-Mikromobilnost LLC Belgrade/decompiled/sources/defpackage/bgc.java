package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.yandex.go.order.ui.presentation.routing.CopyCarNumberByTapExperiment;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.f;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.n;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.o;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.q;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.r;
import com.yandex.go.places.complaint.experiment.ComplaintExperiment;
import com.yandex.go.places.complaint.experiment.ComplaintExperiment$ComplaintButton$$serializer;
import com.yandex.go.summary.experiment.ComposeSummaryExperiment;
import com.yandex.go.taxi.order.experiments.ColorizedCarIconExperiment;
import com.yandex.go.taxi.order.experiments.a;
import java.lang.annotation.Annotation;
import kotlin.KotlinNothingValueException;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.d;
import ru.yandex.taxi.delivery.models.data.experiment.SkipAlertCondition;
import ru.yandex.taxi.models.CopySource;
import ru.yandex.taxi.requirements.models.net.CompoundSelectDto;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes.dex */
public final /* synthetic */ class bgc implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ bgc(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a7u0 a7u0Var = dgc.a;
                return Boolean.TRUE;
            case 1:
                return new o4o("Transparent", sgc.INSTANCE, new Annotation[0]);
            case 2:
                a aVar = ColorizedCarIconExperiment.Companion;
                return new p53(auu0.a, 0);
            case 3:
                yyj.a.getClass();
                return xyj.a;
            case 4:
                return "Android";
            case 5:
                fsc fscVar = CommunicationItem.Companion;
                return jsq0.Companion.serializer(CommunicationItem.DisplayOnType.Companion.serializer());
            case 6:
                fsc fscVar2 = CommunicationItem.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 7:
                return vez0.g("ru.yandex.taxi.communications.model.CommunicationItem.DisplayOnType", CommunicationItem.DisplayOnType.values(), new String[]{"multiorder", "details", "taxi_search", "details_top", "ride_auto", "ride_custom", "change_order_universal_error_custom"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 8:
                d dVar = CommunicationItem.a.Companion;
                return new p53(ru.yandex.taxi.communications.model.widgets.a.a, 0);
            case 9:
                HandlerThread handlerThread = new HandlerThread("CompassProviderThread");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 10:
                com.yandex.go.places.complaint.experiment.a aVar2 = ComplaintExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 11:
                com.yandex.go.places.complaint.experiment.a aVar3 = ComplaintExperiment.Companion;
                return new p53(ComplaintExperiment$ComplaintButton$$serializer.INSTANCE, 0);
            case 12:
                return zy11.a;
            case 13:
                oz40 oz40Var = lgd.a;
                return kvn.a;
            case 14:
                com.yandex.go.summary.experiment.a aVar4 = ComposeSummaryExperiment.Companion;
                return new p53(auu0.a, 1);
            case 15:
                pvd pvdVar = CompoundSelectDto.Companion;
                return new p53(rvd.a, 0);
            case 16:
                pvd pvdVar2 = CompoundSelectDto.Companion;
                return CompoundSelectDto.CompoundSelectItemTypeDto.Companion.serializer();
            case 17:
                return vez0.g("ru.yandex.taxi.requirements.models.net.CompoundSelectDto.CompoundSelectItemTypeDto", CompoundSelectDto.CompoundSelectItemTypeDto.values(), new String[]{"default", "child_seats"}, new Annotation[][]{null, null});
            case 18:
                vvd vvdVar = wvd.Companion;
                return new p53(auu0.a, 0);
            case 19:
                lid.b("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 20:
                return new p53(auu0.a, 0);
            case 21:
                lle lleVar = mle.Companion;
                return SkipAlertCondition.Companion.serializer();
            case 22:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 23:
                wne wneVar = xne.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 24:
                com.yandex.go.order.ui.presentation.routing.a aVar5 = CopyCarNumberByTapExperiment.Companion;
                return jsq0.Companion.serializer(CopySource.Companion.serializer());
            case 25:
                return vez0.g("ru.yandex.taxi.models.CopySource", CopySource.values(), new String[]{"mini_card", "order_details", "order_info", TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY}, new Annotation[][]{null, null, null, null});
            case 26:
                f fVar = CorpAccountFlowExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 27:
                q qVar = CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.Companion;
                return new p53(n.e, 0);
            case 28:
                return new o4o("com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.Button.Unknown", o.INSTANCE, new Annotation[0]);
            default:
                r rVar = CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.EmployeeAccessInfoModalDto.Companion;
                return new p53(w7s.a, 0);
        }
    }
}
