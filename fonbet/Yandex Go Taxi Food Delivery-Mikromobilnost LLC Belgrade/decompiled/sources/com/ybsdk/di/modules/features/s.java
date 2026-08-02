package com.ybsdk.di.modules.features;

import defpackage.ny61;
import defpackage.xj1;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class s {
    public final /* synthetic */ com.ybsdk.common.repositiories.agreements.a a;

    public s(com.ybsdk.common.repositiories.agreements.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        TransferFeatureModule$agreementProvider$1$agreementId$1 transferFeatureModule$agreementProvider$1$agreementId$1;
        int i;
        Object b;
        xj1 xj1Var;
        if (continuationImpl instanceof TransferFeatureModule$agreementProvider$1$agreementId$1) {
            transferFeatureModule$agreementProvider$1$agreementId$1 = (TransferFeatureModule$agreementProvider$1$agreementId$1) continuationImpl;
            int i2 = transferFeatureModule$agreementProvider$1$agreementId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferFeatureModule$agreementProvider$1$agreementId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferFeatureModule$agreementProvider$1$agreementId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferFeatureModule$agreementProvider$1$agreementId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transferFeatureModule$agreementProvider$1$agreementId$1.label = 1;
                    b = this.a.b(transferFeatureModule$agreementProvider$1$agreementId$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                xj1Var = (xj1) b;
                if (xj1Var == null) {
                    return xj1Var.a;
                }
                return null;
            }
        }
        transferFeatureModule$agreementProvider$1$agreementId$1 = new TransferFeatureModule$agreementProvider$1$agreementId$1(this, continuationImpl);
        Object obj2 = transferFeatureModule$agreementProvider$1$agreementId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferFeatureModule$agreementProvider$1$agreementId$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        xj1Var = (xj1) b;
        if (xj1Var == null) {
        }
    }
}
