package com.yandex.go.taxi.order.map.overlay;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.t201;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt201;", "it", "Lzy11;", "<anonymous>", "(Lt201;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayPresenter$startCarPositionTracking$1", f = "OrderMapOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapOverlayPresenter$startCarPositionTracking$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapOverlayPresenter$startCarPositionTracking$1(c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderMapOverlayPresenter$startCarPositionTracking$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderMapOverlayPresenter$startCarPositionTracking$1 orderMapOverlayPresenter$startCarPositionTracking$1 = (OrderMapOverlayPresenter$startCarPositionTracking$1) create((t201) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderMapOverlayPresenter$startCarPositionTracking$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.Qg();
        return zy11.a;
    }
}
