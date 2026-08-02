package defpackage;

import com.squareup.wire.internal.MathMethodsKt;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedback;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedbackQuestion;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedbackQuestionAnswer$$serializer;
import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$ChangeSource$Mode;
import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$PreferredScreenType;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderFeedbackQuestionInfoState$$serializer;
import com.yandex.go.taxi.order.models.api.g;
import com.yandex.go.taxi.order.models.api.h;
import com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto;
import com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto$TariffDetailsDto$$serializer;
import com.yandex.go.taxi.order.models.api.response.a8;
import com.yandex.go.taxi.order.multi.feed.experiments.TaxiOrderFeedStateSettingsExperiment;
import com.yandex.go.taxi.order.multi.feed.experiments.TaxiOrderFeedStateSettingsExperiment$StateDto$$serializer;
import com.yandex.go.taxi.order.multi.feed.experiments.b;
import com.yandex.plus.pay.internal.benchmark.tarifficator.a;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.object.TaxiOrderFeedbackFlow;

/* loaded from: classes14.dex */
public final /* synthetic */ class mpx0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ mpx0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "TariffUpgradeAnalytics");
            case 1:
                return "Invalid data in tariff upgrade dto";
            case 2:
                return "Missing source point in order for fetching zone";
            case 3:
                i3y i3yVar = a.g;
                return Long.valueOf(MathMethodsKt.NANOS_PER_SECOND);
            case 4:
                a8 a8Var = TariffsSuggestDto.Companion;
                return new p53(TariffsSuggestDto$TariffDetailsDto$$serializer.INSTANCE, 0);
            case 5:
                a8 a8Var2 = TariffsSuggestDto.Companion;
                return TariffsSuggestDto.SelectionMode.Companion.serializer();
            case 6:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto.SelectionMode", TariffsSuggestDto.SelectionMode.values(), new String[]{"multi_choice", "single_choice"}, new Annotation[][]{null, null});
            case 7:
                zy11Var = zy11.a;
                return zy11Var;
            case 8:
                return "Failed to execute action";
            case 9:
                return "Chat messages polling error";
            case 10:
                return "Failed to make orderchat request";
            case 11:
                return "Failed to post message";
            case 12:
                return "Failed to update messages";
            case 13:
                return vez0.g("com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink.ChangeSource.Mode", TaxiOrderDeeplink$ChangeSource$Mode.values(), new String[]{"change_source_screen", "modal_confirm"}, new Annotation[][]{null, null});
            case 14:
                return vez0.g("com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink.PreferredScreenType", TaxiOrderDeeplink$PreferredScreenType.values(), new String[]{"tracking", "details"}, new Annotation[][]{null, null});
            case 15:
                return "make orderdraft request";
            case 16:
                return "orderdraft error";
            case 17:
                return "eager orderdraft failed — falling back to regular request";
            case 18:
                com.yandex.go.taxi.order.multi.feed.experiments.a aVar = TaxiOrderFeedStateSettingsExperiment.Companion;
                return new p53(TaxiOrderFeedStateSettingsExperiment$StateDto$$serializer.INSTANCE, 0);
            case 19:
                b bVar = TaxiOrderFeedStateSettingsExperiment.StateDto.Companion;
                return DriveState.Companion.serializer();
            case 20:
                b bVar2 = TaxiOrderFeedStateSettingsExperiment.StateDto.Companion;
                return new p53(auu0.a, 0);
            case 21:
                b bVar3 = TaxiOrderFeedStateSettingsExperiment.StateDto.Companion;
                return TaxiOrderFeedStateSettingsExperiment.StateDto.State.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.taxi.order.multi.feed.experiments.TaxiOrderFeedStateSettingsExperiment.StateDto.State", TaxiOrderFeedStateSettingsExperiment.StateDto.State.values(), new String[]{"minimized", "expanded", "raised"}, new Annotation[][]{null, null, null});
            case 23:
                g gVar = TaxiOrderFeedback.Companion;
                return new p53(auu0.a, 0);
            case 24:
                g gVar2 = TaxiOrderFeedback.Companion;
                return new p53(auu0.a, 0);
            case 25:
                g gVar3 = TaxiOrderFeedback.Companion;
                return new p53(auu0.a, 0);
            case 26:
                g gVar4 = TaxiOrderFeedback.Companion;
                return new k8u(auu0.a, h6w.a, 1);
            case 27:
                g gVar5 = TaxiOrderFeedback.Companion;
                return new p53(TaxiOrderFeedbackQuestionInfoState$$serializer.INSTANCE, 0);
            case 28:
                return vez0.g("ru.yandex.taxi.object.TaxiOrderFeedbackFlow", TaxiOrderFeedbackFlow.values(), new String[]{"force_screen", "tracking_only"}, new Annotation[][]{null, null});
            default:
                h hVar = TaxiOrderFeedbackQuestion.Companion;
                return new p53(TaxiOrderFeedbackQuestionAnswer$$serializer.INSTANCE, 0);
        }
    }
}
