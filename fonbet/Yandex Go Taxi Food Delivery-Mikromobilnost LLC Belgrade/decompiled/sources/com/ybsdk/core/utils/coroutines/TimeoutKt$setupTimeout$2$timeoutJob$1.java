package com.ybsdk.core.utils.coroutines;

import defpackage.bvf0;
import defpackage.cez0;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.qv10;
import defpackage.rez0;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.utils.coroutines.TimeoutKt$setupTimeout$2$timeoutJob$1", f = "Timeout.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TimeoutKt$setupTimeout$2$timeoutJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $timeProvider;
    final /* synthetic */ long $timeout;
    final /* synthetic */ cez0 $timeoutScope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeoutKt$setupTimeout$2$timeoutJob$1(sls slsVar, cez0 cez0Var, long j, Continuation continuation) {
        super(2, continuation);
        this.$timeProvider = slsVar;
        this.$timeoutScope = cez0Var;
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimeoutKt$setupTimeout$2$timeoutJob$1(this.$timeProvider, this.$timeoutScope, this.$timeout, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimeoutKt$setupTimeout$2$timeoutJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long V;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        do {
            long j = ((rez0) this.$timeProvider.invoke()).a;
            long j2 = this.$timeoutScope.c;
            char c = j == j2 ? (char) 0 : j > j2 ? (char) 1 : (char) 65535;
            cez0 cez0Var = this.$timeoutScope;
            if (c >= 0) {
                bvf0.j(cez0Var, new TimeoutCancellationException(qv10.k(e3n.e(this.$timeout), "Timed out waiting for ", " ms")));
                return zy11.a;
            }
            long j3 = cez0Var.c;
            long j4 = ((rez0) this.$timeProvider.invoke()).a;
            o430 o430Var = e3n.b;
            V = kp50.V(j3 - j4, DurationUnit.MILLISECONDS);
            this.label = 1;
        } while (kotlinx.coroutines.a.j(V, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
