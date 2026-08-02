package com.yandex.go.taxi.order.net.xiva;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p9g0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.net.xiva.TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2", f = "TaxiRouteWebSocketTrackingInteractor.kt", l = {101}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $holder;
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2(o2y0 o2y0Var, d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$holder = o2y0Var;
        this.this$0 = dVar;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2(this.$holder, this.this$0, this.$orderId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiRouteWebSocketTrackingInteractor$setupSubscription$3$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(new c(this.$holder.a(), this.this$0.d));
            p9g0 p9g0Var = new p9g0(24, this.this$0, this.$orderId);
            this.label = 1;
            if (t.collect(p9g0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
