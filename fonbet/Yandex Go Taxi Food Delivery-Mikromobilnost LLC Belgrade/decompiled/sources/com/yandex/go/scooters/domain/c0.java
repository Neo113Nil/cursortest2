package com.yandex.go.scooters.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c0 implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ zzs b;
    public final /* synthetic */ zzs c;
    public final /* synthetic */ f0 w;

    public c0(tpr tprVar, zzs zzsVar, zzs zzsVar2, f0 f0Var) {
        this.a = tprVar;
        this.b = zzsVar;
        this.c = zzsVar2;
        this.w = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1 scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1) {
            scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1 = (ScootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1) continuation;
            int i2 = scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b0 b0Var = new b0(vprVar, this.b, this.c, this.w);
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1.L$0 = null;
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1.L$1 = null;
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1.L$2 = null;
                    scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1.label = 1;
                    if (this.a.collect(b0Var, scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1 = new ScootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersTariffFixRoutesInteractor$listenToScootersAndWalkToDestinationRoutes$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
