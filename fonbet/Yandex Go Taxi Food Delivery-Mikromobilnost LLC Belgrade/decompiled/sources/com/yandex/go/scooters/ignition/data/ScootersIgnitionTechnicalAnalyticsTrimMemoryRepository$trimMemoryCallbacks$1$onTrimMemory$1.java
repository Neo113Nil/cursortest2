package com.yandex.go.scooters.ignition.data;

import defpackage.is8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.psn0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.data.ScootersIgnitionTechnicalAnalyticsTrimMemoryRepository$trimMemoryCallbacks$1$onTrimMemory$1", f = "ScootersIgnitionTechnicalAnalyticsTrimMemoryRepository.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersIgnitionTechnicalAnalyticsTrimMemoryRepository$trimMemoryCallbacks$1$onTrimMemory$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $level;
    int label;
    final /* synthetic */ psn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionTechnicalAnalyticsTrimMemoryRepository$trimMemoryCallbacks$1$onTrimMemory$1(psn0 psn0Var, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = psn0Var;
        this.$level = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionTechnicalAnalyticsTrimMemoryRepository$trimMemoryCallbacks$1$onTrimMemory$1(this.this$0, this.$level, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionTechnicalAnalyticsTrimMemoryRepository$trimMemoryCallbacks$1$onTrimMemory$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.scooters.ignition.analytics.a aVar = this.this$0.b;
            int i2 = this.$level;
            this.label = 1;
            aVar.getClass();
            if (com.yandex.go.scooters.ignition.analytics.a.e(aVar, "trim_memory", new is8(aVar, i2, 12), this, 2) == coroutineSingletons) {
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
