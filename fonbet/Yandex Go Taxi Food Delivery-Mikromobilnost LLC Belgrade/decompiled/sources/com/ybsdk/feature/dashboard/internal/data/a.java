package com.ybsdk.feature.dashboard.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.dashboard.internal.data.dto.GetCardWidgetInfoRequest;
import defpackage.iyd0;
import defpackage.ny61;
import defpackage.ozd0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final DashboardApi a;
    public final com.ybsdk.utils.poller.b b;

    public a(DashboardApi dashboardApi, com.ybsdk.utils.poller.b bVar) {
        this.a = dashboardApi;
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ProductId productId, String str, ContinuationImpl continuationImpl) {
        DashboardCardRepository$getCardWidgetInfo$1 dashboardCardRepository$getCardWidgetInfo$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof DashboardCardRepository$getCardWidgetInfo$1) {
            dashboardCardRepository$getCardWidgetInfo$1 = (DashboardCardRepository$getCardWidgetInfo$1) continuationImpl;
            int i2 = dashboardCardRepository$getCardWidgetInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardCardRepository$getCardWidgetInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardCardRepository$getCardWidgetInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardCardRepository$getCardWidgetInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DashboardCardRepository$getCardWidgetInfo$2 dashboardCardRepository$getCardWidgetInfo$2 = new DashboardCardRepository$getCardWidgetInfo$2(this, new GetCardWidgetInfoRequest(str, productId.getValue()), null);
                    dashboardCardRepository$getCardWidgetInfo$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(dashboardCardRepository$getCardWidgetInfo$2, dashboardCardRepository$getCardWidgetInfo$1);
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
                DashboardCardRepository$getCardWidgetInfo$3$1 dashboardCardRepository$getCardWidgetInfo$3$1 = new DashboardCardRepository$getCardWidgetInfo$3$1(2, null);
                dashboardCardRepository$getCardWidgetInfo$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, dashboardCardRepository$getCardWidgetInfo$3$1, dashboardCardRepository$getCardWidgetInfo$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        dashboardCardRepository$getCardWidgetInfo$1 = new DashboardCardRepository$getCardWidgetInfo$1(this, continuationImpl);
        Object obj2 = dashboardCardRepository$getCardWidgetInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardCardRepository$getCardWidgetInfo$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ProductId productId, String str, int i, ContinuationImpl continuationImpl) {
        DashboardCardRepository$getCardWidgetInfoPollable$1 dashboardCardRepository$getCardWidgetInfoPollable$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object a2;
        if (continuationImpl instanceof DashboardCardRepository$getCardWidgetInfoPollable$1) {
            dashboardCardRepository$getCardWidgetInfoPollable$1 = (DashboardCardRepository$getCardWidgetInfoPollable$1) continuationImpl;
            int i3 = dashboardCardRepository$getCardWidgetInfoPollable$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dashboardCardRepository$getCardWidgetInfoPollable$1.label = i3 - Integer.MIN_VALUE;
                Object obj = dashboardCardRepository$getCardWidgetInfoPollable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = dashboardCardRepository$getCardWidgetInfoPollable$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    DashboardCardRepository$getCardWidgetInfoPollable$2 dashboardCardRepository$getCardWidgetInfoPollable$2 = new DashboardCardRepository$getCardWidgetInfoPollable$2(this, new GetCardWidgetInfoRequest(str, productId.getValue()), i, null);
                    dashboardCardRepository$getCardWidgetInfoPollable$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(dashboardCardRepository$getCardWidgetInfoPollable$2, dashboardCardRepository$getCardWidgetInfoPollable$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) dashboardCardRepository$getCardWidgetInfoPollable$1.L$0;
                        kotlin.b.b(obj);
                        a2 = ((Result) obj).getValue();
                        return !(a2 instanceof Result.Failure) ? new iyd0(iyd0Var.b, a2) : a2;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0Var = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var.a;
                DashboardCardRepository$getCardWidgetInfoPollable$3$1$1 dashboardCardRepository$getCardWidgetInfoPollable$3$1$1 = new DashboardCardRepository$getCardWidgetInfoPollable$3$1$1(2, null);
                dashboardCardRepository$getCardWidgetInfoPollable$1.L$0 = iyd0Var;
                dashboardCardRepository$getCardWidgetInfoPollable$1.label = 2;
                a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, dashboardCardRepository$getCardWidgetInfoPollable$3$1$1, dashboardCardRepository$getCardWidgetInfoPollable$1);
            }
        }
        dashboardCardRepository$getCardWidgetInfoPollable$1 = new DashboardCardRepository$getCardWidgetInfoPollable$1(this, continuationImpl);
        Object obj2 = dashboardCardRepository$getCardWidgetInfoPollable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = dashboardCardRepository$getCardWidgetInfoPollable$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ProductId productId, String str, ContinuationImpl continuationImpl) {
        DashboardCardRepository$startPolling$1 dashboardCardRepository$startPolling$1;
        int i;
        if (continuationImpl instanceof DashboardCardRepository$startPolling$1) {
            dashboardCardRepository$startPolling$1 = (DashboardCardRepository$startPolling$1) continuationImpl;
            int i2 = dashboardCardRepository$startPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardCardRepository$startPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardCardRepository$startPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardCardRepository$startPolling$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                com.ybsdk.utils.poller.c c = this.b.c(ozd0.b, new DashboardCardRepository$startPolling$2(2, null), new DashboardCardRepository$startPolling$3(this, productId, str, null));
                dashboardCardRepository$startPolling$1.label = 1;
                Object e = c.e(dashboardCardRepository$startPolling$1);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        dashboardCardRepository$startPolling$1 = new DashboardCardRepository$startPolling$1(this, continuationImpl);
        Object obj2 = dashboardCardRepository$startPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardCardRepository$startPolling$1.label;
        if (i == 0) {
        }
    }
}
