package com.yandex.go.multimodal_route.ui.detailed_card;

import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteButtonType;
import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteScreenStatus;
import com.yandex.go.taxi.order.models.api.preorder.SelectedTariffInfo;
import com.yandex.go.taxi.order.models.api.preorder.TollRoads;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import defpackage.agd;
import defpackage.aw40;
import defpackage.bg30;
import defpackage.c21;
import defpackage.cg30;
import defpackage.es40;
import defpackage.gh00;
import defpackage.i3y;
import defpackage.is40;
import defpackage.jj3;
import defpackage.jl40;
import defpackage.js40;
import defpackage.ks40;
import defpackage.mvg;
import defpackage.ns40;
import defpackage.ny61;
import defpackage.o711;
import defpackage.os40;
import defpackage.p711;
import defpackage.ps40;
import defpackage.q711;
import defpackage.qs40;
import defpackage.qu;
import defpackage.qzj0;
import defpackage.r711;
import defpackage.rs40;
import defpackage.rs5;
import defpackage.ss40;
import defpackage.ts40;
import defpackage.tse;
import defpackage.um3;
import defpackage.us40;
import defpackage.v3y0;
import defpackage.vs40;
import defpackage.w511;
import defpackage.wls;
import defpackage.ws40;
import defpackage.xs40;
import defpackage.xv10;
import defpackage.y711;
import defpackage.yfd;
import defpackage.ys40;
import defpackage.zs40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteDetailedCardRouter$content$1$1$1", f = "MultimodalRouteDetailedCardRouter.kt", l = {111}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRouteDetailedCardRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ zs40 $action;
    final /* synthetic */ js40 $innerNavigator;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ ks40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRouteDetailedCardRouter$content$1$1$1(ks40 ks40Var, yfd yfdVar, zs40 zs40Var, js40 js40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ks40Var;
        this.$this_buildContent = yfdVar;
        this.$action = zs40Var;
        this.$innerNavigator = js40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultimodalRouteDetailedCardRouter$content$1$1$1(this.this$0, this.$this_buildContent, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalRouteDetailedCardRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0217 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Route route;
        RouteMetadata metadata;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        xv10 xv10Var = this.this$0.a0;
        Object obj2 = ((agd) this.$this_buildContent).a;
        String str2 = ((is40) obj2).d;
        String str3 = ((is40) obj2).b;
        zs40 zs40Var = this.$action;
        js40 js40Var = this.$innerNavigator;
        this.label = 1;
        g gVar = (g) xv10Var.c;
        i3y i3yVar = (i3y) xv10Var.x;
        es40 es40Var = (es40) xv10Var.w;
        if (zs40Var instanceof ys40) {
            if (str2 == null) {
                str2 = "";
            }
            es40Var.a(str2, str3, MultimodalRouteAnalytics$MultimodalRouteButtonType.ModalOpen, MultimodalRouteAnalytics$MultimodalRouteScreenStatus.Details);
        } else if (zs40Var instanceof os40) {
            String str4 = str2 == null ? "" : str2;
            MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType = MultimodalRouteAnalytics$MultimodalRouteButtonType.ModalClose;
            MultimodalRouteAnalytics$MultimodalRouteScreenStatus multimodalRouteAnalytics$MultimodalRouteScreenStatus = MultimodalRouteAnalytics$MultimodalRouteScreenStatus.Details;
            es40Var.a(str4, str3, multimodalRouteAnalytics$MultimodalRouteButtonType, multimodalRouteAnalytics$MultimodalRouteScreenStatus);
            if (str2 == null) {
                str2 = "";
            }
            es40Var.a(str2, str3, MultimodalRouteAnalytics$MultimodalRouteButtonType.Back, multimodalRouteAnalytics$MultimodalRouteScreenStatus);
            js40Var.a.r(new qu(9));
        } else if (zs40Var instanceof ts40) {
            ((y711) i3yVar.getValue()).a(new o711(((ts40) zs40Var).a), new MultimodalRouteDetailedCardUiActionInteractor$handleAction$2(1, js40Var, js40.class, "launchTransportRouteListRouter", "launchTransportRouteListRouter(Lcom/yandex/go/multimodal_route/api/TransportRoutePartActionPayload;)V", 0));
        } else if (zs40Var instanceof ws40) {
            if (str2 == null) {
                str2 = "";
            }
            es40Var.a(str2, str3, MultimodalRouteAnalytics$MultimodalRouteButtonType.ThreadVariants, MultimodalRouteAnalytics$MultimodalRouteScreenStatus.Details);
            ((y711) i3yVar.getValue()).a(new q711(((ws40) zs40Var).a), new MultimodalRouteDetailedCardUiActionInteractor$handleAction$3(1, js40Var, js40.class, "launchTransportRouteListRouter", "launchTransportRouteListRouter(Lcom/yandex/go/multimodal_route/api/TransportRoutePartActionPayload;)V", 0));
        } else if (zs40Var instanceof us40) {
            if (str2 == null) {
                str2 = "";
            }
            es40Var.a(str2, str3, MultimodalRouteAnalytics$MultimodalRouteButtonType.ScheduleAndTickets, MultimodalRouteAnalytics$MultimodalRouteScreenStatus.Details);
            ((y711) i3yVar.getValue()).a(new p711(((us40) zs40Var).a), new MultimodalRouteDetailedCardUiActionInteractor$handleAction$4(1, js40Var, js40.class, "launchTransportRouteListRouter", "launchTransportRouteListRouter(Lcom/yandex/go/multimodal_route/api/TransportRoutePartActionPayload;)V", 0));
        } else if (zs40Var instanceof xs40) {
            if (str2 == null) {
                str2 = "";
            }
            es40Var.a(str2, str3, MultimodalRouteAnalytics$MultimodalRouteButtonType.MyTickets, MultimodalRouteAnalytics$MultimodalRouteScreenStatus.Details);
            ((y711) i3yVar.getValue()).a(new r711(((xs40) zs40Var).a), new MultimodalRouteDetailedCardUiActionInteractor$handleAction$5(1, js40Var, js40.class, "launchTransportRouteListRouter", "launchTransportRouteListRouter(Lcom/yandex/go/multimodal_route/api/TransportRoutePartActionPayload;)V", 0));
        } else if (zs40Var instanceof ss40) {
            bg30 bg30Var = ((ss40) zs40Var).a;
            ks40 ks40Var = js40Var.a;
            bg30 bg30Var2 = ks40Var.c0;
            if (bg30Var2 != null && (route = bg30Var2.a) != null && (metadata = route.getMetadata()) != null) {
                str = metadata.getRouteId();
            }
            if (!jl40.l(str, bg30Var.a.getMetadata().getRouteId())) {
                ks40Var.c0 = bg30Var;
                cg30 cg30Var = (cg30) ks40Var.H.get();
                ks40Var.b0 = cg30Var;
                cg30Var.i();
                ks40Var.A(cg30Var, bg30Var, new c21());
            }
        } else if (zs40Var instanceof vs40) {
            js40Var.a();
        } else if (zs40Var instanceof ns40) {
            ns40 ns40Var = (ns40) zs40Var;
            aw40 aw40Var = ns40Var.a;
            v3y0 v3y0Var = ns40Var.b;
            if (aw40Var != null) {
                SelectedTariffInfo selectedTariffInfo = (SelectedTariffInfo) aw40Var.f;
                ((jj3) js40Var.a.O.get()).c(new um3(Events$Zalogin$LoginContext.MOBILITY_HUB, new qzj0(null, new rs5(js40Var.a, (String) aw40Var.b, (TollRoads) aw40Var.e, v3y0Var != null ? v3y0Var.c : null, v3y0Var != null ? v3y0Var.a : null, v3y0Var != null ? v3y0Var.b : null, selectedTariffInfo)), false, false, 28));
            } else if (aw40Var != null) {
                w511.b();
                return null;
            }
        } else if (zs40Var instanceof qs40) {
            ((gh00) gVar.a).A(((qs40) zs40Var).a, null);
            gVar.f.l(MultimodalRouteFabState.FOCUS_USER_LOCATION);
        } else {
            if (jl40.l(zs40Var, rs40.a)) {
                a = gVar.a(this);
                return a != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            if (!jl40.l(zs40Var, ps40.a)) {
                w511.b();
                return null;
            }
            if (str2 == null) {
                str2 = "";
            }
            es40Var.a(str2, str3, MultimodalRouteAnalytics$MultimodalRouteButtonType.EndOfModal, MultimodalRouteAnalytics$MultimodalRouteScreenStatus.Details);
        }
        a = zy11Var;
        if (a != coroutineSingletons) {
        }
    }
}
