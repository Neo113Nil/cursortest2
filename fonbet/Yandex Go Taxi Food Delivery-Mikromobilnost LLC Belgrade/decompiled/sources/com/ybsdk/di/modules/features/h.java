package com.ybsdk.di.modules.features;

import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class h {
    public final /* synthetic */ com.ybsdk.common.repositiories.auth.f a;

    public h(com.ybsdk.common.repositiories.auth.f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        EducationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1 educationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1;
        int i;
        if (continuationImpl instanceof EducationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1) {
            educationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1 = (EducationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1) continuationImpl;
            int i2 = educationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                educationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = educationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = educationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    educationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1.label = 1;
                    obj = this.a.a(educationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1);
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
                return String.valueOf(obj);
            }
        }
        educationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1 = new EducationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1(this, continuationImpl);
        Object obj2 = educationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = educationsFeatureModule$provideEducationsAuthProvider$1$getPassportUid$1.label;
        if (i != 0) {
        }
        return String.valueOf(obj2);
    }
}
