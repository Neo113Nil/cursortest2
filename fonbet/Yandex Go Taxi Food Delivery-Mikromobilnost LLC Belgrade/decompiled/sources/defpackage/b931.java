package defpackage;

import android.os.SystemClock;
import androidx.transition.TransitionSet;
import com.yandex.go.flex.common.analytics.models.WebAdjustEventParams;
import com.yandex.go.flex.common.analytics.models.c;
import com.yandex.go.payments.cards.data.model.VerificationsParam;
import com.yandex.go.payments.cards.data.model.VerificationsStatusResponse;
import com.yandex.go.payments.cards.data.model.p;
import com.yandex.go.payments.cards.data.model.r;
import com.yandex.go.payments.data.model.VerifyStrategy;
import com.yandex.go.shortcuts.dto.request.WayPoint;
import com.yandex.go.shortcuts.dto.request.WayType;
import com.yandex.go.shortcuts.dto.request.v;
import com.yandex.go.shortcuts.dto.response.VerticalStack;
import com.yandex.go.shortcuts.dto.response.h3;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment$OrderStatusRule$$serializer;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.q;
import com.yandex.go.taxi_order.ws.WebSocketFrameResponse;
import com.yandex.go.wallet.data.dto.WalletFlexRequestDto;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.ybsdk.feature.stories.internal.screens.verticalstories.b;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

/* loaded from: classes14.dex */
public final /* synthetic */ class b931 implements sls {
    public final /* synthetic */ int a;

    @Override // defpackage.sls
    public final Object invoke() {
        TransitionSet defaultTransition_delegate$lambda$0;
        int i = 0;
        switch (this.a) {
            case 0:
                return vez0.g("ru.yandex.taxi.payments.cards.dto.VerificationStatus", VerificationStatus.values(), new String[]{"created", "in_progress", "success", ResultType.RESULT_TYPE_FAILURE, "3ds_required", "3ds_status_received", "amount_expected", "cvn_expected"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 1:
                p pVar = VerificationsParam.Companion;
                return PaymentMethod$Type.Companion.serializer();
            case 2:
                p pVar2 = VerificationsParam.Companion;
                return new p53(auu0.a, 1);
            case 3:
                r rVar = VerificationsStatusResponse.Companion;
                return VerificationStatus.Companion.serializer();
            case 4:
                return vez0.g("com.yandex.go.payments.data.model.VerifyStrategy", VerifyStrategy.values(), new String[]{"card_antifraud", "standard"}, new Annotation[][]{null, null});
            case 5:
                return new p53(auu0.a, 1);
            case 6:
                h3 h3Var = VerticalStack.Companion;
                return new p53(qyt0.f, 0);
            case 7:
                h3 h3Var2 = VerticalStack.Companion;
                return new p53(qyt0.f, 0);
            case 8:
                return new b(i);
            case 9:
                return Boolean.TRUE;
            case 10:
                return new jy10();
            case 11:
                defaultTransition_delegate$lambda$0 = ViewBindingActivityImpl.defaultTransition_delegate$lambda$0();
                return defaultTransition_delegate$lambda$0;
            case 12:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 13:
                nw31 nw31Var = ow31.a;
                return zy11.a;
            case 14:
                return new p53(auu0.a, 0);
            case 15:
                com.yandex.go.taxi.order.models.api.response.typed_experiments.p pVar3 = WalkRouteOrderExperiment.Companion;
                return new p53(WalkRouteOrderExperiment$OrderStatusRule$$serializer.INSTANCE, 0);
            case 16:
                q qVar = WalkRouteOrderExperiment.OrderStatusRule.Companion;
                return DriveState.Companion.serializer();
            case 17:
                q qVar2 = WalkRouteOrderExperiment.OrderStatusRule.Companion;
                return WalkRouteOrderExperiment.OrderStatusRule.PointType.Companion.serializer();
            case 18:
                q qVar3 = WalkRouteOrderExperiment.OrderStatusRule.Companion;
                return WalkRouteOrderExperiment.OrderStatusRule.PointType.Companion.serializer();
            case 19:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment.OrderStatusRule.PointType", WalkRouteOrderExperiment.OrderStatusRule.PointType.values(), new String[]{"car", "point_a", "point_b", "end_of_driving_route", "user_location", "check_in_zone", null}, new Annotation[][]{null, null, null, null, null, null, null});
            case 20:
                com.yandex.go.wallet.data.dto.b bVar = WalletFlexRequestDto.Companion;
                return new p53(e6m.a, 0);
            case 21:
                v vVar = WayPoint.Companion;
                return WayType.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.shortcuts.dto.request.WayType", WayType.values(), new String[]{"a", "mid", "b"}, new Annotation[][]{null, null, null});
            case 23:
                c cVar = WebAdjustEventParams.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(qke.n(auu0Var), qke.n(auu0Var), 1);
            case 24:
                c cVar2 = WebAdjustEventParams.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(qke.n(auu0Var2), qke.n(auu0Var2), 1);
            case 25:
                return new p53(db41.a, 0);
            case 26:
                return new p53(qb41.a, 0);
            case 27:
                return new p53(auu0.a, 0);
            case 28:
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            default:
                com.yandex.go.taxi_order.ws.b bVar2 = WebSocketFrameResponse.Companion;
                return new p53(auu0.a, 0);
        }
    }

    public /* synthetic */ b931(int i) {
        this.a = i;
    }
}
