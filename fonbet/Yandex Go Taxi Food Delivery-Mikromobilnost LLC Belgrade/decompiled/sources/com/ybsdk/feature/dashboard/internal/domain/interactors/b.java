package com.ybsdk.feature.dashboard.internal.domain.interactors;

import com.ybsdk.di.modules.features.d;
import com.ybsdk.di.modules.features.f;
import com.ybsdk.feature.dashboard.api.DashboardScreenParams;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import defpackage.bvf0;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final d a;
    public final f b;
    public final com.ybsdk.feature.dashboard.internal.data.b c;
    public final a d;

    public b(d dVar, f fVar, com.ybsdk.feature.dashboard.internal.data.b bVar, a aVar) {
        this.a = dVar;
        this.b = fVar;
        this.c = bVar;
        this.d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ProductId productId, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        DashboardInteractor$loadNextPage$1 dashboardInteractor$loadNextPage$1;
        int i;
        if (continuationImpl instanceof DashboardInteractor$loadNextPage$1) {
            dashboardInteractor$loadNextPage$1 = (DashboardInteractor$loadNextPage$1) continuationImpl;
            int i2 = dashboardInteractor$loadNextPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardInteractor$loadNextPage$1.label = i2 - Integer.MIN_VALUE;
                DashboardInteractor$loadNextPage$1 dashboardInteractor$loadNextPage$12 = dashboardInteractor$loadNextPage$1;
                Object obj = dashboardInteractor$loadNextPage$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardInteractor$loadNextPage$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dashboardInteractor$loadNextPage$12.label = 1;
                    Object a = this.c.a(productId, str, str2, str3, dashboardInteractor$loadNextPage$12);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        dashboardInteractor$loadNextPage$1 = new DashboardInteractor$loadNextPage$1(this, continuationImpl);
        DashboardInteractor$loadNextPage$1 dashboardInteractor$loadNextPage$122 = dashboardInteractor$loadNextPage$1;
        Object obj2 = dashboardInteractor$loadNextPage$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardInteractor$loadNextPage$122.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(DashboardScreenParams dashboardScreenParams, ContinuationImpl continuationImpl) {
        DashboardInteractor$requestData$1 dashboardInteractor$requestData$1;
        int i;
        if (continuationImpl instanceof DashboardInteractor$requestData$1) {
            dashboardInteractor$requestData$1 = (DashboardInteractor$requestData$1) continuationImpl;
            int i2 = dashboardInteractor$requestData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardInteractor$requestData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardInteractor$requestData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardInteractor$requestData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DashboardInteractor$requestData$2 dashboardInteractor$requestData$2 = new DashboardInteractor$requestData$2(this, dashboardScreenParams, null);
                    dashboardInteractor$requestData$1.label = 1;
                    obj = bvf0.n(dashboardInteractor$requestData$2, dashboardInteractor$requestData$1);
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
                return ((Result) obj).getValue();
            }
        }
        dashboardInteractor$requestData$1 = new DashboardInteractor$requestData$1(this, continuationImpl);
        Object obj2 = dashboardInteractor$requestData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardInteractor$requestData$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
