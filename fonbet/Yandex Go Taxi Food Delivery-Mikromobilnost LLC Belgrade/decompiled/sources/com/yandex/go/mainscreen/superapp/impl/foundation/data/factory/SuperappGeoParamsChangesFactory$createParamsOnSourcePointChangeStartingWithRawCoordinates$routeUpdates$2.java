package com.yandex.go.mainscreen.superapp.impl.foundation.data.factory;

import com.yandex.go.address.models.Address;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/address/models/Address;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/address/models/Address;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.data.factory.SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$routeUpdates$2", f = "SuperappGeoParamsChangesFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$routeUpdates$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$routeUpdates$2 superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$routeUpdates$2 = new SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$routeUpdates$2(2, continuation);
        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$routeUpdates$2.L$0 = obj;
        return superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$routeUpdates$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$routeUpdates$2 superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$routeUpdates$2 = (SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$routeUpdates$2) create((Address) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$routeUpdates$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address address = (Address) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        hst hstVar = jst.e;
        zzs B = address.B();
        double d = B.a;
        double d2 = B.b;
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        address.d();
        hstVar.getClass();
        return zy11.a;
    }
}
