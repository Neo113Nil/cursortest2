package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.gson.ToNumberPolicy;
import com.yandex.go.business.impl.web.model.JsFile$$serializer;
import com.yandex.go.business.impl.web.model.JsFilesContent;
import com.yandex.go.business.impl.web.model.b;
import com.yandex.go.flex.common.actions.create_order.SendOrderDraftAction;
import com.yandex.go.flex.common.actions.dto.JasonStateNodeDto;
import com.yandex.go.flex.common.actions.dto.c;
import com.yandex.go.flex.common.api.actions.IntercityMainAction;
import com.yandex.go.flex.common.api.actions.u;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenFlexScreenAction;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenSelectPaymentMethodScreenAction;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenShuttleClarifyPointAction;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenShuttleClarifyPointAction$AvailablePointToSelection$$serializer;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercitySelectContactAction;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.d;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.e;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.f;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.l;
import com.yandex.go.payments.data.model.JazzcashWalletDto;
import com.yandex.go.payments.data.model.VerifyStrategy;
import com.yandex.go.payments.data.model.r;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.JazzcashWallet;
import com.yandex.go.payments.data.model.response.m0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionTypeDto;
import defpackage.ygx;
import flex.animation.player.interpolator.InterpolationType;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.concurrent.Executors;
import just.adapter.snapping.IntervalType;

/* loaded from: classes12.dex */
public final /* synthetic */ class ojw implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ojw(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vez0.g("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionTypeDto", IntercityDashboardSectionTypeDto.values(), new String[]{"header", "address_selector", "due_selector", "tariff_selector", "banner_carousel", "seats_selector", "comment_selector", null}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 1:
                u uVar = IntercityMainAction.Addresses.Coordinates.Companion;
                return new p53(e6m.a, 0);
            case 2:
                return IntercityOpenFlexScreenAction.Companion.serializer();
            case 3:
                return IntercityOpenSelectPaymentMethodScreenAction.Companion.serializer();
            case 4:
                f fVar = IntercityOpenShuttleClarifyPointAction.Companion;
                return IntercityOpenShuttleClarifyPointAction.FlexPointType.Companion.serializer();
            case 5:
                f fVar2 = IntercityOpenShuttleClarifyPointAction.Companion;
                return new p53(IntercityOpenShuttleClarifyPointAction$AvailablePointToSelection$$serializer.INSTANCE, 0);
            case 6:
                d dVar = IntercityOpenShuttleClarifyPointAction.AvailablePointToSelection.Companion;
                return new eni0(qoi0.a(Double.class), e6m.a);
            case 7:
                e eVar = IntercityOpenShuttleClarifyPointAction.ClarifyPointOriginalPoint.Companion;
                return new eni0(qoi0.a(Double.class), e6m.a);
            case 8:
                return vez0.g("com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenShuttleClarifyPointAction.FlexPointType", IntercityOpenShuttleClarifyPointAction.FlexPointType.values(), new String[]{"source", "destination"}, new Annotation[][]{null, null});
            case 9:
                l lVar = IntercityOpenShuttleClarifyPointAction.TripInfoPoint.Companion;
                return new eni0(qoi0.a(Double.class), e6m.a);
            case 10:
                return IntercityOpenShuttleClarifyPointAction.Companion.serializer();
            case 11:
                return bti0.Companion.serializer();
            case 12:
                return IntercitySelectContactAction.Companion.serializer();
            case 13:
                return SendOrderDraftAction.Companion.serializer();
            case 14:
                return Executors.newSingleThreadExecutor();
            case 15:
                return new t8j0();
            case 16:
                return vez0.g("flex.animation.player.interpolator.InterpolationType", InterpolationType.values(), new String[]{"linear", "easeIn", "easeOut", "easeInOut"}, new Annotation[][]{null, null, null, null});
            case 17:
                quw quwVar = ruw.Companion;
                return IntervalType.Companion.serializer();
            case 18:
                return vez0.g("just.adapter.snapping.IntervalType", IntervalType.values(), new String[]{"absolute", "relative"}, new Annotation[][]{null, null});
            case 19:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, new p53(auu0Var, 0), 1);
            case 20:
                return new p53(a2x.Companion.serializer(), 0);
            case 21:
                return new p53(qke.n(auu0.a), 0);
            case 22:
                c cVar = JasonStateNodeDto.Companion;
                return new p53(udx.a, 0);
            case 23:
                m0 m0Var = JazzcashWallet.Companion;
                return Card.VerifyStrategy.Companion.serializer();
            case 24:
                r rVar = JazzcashWalletDto.Companion;
                return VerifyStrategy.Companion.serializer();
            case 25:
                b bVar = JsFilesContent.Companion;
                return new p53(JsFile$$serializer.INSTANCE, 0);
            case 26:
                v3u v3uVar = new v3u();
                ToNumberPolicy toNumberPolicy = ToNumberPolicy.LONG_OR_DOUBLE;
                Objects.requireNonNull(toNumberPolicy);
                v3uVar.m = toNumberPolicy;
                v3uVar.n = toNumberPolicy;
                return new u3u(v3uVar);
            case 27:
                return new u3u(new v3u());
            case 28:
                xgx xgxVar = ygx.a.Companion;
                return new p53(auu0.a, 0);
            default:
                return new Handler(Looper.getMainLooper());
        }
    }
}
