package com.yandex.go.taxi.tariffs.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.ck31;
import defpackage.dk31;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public final class b {
    public final ck31 a;

    public b(ck31 ck31Var) {
        this.a = ck31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AwaitTariffsInteractorImpl$awaitTariffs$1 awaitTariffsInteractorImpl$awaitTariffs$1;
        int i;
        if (continuationImpl instanceof AwaitTariffsInteractorImpl$awaitTariffs$1) {
            awaitTariffsInteractorImpl$awaitTariffs$1 = (AwaitTariffsInteractorImpl$awaitTariffs$1) continuationImpl;
            int i2 = awaitTariffsInteractorImpl$awaitTariffs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                awaitTariffsInteractorImpl$awaitTariffs$1.label = i2 - Integer.MIN_VALUE;
                Object obj = awaitTariffsInteractorImpl$awaitTariffs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = awaitTariffsInteractorImpl$awaitTariffs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.taxi.tariffs.internal.repository.h i3 = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.a).i();
                    AwaitTariffsInteractorImpl$awaitTariffs$2 awaitTariffsInteractorImpl$awaitTariffs$2 = new AwaitTariffsInteractorImpl$awaitTariffs$2();
                    awaitTariffsInteractorImpl$awaitTariffs$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(i3, awaitTariffsInteractorImpl$awaitTariffs$2, awaitTariffsInteractorImpl$awaitTariffs$1) == coroutineSingletons) {
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
        awaitTariffsInteractorImpl$awaitTariffs$1 = new AwaitTariffsInteractorImpl$awaitTariffs$1(this, continuationImpl);
        Object obj2 = awaitTariffsInteractorImpl$awaitTariffs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = awaitTariffsInteractorImpl$awaitTariffs$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Zone zone, ContinuationImpl continuationImpl) {
        AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1 awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1;
        Object obj;
        int i;
        if (continuationImpl instanceof AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1) {
            awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1 = (AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1) continuationImpl;
            int i2 = awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.label = i2 - Integer.MIN_VALUE;
                obj = awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                        } else {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                if (zone == null) {
                    awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.L$0 = null;
                    awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.label = 1;
                    Object a = a(awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1);
                    if (a != obj2) {
                        return a;
                    }
                } else {
                    o430 o430Var = e3n.b;
                    long V = kp50.V(3L, DurationUnit.SECONDS);
                    AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$verticalsInfo$1 awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$verticalsInfo$1 = new AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$verticalsInfo$1(this, zone, null);
                    awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.L$0 = null;
                    awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.label = 2;
                    obj = kotlinx.coroutines.a.x(V, awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$verticalsInfo$1, awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1);
                }
                if (((dk31) obj) == null) {
                    return zy11.a;
                }
                awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.L$0 = null;
                awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.L$1 = null;
                awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.label = 3;
                Object a2 = a(awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1);
                return a2 == obj2 ? obj2 : a2;
            }
        }
        awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1 = new AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1(this, continuationImpl);
        obj = awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = awaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$1.label;
        if (i == 0) {
        }
        if (((dk31) obj) == null) {
        }
    }
}
