package com.ybsdk.feature.dashboard.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import defpackage.fdr;
import defpackage.g8e;
import defpackage.n860;
import defpackage.ny61;
import defpackage.tvv;
import defpackage.vvj0;
import defpackage.y1r0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class c {
    public final DashboardApi a;
    public final com.ybsdk.core.common.data.cache.b b;
    public final n860 c;
    public final fdr d;
    public final tvv e;
    public final com.ybsdk.common.a f;
    public final y1r0 g;

    public c(DashboardApi dashboardApi, com.ybsdk.core.common.data.cache.b bVar, n860 n860Var, fdr fdrVar, tvv tvvVar, com.ybsdk.common.a aVar, y1r0 y1r0Var) {
        this.a = dashboardApi;
        this.b = bVar;
        this.c = n860Var;
        this.d = fdrVar;
        this.e = tvvVar;
        this.f = aVar;
        this.g = y1r0Var;
    }

    public static vvj0 a(String str) {
        return new vvj0("DashboardV4Info", g8e.o("Dashboard_", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        DashboardV3Repository$getSingleDashboardV3External$1 dashboardV3Repository$getSingleDashboardV3External$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof DashboardV3Repository$getSingleDashboardV3External$1) {
            dashboardV3Repository$getSingleDashboardV3External$1 = (DashboardV3Repository$getSingleDashboardV3External$1) continuationImpl;
            int i2 = dashboardV3Repository$getSingleDashboardV3External$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardV3Repository$getSingleDashboardV3External$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardV3Repository$getSingleDashboardV3External$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardV3Repository$getSingleDashboardV3External$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DashboardV3Repository$getSingleDashboardV3External$2 dashboardV3Repository$getSingleDashboardV3External$2 = new DashboardV3Repository$getSingleDashboardV3External$2(this, str, null);
                    dashboardV3Repository$getSingleDashboardV3External$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(dashboardV3Repository$getSingleDashboardV3External$2, dashboardV3Repository$getSingleDashboardV3External$1);
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
                DashboardV3Repository$getSingleDashboardV3External$3$1 dashboardV3Repository$getSingleDashboardV3External$3$1 = new DashboardV3Repository$getSingleDashboardV3External$3$1(2, null);
                dashboardV3Repository$getSingleDashboardV3External$1.label = 2;
                Object b = com.ybsdk.core.utils.dto.b.b((DataWithStatusResponse) c, dashboardV3Repository$getSingleDashboardV3External$3$1, dashboardV3Repository$getSingleDashboardV3External$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        dashboardV3Repository$getSingleDashboardV3External$1 = new DashboardV3Repository$getSingleDashboardV3External$1(this, continuationImpl);
        Object obj2 = dashboardV3Repository$getSingleDashboardV3External$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardV3Repository$getSingleDashboardV3External$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        DashboardV3Repository$getSingleDashboardV3Product$1 dashboardV3Repository$getSingleDashboardV3Product$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof DashboardV3Repository$getSingleDashboardV3Product$1) {
            dashboardV3Repository$getSingleDashboardV3Product$1 = (DashboardV3Repository$getSingleDashboardV3Product$1) continuationImpl;
            int i2 = dashboardV3Repository$getSingleDashboardV3Product$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardV3Repository$getSingleDashboardV3Product$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardV3Repository$getSingleDashboardV3Product$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardV3Repository$getSingleDashboardV3Product$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DashboardV3Repository$getSingleDashboardV3Product$2 dashboardV3Repository$getSingleDashboardV3Product$2 = new DashboardV3Repository$getSingleDashboardV3Product$2(this, str, null);
                    dashboardV3Repository$getSingleDashboardV3Product$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(dashboardV3Repository$getSingleDashboardV3Product$2, dashboardV3Repository$getSingleDashboardV3Product$1);
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
                DashboardV3Repository$getSingleDashboardV3Product$3$1 dashboardV3Repository$getSingleDashboardV3Product$3$1 = new DashboardV3Repository$getSingleDashboardV3Product$3$1(2, null);
                dashboardV3Repository$getSingleDashboardV3Product$1.label = 2;
                Object b = com.ybsdk.core.utils.dto.b.b((DataWithStatusResponse) c, dashboardV3Repository$getSingleDashboardV3Product$3$1, dashboardV3Repository$getSingleDashboardV3Product$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        dashboardV3Repository$getSingleDashboardV3Product$1 = new DashboardV3Repository$getSingleDashboardV3Product$1(this, continuationImpl);
        Object obj2 = dashboardV3Repository$getSingleDashboardV3Product$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardV3Repository$getSingleDashboardV3Product$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r7.b.m(r8, (com.ybsdk.core.common.data.network.dto.cache.CacheableResponseDto) r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        DashboardV3Repository$updateSingleDashboardProduct$1 dashboardV3Repository$updateSingleDashboardProduct$1;
        int i;
        Object obj;
        vvj0 vvj0Var;
        if (continuationImpl instanceof DashboardV3Repository$updateSingleDashboardProduct$1) {
            dashboardV3Repository$updateSingleDashboardProduct$1 = (DashboardV3Repository$updateSingleDashboardProduct$1) continuationImpl;
            int i2 = dashboardV3Repository$updateSingleDashboardProduct$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardV3Repository$updateSingleDashboardProduct$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = dashboardV3Repository$updateSingleDashboardProduct$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardV3Repository$updateSingleDashboardProduct$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vvj0 a = a(str);
                    DashboardV3Repository$updateSingleDashboardProduct$2 dashboardV3Repository$updateSingleDashboardProduct$2 = new DashboardV3Repository$updateSingleDashboardProduct$2(this, a, str, null);
                    dashboardV3Repository$updateSingleDashboardProduct$1.L$0 = a;
                    dashboardV3Repository$updateSingleDashboardProduct$1.label = 1;
                    Object c = com.ybsdk.core.utils.ext.c.c(dashboardV3Repository$updateSingleDashboardProduct$2, dashboardV3Repository$updateSingleDashboardProduct$1);
                    if (c != coroutineSingletons) {
                        obj = c;
                        vvj0Var = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    ((Result) obj2).getClass();
                    return zy11.a;
                }
                vvj0Var = (vvj0) dashboardV3Repository$updateSingleDashboardProduct$1.L$0;
                kotlin.b.b(obj2);
                obj = ((Result) obj2).getValue();
                if (!(obj instanceof Result.Failure)) {
                    return obj;
                }
                dashboardV3Repository$updateSingleDashboardProduct$1.L$0 = null;
                dashboardV3Repository$updateSingleDashboardProduct$1.label = 2;
            }
        }
        dashboardV3Repository$updateSingleDashboardProduct$1 = new DashboardV3Repository$updateSingleDashboardProduct$1(this, continuationImpl);
        Object obj22 = dashboardV3Repository$updateSingleDashboardProduct$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardV3Repository$updateSingleDashboardProduct$1.label;
        if (i != 0) {
        }
        if (!(obj instanceof Result.Failure)) {
        }
    }
}
