package com.yandex.go.scooters.qr.domain;

import com.yandex.go.scooters.qr.domain.model.ScootersAvailabilityCheckOpenReason;
import defpackage.n7p0;
import defpackage.ny61;
import defpackage.o7p0;
import defpackage.r7p0;
import defpackage.zgz;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final com.yandex.go.scooters.qr.data.a a;
    public final com.yandex.go.scooters.qr.unavailable_scooter.data.a b;

    public c(com.yandex.go.scooters.qr.data.a aVar, com.yandex.go.scooters.qr.unavailable_scooter.data.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r7p0 r7p0Var, ScootersAvailabilityCheckOpenReason scootersAvailabilityCheckOpenReason, boolean z, ContinuationImpl continuationImpl) {
        ScootersQrCheckScooterInteractor$checkScooter$1 scootersQrCheckScooterInteractor$checkScooter$1;
        int i;
        try {
            if (continuationImpl instanceof ScootersQrCheckScooterInteractor$checkScooter$1) {
                scootersQrCheckScooterInteractor$checkScooter$1 = (ScootersQrCheckScooterInteractor$checkScooter$1) continuationImpl;
                int i2 = scootersQrCheckScooterInteractor$checkScooter$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersQrCheckScooterInteractor$checkScooter$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersQrCheckScooterInteractor$checkScooter$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersQrCheckScooterInteractor$checkScooter$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.go.scooters.qr.data.a aVar = this.a;
                        scootersQrCheckScooterInteractor$checkScooter$1.L$0 = null;
                        scootersQrCheckScooterInteractor$checkScooter$1.L$1 = null;
                        scootersQrCheckScooterInteractor$checkScooter$1.Z$0 = z;
                        scootersQrCheckScooterInteractor$checkScooter$1.label = 1;
                        obj = aVar.a(r7p0Var, scootersAvailabilityCheckOpenReason, z, scootersQrCheckScooterInteractor$checkScooter$1);
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
                    return (o7p0) obj;
                }
            }
            if (i != 0) {
            }
            return (o7p0) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            zgz.a(null, th);
            return null;
        }
        scootersQrCheckScooterInteractor$checkScooter$1 = new ScootersQrCheckScooterInteractor$checkScooter$1(this, continuationImpl);
        Object obj2 = scootersQrCheckScooterInteractor$checkScooter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersQrCheckScooterInteractor$checkScooter$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(r7p0 r7p0Var, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        ScootersQrCheckScooterInteractor$checkScooterAvailability$1 scootersQrCheckScooterInteractor$checkScooterAvailability$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersQrCheckScooterInteractor$checkScooterAvailability$1) {
            scootersQrCheckScooterInteractor$checkScooterAvailability$1 = (ScootersQrCheckScooterInteractor$checkScooterAvailability$1) continuationImpl;
            int i2 = scootersQrCheckScooterInteractor$checkScooterAvailability$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersQrCheckScooterInteractor$checkScooterAvailability$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersQrCheckScooterInteractor$checkScooterAvailability$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersQrCheckScooterInteractor$checkScooterAvailability$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersQrCheckScooterInteractor$checkScooterAvailability$1.L$0 = r7p0Var;
                    scootersQrCheckScooterInteractor$checkScooterAvailability$1.Z$0 = z;
                    scootersQrCheckScooterInteractor$checkScooterAvailability$1.Z$1 = z2;
                    scootersQrCheckScooterInteractor$checkScooterAvailability$1.label = 1;
                    obj = this.b.d(scootersQrCheckScooterInteractor$checkScooterAvailability$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    z2 = scootersQrCheckScooterInteractor$checkScooterAvailability$1.Z$1;
                    z = scootersQrCheckScooterInteractor$checkScooterAvailability$1.Z$0;
                    r7p0Var = (r7p0) scootersQrCheckScooterInteractor$checkScooterAvailability$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((List) obj).contains(r7p0Var.b.k())) {
                    return null;
                }
                ScootersAvailabilityCheckOpenReason scootersAvailabilityCheckOpenReason = z ? ScootersAvailabilityCheckOpenReason.ENTERED_MANUALLY : ScootersAvailabilityCheckOpenReason.QR;
                scootersQrCheckScooterInteractor$checkScooterAvailability$1.L$0 = null;
                scootersQrCheckScooterInteractor$checkScooterAvailability$1.Z$0 = z;
                scootersQrCheckScooterInteractor$checkScooterAvailability$1.Z$1 = z2;
                scootersQrCheckScooterInteractor$checkScooterAvailability$1.label = 2;
                Object a = a(r7p0Var, scootersAvailabilityCheckOpenReason, z2, scootersQrCheckScooterInteractor$checkScooterAvailability$1);
                return a == obj2 ? obj2 : a;
            }
        }
        scootersQrCheckScooterInteractor$checkScooterAvailability$1 = new ScootersQrCheckScooterInteractor$checkScooterAvailability$1(this, continuationImpl);
        obj = scootersQrCheckScooterInteractor$checkScooterAvailability$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersQrCheckScooterInteractor$checkScooterAvailability$1.label;
        if (i != 0) {
        }
        if (((List) obj).contains(r7p0Var.b.k())) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z, ContinuationImpl continuationImpl) {
        ScootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1 scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1) {
            scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1 = (ScootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1) continuationImpl;
            int i2 = scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1.Z$0 = z;
                    scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1.label = 1;
                    obj = this.b.g(scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        if (obj instanceof n7p0) {
                            return (n7p0) obj;
                        }
                        return null;
                    }
                    z = scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1.Z$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1.Z$0 = z;
                    scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1.label = 2;
                    obj = a(null, null, z, scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1);
                }
                return null;
            }
        }
        scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1 = new ScootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1(this, continuationImpl);
        obj = scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersQrCheckScooterInteractor$findOurNearestInsteadOfAlien$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return null;
    }
}
