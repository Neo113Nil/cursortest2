package com.yandex.messaging.ui.timeline;

import defpackage.edz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "organizationsCount", "Lzy11;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineToolbarContentBrick$onBrickAttach$3", f = "TimelineToolbarContentBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineToolbarContentBrick$onBrickAttach$3 extends SuspendLambda implements wls {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineToolbarContentBrick$onBrickAttach$3(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineToolbarContentBrick$onBrickAttach$3 timelineToolbarContentBrick$onBrickAttach$3 = new TimelineToolbarContentBrick$onBrickAttach$3(this.this$0, continuation);
        timelineToolbarContentBrick$onBrickAttach$3.I$0 = ((Number) obj).intValue();
        return timelineToolbarContentBrick$onBrickAttach$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineToolbarContentBrick$onBrickAttach$3 timelineToolbarContentBrick$onBrickAttach$3 = (TimelineToolbarContentBrick$onBrickAttach$3) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineToolbarContentBrick$onBrickAttach$3.invokeSuspend(zy11Var);
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
        int i = this.I$0;
        edz0 edz0Var = (edz0) this.this$0.x.get();
        edz0Var.T = i;
        edz0Var.c();
        return zy11.a;
    }
}
