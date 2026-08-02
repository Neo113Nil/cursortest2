package com.yandex.messaging.ui.timeline;

import defpackage.edz0;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y0k;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly0k;", "it", "Lzy11;", "<anonymous>", "(Ly0k;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineToolbarStatusUpdater$onAttach$1", f = "TimelineToolbarStatusUpdater.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineToolbarStatusUpdater$onAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ edz0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineToolbarStatusUpdater$onAttach$1(edz0 edz0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = edz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineToolbarStatusUpdater$onAttach$1 timelineToolbarStatusUpdater$onAttach$1 = new TimelineToolbarStatusUpdater$onAttach$1(this.this$0, continuation);
        timelineToolbarStatusUpdater$onAttach$1.L$0 = obj;
        return timelineToolbarStatusUpdater$onAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineToolbarStatusUpdater$onAttach$1 timelineToolbarStatusUpdater$onAttach$1 = (TimelineToolbarStatusUpdater$onAttach$1) create((y0k) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineToolbarStatusUpdater$onAttach$1.invokeSuspend(zy11Var);
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
        y0k y0kVar = (y0k) this.L$0;
        edz0 edz0Var = this.this$0;
        kgx[] kgxVarArr = edz0.a0;
        edz0Var.getClass();
        edz0Var.Q = y0kVar.a;
        edz0Var.R = y0kVar.b;
        edz0Var.c();
        return zy11.a;
    }
}
