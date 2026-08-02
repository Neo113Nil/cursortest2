package com.yandex.go.taxi.order.details.v2.state.elements.timeline.options;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pok0;
import defpackage.qok0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpok0;", "titleInfo", "Lqok0;", "<anonymous>", "(Lpok0;)Lqok0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.timeline.options.RideCardTimelineOptionsMapper$additionalOrderOptionButtons$1", f = "RideCardTimelineOptionsMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTimelineOptionsMapper$additionalOrderOptionButtons$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $hasPendingChangesForTimelineOptions;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTimelineOptionsMapper$additionalOrderOptionButtons$1(boolean z, Continuation continuation) {
        super(2, continuation);
        this.$hasPendingChangesForTimelineOptions = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardTimelineOptionsMapper$additionalOrderOptionButtons$1 rideCardTimelineOptionsMapper$additionalOrderOptionButtons$1 = new RideCardTimelineOptionsMapper$additionalOrderOptionButtons$1(this.$hasPendingChangesForTimelineOptions, continuation);
        rideCardTimelineOptionsMapper$additionalOrderOptionButtons$1.L$0 = obj;
        return rideCardTimelineOptionsMapper$additionalOrderOptionButtons$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardTimelineOptionsMapper$additionalOrderOptionButtons$1) create((pok0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pok0 pok0Var = (pok0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (pok0Var != null) {
            return new qok0(pok0Var, this.$hasPendingChangesForTimelineOptions);
        }
        return null;
    }
}
