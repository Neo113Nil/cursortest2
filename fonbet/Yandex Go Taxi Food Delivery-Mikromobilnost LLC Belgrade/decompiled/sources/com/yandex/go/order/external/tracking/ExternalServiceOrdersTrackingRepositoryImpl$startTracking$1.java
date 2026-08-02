package com.yandex.go.order.external.tracking;

import defpackage.go60;
import defpackage.j3p;
import defpackage.m2e0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj3p;", "trackingEndpoint", "Lgo60;", "authorizer", "Lm2e0;", "<anonymous>", "(Lj3p;Lgo60;)Lm2e0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.external.tracking.ExternalServiceOrdersTrackingRepositoryImpl$startTracking$1", f = "ExternalServiceOrdersTrackingRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ExternalServiceOrdersTrackingRepositoryImpl$startTracking$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ExternalServiceOrdersTrackingRepositoryImpl$startTracking$1 externalServiceOrdersTrackingRepositoryImpl$startTracking$1 = new ExternalServiceOrdersTrackingRepositoryImpl$startTracking$1(3, (Continuation) obj3);
        externalServiceOrdersTrackingRepositoryImpl$startTracking$1.L$0 = (j3p) obj;
        externalServiceOrdersTrackingRepositoryImpl$startTracking$1.L$1 = (go60) obj2;
        return externalServiceOrdersTrackingRepositoryImpl$startTracking$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j3p j3pVar = (j3p) this.L$0;
        go60 go60Var = (go60) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new m2e0(j3pVar.a, go60Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
