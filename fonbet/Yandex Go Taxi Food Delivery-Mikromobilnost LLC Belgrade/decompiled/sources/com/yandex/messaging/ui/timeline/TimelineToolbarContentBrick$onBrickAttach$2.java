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
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", RemoteBioParameters.TIME, "Lzy11;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineToolbarContentBrick$onBrickAttach$2", f = "TimelineToolbarContentBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineToolbarContentBrick$onBrickAttach$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineToolbarContentBrick$onBrickAttach$2(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineToolbarContentBrick$onBrickAttach$2 timelineToolbarContentBrick$onBrickAttach$2 = new TimelineToolbarContentBrick$onBrickAttach$2(this.this$0, continuation);
        timelineToolbarContentBrick$onBrickAttach$2.L$0 = obj;
        return timelineToolbarContentBrick$onBrickAttach$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineToolbarContentBrick$onBrickAttach$2 timelineToolbarContentBrick$onBrickAttach$2 = (TimelineToolbarContentBrick$onBrickAttach$2) create((Long) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineToolbarContentBrick$onBrickAttach$2.invokeSuspend(zy11Var);
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
        ((edz0) this.this$0.x.get()).b((Long) this.L$0);
        return zy11.a;
    }
}
