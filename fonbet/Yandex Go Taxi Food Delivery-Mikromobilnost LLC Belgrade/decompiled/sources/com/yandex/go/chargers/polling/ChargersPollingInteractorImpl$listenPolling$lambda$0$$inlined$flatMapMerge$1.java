package com.yandex.go.chargers.polling;

import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.polling.ChargersPollingInteractorImpl$listenPolling$lambda$0$$inlined$flatMapMerge$1", f = "ChargersPollingInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class ChargersPollingInteractorImpl$listenPolling$lambda$0$$inlined$flatMapMerge$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersPollingInteractorImpl$listenPolling$lambda$0$$inlined$flatMapMerge$1 chargersPollingInteractorImpl$listenPolling$lambda$0$$inlined$flatMapMerge$1 = new ChargersPollingInteractorImpl$listenPolling$lambda$0$$inlined$flatMapMerge$1(2, continuation);
        chargersPollingInteractorImpl$listenPolling$lambda$0$$inlined$flatMapMerge$1.L$0 = obj;
        return chargersPollingInteractorImpl$listenPolling$lambda$0$$inlined$flatMapMerge$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPollingInteractorImpl$listenPolling$lambda$0$$inlined$flatMapMerge$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = (a) obj2;
        return new j(new mth(aVar.f, 6), aVar);
    }
}
