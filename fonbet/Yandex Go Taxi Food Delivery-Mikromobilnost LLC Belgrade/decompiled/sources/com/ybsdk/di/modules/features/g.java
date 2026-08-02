package com.ybsdk.di.modules.features;

import com.ybsdk.common.entities.SupportStateEntity;
import com.ybsdk.feature.dashboard.api.model.SupportState;
import defpackage.bjg;
import defpackage.ny61;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class g {
    public final /* synthetic */ com.ybsdk.common.domain.d a;

    public g(com.ybsdk.common.domain.d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(ContinuationImpl continuationImpl) {
        DashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1 dashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1;
        int i;
        int i2;
        if (continuationImpl instanceof DashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1) {
            dashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1 = (DashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1) continuationImpl;
            int i3 = dashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = dashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1.label = 1;
                    obj = this.a.a(dashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1);
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
                i2 = bjg.a[((SupportStateEntity) obj).ordinal()];
                if (i2 != 1) {
                    return SupportState.DEFAULT;
                }
                if (i2 == 2) {
                    return SupportState.HAS_UNREAD_MESSAGES;
                }
                w511.b();
                return null;
            }
        }
        dashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1 = new DashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1(this, continuationImpl);
        Object obj2 = dashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardFeatureModule$dashboardSupportStatusInteractor$1$getSupportStatus$1.label;
        if (i != 0) {
        }
        i2 = bjg.a[((SupportStateEntity) obj2).ordinal()];
        if (i2 != 1) {
        }
    }
}
