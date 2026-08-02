package com.yandex.go.taxi.order.details.v2.state.elements.timeline.options;

import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton;
import com.yandex.go.taxi.order.models.api.response.o8;
import defpackage.cvu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pok0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "timerString", "Lpok0;", "<anonymous>", "(Ljava/lang/String;)Lpok0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.timeline.options.RideCardTimelineOptionsMapper$buttonTitleFlow$1", f = "RideCardTimelineOptionsMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTimelineOptionsMapper$buttonTitleFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ o8 $buttons;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTimelineOptionsMapper$buttonTitleFlow$1(o8 o8Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$buttons = o8Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardTimelineOptionsMapper$buttonTitleFlow$1 rideCardTimelineOptionsMapper$buttonTitleFlow$1 = new RideCardTimelineOptionsMapper$buttonTitleFlow$1(this.$buttons, this.this$0, continuation);
        rideCardTimelineOptionsMapper$buttonTitleFlow$1.L$0 = obj;
        return rideCardTimelineOptionsMapper$buttonTitleFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardTimelineOptionsMapper$buttonTitleFlow$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new pok0(cvu0.v(((TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton) this.$buttons).a.b, "$TIMER$", str, false), cvu0.v(((TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton) this.$buttons).a.b, "$TIMER$", this.this$0.d.b(str), false));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
