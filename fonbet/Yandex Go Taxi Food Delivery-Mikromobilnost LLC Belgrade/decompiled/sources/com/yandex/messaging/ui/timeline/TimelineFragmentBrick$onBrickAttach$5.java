package com.yandex.messaging.ui.timeline;

import defpackage.kju0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/messaging/core/net/entities/Metadata;", kju0.j, "Lzy11;", "<anonymous>", "(Lcom/yandex/messaging/core/net/entities/Metadata;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineFragmentBrick$onBrickAttach$5", f = "TimelineFragmentBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineFragmentBrick$onBrickAttach$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFragmentBrick$onBrickAttach$5(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineFragmentBrick$onBrickAttach$5 timelineFragmentBrick$onBrickAttach$5 = new TimelineFragmentBrick$onBrickAttach$5(this.this$0, continuation);
        timelineFragmentBrick$onBrickAttach$5.L$0 = obj;
        return timelineFragmentBrick$onBrickAttach$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineFragmentBrick$onBrickAttach$5 timelineFragmentBrick$onBrickAttach$5 = (TimelineFragmentBrick$onBrickAttach$5) create((com.yandex.messaging.core.net.entities.Metadata) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineFragmentBrick$onBrickAttach$5.invokeSuspend(zy11Var);
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
        this.this$0.J.getClass();
        return zy11.a;
    }
}
