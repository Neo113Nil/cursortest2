package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import defpackage.a3y0;
import defpackage.c680;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oa1;
import defpackage.ra80;
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
@mvg(c = "com.yandex.go.superapp.order.multi.old.view.OrderStackViewPresenter$onTaxiOrderTrackingHandled$1", f = "OrderStackViewPresenter.kt", l = {582, 583}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStackViewPresenter$onTaxiOrderTrackingHandled$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ OrderScreen $prevScreenState;
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
    public OrderStackViewPresenter$onTaxiOrderTrackingHandled$1(ra80 ra80Var, f fVar, OrderScreen orderScreen, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$orderId = str;
        this.$state = ra80Var;
        this.$prevScreenState = orderScreen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderStackViewPresenter$onTaxiOrderTrackingHandled$1 orderStackViewPresenter$onTaxiOrderTrackingHandled$1 = new OrderStackViewPresenter$onTaxiOrderTrackingHandled$1(this.$state, this.this$0, this.$prevScreenState, this.$orderId, continuation);
        orderStackViewPresenter$onTaxiOrderTrackingHandled$1.L$0 = obj;
        return orderStackViewPresenter$onTaxiOrderTrackingHandled$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderStackViewPresenter$onTaxiOrderTrackingHandled$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0095 A[Catch: all -> 0x002f, CancellationException -> 0x00f3, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00f3, blocks: (B:7:0x002a, B:8:0x0091, B:10:0x0095, B:15:0x00ab, B:17:0x00b9, B:19:0x00c5, B:20:0x00cd, B:22:0x00de, B:23:0x00e0, B:30:0x00c8, B:31:0x00cb, B:35:0x0048, B:38:0x0070, B:40:0x0074, B:46:0x005b), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9 A[Catch: all -> 0x00a8, CancellationException -> 0x00f3, TryCatch #1 {all -> 0x00a8, blocks: (B:15:0x00ab, B:17:0x00b9, B:19:0x00c5, B:20:0x00cd, B:22:0x00de, B:23:0x00e0, B:30:0x00c8, B:31:0x00cb, B:38:0x0070, B:40:0x0074), top: B:37:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de A[Catch: all -> 0x00a8, CancellationException -> 0x00f3, TryCatch #1 {all -> 0x00a8, blocks: (B:15:0x00ab, B:17:0x00b9, B:19:0x00c5, B:20:0x00cd, B:22:0x00de, B:23:0x00e0, B:30:0x00c8, B:31:0x00cb, B:38:0x0070, B:40:0x0074), top: B:37:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb A[Catch: all -> 0x00a8, CancellationException -> 0x00f3, TryCatch #1 {all -> 0x00a8, blocks: (B:15:0x00ab, B:17:0x00b9, B:19:0x00c5, B:20:0x00cd, B:22:0x00de, B:23:0x00e0, B:30:0x00c8, B:31:0x00cb, B:38:0x0070, B:40:0x0074), top: B:37:0x0070 }] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tse] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.yandex.go.superapp.order.multi.old.view.f] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar;
        OrderScreen orderScreen;
        Object Ng;
        f fVar2;
        ra80 ra80Var;
        o2y0 o2y0Var;
        f fVar3;
        ra80 ra80Var2;
        OrderScreen orderScreen2;
        DetailsOpenReason detailsOpenReason;
        o2y0 o2y0Var2;
        zy11 zy11Var = zy11.a;
        ?? r1 = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        kotlin.b.b(obj);
                        fVar = this.this$0;
                        String str = this.$orderId;
                        ra80 ra80Var3 = this.$state;
                        orderScreen = this.$prevScreenState;
                        try {
                            this.L$0 = r1;
                            this.L$1 = fVar;
                            this.L$2 = ra80Var3;
                            this.L$3 = orderScreen;
                            this.L$4 = fVar;
                            this.label = 1;
                            Ng = f.Ng(fVar, str, this);
                            if (Ng != coroutineSingletons) {
                                fVar2 = fVar;
                                ra80Var = ra80Var3;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th) {
                            th = th;
                            r1 = fVar;
                            r1.f0.b("onTaxiOrderTrackingHandled", th, new c680(4));
                            return zy11Var;
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f fVar4 = (f) this.L$4;
                        orderScreen2 = (OrderScreen) this.L$3;
                        ra80Var2 = (ra80) this.L$2;
                        fVar3 = (f) this.L$1;
                        kotlin.b.b(obj);
                        r1 = fVar4;
                        o2y0Var2 = (o2y0) obj;
                        if (o2y0Var2 != null) {
                            a3y0.d(fVar3.f0, "onTaxiOrderTrackingHandled", new IllegalStateException("Missing active order"), null, 4);
                            return zy11Var;
                        }
                        orderScreen = orderScreen2;
                        ra80Var = ra80Var2;
                        fVar2 = r1;
                        o2y0Var = o2y0Var2;
                        fVar = fVar3;
                        r0 r0Var = fVar.L.p;
                        r0Var.getClass();
                        r0Var.m(null, o2y0Var);
                        ((OrderStackMvpView) fVar.Dg()).Y7(ra80Var.b, !ra80Var.f ? o2y0Var.b().l.getA() ? OrderStackMvpView.AnimationType.FADE : OrderStackMvpView.AnimationType.HORIZONTAL_TRANSLATION : OrderStackMvpView.AnimationType.NONE, orderScreen);
                        oa1 oa1Var = fVar.a0;
                        detailsOpenReason = ra80Var.d;
                        if (detailsOpenReason == null) {
                            detailsOpenReason = DetailsOpenReason.AUTO;
                        }
                        oa1Var.b(detailsOpenReason, "SuperappOrderDetails");
                        return zy11Var;
                    }
                    f fVar5 = (f) this.L$4;
                    OrderScreen orderScreen3 = (OrderScreen) this.L$3;
                    ra80Var = (ra80) this.L$2;
                    f fVar6 = (f) this.L$1;
                    kotlin.b.b(obj);
                    orderScreen = orderScreen3;
                    fVar2 = fVar5;
                    Ng = obj;
                    fVar = fVar6;
                    o2y0Var = (o2y0) Ng;
                    if (o2y0Var == null) {
                        com.yandex.go.taxi.order.provider.a aVar = fVar.C;
                        this.L$0 = null;
                        this.L$1 = fVar;
                        this.L$2 = ra80Var;
                        this.L$3 = orderScreen;
                        this.L$4 = fVar2;
                        this.L$5 = null;
                        this.label = 2;
                        Object t = aVar.t(this);
                        if (t != coroutineSingletons) {
                            f fVar7 = fVar;
                            obj = t;
                            fVar3 = fVar7;
                            r1 = fVar2;
                            ra80Var2 = ra80Var;
                            orderScreen2 = orderScreen;
                            o2y0Var2 = (o2y0) obj;
                            if (o2y0Var2 != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    r0 r0Var2 = fVar.L.p;
                    r0Var2.getClass();
                    r0Var2.m(null, o2y0Var);
                    ((OrderStackMvpView) fVar.Dg()).Y7(ra80Var.b, !ra80Var.f ? o2y0Var.b().l.getA() ? OrderStackMvpView.AnimationType.FADE : OrderStackMvpView.AnimationType.HORIZONTAL_TRANSLATION : OrderStackMvpView.AnimationType.NONE, orderScreen);
                    oa1 oa1Var2 = fVar.a0;
                    detailsOpenReason = ra80Var.d;
                    if (detailsOpenReason == null) {
                    }
                    oa1Var2.b(detailsOpenReason, "SuperappOrderDetails");
                    return zy11Var;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = fVar2;
                    r1.f0.b("onTaxiOrderTrackingHandled", th, new c680(4));
                    return zy11Var;
                }
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
