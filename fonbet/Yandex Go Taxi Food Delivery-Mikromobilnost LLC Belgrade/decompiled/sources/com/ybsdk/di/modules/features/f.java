package com.ybsdk.di.modules.features;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class f {
    public final /* synthetic */ com.ybsdk.screens.common.c a;

    public f(com.ybsdk.screens.common.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1 dashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1;
        int i;
        if (continuationImpl instanceof DashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1) {
            dashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1 = (DashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1) continuationImpl;
            int i2 = dashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1.label;
                com.ybsdk.screens.common.c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1.label = 1;
                    obj = cVar.b(dashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1);
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
                return new jqr((tpr) obj, new DashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$2(cVar, null), 3);
            }
        }
        dashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1 = new DashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1(this, continuationImpl);
        Object obj2 = dashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$1.label;
        com.ybsdk.screens.common.c cVar2 = this.a;
        if (i != 0) {
        }
        return new jqr((tpr) obj2, new DashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$2(cVar2, null), 3);
    }
}
