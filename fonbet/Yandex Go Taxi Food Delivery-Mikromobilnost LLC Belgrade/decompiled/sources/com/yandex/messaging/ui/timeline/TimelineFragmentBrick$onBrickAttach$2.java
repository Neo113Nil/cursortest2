package com.yandex.messaging.ui.timeline;

import defpackage.bms;
import defpackage.j3b;
import defpackage.jbz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "canUserCreateMeetingsInChat", "hasMeetingInChat", "Loyj0;", "Lj3b;", "Lcom/yandex/messaging/internal/net/Error;", "chatInfoResult", "Lzy11;", "<anonymous>", "(ZZLoyj0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineFragmentBrick$onBrickAttach$2", f = "TimelineFragmentBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineFragmentBrick$onBrickAttach$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFragmentBrick$onBrickAttach$2(f fVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        TimelineFragmentBrick$onBrickAttach$2 timelineFragmentBrick$onBrickAttach$2 = new TimelineFragmentBrick$onBrickAttach$2(this.this$0, (Continuation) obj4);
        timelineFragmentBrick$onBrickAttach$2.Z$0 = booleanValue;
        timelineFragmentBrick$onBrickAttach$2.Z$1 = booleanValue2;
        timelineFragmentBrick$onBrickAttach$2.L$0 = (oyj0) obj3;
        zy11 zy11Var = zy11.a;
        timelineFragmentBrick$onBrickAttach$2.invokeSuspend(zy11Var);
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
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        j3b j3bVar = (j3b) ((oyj0) this.L$0).b();
        if (j3bVar == null || !j3bVar.C) {
        }
        if (!z || !z2) {
        }
        ((jbz0) this.this$0.J.a.get()).a();
        ((jbz0) this.this$0.J.a.get()).a();
        return zy11.a;
    }
}
