package com.ybsdk.di.modules.features;

import com.ybsdk.common.entities.SupportStateEntity;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class q {
    public final /* synthetic */ com.ybsdk.common.domain.d a;

    public q(com.ybsdk.common.domain.d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SavingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1 savingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1;
        int i;
        if (continuationImpl instanceof SavingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1) {
            savingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1 = (SavingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1) continuationImpl;
            int i2 = savingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    savingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1.label = 1;
                    obj = this.a.a(savingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((SupportStateEntity) obj).getIcon();
            }
        }
        savingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1 = new SavingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1(this, continuationImpl);
        Object obj3 = savingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsFeatureModule$provideSavingsSupportImageProvider$1$getSupportStatusImage$1.label;
        if (i != 0) {
        }
        return ((SupportStateEntity) obj3).getIcon();
    }
}
