package defpackage;

import androidx.compose.runtime.f;
import com.yandex.fintechsdk.flows.applink.payment.api.activity.ApplinkPaymentActivity;
import com.yandex.go.payments.data.model.response.ApiError;
import com.yandex.go.payments.data.model.response.i;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.preorder.source.altpins.Alternatives$PinStateDto$$serializer;
import com.yandex.go.preorder.source.altpins.Alternatives$RoutePartItemDto$MultimodalScooterRoutePart;
import com.yandex.go.preorder.source.altpins.Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart;
import com.yandex.go.preorder.source.altpins.Alternatives$RoutePartItemDto$MultimodalTransportRoutePart;
import com.yandex.go.preorder.source.altpins.b1;
import com.yandex.go.preorder.source.altpins.c1;
import com.yandex.go.preorder.source.altpins.d1;
import com.yandex.go.preorder.source.altpins.e1;
import com.yandex.go.preorder.source.altpins.j1;
import com.yandex.go.slot.dto.SlotButtonDto$$serializer;
import com.yandex.go.taxi.order.change.price.data.dto.ApplyAdditionalPaymentResponse;
import com.yandex.go.taxi.order.change.source.data.ApplyChangeSourceParam;
import com.yandex.go.taxi.order.change.source.data.SourceChangeReason;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.objects.AltpinCardInfo;
import com.yandex.go.taxi.order.models.api.objects.AltpinCardItemDto$ActionButtons;
import com.yandex.go.taxi.order.models.api.objects.a;
import com.yandex.go.taxi.order.models.api.objects.b;
import com.yandex.go.taxi.order.models.api.objects.d;
import com.yandex.go.taxi.order.models.api.objects.e;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final /* synthetic */ class ly1 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ly1(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        u7w intentArgsParser_delegate$lambda$0;
        switch (this.a) {
            case 0:
                b1 b1Var = Alternatives$RoutePartItemDto$MultimodalScooterRoutePart.Companion;
                return new p53(Alternatives$PinStateDto$$serializer.INSTANCE, 0);
            case 1:
                c1 c1Var = Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart.Companion;
                return new p53(Alternatives$PinStateDto$$serializer.INSTANCE, 0);
            case 2:
                d1 d1Var = Alternatives$RoutePartItemDto$MultimodalTransportRoutePart.Companion;
                return new p53(Alternatives$PinStateDto$$serializer.INSTANCE, 0);
            case 3:
                return new o4o("com.yandex.go.preorder.source.altpins.Alternatives.RoutePartItemDto.Unsupported", e1.INSTANCE, new Annotation[0]);
            case 4:
                j1 j1Var = Alternatives.Walk.Companion;
                return new p53(b0t.a, 0);
            case 5:
                a aVar = AltpinCardInfo.Companion;
                return new p53(e.Companion.serializer(), 0);
            case 6:
                b bVar = AltpinCardItemDto$ActionButtons.Companion;
                return new p53(SlotButtonDto$$serializer.INSTANCE, 0);
            case 7:
                return new o4o("com.yandex.go.taxi.order.models.api.objects.AltpinCardItemDto.UnknownType", d.INSTANCE, new Annotation[0]);
            case 8:
                o02 o02Var = p02.Companion;
                return new p53(auu0.a, 0);
            case 9:
                return new o4o("ru.yandex.taxi.persuggest.api.finalsuggest.AlwaysTrueCondition", r02.INSTANCE, new Annotation[0]);
            case 10:
                return new o4o("com.yandex.go.user_profile.ui.am.AmActions.ToggleUltimaMode", com.yandex.go.user_profile.ui.am.d.INSTANCE, new Annotation[0]);
            case 11:
                return new o4o("com.yandex.go.user_profile.ui.am.AmActions.Unknown", com.yandex.go.user_profile.ui.am.e.INSTANCE, new Annotation[0]);
            case 12:
                return null;
            case 13:
                return new an();
            case 14:
                return new jy10();
            case 15:
                return new ld2();
            case 16:
                zy11Var = zy11.a;
                return zy11Var;
            case 17:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 18:
                uj2 uj2Var = vj2.Companion;
                return new oke(qoi0.a(tg2.class), null, new KSerializer[0]);
            case 19:
                i iVar = ApiError.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, new p53(auu0Var, 0), 1);
            case 20:
                return f.g(0);
            case 21:
                u03 u03Var = w03.Companion;
                return new p53(auu0.a, 0);
            case 22:
                u03 u03Var2 = w03.Companion;
                return new p53(c5v0.a, 0);
            case 23:
                u03 u03Var3 = w03.Companion;
                return new p53(auu0.a, 0);
            case 24:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 25:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 26:
                intentArgsParser_delegate$lambda$0 = ApplinkPaymentActivity.intentArgsParser_delegate$lambda$0();
                return intentArgsParser_delegate$lambda$0;
            case 27:
                return new a3y0(TaxiOrderLogGroup.CHANGE_ORDER.getTag(), "ApplyAdditionalPaymentInteractor");
            case 28:
                com.yandex.go.taxi.order.change.price.data.dto.b bVar2 = ApplyAdditionalPaymentResponse.Companion;
                return OrderChangesDto.Status.Companion.serializer();
            default:
                com.yandex.go.taxi.order.change.source.data.a aVar2 = ApplyChangeSourceParam.Companion;
                return SourceChangeReason.Companion.serializer();
        }
    }
}
