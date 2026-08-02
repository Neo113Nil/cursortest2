package com.ybsdk.feature.dashboard.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.dashboard.internal.data.dto.GetDashboardRequest;
import com.ybsdk.feature.dashboard.internal.data.dto.PagingData;
import defpackage.fdr;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final DashboardApi a;
    public final fdr b;

    public b(DashboardApi dashboardApi, fdr fdrVar) {
        this.a = dashboardApi;
        this.b = fdrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ProductId productId, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        DashboardRepository$getDashboard$1 dashboardRepository$getDashboard$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof DashboardRepository$getDashboard$1) {
            dashboardRepository$getDashboard$1 = (DashboardRepository$getDashboard$1) continuationImpl;
            int i2 = dashboardRepository$getDashboard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardRepository$getDashboard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardRepository$getDashboard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardRepository$getDashboard$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DashboardRepository$getDashboard$2 dashboardRepository$getDashboard$2 = new DashboardRepository$getDashboard$2(this, new GetDashboardRequest(str2, productId.getValue(), str, new PagingData(null, str3)), null);
                    dashboardRepository$getDashboard$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(dashboardRepository$getDashboard$2, dashboardRepository$getDashboard$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                DashboardRepository$getDashboard$3$1 dashboardRepository$getDashboard$3$1 = new DashboardRepository$getDashboard$3$1(2, null);
                dashboardRepository$getDashboard$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, dashboardRepository$getDashboard$3$1, dashboardRepository$getDashboard$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        dashboardRepository$getDashboard$1 = new DashboardRepository$getDashboard$1(this, continuationImpl);
        Object obj2 = dashboardRepository$getDashboard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardRepository$getDashboard$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
