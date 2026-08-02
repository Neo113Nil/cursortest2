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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineToolbarStatusUpdater$updateStatusData$1", f = "TimelineToolbarStatusUpdater.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineToolbarStatusUpdater$updateStatusData$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ edz0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineToolbarStatusUpdater$updateStatusData$1(edz0 edz0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = edz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineToolbarStatusUpdater$updateStatusData$1 timelineToolbarStatusUpdater$updateStatusData$1 = new TimelineToolbarStatusUpdater$updateStatusData$1(this.this$0, continuation);
        timelineToolbarStatusUpdater$updateStatusData$1.L$0 = obj;
        return timelineToolbarStatusUpdater$updateStatusData$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineToolbarStatusUpdater$updateStatusData$1 timelineToolbarStatusUpdater$updateStatusData$1 = (TimelineToolbarStatusUpdater$updateStatusData$1) create((CharSequence) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineToolbarStatusUpdater$updateStatusData$1.invokeSuspend(zy11Var);
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
        CharSequence charSequence = (CharSequence) this.L$0;
        edz0 edz0Var = this.this$0;
        edz0Var.S = charSequence;
        edz0Var.c();
        return zy11.a;
    }
}
