package com.yandex.go.mainscreen.superapp.impl.foundation.data.factory;

import com.yandex.go.address.models.Address;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vaw0;
import defpackage.vpr;
import defpackage.xaw0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ xaw0 b;

    public a(vpr vprVar, xaw0 xaw0Var) {
        this.a = vprVar;
        this.b = xaw0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1 superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuperappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1) {
            superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1 = (SuperappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1) continuation;
            int i2 = superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Address address = (Address) obj;
                    this.b.getClass();
                    vaw0 vaw0Var = new vaw0(address.B(), address.x0(), address.a0(), jl40.B(address.getPositionInitAction()), address.getZoneName());
                    superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1.L$0 = null;
                    superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1.L$1 = null;
                    superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1.L$2 = null;
                    superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1.L$3 = null;
                    superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(vaw0Var, superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1) == coroutineSingletons) {
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
        superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1 = new SuperappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappGeoParamsChangesFactory$createParamsOnSourcePointChange$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
