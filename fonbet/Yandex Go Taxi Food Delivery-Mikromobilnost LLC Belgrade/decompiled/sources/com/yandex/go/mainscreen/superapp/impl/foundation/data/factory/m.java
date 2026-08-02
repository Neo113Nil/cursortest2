package com.yandex.go.mainscreen.superapp.impl.foundation.data.factory;

import defpackage.i621;
import defpackage.kfl0;
import defpackage.ny61;
import defpackage.rvd0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ q b;
    public final /* synthetic */ Ref$ObjectRef c;

    public m(vpr vprVar, q qVar, Ref$ObjectRef ref$ObjectRef) {
        this.a = vprVar;
        this.b = qVar;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, i621] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1 superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1;
        int i;
        Object obj2;
        boolean z;
        Long requestTime;
        if (continuation instanceof SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1) {
            superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1 = (SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1) continuation;
            int i2 = superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    ?? r10 = (i621) obj;
                    Ref$ObjectRef ref$ObjectRef = this.c;
                    i621 i621Var = (i621) ref$ObjectRef.element;
                    this.b.getClass();
                    if (i621Var != null && ((((z = i621Var instanceof kfl0)) && (r10 instanceof rvd0)) || (!((i621Var instanceof rvd0) && (r10 instanceof kfl0)) ? !(z && (r10 instanceof kfl0) && ((kfl0) i621Var).a == ((kfl0) r10).a) : (requestTime = ((kfl0) r10).a.getRequestTime()) == null || requestTime.longValue() >= ((rvd0) i621Var).a.a.b.e))) {
                        obj2 = null;
                    } else {
                        ref$ObjectRef.element = r10;
                        obj2 = r10;
                    }
                    if (obj2 != null) {
                        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1.L$0 = null;
                        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1.L$1 = null;
                        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1.L$2 = null;
                        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1.L$3 = null;
                        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1.L$4 = null;
                        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1.label = 1;
                        if (this.a.emit(obj2, superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1 = new SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1(this, continuation);
        Object obj32 = superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
