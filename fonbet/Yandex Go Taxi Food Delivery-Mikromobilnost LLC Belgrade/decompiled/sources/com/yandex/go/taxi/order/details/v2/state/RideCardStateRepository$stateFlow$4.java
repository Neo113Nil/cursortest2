package com.yandex.go.taxi.order.details.v2.state;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qnk0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqnk0;", "it", "Lzy11;", "<anonymous>", "(Lqnk0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.RideCardStateRepository$stateFlow$4", f = "RideCardStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardStateRepository$stateFlow$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardStateRepository$stateFlow$4(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardStateRepository$stateFlow$4 rideCardStateRepository$stateFlow$4 = new RideCardStateRepository$stateFlow$4(this.this$0, continuation);
        rideCardStateRepository$stateFlow$4.L$0 = obj;
        return rideCardStateRepository$stateFlow$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RideCardStateRepository$stateFlow$4 rideCardStateRepository$stateFlow$4 = (RideCardStateRepository$stateFlow$4) create((qnk0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardStateRepository$stateFlow$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qnk0 qnk0Var = (qnk0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        dVar.e.d(((qnk0) dVar.f.getValue()).b, qnk0Var.b, ((qnk0) this.this$0.f.getValue()).a.size());
        r0 r0Var = this.this$0.f;
        r0Var.getClass();
        r0Var.m(null, qnk0Var);
        return zy11.a;
    }
}
