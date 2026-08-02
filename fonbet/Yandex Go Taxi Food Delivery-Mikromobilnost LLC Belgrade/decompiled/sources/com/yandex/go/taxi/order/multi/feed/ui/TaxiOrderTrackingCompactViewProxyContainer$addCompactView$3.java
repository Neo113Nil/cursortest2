package com.yandex.go.taxi.order.multi.feed.ui;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.ack0;
import defpackage.bck0;
import defpackage.cck0;
import defpackage.eck0;
import defpackage.h3y;
import defpackage.ifk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderTrackingCompactViewProxyContainer$addCompactView$3", f = "TaxiOrderTrackingCompactViewProxyContainer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TaxiOrderTrackingCompactViewProxyContainer$addCompactView$3 extends SuspendLambda implements wls {
    final /* synthetic */ cck0 $availability;
    final /* synthetic */ o2y0 $holder;
    int label;
    final /* synthetic */ TaxiOrderTrackingCompactViewProxyContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderTrackingCompactViewProxyContainer$addCompactView$3(TaxiOrderTrackingCompactViewProxyContainer taxiOrderTrackingCompactViewProxyContainer, cck0 cck0Var, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = taxiOrderTrackingCompactViewProxyContainer;
        this.$availability = cck0Var;
        this.$holder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderTrackingCompactViewProxyContainer$addCompactView$3(this.this$0, this.$availability, this.$holder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiOrderTrackingCompactViewProxyContainer$addCompactView$3 taxiOrderTrackingCompactViewProxyContainer$addCompactView$3 = (TaxiOrderTrackingCompactViewProxyContainer$addCompactView$3) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiOrderTrackingCompactViewProxyContainer$addCompactView$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h3y h3yVar;
        eck0 eck0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        h3yVar = this.this$0.rideCardRouterFacade;
        ifk0 ifk0Var = ((com.yandex.go.taxi.order.details.v2.navigation.d) h3yVar.get()).f;
        if (ifk0Var != null) {
            ifk0Var.i();
        }
        this.this$0.removeAllViews();
        cck0 cck0Var = this.$availability;
        if (cck0Var instanceof bck0) {
            eck0Var = this.this$0.rideCardAvailabilityAnalytics;
            eck0Var.a(OrderScreen.ORDER_TRACKING, (bck0) this.$availability);
            this.this$0.addOrderListView();
        } else {
            if (!(cck0Var instanceof ack0)) {
                w511.b();
                return null;
            }
            this.this$0.addRideCardView(this.$holder);
        }
        return zy11.a;
    }
}
