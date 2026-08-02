package com.yandex.messaging.ui.timeline;

import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.net.Error;
import defpackage.edz0;
import defpackage.iyj0;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tje;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loyj0;", "Lj3b;", "Lcom/yandex/messaging/internal/net/Error;", "info", "Lzy11;", "<anonymous>", "(Loyj0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineToolbarContentBrick$onBrickAttach$1", f = "TimelineToolbarContentBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineToolbarContentBrick$onBrickAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineToolbarContentBrick$onBrickAttach$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineToolbarContentBrick$onBrickAttach$1 timelineToolbarContentBrick$onBrickAttach$1 = new TimelineToolbarContentBrick$onBrickAttach$1(this.this$0, continuation);
        timelineToolbarContentBrick$onBrickAttach$1.L$0 = obj;
        return timelineToolbarContentBrick$onBrickAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineToolbarContentBrick$onBrickAttach$1 timelineToolbarContentBrick$onBrickAttach$1 = (TimelineToolbarContentBrick$onBrickAttach$1) create((oyj0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineToolbarContentBrick$onBrickAttach$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        oyj0 oyj0Var = (oyj0) this.L$0;
        g gVar = this.this$0;
        if (oyj0Var instanceof myj0) {
            j3b j3bVar = (j3b) ((myj0) oyj0Var).a;
            gVar.L = null;
            edz0 edz0Var = (edz0) gVar.x.get();
            boolean z = edz0Var.M == null;
            edz0Var.I = j3bVar.C;
            edz0Var.J = j3bVar.M;
            edz0Var.K = j3bVar.I;
            edz0Var.L = j3bVar.G;
            edz0Var.M = j3bVar;
            if (z && j3bVar.J) {
                com.yandex.messaging.extension.flow.c.b(edz0Var.B.a(new ThreadChat(j3bVar.b)), edz0Var.U, new TimelineToolbarStatusUpdater$updateStatusData$1(edz0Var, null));
            }
            edz0Var.b(j3bVar.f);
            if (j3bVar.C && !j3bVar.G && (str = j3bVar.e) != null) {
                tje.N(gVar.getBrickScope(), null, null, new TimelineToolbarContentBrick$requestUserGapIfNeeded$1(gVar, str, null), 3);
            }
        } else {
            if (!(oyj0Var instanceof iyj0)) {
                w511.b();
                return null;
            }
            gVar.u((Error) ((iyj0) oyj0Var).a);
        }
        return zy11.a;
    }
}
