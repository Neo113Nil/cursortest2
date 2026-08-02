package com.ybsdk.di.modules.features;

import defpackage.kn21;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class v {
    public final /* synthetic */ com.ybsdk.common.repositiories.user.a a;

    public v(com.ybsdk.common.repositiories.user.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        TransferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1 transferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1;
        int i;
        Object a;
        kn21 kn21Var;
        if (continuationImpl instanceof TransferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1) {
            transferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1 = (TransferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1) continuationImpl;
            int i2 = transferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1.label = 1;
                    a = this.a.a(false, transferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (a instanceof Result.Failure) {
                    a = null;
                }
                kn21Var = (kn21) a;
                if (kn21Var == null) {
                    return kn21Var.b;
                }
                return null;
            }
        }
        transferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1 = new TransferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1(this, continuationImpl);
        Object obj2 = transferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        kn21Var = (kn21) a;
        if (kn21Var == null) {
        }
    }
}
