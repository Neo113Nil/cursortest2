package com.yandex.go.superapp.tracking.data;

import defpackage.jst;
import defpackage.lfx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w201;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "", "Lw201;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.tracking.data.TrackingRepositoryImpl$catchTrackingFlowError$2", f = "TrackingRepositoryImpl.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class TrackingRepositoryImpl$catchTrackingFlowError$2 extends SuspendLambda implements zls {
    final /* synthetic */ lfx $clazz;
    final /* synthetic */ AtomicReference<List<w201>> $lastValue;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingRepositoryImpl$catchTrackingFlowError$2(lfx lfxVar, AtomicReference atomicReference, Continuation continuation) {
        super(3, continuation);
        this.$clazz = lfxVar;
        this.$lastValue = atomicReference;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TrackingRepositoryImpl$catchTrackingFlowError$2 trackingRepositoryImpl$catchTrackingFlowError$2 = new TrackingRepositoryImpl$catchTrackingFlowError$2(this.$clazz, this.$lastValue, (Continuation) obj3);
        trackingRepositoryImpl$catchTrackingFlowError$2.L$0 = (vpr) obj;
        trackingRepositoryImpl$catchTrackingFlowError$2.L$1 = (Throwable) obj2;
        return trackingRepositoryImpl$catchTrackingFlowError$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            jst.e.r("Error during getting order models for: " + this.$clazz, th);
            if (this.$lastValue.get() == null) {
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (vprVar.emit(EmptyList.a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
