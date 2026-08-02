package com.yandex.go.scooters.bdui;

import defpackage.eci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class e implements tpr {
    public final /* synthetic */ eci0 a;

    public e(eci0 eci0Var) {
        this.a = eci0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1 scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1) {
            scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1 = (ScootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1) continuation;
            int i2 = scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar);
                    scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1.L$0 = null;
                    scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1.L$1 = null;
                    scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1.L$2 = null;
                    scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1.label = 1;
                    if (this.a.a.collect(dVar, scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1 = new ScootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBduiScreenRouterFactoryImpl$create$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
