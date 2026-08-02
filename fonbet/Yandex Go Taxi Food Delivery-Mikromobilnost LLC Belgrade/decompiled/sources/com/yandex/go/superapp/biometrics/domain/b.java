package com.yandex.go.superapp.biometrics.domain;

import android.os.SystemClock;
import defpackage.ac51;
import defpackage.ar5;
import defpackage.bc51;
import defpackage.e3n;
import defpackage.f931;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.kv5;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ppq0;
import defpackage.qpq0;
import defpackage.rpq0;
import defpackage.spq0;
import defpackage.vbo;
import defpackage.w511;
import defpackage.xbo;
import defpackage.y16;
import defpackage.yb51;
import defpackage.yy5;
import defpackage.zb51;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes14.dex */
public final class b {
    public final com.yandex.go.ble.domain.a a;
    public final y16 b;
    public final yy5 c;
    public final com.yandex.go.superapp.biometrics.data.a d;

    public b(com.yandex.go.ble.domain.a aVar, y16 y16Var, yy5 yy5Var, com.yandex.go.superapp.biometrics.data.a aVar2) {
        this.a = aVar;
        this.b = y16Var;
        this.c = yy5Var;
        this.d = aVar2;
    }

    public static spq0 b(ac51 ac51Var) {
        if (jl40.l(ac51Var, yb51.a)) {
            return ppq0.a;
        }
        if (jl40.l(ac51Var, yb51.b)) {
            return ppq0.b;
        }
        if (jl40.l(ac51Var, yb51.c)) {
            return ppq0.c;
        }
        if (jl40.l(ac51Var, yb51.d)) {
            return ppq0.d;
        }
        if (jl40.l(ac51Var, zb51.a)) {
            return qpq0.a;
        }
        if (jl40.l(ac51Var, yb51.e)) {
            return rpq0.a;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, String str, ContinuationImpl continuationImpl) {
        BiometricsBleReceiverConnectionInteractor$establishConnection$1 biometricsBleReceiverConnectionInteractor$establishConnection$1;
        int i;
        long j2;
        if (continuationImpl instanceof BiometricsBleReceiverConnectionInteractor$establishConnection$1) {
            biometricsBleReceiverConnectionInteractor$establishConnection$1 = (BiometricsBleReceiverConnectionInteractor$establishConnection$1) continuationImpl;
            int i2 = biometricsBleReceiverConnectionInteractor$establishConnection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricsBleReceiverConnectionInteractor$establishConnection$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricsBleReceiverConnectionInteractor$establishConnection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricsBleReceiverConnectionInteractor$establishConnection$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Long l = this.c.a;
                    Long l2 = l != null ? new Long(l.longValue() - SystemClock.uptimeMillis()) : null;
                    if (l2 == null || l2.longValue() <= 0) {
                        j2 = j;
                    } else {
                        o430 o430Var = e3n.b;
                        j2 = kp50.V(l2.longValue(), DurationUnit.MILLISECONDS);
                    }
                    BiometricsBleReceiverConnectionInteractor$establishConnection$2 biometricsBleReceiverConnectionInteractor$establishConnection$2 = new BiometricsBleReceiverConnectionInteractor$establishConnection$2(this, str, null);
                    biometricsBleReceiverConnectionInteractor$establishConnection$1.L$0 = null;
                    biometricsBleReceiverConnectionInteractor$establishConnection$1.L$1 = null;
                    biometricsBleReceiverConnectionInteractor$establishConnection$1.J$0 = j;
                    biometricsBleReceiverConnectionInteractor$establishConnection$1.J$1 = j2;
                    biometricsBleReceiverConnectionInteractor$establishConnection$1.label = 1;
                    obj = kotlinx.coroutines.a.x(j2, biometricsBleReceiverConnectionInteractor$establishConnection$2, biometricsBleReceiverConnectionInteractor$establishConnection$1);
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
                xbo xboVar = (xbo) obj;
                return xboVar != null ? vbo.g : xboVar;
            }
        }
        biometricsBleReceiverConnectionInteractor$establishConnection$1 = new BiometricsBleReceiverConnectionInteractor$establishConnection$1(this, continuationImpl);
        Object obj2 = biometricsBleReceiverConnectionInteractor$establishConnection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricsBleReceiverConnectionInteractor$establishConnection$1.label;
        if (i != 0) {
        }
        xbo xboVar2 = (xbo) obj2;
        if (xboVar2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        BiometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1 biometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1;
        int i;
        if (continuationImpl instanceof BiometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1) {
            biometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1 = (BiometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1) continuationImpl;
            int i2 = biometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ar5 ar5Var = new ar5(15);
                    biometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1.label = 1;
                    obj = this.d.e("f47ac10b-58cc-4372-a567-0e02b2c3d479", new bc51(), ar5Var, biometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1);
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
                return b((ac51) obj);
            }
        }
        biometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1 = new BiometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1(this, continuationImpl);
        Object obj2 = biometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricsBleReceiverConnectionInteractor$sendAwaitingStatus$1.label;
        if (i != 0) {
        }
        return b((ac51) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(f931 f931Var, ContinuationImpl continuationImpl) {
        BiometricsBleReceiverConnectionInteractor$sendVerificationStatus$1 biometricsBleReceiverConnectionInteractor$sendVerificationStatus$1;
        int i;
        ac51 ac51Var;
        if (continuationImpl instanceof BiometricsBleReceiverConnectionInteractor$sendVerificationStatus$1) {
            biometricsBleReceiverConnectionInteractor$sendVerificationStatus$1 = (BiometricsBleReceiverConnectionInteractor$sendVerificationStatus$1) continuationImpl;
            int i2 = biometricsBleReceiverConnectionInteractor$sendVerificationStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricsBleReceiverConnectionInteractor$sendVerificationStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricsBleReceiverConnectionInteractor$sendVerificationStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricsBleReceiverConnectionInteractor$sendVerificationStatus$1.label;
                com.yandex.go.superapp.biometrics.data.a aVar = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kv5 kv5Var = new kv5(8, f931Var);
                    biometricsBleReceiverConnectionInteractor$sendVerificationStatus$1.L$0 = null;
                    biometricsBleReceiverConnectionInteractor$sendVerificationStatus$1.label = 1;
                    obj = aVar.e("f47ac10b-58cc-4372-a567-0e02b2c3d479", new bc51(), kv5Var, biometricsBleReceiverConnectionInteractor$sendVerificationStatus$1);
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
                ac51Var = (ac51) obj;
                if (ac51Var instanceof zb51) {
                    aVar.a(null);
                }
                return b(ac51Var);
            }
        }
        biometricsBleReceiverConnectionInteractor$sendVerificationStatus$1 = new BiometricsBleReceiverConnectionInteractor$sendVerificationStatus$1(this, continuationImpl);
        Object obj2 = biometricsBleReceiverConnectionInteractor$sendVerificationStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricsBleReceiverConnectionInteractor$sendVerificationStatus$1.label;
        com.yandex.go.superapp.biometrics.data.a aVar2 = this.d;
        if (i != 0) {
        }
        ac51Var = (ac51) obj2;
        if (ac51Var instanceof zb51) {
        }
        return b(ac51Var);
    }
}
