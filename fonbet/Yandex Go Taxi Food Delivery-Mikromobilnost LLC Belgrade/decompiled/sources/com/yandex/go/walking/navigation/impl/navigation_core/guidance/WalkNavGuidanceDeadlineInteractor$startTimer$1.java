package com.yandex.go.walking.navigation.impl.navigation_core.guidance;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.navigation_core.guidance.WalkNavGuidanceDeadlineInteractor$startTimer$1", f = "WalkNavGuidanceDeadlineInteractor.kt", l = {91}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceDeadlineInteractor$startTimer$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $delayMs;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceDeadlineInteractor$startTimer$1(long j, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$delayMs = j;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavGuidanceDeadlineInteractor$startTimer$1(this.$delayMs, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavGuidanceDeadlineInteractor$startTimer$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.$delayMs;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.c.d();
        return zy11.a;
    }
}
