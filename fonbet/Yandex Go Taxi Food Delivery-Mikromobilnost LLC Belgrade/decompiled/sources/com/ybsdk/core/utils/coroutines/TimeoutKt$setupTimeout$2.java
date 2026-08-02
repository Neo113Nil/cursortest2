package com.ybsdk.core.utils.coroutines;

import defpackage.cez0;
import defpackage.e3n;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rez0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.utils.coroutines.TimeoutKt$setupTimeout$2", f = "Timeout.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TimeoutKt$setupTimeout$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    final /* synthetic */ sls $timeProvider;
    final /* synthetic */ long $timeout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeoutKt$setupTimeout$2(sls slsVar, long j, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$timeProvider = slsVar;
        this.$timeout = j;
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimeoutKt$setupTimeout$2 timeoutKt$setupTimeout$2 = new TimeoutKt$setupTimeout$2(this.$timeProvider, this.$timeout, this.$block, continuation);
        timeoutKt$setupTimeout$2.L$0 = obj;
        return timeoutKt$setupTimeout$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimeoutKt$setupTimeout$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        l8x l8xVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            long e = e3n.e(this.$timeout) + ((rez0) this.$timeProvider.invoke()).a;
            sls slsVar = this.$timeProvider;
            cez0 cez0Var = new cez0(tseVar, e, slsVar);
            pzt0 N = tje.N(cez0Var, null, CoroutineStart.UNDISPATCHED, new TimeoutKt$setupTimeout$2$timeoutJob$1(slsVar, cez0Var, this.$timeout, null), 1);
            wls wlsVar = this.$block;
            this.L$0 = N;
            this.label = 1;
            Object invoke = wlsVar.invoke(cez0Var, this);
            if (invoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = invoke;
            l8xVar = N;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l8xVar = (l8x) this.L$0;
            kotlin.b.b(obj);
            obj2 = obj;
        }
        l8xVar.a(null);
        return obj2;
    }
}
