package com.ybsdk.di.modules.features;

import defpackage.ny61;
import defpackage.xj1;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class l {
    public final /* synthetic */ com.ybsdk.common.repositiories.agreements.a a;

    public l(com.ybsdk.common.repositiories.agreements.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PartnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1 partnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1;
        int i;
        Object b;
        if (continuationImpl instanceof PartnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1) {
            partnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1 = (PartnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1) continuationImpl;
            int i2 = partnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    partnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1.label = 1;
                    b = this.a.b(partnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1);
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
                return b instanceof Result.Failure ? ((xj1) b).a : b;
            }
        }
        partnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1 = new PartnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1(this, continuationImpl);
        Object obj2 = partnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerSelectionScreenFeatureModule$agreementIdProvider$1$agreementId$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
    }
}
