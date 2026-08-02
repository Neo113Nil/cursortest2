package com.yandex.go.mainscreen.superapp.impl.foundation.data.factory;

import defpackage.i621;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Li621;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.data.factory.SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$1", f = "SuperappGeoParamsChangesFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<i621> $current;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$1(Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(2, continuation);
        this.$current = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$1(continuation, this.$current);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$1 superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$1 = (SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$1) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$current.element = null;
        return zy11.a;
    }
}
