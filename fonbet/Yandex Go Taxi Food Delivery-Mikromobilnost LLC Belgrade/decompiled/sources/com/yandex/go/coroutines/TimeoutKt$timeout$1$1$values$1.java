package com.yandex.go.coroutines;

import defpackage.gqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.TimeoutKt$timeout$1$1$values$1", f = "Timeout.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class TimeoutKt$timeout$1$1$values$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $upstreamFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeoutKt$timeout$1$1$values$1(tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.$upstreamFlow = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimeoutKt$timeout$1$1$values$1 timeoutKt$timeout$1$1$values$1 = new TimeoutKt$timeout$1$1$values$1(this.$upstreamFlow, continuation);
        timeoutKt$timeout$1$1$values$1.L$0 = obj;
        return timeoutKt$timeout$1$1$values$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimeoutKt$timeout$1$1$values$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$upstreamFlow;
            gqr gqrVar = new gqr(y6f0Var, 1);
            this.L$0 = null;
            this.label = 1;
            if (tprVar.collect(gqrVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
