package defpackage;

import com.yandex.go.explorer.impl.data.models.CoordinateDto$$serializer;
import com.yandex.go.explorer.impl.data.models.RegionCoverageResponse;
import com.yandex.go.explorer.impl.data.models.RegionItemDto;
import com.yandex.go.explorer.impl.data.models.RegionItemDto$$serializer;
import com.yandex.go.explorer.impl.data.models.g;
import com.yandex.go.explorer.impl.data.models.h;
import com.yandex.go.multimodal_route.network.models.FeedbackHintDto$$serializer;
import com.yandex.go.multimodal_route.network.models.RatingSelectorDto;
import com.yandex.go.multimodal_route.network.models.o;
import com.yandex.go.navigator.rate_route.RateRouteModalView;
import com.yandex.go.promocodes.referral.api.net.dto.DescriptionItem$$serializer;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import com.yandex.go.promocodes.referral.impl.net.dto.ReferralCodeResponse;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.f;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.RatingDependentVisibilityTextDto;
import com.yandex.go.taxi.order.models.api.response.RatingDisplayPolicy;
import com.yandex.go.taxi.order.models.api.response.r3;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.RatingReasonBadgeDto$Achievement;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.RatingReasonBadgeDto$Tag;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.RatingReasonBadgeDto$Text;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.RatingReasonsTitleDto;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.a;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.c;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.d;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.e;
import com.yandex.go.taxi.order.models.api.response.rating_selector.RatingSelectorHintDto;
import com.yandex.go.taxi.order.models.api.response.s3;
import com.yandex.go.zone.dto.objects.QueueScreen;
import com.yandex.go.zone.dto.objects.QueueScreen$QueueButton$$serializer;
import com.yandex.go.zone.dto.objects.l3;
import com.yandex.go.zone.dto.objects.m3;
import com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodStatusEntity;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.d0;

/* loaded from: classes14.dex */
public final /* synthetic */ class hkg0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ hkg0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        u550 rootLayer_delegate$lambda$0;
        switch (this.a) {
            case 0:
                l3 l3Var = QueueScreen.Companion;
                return new p53(QueueScreen$QueueButton$$serializer.INSTANCE, 0);
            case 1:
                m3 m3Var = QueueScreen.QueueButton.Companion;
                return QueueScreen.QueueButton.QueueButtonAction.Companion.serializer();
            case 2:
                return vez0.g("com.yandex.go.zone.dto.objects.QueueScreen.QueueButton.QueueButtonAction", QueueScreen.QueueButton.QueueButtonAction.values(), new String[]{"primary", "secondary", null}, new Annotation[][]{null, null, null});
            case 3:
                return "QueueButtonUiAction is null";
            case 4:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "QueueViewPresenter");
            case 5:
                rootLayer_delegate$lambda$0 = RateRouteModalView.rootLayer_delegate$lambda$0();
                return rootLayer_delegate$lambda$0;
            case 6:
                r3 r3Var = RatingDependentVisibilityTextDto.Companion;
                return new p53(h6w.a, 0);
            case 7:
                s3 s3Var = RatingDisplayPolicy.Companion;
                return jsq0.Companion.serializer(RatingDisplayPolicy.DisplayOnType.Companion.serializer());
            case 8:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.RatingDisplayPolicy.DisplayOnType", RatingDisplayPolicy.DisplayOnType.values(), new String[]{"multiorder", "details"}, new Annotation[][]{null, null});
            case 9:
                a aVar = RatingReasonBadgeDto$Achievement.Companion;
                return new p53(h6w.a, 0);
            case 10:
                c cVar = RatingReasonBadgeDto$Tag.Companion;
                return new p53(h6w.a, 0);
            case 11:
                d dVar = RatingReasonBadgeDto$Text.Companion;
                return new p53(h6w.a, 0);
            case 12:
                e eVar = RatingReasonsTitleDto.Companion;
                return new p53(h6w.a, 0);
            case 13:
                o oVar = RatingSelectorDto.Companion;
                return new p53(FeedbackHintDto$$serializer.INSTANCE, 0);
            case 14:
                com.yandex.go.taxi.order.models.api.response.rating_selector.a aVar2 = RatingSelectorHintDto.Companion;
                return new p53(h6w.a, 0);
            case 15:
                bei0 bei0Var = cei0.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 16:
                return new gfi0(RebindPaymentMethodStatusEntity.PENDING, null);
            case 17:
                tki0 tki0Var = d0.Companion;
                return new p53(f290.a, 0);
            case 18:
                return new oke(qoi0.a(u1m.class), null, new KSerializer[0]);
            case 19:
                return new oke(qoi0.a(ywl.class), null, new KSerializer[0]);
            case 20:
                return zli0.a;
            case 21:
                return new p53(zkp.a, 0);
            case 22:
                return new p53(zru.a, 0);
            case 23:
                return new o4o("com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.RedirectionRuleDto.Cancel", com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.c.INSTANCE, new Annotation[0]);
            case 24:
                return new o4o("com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.RedirectionRuleDto.Impossible", com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.d.INSTANCE, new Annotation[0]);
            case 25:
                return new o4o("com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.RedirectionRuleDto.Unknown", f.INSTANCE, new Annotation[0]);
            case 26:
                com.yandex.go.promocodes.referral.impl.net.dto.c cVar2 = ReferralCodeResponse.Companion;
                return ReferralService.Companion.serializer();
            case 27:
                com.yandex.go.promocodes.referral.impl.net.dto.c cVar3 = ReferralCodeResponse.Companion;
                return new p53(DescriptionItem$$serializer.INSTANCE, 0);
            case 28:
                g gVar = RegionCoverageResponse.Companion;
                return new p53(RegionItemDto$$serializer.INSTANCE, 0);
            default:
                h hVar = RegionItemDto.Companion;
                return new p53(new p53(CoordinateDto$$serializer.INSTANCE, 0), 0);
        }
    }
}
