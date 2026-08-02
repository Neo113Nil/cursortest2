package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.superapp.order.multi.old.OrdersListAnalytics$ListCloseReason;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import com.yandex.passport.internal.ui.social.gimap.SmtpServerPrefsFragment;
import defpackage.a3y0;
import defpackage.c680;
import defpackage.ev6;
import defpackage.g18;
import defpackage.hc00;
import defpackage.ic00;
import defpackage.kc00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.ra80;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.view.OrderStackViewPresenter$onOrderDetailsHandled$1", f = "OrderStackViewPresenter.kt", l = {464, SmtpServerPrefsFragment.DEFAULT_SMTP_PORT, 492}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStackViewPresenter$onOrderDetailsHandled$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ OrderScreen $prevState;
    final /* synthetic */ ra80 $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStackViewPresenter$onOrderDetailsHandled$1(ra80 ra80Var, f fVar, OrderScreen orderScreen, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$orderId = str;
        this.$prevState = orderScreen;
        this.$state = ra80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = this.this$0;
        String str = this.$orderId;
        OrderStackViewPresenter$onOrderDetailsHandled$1 orderStackViewPresenter$onOrderDetailsHandled$1 = new OrderStackViewPresenter$onOrderDetailsHandled$1(this.$state, fVar, this.$prevState, str, continuation);
        orderStackViewPresenter$onOrderDetailsHandled$1.L$0 = obj;
        return orderStackViewPresenter$onOrderDetailsHandled$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderStackViewPresenter$onOrderDetailsHandled$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5 A[Catch: all -> 0x00b0, CancellationException -> 0x0175, TryCatch #0 {all -> 0x00b0, blocks: (B:17:0x00a1, B:19:0x00a5, B:21:0x00b4, B:23:0x00bc, B:25:0x00c9, B:26:0x00d2, B:28:0x00d6, B:29:0x00e7, B:32:0x0121, B:35:0x0150, B:37:0x00de, B:39:0x00e2, B:12:0x0085, B:14:0x0089, B:6:0x006f), top: B:5:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc A[Catch: all -> 0x00b0, CancellationException -> 0x0175, TryCatch #0 {all -> 0x00b0, blocks: (B:17:0x00a1, B:19:0x00a5, B:21:0x00b4, B:23:0x00bc, B:25:0x00c9, B:26:0x00d2, B:28:0x00d6, B:29:0x00e7, B:32:0x0121, B:35:0x0150, B:37:0x00de, B:39:0x00e2, B:12:0x0085, B:14:0x0089, B:6:0x006f), top: B:5:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6 A[Catch: all -> 0x00b0, CancellationException -> 0x0175, TryCatch #0 {all -> 0x00b0, blocks: (B:17:0x00a1, B:19:0x00a5, B:21:0x00b4, B:23:0x00bc, B:25:0x00c9, B:26:0x00d2, B:28:0x00d6, B:29:0x00e7, B:32:0x0121, B:35:0x0150, B:37:0x00de, B:39:0x00e2, B:12:0x0085, B:14:0x0089, B:6:0x006f), top: B:5:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121 A[Catch: all -> 0x00b0, CancellationException -> 0x0175, TRY_ENTER, TryCatch #0 {all -> 0x00b0, blocks: (B:17:0x00a1, B:19:0x00a5, B:21:0x00b4, B:23:0x00bc, B:25:0x00c9, B:26:0x00d2, B:28:0x00d6, B:29:0x00e7, B:32:0x0121, B:35:0x0150, B:37:0x00de, B:39:0x00e2, B:12:0x0085, B:14:0x0089, B:6:0x006f), top: B:5:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150 A[Catch: all -> 0x00b0, CancellationException -> 0x0175, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:17:0x00a1, B:19:0x00a5, B:21:0x00b4, B:23:0x00bc, B:25:0x00c9, B:26:0x00d2, B:28:0x00d6, B:29:0x00e7, B:32:0x0121, B:35:0x0150, B:37:0x00de, B:39:0x00e2, B:12:0x0085, B:14:0x0089, B:6:0x006f), top: B:5:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de A[Catch: all -> 0x00b0, CancellationException -> 0x0175, TryCatch #0 {all -> 0x00b0, blocks: (B:17:0x00a1, B:19:0x00a5, B:21:0x00b4, B:23:0x00bc, B:25:0x00c9, B:26:0x00d2, B:28:0x00d6, B:29:0x00e7, B:32:0x0121, B:35:0x0150, B:37:0x00de, B:39:0x00e2, B:12:0x0085, B:14:0x0089, B:6:0x006f), top: B:5:0x006f }] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tse] */
    /* JADX WARN: Type inference failed for: r2v25 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OrderScreen orderScreen;
        f fVar;
        ra80 ra80Var;
        f fVar2;
        Object obj2;
        Object obj3;
        o2y0 o2y0Var;
        boolean z;
        zy11 zy11Var = zy11.a;
        f fVar3 = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                try {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        f fVar4 = (f) this.L$4;
                        ra80 ra80Var2 = (ra80) this.L$3;
                        orderScreen = (OrderScreen) this.L$2;
                        fVar = (f) this.L$1;
                        kotlin.b.b(obj);
                        ra80Var = ra80Var2;
                        fVar2 = fVar4;
                        obj3 = obj;
                        o2y0Var = (o2y0) obj3;
                        if (o2y0Var == null) {
                            a3y0.d(fVar.f0, "onOrderDetailsHandled", null, new c680(3), 2);
                            return zy11Var;
                        }
                        if (!fVar.B.f()) {
                            ic00 ic00Var = ((kc00) fVar.V).a;
                            ic00Var.getClass();
                            if (!(ic00Var instanceof hc00)) {
                                ((OrderStackMvpView) fVar.Dg()).u8();
                            }
                        }
                        if (orderScreen != OrderScreen.ORDER_LIST) {
                            fVar.G.d(OrdersListAnalytics$ListCloseReason.DETAILS_OPENED);
                        } else {
                            g18 g18Var = fVar.k0;
                            if (g18Var != null) {
                                g18Var.cancel();
                                fVar.k0 = null;
                            }
                        }
                        fVar.G.b(ra80Var.d, o2y0Var.b().h.b);
                        fVar.N.i("order_info", false);
                        r0 r0Var = fVar.L.p;
                        r0Var.getClass();
                        r0Var.m(null, o2y0Var);
                        ((ev6) fVar.o0.getValue()).i();
                        z = ((com.yandex.go.taxi.order.perf.experiment.d) fVar.e0).b().b;
                        com.yandex.go.taxi.order.details.v2.navigation.c cVar = fVar.W;
                        if (z) {
                            cVar.c(o2y0Var, ra80Var, orderScreen, new OrderStackViewPresenter$onOrderDetailsHandled$1$1$2(1, (OrderStackMvpView) fVar.Dg(), OrderStackMvpView.class, "showDetails", "showDetails(Lcom/yandex/go/taxi/order/stack/OrderStackMvpView$DetailsNavigationPayload;)V", 0));
                            return zy11Var;
                        }
                        tpr b = cVar.b(o2y0Var, ra80Var, orderScreen);
                        OrderStackViewPresenter$onOrderDetailsHandled$1$1$1 orderStackViewPresenter$onOrderDetailsHandled$1$1$1 = new OrderStackViewPresenter$onOrderDetailsHandled$1$1$1(2, (OrderStackMvpView) fVar.Dg(), OrderStackMvpView.class, "showDetails", "showDetails(Lcom/yandex/go/taxi/order/stack/OrderStackMvpView$DetailsNavigationPayload;)V", 4);
                        this.L$0 = null;
                        this.L$1 = fVar2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 3;
                        return kotlinx.coroutines.flow.e.k(b, orderStackViewPresenter$onOrderDetailsHandled$1$1$1, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    f fVar5 = (f) this.L$4;
                    ra80 ra80Var3 = (ra80) this.L$3;
                    orderScreen = (OrderScreen) this.L$2;
                    fVar = (f) this.L$1;
                    kotlin.b.b(obj);
                    ra80Var = ra80Var3;
                    fVar2 = fVar5;
                    obj2 = obj;
                } catch (Throwable th) {
                    th = th;
                    fVar3.f0.b("onOrderDetailsHandled", th, new c680(4));
                    return zy11Var;
                }
            } else {
                kotlin.b.b(obj);
                fVar2 = this.this$0;
                String str = this.$orderId;
                OrderScreen orderScreen2 = this.$prevState;
                ra80Var = this.$state;
                try {
                    this.L$0 = fVar3;
                    this.L$1 = fVar2;
                    this.L$2 = orderScreen2;
                    this.L$3 = ra80Var;
                    this.L$4 = fVar2;
                    this.label = 1;
                    obj2 = f.Ng(fVar2, str, this);
                    if (obj2 != coroutineSingletons) {
                        fVar = fVar2;
                        orderScreen = orderScreen2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fVar3 = fVar2;
                    fVar3.f0.b("onOrderDetailsHandled", th, new c680(4));
                    return zy11Var;
                }
            }
            o2y0Var = (o2y0) obj2;
            if (o2y0Var == null) {
                com.yandex.go.taxi.order.provider.a aVar = fVar.C;
                this.L$0 = null;
                this.L$1 = fVar;
                this.L$2 = orderScreen;
                this.L$3 = ra80Var;
                this.L$4 = fVar2;
                this.L$5 = null;
                this.label = 2;
                obj3 = aVar.t(this);
                if (obj3 == coroutineSingletons) {
                }
                o2y0Var = (o2y0) obj3;
                if (o2y0Var == null) {
                }
            }
            if (!fVar.B.f()) {
            }
            if (orderScreen != OrderScreen.ORDER_LIST) {
            }
            fVar.G.b(ra80Var.d, o2y0Var.b().h.b);
            fVar.N.i("order_info", false);
            r0 r0Var2 = fVar.L.p;
            r0Var2.getClass();
            r0Var2.m(null, o2y0Var);
            ((ev6) fVar.o0.getValue()).i();
            z = ((com.yandex.go.taxi.order.perf.experiment.d) fVar.e0).b().b;
            com.yandex.go.taxi.order.details.v2.navigation.c cVar2 = fVar.W;
            if (z) {
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
