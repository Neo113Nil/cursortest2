package com.yandex.go.location.provider;

import defpackage.iwc;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Ref$LongRef b;
    public final /* synthetic */ Ref$LongRef c;

    public b(vpr vprVar, Ref$LongRef ref$LongRef, Ref$LongRef ref$LongRef2) {
        this.b = ref$LongRef;
        this.c = ref$LongRef2;
        this.a = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e5, code lost:
    
        if (r0.emit(r8, r4) == r10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0228, code lost:
    
        if (r0.emit(r0, r15) == r10) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CompassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1 compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1;
        int i;
        CoroutineSingletons coroutineSingletons;
        long j;
        if (continuation instanceof CompassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1) {
            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1 = (CompassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1) continuation;
            int i2 = compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1.label;
                Ref$LongRef ref$LongRef = this.c;
                Ref$LongRef ref$LongRef2 = this.b;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            j = compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1.J$0;
                            kotlin.b.b(obj2);
                            ref$LongRef2.element = j;
                            ref$LongRef.element = System.nanoTime();
                            return zy11.a;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                kotlin.b.b(obj2);
                long j2 = ((iwc) obj).a;
                long j3 = j2 & Long.MIN_VALUE;
                vpr vprVar = this.a;
                if (j3 != 0) {
                    long j4 = ref$LongRef2.element;
                    if ((j4 & Long.MIN_VALUE) != 0) {
                        long j5 = j2 & 4611686018427387904L;
                        if (((j4 & 4611686018427387904L) != 0) == (j5 != 0)) {
                            long nanoTime = System.nanoTime();
                            CompassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1 compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12 = compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1;
                            long j6 = nanoTime - ref$LongRef.element;
                            ref$LongRef.element = nanoTime;
                            float f = j6 / 1000000.0f;
                            float f2 = 0.1f;
                            if (f > 10.0f) {
                                float intBitsToFloat = ((Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) + 180.0f) % 360.0f;
                                if (intBitsToFloat != 0.0f && Math.signum(intBitsToFloat) != Math.signum(360.0f)) {
                                    intBitsToFloat += 360.0f;
                                }
                                if (Math.abs((intBitsToFloat - 180.0f) / (f / 1000.0f)) > 45.0f) {
                                    f2 = 0.5f;
                                }
                            }
                            float f3 = f2;
                            int i3 = (int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            double cos = Math.cos(Math.toRadians(Float.intBitsToFloat(i3)));
                            double sin = Math.sin(Math.toRadians(Float.intBitsToFloat(i3)));
                            int i4 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            double cos2 = Math.cos(Math.toRadians(Float.intBitsToFloat(i4)));
                            double sin2 = Math.sin(Math.toRadians(Float.intBitsToFloat(i4)));
                            double d = f3;
                            double d2 = d * cos2;
                            double d3 = 1.0f - f3;
                            double d4 = (d3 * cos) + d2;
                            double d5 = (d3 * sin) + (d * sin2);
                            double atan2 = Math.atan2(d5, d4);
                            float degrees = (float) Math.toDegrees(atan2);
                            float f4 = degrees % 360.0f;
                            if (f4 != 0.0f && Math.signum(f4) != Math.signum(360.0f)) {
                                f4 += 360.0f;
                            }
                            float f5 = f4;
                            long floatToRawIntBits = (Float.floatToRawIntBits(f4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | ((j5 > 0L ? 1 : (j5 == 0L ? 0 : -1)) != 0 ? 4611686018427387904L : 0L) | Long.MIN_VALUE;
                            ref$LongRef2.element = floatToRawIntBits;
                            iwc iwcVar = new iwc(floatToRawIntBits);
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.L$0 = null;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.L$1 = null;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.L$2 = null;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.J$0 = j2;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.J$1 = j4;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.J$2 = nanoTime;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.J$3 = j6;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.F$0 = f;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.F$1 = f3;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.D$0 = sin;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.D$1 = cos;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.D$2 = cos2;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.D$3 = sin2;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.D$4 = d4;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.D$5 = d5;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.D$6 = atan2;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.F$2 = degrees;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.F$3 = f5;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.J$4 = floatToRawIntBits;
                            compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$12.label = 3;
                            coroutineSingletons = coroutineSingletons2;
                        }
                    }
                    CompassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1 compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$13 = compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1;
                    coroutineSingletons = coroutineSingletons2;
                    iwc iwcVar2 = new iwc(j2);
                    compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$13.L$0 = null;
                    compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$13.L$1 = null;
                    compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$13.L$2 = null;
                    compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$13.J$0 = j2;
                    compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$13.J$1 = j4;
                    compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$13.label = 2;
                    if (vprVar.emit(iwcVar2, compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$13) != coroutineSingletons) {
                        j = j2;
                        ref$LongRef2.element = j;
                        ref$LongRef.element = System.nanoTime();
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
                CompassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1 compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$14 = compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1;
                coroutineSingletons = coroutineSingletons2;
                ref$LongRef2.element = 0L;
                ref$LongRef.element = 0L;
                iwc iwcVar3 = new iwc(0L);
                compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$14.L$0 = null;
                compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$14.L$1 = null;
                compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$14.L$2 = null;
                compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$14.J$0 = j2;
                compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$14.label = 1;
            }
        }
        compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1 = new CompassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1(this, continuation);
        Object obj22 = compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compassProviderImpl$adaptiveSmooth$$inlined$transform$1$1$1.label;
        Ref$LongRef ref$LongRef3 = this.c;
        Ref$LongRef ref$LongRef22 = this.b;
        if (i == 0) {
        }
    }
}
