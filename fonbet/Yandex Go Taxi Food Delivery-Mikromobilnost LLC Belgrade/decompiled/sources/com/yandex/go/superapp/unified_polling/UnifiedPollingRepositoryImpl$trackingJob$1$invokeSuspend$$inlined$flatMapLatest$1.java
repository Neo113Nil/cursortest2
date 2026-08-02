package com.yandex.go.superapp.unified_polling;

import defpackage.m2e0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.unified_polling.UnifiedPollingRepositoryImpl$trackingJob$1$invokeSuspend$$inlined$flatMapLatest$1", f = "UnifiedPollingRepositoryImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class UnifiedPollingRepositoryImpl$trackingJob$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingRepositoryImpl$trackingJob$1$invokeSuspend$$inlined$flatMapLatest$1(k kVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = kVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UnifiedPollingRepositoryImpl$trackingJob$1$invokeSuspend$$inlined$flatMapLatest$1 unifiedPollingRepositoryImpl$trackingJob$1$invokeSuspend$$inlined$flatMapLatest$1 = new UnifiedPollingRepositoryImpl$trackingJob$1$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        unifiedPollingRepositoryImpl$trackingJob$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        unifiedPollingRepositoryImpl$trackingJob$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return unifiedPollingRepositoryImpl$trackingJob$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr kVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m2e0 m2e0Var = (m2e0) obj2;
            if (m2e0Var == null) {
                kVar = pvn.a;
            } else {
                g gVar = (g) this.this$0.i.getValue();
                gVar.getClass();
                kVar = new kotlinx.coroutines.flow.k(com.yandex.go.coroutines.b.d(new rol0(new UnifiedPollingApiImplementation$startTracking$1(gVar, m2e0Var, null)), new UnifiedPollingApiImplementation$startTracking$2(2, null)), new UnifiedPollingApiImplementation$startTracking$3(3, null));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(kVar, vprVar, this) == coroutineSingletons) {
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
