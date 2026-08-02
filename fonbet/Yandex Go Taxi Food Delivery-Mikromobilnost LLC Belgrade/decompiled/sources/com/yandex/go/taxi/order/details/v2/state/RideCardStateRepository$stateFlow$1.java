package com.yandex.go.taxi.order.details.v2.state;

import defpackage.agk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lqnk0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.RideCardStateRepository$stateFlow$1", f = "RideCardStateRepository.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardStateRepository$stateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardPresentationType $presentation;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardStateRepository$stateFlow$1(d dVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$presentation = rideCardPresentationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardStateRepository$stateFlow$1 rideCardStateRepository$stateFlow$1 = new RideCardStateRepository$stateFlow$1(this.this$0, this.$presentation, continuation);
        rideCardStateRepository$stateFlow$1.L$0 = obj;
        return rideCardStateRepository$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardStateRepository$stateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            dVar.e.c(this.$presentation, dVar.a.b().a);
            agk0 agk0Var = this.this$0.d;
            agk0Var.a.b();
            agk0Var.b.b();
            this.this$0.b.d(this.$presentation);
            Object value = this.this$0.f.getValue();
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(value, this) == coroutineSingletons) {
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
