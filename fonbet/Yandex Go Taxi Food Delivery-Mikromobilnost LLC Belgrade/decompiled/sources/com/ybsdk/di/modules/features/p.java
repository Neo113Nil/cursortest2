package com.ybsdk.di.modules.features;

import defpackage.ny61;
import defpackage.ym90;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class p {
    public final /* synthetic */ com.ybsdk.common.repositiories.auth.f a;
    public final /* synthetic */ com.ybsdk.adapters.passportsdk.impl.a b;

    public p(com.ybsdk.common.repositiories.auth.f fVar, com.ybsdk.adapters.passportsdk.impl.a aVar) {
        this.a = fVar;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SavingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1 savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1;
        int i;
        Long l;
        Object b;
        if (continuationImpl instanceof SavingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1) {
            savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1 = (SavingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1) continuationImpl;
            int i2 = savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1.label = 1;
                    obj = this.a.a(savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        b = ((Result) obj).getValue();
                        ym90 ym90Var = (ym90) (b instanceof Result.Failure ? null : b);
                        return Boolean.valueOf(ym90Var != null && ym90Var.g);
                    }
                    kotlin.b.b(obj);
                }
                l = (Long) obj;
                if (l != null) {
                    return Boolean.FALSE;
                }
                long longValue = l.longValue();
                savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1.label = 2;
                b = this.b.b(longValue, savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1);
            }
        }
        savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1 = new SavingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1(this, continuationImpl);
        Object obj2 = savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsFeatureModule$providePlusSubscriptionsStatusProvider$1$hasPlus$1.label;
        if (i != 0) {
        }
        l = (Long) obj2;
        if (l != null) {
        }
    }
}
