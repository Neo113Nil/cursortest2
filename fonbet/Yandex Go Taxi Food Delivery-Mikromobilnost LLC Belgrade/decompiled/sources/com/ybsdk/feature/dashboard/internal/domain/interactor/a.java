package com.ybsdk.feature.dashboard.internal.domain.interactor;

import com.ybsdk.feature.dashboard.internal.data.c;
import defpackage.btc;
import defpackage.ez8;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.yig;
import java.util.Iterator;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final yig a;
    public final c b;
    public final com.ybsdk.common.a c;

    public a(yig yigVar, c cVar, com.ybsdk.common.a aVar) {
        this.a = yigVar;
        this.b = cVar;
        this.c = aVar;
    }

    public final boolean a(String str) {
        Object obj;
        Iterator it = this.c.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((btc) obj).a, str)) {
                break;
            }
        }
        return ((btc) obj) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        DashboardInteractor$getSingleDashboardV3External$1 dashboardInteractor$getSingleDashboardV3External$1;
        int i;
        if (continuationImpl instanceof DashboardInteractor$getSingleDashboardV3External$1) {
            dashboardInteractor$getSingleDashboardV3External$1 = (DashboardInteractor$getSingleDashboardV3External$1) continuationImpl;
            int i2 = dashboardInteractor$getSingleDashboardV3External$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardInteractor$getSingleDashboardV3External$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardInteractor$getSingleDashboardV3External$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardInteractor$getSingleDashboardV3External$1.label;
                if (i != 0) {
                    b.b(obj);
                    dashboardInteractor$getSingleDashboardV3External$1.label = 1;
                    Object b = this.b.b(str, dashboardInteractor$getSingleDashboardV3External$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        dashboardInteractor$getSingleDashboardV3External$1 = new DashboardInteractor$getSingleDashboardV3External$1(this, continuationImpl);
        Object obj2 = dashboardInteractor$getSingleDashboardV3External$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardInteractor$getSingleDashboardV3External$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        DashboardInteractor$getSingleDashboardV3Product$1 dashboardInteractor$getSingleDashboardV3Product$1;
        int i;
        Object c;
        if (continuationImpl instanceof DashboardInteractor$getSingleDashboardV3Product$1) {
            dashboardInteractor$getSingleDashboardV3Product$1 = (DashboardInteractor$getSingleDashboardV3Product$1) continuationImpl;
            int i2 = dashboardInteractor$getSingleDashboardV3Product$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardInteractor$getSingleDashboardV3Product$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardInteractor$getSingleDashboardV3Product$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardInteractor$getSingleDashboardV3Product$1.label;
                if (i != 0) {
                    b.b(obj);
                    dashboardInteractor$getSingleDashboardV3Product$1.label = 1;
                    c = this.b.c(str, dashboardInteractor$getSingleDashboardV3Product$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    ((ez8) c).b.getClass();
                }
                return c;
            }
        }
        dashboardInteractor$getSingleDashboardV3Product$1 = new DashboardInteractor$getSingleDashboardV3Product$1(this, continuationImpl);
        Object obj2 = dashboardInteractor$getSingleDashboardV3Product$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardInteractor$getSingleDashboardV3Product$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        DashboardInteractor$updateSingleDashboardProduct$1 dashboardInteractor$updateSingleDashboardProduct$1;
        int i;
        if (continuationImpl instanceof DashboardInteractor$updateSingleDashboardProduct$1) {
            dashboardInteractor$updateSingleDashboardProduct$1 = (DashboardInteractor$updateSingleDashboardProduct$1) continuationImpl;
            int i2 = dashboardInteractor$updateSingleDashboardProduct$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardInteractor$updateSingleDashboardProduct$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardInteractor$updateSingleDashboardProduct$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardInteractor$updateSingleDashboardProduct$1.label;
                if (i != 0) {
                    b.b(obj);
                    dashboardInteractor$updateSingleDashboardProduct$1.label = 1;
                    Object d = this.b.d(str, dashboardInteractor$updateSingleDashboardProduct$1);
                    return d == coroutineSingletons ? coroutineSingletons : d;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        dashboardInteractor$updateSingleDashboardProduct$1 = new DashboardInteractor$updateSingleDashboardProduct$1(this, continuationImpl);
        Object obj2 = dashboardInteractor$updateSingleDashboardProduct$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardInteractor$updateSingleDashboardProduct$1.label;
        if (i != 0) {
        }
    }
}
