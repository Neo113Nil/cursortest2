package com.yandex.go.timer;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "countdown", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.timer.TimerInteractorImpl$getUntilTypeTimerFlow$2", f = "TimerInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TimerInteractorImpl$getUntilTypeTimerFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $canNegativeCountdown;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerInteractorImpl$getUntilTypeTimerFlow$2(boolean z, Continuation continuation) {
        super(2, continuation);
        this.$canNegativeCountdown = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimerInteractorImpl$getUntilTypeTimerFlow$2 timerInteractorImpl$getUntilTypeTimerFlow$2 = new TimerInteractorImpl$getUntilTypeTimerFlow$2(this.$canNegativeCountdown, continuation);
        timerInteractorImpl$getUntilTypeTimerFlow$2.J$0 = ((Number) obj).longValue();
        return timerInteractorImpl$getUntilTypeTimerFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimerInteractorImpl$getUntilTypeTimerFlow$2) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(this.$canNegativeCountdown || j >= 0);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
