package com.yandex.go;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o9z;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo9z;", "it", "Lzy11;", "<anonymous>", "(Lo9z;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.LocationSdkController$requestOutputLocationsAndPushToFlow$3", f = "LocationSdkController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class LocationSdkController$requestOutputLocationsAndPushToFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSdkController$requestOutputLocationsAndPushToFlow$3(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationSdkController$requestOutputLocationsAndPushToFlow$3 locationSdkController$requestOutputLocationsAndPushToFlow$3 = new LocationSdkController$requestOutputLocationsAndPushToFlow$3(this.this$0, continuation);
        locationSdkController$requestOutputLocationsAndPushToFlow$3.L$0 = obj;
        return locationSdkController$requestOutputLocationsAndPushToFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LocationSdkController$requestOutputLocationsAndPushToFlow$3 locationSdkController$requestOutputLocationsAndPushToFlow$3 = (LocationSdkController$requestOutputLocationsAndPushToFlow$3) create((o9z) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        locationSdkController$requestOutputLocationsAndPushToFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        o9z o9zVar = (o9z) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.i.l(o9zVar);
        return zy11.a;
    }
}
