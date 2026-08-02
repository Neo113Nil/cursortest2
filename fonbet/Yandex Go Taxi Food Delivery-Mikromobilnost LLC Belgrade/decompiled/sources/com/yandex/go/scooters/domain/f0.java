package com.yandex.go.scooters.domain;

import defpackage.fon0;
import defpackage.huo0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.po21;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wha1;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f0 {
    public final tt2 a;
    public final ru.yandex.taxi.walkroute.a b;
    public final po21 c;
    public final huo0 d;
    public final fon0 e;

    public f0(tt2 tt2Var, ru.yandex.taxi.walkroute.a aVar, po21 po21Var, huo0 huo0Var, fon0 fon0Var) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = po21Var;
        this.d = huo0Var;
        this.e = fon0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f0 f0Var, zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        ScootersTariffFixRoutesInteractor$getScootersRoute$1 scootersTariffFixRoutesInteractor$getScootersRoute$1;
        int i;
        f0Var.getClass();
        if (continuationImpl instanceof ScootersTariffFixRoutesInteractor$getScootersRoute$1) {
            scootersTariffFixRoutesInteractor$getScootersRoute$1 = (ScootersTariffFixRoutesInteractor$getScootersRoute$1) continuationImpl;
            int i2 = scootersTariffFixRoutesInteractor$getScootersRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersTariffFixRoutesInteractor$getScootersRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersTariffFixRoutesInteractor$getScootersRoute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersTariffFixRoutesInteractor$getScootersRoute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    huo0 huo0Var = f0Var.d;
                    scootersTariffFixRoutesInteractor$getScootersRoute$1.L$0 = null;
                    scootersTariffFixRoutesInteractor$getScootersRoute$1.L$1 = null;
                    scootersTariffFixRoutesInteractor$getScootersRoute$1.label = 1;
                    ru.yandex.taxi.scootersroute.a aVar = (ru.yandex.taxi.scootersroute.a) huo0Var;
                    obj = aVar.b(zzsVar, zzsVar2, aVar.c, scootersTariffFixRoutesInteractor$getScootersRoute$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return wha1.g((List) obj);
            }
        }
        scootersTariffFixRoutesInteractor$getScootersRoute$1 = new ScootersTariffFixRoutesInteractor$getScootersRoute$1(f0Var, continuationImpl);
        Object obj2 = scootersTariffFixRoutesInteractor$getScootersRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersTariffFixRoutesInteractor$getScootersRoute$1.label;
        if (i != 0) {
        }
        return wha1.g((List) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(f0 f0Var, zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        ScootersTariffFixRoutesInteractor$getWalkRoute$1 scootersTariffFixRoutesInteractor$getWalkRoute$1;
        int i;
        f0Var.getClass();
        if (continuationImpl instanceof ScootersTariffFixRoutesInteractor$getWalkRoute$1) {
            scootersTariffFixRoutesInteractor$getWalkRoute$1 = (ScootersTariffFixRoutesInteractor$getWalkRoute$1) continuationImpl;
            int i2 = scootersTariffFixRoutesInteractor$getWalkRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersTariffFixRoutesInteractor$getWalkRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersTariffFixRoutesInteractor$getWalkRoute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersTariffFixRoutesInteractor$getWalkRoute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.walkroute.a aVar = f0Var.b;
                    scootersTariffFixRoutesInteractor$getWalkRoute$1.L$0 = null;
                    scootersTariffFixRoutesInteractor$getWalkRoute$1.L$1 = null;
                    scootersTariffFixRoutesInteractor$getWalkRoute$1.label = 1;
                    obj = aVar.b(zzsVar, zzsVar2, scootersTariffFixRoutesInteractor$getWalkRoute$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return wha1.g((List) obj);
            }
        }
        scootersTariffFixRoutesInteractor$getWalkRoute$1 = new ScootersTariffFixRoutesInteractor$getWalkRoute$1(f0Var, continuationImpl);
        Object obj2 = scootersTariffFixRoutesInteractor$getWalkRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersTariffFixRoutesInteractor$getWalkRoute$1.label;
        if (i != 0) {
        }
        return wha1.g((List) obj2);
    }

    public final tpr c(zzs zzsVar) {
        e0 e0Var = new e0(new kotlinx.coroutines.flow.n(((ru.yandex.taxi.preorder.source.userposition.e) this.c).n(), new ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$1(this, null)), this, zzsVar);
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(e0Var, mdh.b);
    }
}
