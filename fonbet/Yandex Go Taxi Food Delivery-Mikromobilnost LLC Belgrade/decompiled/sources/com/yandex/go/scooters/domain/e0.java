package com.yandex.go.scooters.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class e0 implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ zzs c;

    public e0(kotlinx.coroutines.flow.n nVar, f0 f0Var, zzs zzsVar) {
        this.a = nVar;
        this.b = f0Var;
        this.c = zzsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1 scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1) {
            scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1 = (ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1) continuation;
            int i2 = scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d0 d0Var = new d0(vprVar, this.b, this.c);
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1.L$0 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1.L$1 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1.L$2 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(d0Var, scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1 = new ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
