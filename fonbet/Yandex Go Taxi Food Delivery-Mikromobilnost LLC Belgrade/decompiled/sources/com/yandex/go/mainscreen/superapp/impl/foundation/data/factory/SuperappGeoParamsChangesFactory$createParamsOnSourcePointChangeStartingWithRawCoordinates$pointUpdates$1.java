package com.yandex.go.mainscreen.superapp.impl.foundation.data.factory;

import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9j0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp9j0;", "it", "Lzy11;", "<anonymous>", "(Lp9j0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.data.factory.SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$pointUpdates$1", f = "SuperappGeoParamsChangesFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$pointUpdates$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$pointUpdates$1 superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$pointUpdates$1 = new SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$pointUpdates$1(2, continuation);
        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$pointUpdates$1.L$0 = obj;
        return superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$pointUpdates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$pointUpdates$1 superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$pointUpdates$1 = (SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$pointUpdates$1) create((p9j0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$pointUpdates$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p9j0 p9j0Var = (p9j0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        hst hstVar = jst.e;
        double d = p9j0Var.b.b.a;
        hstVar.getClass();
        return zy11.a;
    }
}
