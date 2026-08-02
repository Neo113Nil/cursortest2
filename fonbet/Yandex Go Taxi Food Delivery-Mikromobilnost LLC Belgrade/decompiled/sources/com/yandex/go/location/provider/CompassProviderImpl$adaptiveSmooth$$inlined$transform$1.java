package com.yandex.go.location.provider;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.location.provider.CompassProviderImpl$adaptiveSmooth$$inlined$transform$1", f = "CompassProviderImpl.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class CompassProviderImpl$adaptiveSmooth$$inlined$transform$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$LongRef $lastSmoothedAzimuth$inlined;
    final /* synthetic */ Ref$LongRef $lastTimestampNs$inlined;
    final /* synthetic */ tpr $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompassProviderImpl$adaptiveSmooth$$inlined$transform$1(tpr tprVar, Continuation continuation, Ref$LongRef ref$LongRef, Ref$LongRef ref$LongRef2) {
        super(2, continuation);
        this.$this_transform = tprVar;
        this.$lastSmoothedAzimuth$inlined = ref$LongRef;
        this.$lastTimestampNs$inlined = ref$LongRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CompassProviderImpl$adaptiveSmooth$$inlined$transform$1 compassProviderImpl$adaptiveSmooth$$inlined$transform$1 = new CompassProviderImpl$adaptiveSmooth$$inlined$transform$1(this.$this_transform, continuation, this.$lastSmoothedAzimuth$inlined, this.$lastTimestampNs$inlined);
        compassProviderImpl$adaptiveSmooth$$inlined$transform$1.L$0 = obj;
        return compassProviderImpl$adaptiveSmooth$$inlined$transform$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompassProviderImpl$adaptiveSmooth$$inlined$transform$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_transform;
            b bVar = new b(vprVar, this.$lastSmoothedAzimuth$inlined, this.$lastTimestampNs$inlined);
            this.L$0 = null;
            this.label = 1;
            if (tprVar.collect(bVar, this) == coroutineSingletons) {
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
