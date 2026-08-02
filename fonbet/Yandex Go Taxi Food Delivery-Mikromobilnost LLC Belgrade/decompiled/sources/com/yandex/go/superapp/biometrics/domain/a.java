package com.yandex.go.superapp.biometrics.domain;

import android.os.SystemClock;
import defpackage.e3n;
import defpackage.gy5;
import defpackage.hy5;
import defpackage.iy5;
import defpackage.jl40;
import defpackage.ky5;
import defpackage.ly5;
import defpackage.my5;
import defpackage.n831;
import defpackage.ny61;
import defpackage.ppq0;
import defpackage.qpq0;
import defpackage.rpq0;
import defpackage.spq0;
import defpackage.t831;
import defpackage.v831;
import defpackage.w511;
import defpackage.w831;
import defpackage.x831;
import defpackage.yy5;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes14.dex */
public final class a {
    public final com.yandex.go.cryptosdk.a a;
    public final b b;
    public final yy5 c;

    public a(com.yandex.go.cryptosdk.a aVar, b bVar, yy5 yy5Var) {
        this.a = aVar;
        this.b = bVar;
        this.c = yy5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        BiometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1 biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1;
        int i;
        my5 my5Var;
        if (continuationImpl instanceof BiometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1) {
            biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1 = (BiometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1) continuationImpl;
            int i2 = biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    iy5 hy5Var = str != null ? new hy5(str) : gy5.a;
                    biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1.L$0 = null;
                    biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1.L$1 = null;
                    biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1.L$2 = this;
                    biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1.label = 1;
                    obj = this.a.a(hy5Var, str2, biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1.L$2;
                    kotlin.b.b(obj);
                }
                my5Var = (my5) obj;
                this.getClass();
                if (!jl40.l(my5Var, ky5.c)) {
                    return t831.b;
                }
                if (jl40.l(my5Var, ky5.a)) {
                    return t831.a;
                }
                if (jl40.l(my5Var, ky5.b)) {
                    return t831.c;
                }
                if (my5Var instanceof ly5) {
                    return new w831(((ly5) my5Var).a);
                }
                w511.b();
                return null;
            }
        }
        biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1 = new BiometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1(this, continuationImpl);
        Object obj2 = biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricVerificationInteractor$startAndWaitForBiometricVerificationScreen$1.label;
        if (i != 0) {
        }
        my5Var = (my5) obj2;
        this.getClass();
        if (!jl40.l(my5Var, ky5.c)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, String str, String str2, ContinuationImpl continuationImpl) {
        BiometricVerificationInteractor$verifyBiometric$1 biometricVerificationInteractor$verifyBiometric$1;
        int i;
        long j2;
        if (continuationImpl instanceof BiometricVerificationInteractor$verifyBiometric$1) {
            biometricVerificationInteractor$verifyBiometric$1 = (BiometricVerificationInteractor$verifyBiometric$1) continuationImpl;
            int i2 = biometricVerificationInteractor$verifyBiometric$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricVerificationInteractor$verifyBiometric$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricVerificationInteractor$verifyBiometric$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricVerificationInteractor$verifyBiometric$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    long uptimeMillis = SystemClock.uptimeMillis() + e3n.o(j, DurationUnit.MILLISECONDS);
                    biometricVerificationInteractor$verifyBiometric$1.L$0 = null;
                    biometricVerificationInteractor$verifyBiometric$1.L$1 = null;
                    biometricVerificationInteractor$verifyBiometric$1.J$0 = j;
                    biometricVerificationInteractor$verifyBiometric$1.J$1 = uptimeMillis;
                    biometricVerificationInteractor$verifyBiometric$1.label = 1;
                    obj = a(str, str2, biometricVerificationInteractor$verifyBiometric$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    j2 = uptimeMillis;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = biometricVerificationInteractor$verifyBiometric$1.J$1;
                    kotlin.b.b(obj);
                }
                return SystemClock.uptimeMillis() >= j2 ? (x831) obj : v831.a;
            }
        }
        biometricVerificationInteractor$verifyBiometric$1 = new BiometricVerificationInteractor$verifyBiometric$1(this, continuationImpl);
        Object obj3 = biometricVerificationInteractor$verifyBiometric$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricVerificationInteractor$verifyBiometric$1.label;
        if (i != 0) {
        }
        if (SystemClock.uptimeMillis() >= j2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00de, code lost:
    
        if (r0 == r9) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0035, B:20:0x004e, B:22:0x0079, B:24:0x0083, B:25:0x008a, B:27:0x0092, B:29:0x009a, B:32:0x00a3, B:34:0x00ab, B:35:0x00ae, B:37:0x00b6, B:40:0x00e1, B:41:0x00e6, B:42:0x00e7, B:44:0x005b), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0035, B:20:0x004e, B:22:0x0079, B:24:0x0083, B:25:0x008a, B:27:0x0092, B:29:0x009a, B:32:0x00a3, B:34:0x00ab, B:35:0x00ae, B:37:0x00b6, B:40:0x00e1, B:41:0x00e6, B:42:0x00e7, B:44:0x005b), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, int i, long j, ContinuationImpl continuationImpl) {
        BiometricVerificationInteractor$verifyBiometricWithReceiver$1 biometricVerificationInteractor$verifyBiometricWithReceiver$1;
        int i2;
        String str3;
        String str4;
        int i3;
        long j2;
        spq0 spq0Var;
        try {
            if (continuationImpl instanceof BiometricVerificationInteractor$verifyBiometricWithReceiver$1) {
                biometricVerificationInteractor$verifyBiometricWithReceiver$1 = (BiometricVerificationInteractor$verifyBiometricWithReceiver$1) continuationImpl;
                int i4 = biometricVerificationInteractor$verifyBiometricWithReceiver$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    biometricVerificationInteractor$verifyBiometricWithReceiver$1.label = i4 - Integer.MIN_VALUE;
                    BiometricVerificationInteractor$verifyBiometricWithReceiver$1 biometricVerificationInteractor$verifyBiometricWithReceiver$12 = biometricVerificationInteractor$verifyBiometricWithReceiver$1;
                    Object obj = biometricVerificationInteractor$verifyBiometricWithReceiver$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = biometricVerificationInteractor$verifyBiometricWithReceiver$12.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        b bVar = this.b;
                        str3 = str;
                        biometricVerificationInteractor$verifyBiometricWithReceiver$12.L$0 = str3;
                        biometricVerificationInteractor$verifyBiometricWithReceiver$12.L$1 = str2;
                        biometricVerificationInteractor$verifyBiometricWithReceiver$12.I$0 = i;
                        biometricVerificationInteractor$verifyBiometricWithReceiver$12.J$0 = j;
                        biometricVerificationInteractor$verifyBiometricWithReceiver$12.label = 1;
                        obj = bVar.c(biometricVerificationInteractor$verifyBiometricWithReceiver$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str4 = str2;
                        i3 = i;
                        j2 = j;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        long j3 = biometricVerificationInteractor$verifyBiometricWithReceiver$12.J$0;
                        i3 = biometricVerificationInteractor$verifyBiometricWithReceiver$12.I$0;
                        String str5 = (String) biometricVerificationInteractor$verifyBiometricWithReceiver$12.L$1;
                        String str6 = (String) biometricVerificationInteractor$verifyBiometricWithReceiver$12.L$0;
                        kotlin.b.b(obj);
                        str4 = str5;
                        str3 = str6;
                        j2 = j3;
                    }
                    spq0Var = (spq0) obj;
                    if (jl40.l(spq0Var, ppq0.c)) {
                        if (!jl40.l(spq0Var, ppq0.a) && !jl40.l(spq0Var, ppq0.b) && !jl40.l(spq0Var, ppq0.d)) {
                            if (jl40.l(spq0Var, rpq0.a)) {
                                obj = n831.b;
                            } else {
                                if (!jl40.l(spq0Var, qpq0.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.c.a = new Long(SystemClock.uptimeMillis() + e3n.o(j2, DurationUnit.MILLISECONDS));
                                BiometricVerificationInteractor$verifyBiometricWithReceiver$2 biometricVerificationInteractor$verifyBiometricWithReceiver$2 = new BiometricVerificationInteractor$verifyBiometricWithReceiver$2(this, str3, str4, i3, j2, null);
                                biometricVerificationInteractor$verifyBiometricWithReceiver$12.L$0 = null;
                                biometricVerificationInteractor$verifyBiometricWithReceiver$12.L$1 = null;
                                biometricVerificationInteractor$verifyBiometricWithReceiver$12.I$0 = i3;
                                biometricVerificationInteractor$verifyBiometricWithReceiver$12.J$0 = j2;
                                biometricVerificationInteractor$verifyBiometricWithReceiver$12.label = 2;
                                obj = jl40.O(biometricVerificationInteractor$verifyBiometricWithReceiver$2, biometricVerificationInteractor$verifyBiometricWithReceiver$12);
                            }
                        }
                        obj = n831.a;
                    } else {
                        obj = n831.c;
                    }
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            spq0Var = (spq0) obj;
            if (jl40.l(spq0Var, ppq0.c)) {
            }
            return obj;
        } finally {
            this.c.a = null;
        }
        biometricVerificationInteractor$verifyBiometricWithReceiver$1 = new BiometricVerificationInteractor$verifyBiometricWithReceiver$1(this, continuationImpl);
        BiometricVerificationInteractor$verifyBiometricWithReceiver$1 biometricVerificationInteractor$verifyBiometricWithReceiver$122 = biometricVerificationInteractor$verifyBiometricWithReceiver$1;
        Object obj2 = biometricVerificationInteractor$verifyBiometricWithReceiver$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = biometricVerificationInteractor$verifyBiometricWithReceiver$122.label;
    }
}
