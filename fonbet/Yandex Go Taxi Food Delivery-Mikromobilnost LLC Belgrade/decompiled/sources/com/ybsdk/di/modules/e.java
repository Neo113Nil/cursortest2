package com.ybsdk.di.modules;

import defpackage.ny61;
import defpackage.o9r;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class e implements o9r {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1 fingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1;
        int i;
        if (continuationImpl instanceof FingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1) {
            fingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1 = (FingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1) continuationImpl;
            int i2 = fingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        fingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1 = new FingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1(this, continuationImpl);
        Object obj2 = fingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1.label;
        if (i != 0) {
        }
    }
}
