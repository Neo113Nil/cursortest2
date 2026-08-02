package com.yandex.go.mainscreen.superapp.impl.foundation.data.factory;

import com.yandex.go.address.models.Address;
import defpackage.i621;
import defpackage.jl40;
import defpackage.kfl0;
import defpackage.ny61;
import defpackage.p9j0;
import defpackage.rvd0;
import defpackage.uaw0;
import defpackage.vaw0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xaw0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ q b;

    public o(vpr vprVar, q qVar) {
        this.a = vprVar;
        this.b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1 superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1;
        int i;
        Object vaw0Var;
        if (continuation instanceof SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1) {
            superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1 = (SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1) continuation;
            int i2 = superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i621 i621Var = (i621) obj;
                    xaw0 xaw0Var = this.b.c;
                    if (i621Var instanceof rvd0) {
                        p9j0 p9j0Var = ((rvd0) i621Var).a;
                        xaw0Var.getClass();
                        vaw0Var = new uaw0(p9j0Var.a, p9j0Var.b);
                    } else {
                        if (!(i621Var instanceof kfl0)) {
                            w511.b();
                            return null;
                        }
                        Address address = ((kfl0) i621Var).a;
                        xaw0Var.getClass();
                        vaw0Var = new vaw0(address.B(), address.x0(), address.a0(), jl40.B(address.getPositionInitAction()), address.getZoneName());
                    }
                    superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1.L$0 = null;
                    superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1.L$1 = null;
                    superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1.L$2 = null;
                    superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1.L$3 = null;
                    superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1.L$4 = null;
                    superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1.label = 1;
                    if (this.a.emit(vaw0Var, superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1 = new SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1(this, continuation);
        Object obj22 = superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$$inlined$mapNotNull$3$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
