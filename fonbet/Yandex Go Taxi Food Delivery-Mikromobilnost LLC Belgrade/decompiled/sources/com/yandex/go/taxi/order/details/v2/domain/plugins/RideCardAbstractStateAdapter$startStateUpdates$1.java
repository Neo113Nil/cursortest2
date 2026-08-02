package com.yandex.go.taxi.order.details.v2.domain.plugins;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.domain.plugins.RideCardAbstractStateAdapter$startStateUpdates$1", f = "RideCardAbstractStateAdapter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardAbstractStateAdapter$startStateUpdates$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardAbstractStateAdapter$startStateUpdates$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardAbstractStateAdapter$startStateUpdates$1 rideCardAbstractStateAdapter$startStateUpdates$1 = new RideCardAbstractStateAdapter$startStateUpdates$1(this.this$0, continuation);
        rideCardAbstractStateAdapter$startStateUpdates$1.L$0 = obj;
        return rideCardAbstractStateAdapter$startStateUpdates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RideCardAbstractStateAdapter$startStateUpdates$1 rideCardAbstractStateAdapter$startStateUpdates$1 = (RideCardAbstractStateAdapter$startStateUpdates$1) create(obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardAbstractStateAdapter$startStateUpdates$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.b.l(obj2);
        return zy11.a;
    }
}
