package defpackage;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.yandex.go.design.compose.platform.statusbar.a;
import com.yandex.go.external_service.preloader.data.models.StaticInfo;
import com.yandex.go.external_service.preloader.data.models.b;
import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto$$serializer;
import com.yandex.go.masstransit.sdk.order.impl.orders.StorageData;
import com.yandex.go.masstransit.sdk.order.impl.orders.r;
import com.yandex.go.tariffcard.experiment.SummaryOptionsTariffCardExperiment;
import com.yandex.go.tariffcard.experiment.o;
import com.yandex.go.taxi.order.feed.experiments.tracking_feed_client_features.StatusRefreshPolicyDto;
import com.yandex.go.taxi.order.feed.experiments.tracking_feed_client_features.c;
import com.yandex.go.yb.experiments.SuggestYandexCardInRideExperiment;
import com.yandex.go.zone.dto.objects.SuffixSpanType;
import com.yandex.payment.common.result.ResultType;
import java.lang.annotation.Annotation;
import kotlin.text.Regex;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.api.dto.a0;
import ru.yandex.taxi.communications.api.dto.g0;
import ru.yandex.taxi.communications.api.dto.m0;
import ru.yandex.taxi.communications.api.dto.x;
import ru.yandex.taxi.communications.api.dto.z;
import ru.yandex.taxi.db.StaticDataProvider;
import ru.yandex.taxi.delivery.models.data.experiment.StepType;
import ru.yandex.taxi.masstransit.StopModalDto;
import ru.yandex.taxi.masstransit.e;
import ru.yandex.taxi.masstransit.f;
import ru.yandex.taxi.plus.api.dto.state.subscription.SubscriptionStatusDto;
import ru.yandex.taxi.plus.net.response.Status;

/* loaded from: classes9.dex */
public final /* synthetic */ class c3u0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ c3u0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Regex nonDigitRegex_delegate$lambda$0;
        switch (this.a) {
            case 0:
                return new p53(auu0.a, 0);
            case 1:
                return new p53(imx.b, 0);
            case 2:
                k4u0 k4u0Var = l4u0.Companion;
                return new p53(c841.a, 0);
            case 3:
                k4u0 k4u0Var2 = l4u0.Companion;
                return new p53(zey0.a, 0);
            case 4:
                nonDigitRegex_delegate$lambda$0 = StaticDataProvider.nonDigitRegex_delegate$lambda$0();
                return nonDigitRegex_delegate$lambda$0;
            case 5:
                b bVar = StaticInfo.Companion;
                return new p53(auu0.a, 1);
            case 6:
                b bVar2 = StaticInfo.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 7:
                return vez0.g("ru.yandex.taxi.plus.net.response.Status", Status.values(), new String[]{"pending", "success", ResultType.RESULT_TYPE_FAILURE, null}, new Annotation[][]{null, null, null, null});
            case 8:
                return a.a;
            case 9:
                c cVar = StatusRefreshPolicyDto.Companion;
                return new p53(auu0.a, 0);
            case 10:
                return vez0.g("ru.yandex.taxi.delivery.models.data.experiment.StepType", StepType.values(), new String[]{"source", "destination"}, new Annotation[][]{null, null});
            case 11:
                hgu0 hgu0Var = StopModalDto.Companion;
                return new p53(e.a, 0);
            case 12:
                f fVar = StopModalDto.a.Companion;
                return StopModalDto.ButtonType.Companion.serializer();
            case 13:
                return vez0.g("ru.yandex.taxi.masstransit.StopModalDto.ButtonType", StopModalDto.ButtonType.values(), new String[]{"route_from", "route_to", null}, new Annotation[][]{null, null, null});
            case 14:
                r rVar = StorageData.Companion;
                return new p53(MasstransitOrderDto$$serializer.INSTANCE, 0);
            case 15:
                x xVar = Story.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 16:
                x xVar2 = Story.Companion;
                return new p53(auu0.a, 1);
            case 17:
                z zVar = Story.a.Companion;
                return new p53(auu0.a, 0);
            case 18:
                g0 g0Var = Story.d.Companion;
                return new p53(a0.a, 0);
            case 19:
                m0 m0Var = Story.g.Companion;
                return Story.StoryLayoutType.Companion.serializer();
            case 20:
                return vez0.g("ru.yandex.taxi.communications.api.dto.Story.StoryLayoutType", Story.StoryLayoutType.values(), new String[]{"main", "main_with_top_inset", "bottom", "new_year_layout"}, new Annotation[][]{null, null, null, null});
            case 21:
                n0v0 n0v0Var = o0v0.Companion;
                return SubscriptionStatusDto.Companion.serializer();
            case 22:
                return vez0.g("ru.yandex.taxi.plus.api.dto.state.subscription.SubscriptionStatusDto", SubscriptionStatusDto.values(), new String[]{"AVAILABLE", "PURCHASING", Card.ACTIVE, "NOT_AVAILABLE", null}, new Annotation[][]{null, null, null, null, null});
            case 23:
                return vez0.g("com.yandex.go.zone.dto.objects.SuffixSpanType", SuffixSpanType.values(), new String[]{"chevron"}, new Annotation[][]{null});
            case 24:
                com.yandex.go.yb.experiments.c cVar2 = SuggestYandexCardInRideExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 25:
                tfv0 tfv0Var = ufv0.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 26:
                tfv0 tfv0Var2 = ufv0.Companion;
                return new p53(auu0.a, 0);
            case 27:
                fiv0 fiv0Var = kiv0.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 28:
                fiv0 fiv0Var2 = kiv0.Companion;
                return new k8u(auu0.a, new p53(giv0.a, 0), 1);
            default:
                o oVar = SummaryOptionsTariffCardExperiment.Companion;
                return new p53(auu0.a, 0);
        }
    }
}
