package com.yandex.go.scooters.domain;

import defpackage.mo21;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ zzs c;

    public d0(vpr vprVar, f0 f0Var, zzs zzsVar) {
        this.a = vprVar;
        this.b = f0Var;
        this.c = zzsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (r7.emit(r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1 scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1;
        Object obj2;
        int i;
        vpr vprVar;
        if (continuation instanceof ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1) {
            scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1 = (ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zzs a = ((mo21) obj).a();
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$0 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$1 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$2 = null;
                    vpr vprVar2 = this.a;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$4 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$5 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.label = 1;
                    Object b = f0.b(this.b, a, this.c, scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1);
                    if (b != coroutineSingletons) {
                        obj2 = b;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj2);
                if (obj2 != null) {
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$0 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$1 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$2 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$3 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$4 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.L$5 = null;
                    scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1 = new ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1(this, continuation);
        obj2 = scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        if (obj2 != null) {
        }
        return zy11.a;
    }
}
