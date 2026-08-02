package com.yandex.go.taxi.order.details.v2.state.elements.timeline.options;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qok0;
import defpackage.sok0;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lrok0;", "options", "Lqok0;", "buttons", "Lsok0;", "<anonymous>", "(Ljava/util/List;Lqok0;)Lsok0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.timeline.options.RideCardTimelineOptionsMapper$mapAdditionalOrderOptionsInfo$1", f = "RideCardTimelineOptionsMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTimelineOptionsMapper$mapAdditionalOrderOptionsInfo$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardTimelineOptionsMapper$mapAdditionalOrderOptionsInfo$1 rideCardTimelineOptionsMapper$mapAdditionalOrderOptionsInfo$1 = new RideCardTimelineOptionsMapper$mapAdditionalOrderOptionsInfo$1(3, (Continuation) obj3);
        rideCardTimelineOptionsMapper$mapAdditionalOrderOptionsInfo$1.L$0 = (List) obj;
        rideCardTimelineOptionsMapper$mapAdditionalOrderOptionsInfo$1.L$1 = (qok0) obj2;
        return rideCardTimelineOptionsMapper$mapAdditionalOrderOptionsInfo$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        qok0 qok0Var = (qok0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new sok0(list, qok0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
