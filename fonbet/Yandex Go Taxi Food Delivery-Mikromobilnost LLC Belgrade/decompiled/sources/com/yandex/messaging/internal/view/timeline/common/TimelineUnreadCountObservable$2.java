package com.yandex.messaging.internal.view.timeline.common;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x221;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx221;", "it", "Lzy11;", "<anonymous>", "(Lx221;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.common.TimelineUnreadCountObservable$2", f = "TimelineUnreadCountObservable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineUnreadCountObservable$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineUnreadCountObservable$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineUnreadCountObservable$2 timelineUnreadCountObservable$2 = new TimelineUnreadCountObservable$2(this.this$0, continuation);
        timelineUnreadCountObservable$2.L$0 = obj;
        return timelineUnreadCountObservable$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineUnreadCountObservable$2 timelineUnreadCountObservable$2 = (TimelineUnreadCountObservable$2) create((x221) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineUnreadCountObservable$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        x221 x221Var = (x221) this.L$0;
        r0 r0Var = this.this$0.c;
        Integer num = new Integer(x221Var.c);
        r0Var.getClass();
        r0Var.m(null, num);
        return zy11.a;
    }
}
