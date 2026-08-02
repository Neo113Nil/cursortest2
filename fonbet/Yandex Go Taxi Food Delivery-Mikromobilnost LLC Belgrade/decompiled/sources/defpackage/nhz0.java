package defpackage;

import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import com.yandex.go.agreement.api.trackable.network.b;
import com.yandex.go.chargers.promotion.data.model.TextItemDto$$serializer;
import com.yandex.go.chargers.promotion.data.model.TitleDto;
import com.yandex.go.chargers.promotion.data.model.f;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardButtonDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardButtonDto$$serializer;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusLeadImageWithOverlayImageDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusSquareImageDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTrailTimelineDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTrailTimelineDto$StatusOutline$$serializer;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardTimerDto;
import com.yandex.go.superapp.tracking.models.dto.a0;
import com.yandex.go.superapp.tracking.models.dto.c;
import com.yandex.go.superapp.tracking.models.dto.e;
import com.yandex.go.superapp.tracking.models.dto.h;
import com.yandex.go.superapp.tracking.models.dto.p;
import com.yandex.go.superapp.tracking.models.dto.s;
import com.yandex.go.superapp.tracking.models.dto.w;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceOverride$$serializer;
import com.yandex.go.taxi.order.models.api.response.TipsVariant;
import com.yandex.go.taxi.order.models.api.response.TipsVariant$TipsChoice$$serializer;
import com.yandex.go.taxi.order.models.api.response.TotwPromotionWidgets;
import com.yandex.go.taxi.order.models.api.response.r8;
import com.yandex.go.taxi.order.models.api.response.u8;
import com.yandex.go.taxi.order.models.api.response.v8;
import com.yandex.go.taxi.order.models.api.totw.TotwPromotions;
import com.yandex.go.taxi.order.models.api.totw.g;
import com.yandex.go.taxi.order.tipssuggest.experiment.TipsSuggestModalExperiment;
import com.yandex.go.taxi.order.tipssuggest.experiment.a;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.j2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.p2;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final /* synthetic */ class nhz0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ nhz0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a aVar = TipsSuggestModalExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 1:
                return vez0.g("com.yandex.go.taxi.order.models.api.objects.TipsType", TipsType.values(), new String[]{"percent", "flat"}, new Annotation[][]{null, null});
            case 2:
                r8 r8Var = TipsVariant.Companion;
                return new p53(TipsVariant$TipsChoice$$serializer.INSTANCE, 0);
            case 3:
                u8 u8Var = TipsVariant.TipsChoice.Companion;
                return TipsType.Companion.serializer();
            case 4:
                f fVar = TitleDto.Companion;
                return new p53(TextItemDto$$serializer.INSTANCE, 0);
            case 5:
                return new o4o("ru.yandex.taxi.persuggest.api.finalsuggest.ToTaxiCondition", vjz0.INSTANCE, new Annotation[0]);
            case 6:
                fkz0 fkz0Var = gkz0.Companion;
                return new p53(dkz0.e, 0);
            case 7:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.ToggleItemAction.Unsupported", j2.INSTANCE, new Annotation[0]);
            case 8:
                qwd qwdVar = com.yandex.go.summary.ui.compose.common.tooltip.a.a;
                return null;
            case 9:
                uwz0 uwz0Var = vwz0.Companion;
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 10:
                return new t8j0();
            case 11:
                return new t8j0();
            case 12:
                v8 v8Var = TotwPromotionWidgets.Companion;
                return new p53(ru.yandex.taxi.communications.model.widgets.a.a, 0);
            case 13:
                v8 v8Var2 = TotwPromotionWidgets.Companion;
                return new p53(ru.yandex.taxi.communications.model.widgets.a.a, 0);
            case 14:
                com.yandex.go.taxi.order.models.api.totw.a aVar2 = TotwPromotions.Companion;
                return new k8u(auu0.a, ObjectAppearanceOverride$$serializer.INSTANCE, 1);
            case 15:
                return new o4o("com.yandex.go.taxi.order.models.api.totw.TotwUpsellResponse.Unknown", g.INSTANCE, new Annotation[0]);
            case 16:
                b bVar = TrackableAcceptanceActionParam.Companion;
                return TrackableAcceptanceActionParam.Status.Companion.serializer();
            case 17:
                return vez0.g("com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam.Status", TrackableAcceptanceActionParam.Status.values(), new String[]{"accepted", "rejected", "viewed"}, new Annotation[][]{null, null, null});
            case 18:
                com.yandex.go.superapp.tracking.models.dto.g gVar = TrackingCardButtonDto.Companion;
                return l301.Companion.serializer();
            case 19:
                return new o4o("cancel", c.INSTANCE, new Annotation[]{new e()});
            case 20:
                h hVar = TrackingCardDto.Companion;
                return new p53(TrackingCardButtonDto$$serializer.INSTANCE, 0);
            case 21:
                p pVar = TrackingCardStatusLeadImageWithOverlayImageDto.Companion;
                return TrackingCardStatusLeadImageWithOverlayImageDto.OverlapCorner.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusLeadImageWithOverlayImageDto.OverlapCorner", TrackingCardStatusLeadImageWithOverlayImageDto.OverlapCorner.values(), new String[]{"top_start", "top_end", "bottom_start", "bottom_end"}, new Annotation[][]{null, null, null, null});
            case 23:
                s sVar = TrackingCardStatusSquareImageDto.Companion;
                return TrackingCardStatusSquareImageDto.Clipping.Companion.serializer();
            case 24:
                return vez0.g("com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusSquareImageDto.Clipping", TrackingCardStatusSquareImageDto.Clipping.values(), new String[]{"rounded_square", "circle"}, new Annotation[][]{null, null});
            case 25:
                w wVar = TrackingCardStatusTrailTimelineDto.Companion;
                return new p53(TrackingCardStatusTrailTimelineDto$StatusOutline$$serializer.INSTANCE, 0);
            case 26:
                a0 a0Var = TrackingCardTimerDto.Companion;
                return TrackingCardTimerDto.TimerType.Companion.serializer();
            case 27:
                return vez0.g("com.yandex.go.superapp.tracking.models.dto.TrackingCardTimerDto.TimerType", TrackingCardTimerDto.TimerType.values(), new String[]{"until", "from"}, new Annotation[][]{null, null});
            case 28:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TrailingItemDtoV2.Unsupported", p2.INSTANCE, new Annotation[0]);
            default:
                vc01 vc01Var = wc01.Companion;
                return new p53(qc01.a, 0);
        }
    }
}
