package com.yandex.messaging.analytics;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcz0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.analytics.TimelineOpenLogger$onGapFillFinished$1", f = "TimelineOpenLogger.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineOpenLogger$onGapFillFinished$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $chatId;
    final /* synthetic */ boolean $success;
    final /* synthetic */ long $time;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineOpenLogger$onGapFillFinished$1(b bVar, String str, boolean z, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$chatId = str;
        this.$success = z;
        this.$time = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimelineOpenLogger$onGapFillFinished$1(this.this$0, this.$chatId, this.$success, this.$time, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineOpenLogger$onGapFillFinished$1 timelineOpenLogger$onGapFillFinished$1 = (TimelineOpenLogger$onGapFillFinished$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineOpenLogger$onGapFillFinished$1.invokeSuspend(zy11Var);
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
        tcz0 a = this.this$0.a(this.$chatId);
        if (a != null) {
            boolean z = this.$success;
            long j = this.$time;
            if (a.f && !a.e) {
                a.g = z;
                a.j = new Long(j);
            }
        }
        return zy11.a;
    }
}
