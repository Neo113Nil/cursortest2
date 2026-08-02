package com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qhk0;
import defpackage.qv10;
import defpackage.tse;
import defpackage.wls;
import defpackage.ygk0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation.RideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1", f = "RideCardDriverSectionOrchestrator.kt", l = {424}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ qhk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1(qhk0 qhk0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qhk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, ygk0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return zy11Var;
        }
        Ref$ObjectRef z = qv10.z(obj);
        z.element = ygk0.m;
        qhk0 qhk0Var = this.this$0;
        r0 r0Var = qhk0Var.b;
        a aVar = new a(z, qhk0Var);
        this.L$0 = null;
        this.label = 1;
        Object collect = r0Var.collect(new h0(aVar), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
