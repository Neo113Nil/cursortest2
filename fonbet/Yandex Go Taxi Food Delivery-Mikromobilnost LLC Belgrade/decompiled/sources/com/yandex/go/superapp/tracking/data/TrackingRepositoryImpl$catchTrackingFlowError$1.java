package com.yandex.go.superapp.tracking.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.w201;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lw201;", "it", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.tracking.data.TrackingRepositoryImpl$catchTrackingFlowError$1", f = "TrackingRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class TrackingRepositoryImpl$catchTrackingFlowError$1 extends SuspendLambda implements wls {
    final /* synthetic */ AtomicReference<List<w201>> $lastValue;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingRepositoryImpl$catchTrackingFlowError$1(AtomicReference atomicReference, Continuation continuation) {
        super(2, continuation);
        this.$lastValue = atomicReference;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackingRepositoryImpl$catchTrackingFlowError$1 trackingRepositoryImpl$catchTrackingFlowError$1 = new TrackingRepositoryImpl$catchTrackingFlowError$1(this.$lastValue, continuation);
        trackingRepositoryImpl$catchTrackingFlowError$1.L$0 = obj;
        return trackingRepositoryImpl$catchTrackingFlowError$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TrackingRepositoryImpl$catchTrackingFlowError$1 trackingRepositoryImpl$catchTrackingFlowError$1 = (TrackingRepositoryImpl$catchTrackingFlowError$1) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        trackingRepositoryImpl$catchTrackingFlowError$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<w201> list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$lastValue.set(list);
        return zy11.a;
    }
}
