package com.ybsdk.feature.savings.internal.interactors.v4;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.c;
import defpackage.acu;
import defpackage.bvf0;
import defpackage.gbm0;
import defpackage.nbp0;
import defpackage.ny61;
import defpackage.q1e0;
import defpackage.tpr;
import defpackage.tq11;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final nbp0 a;
    public final com.ybsdk.utils.poller.b b;
    public final AppAnalyticsReporter c;
    public final gbm0 d;
    public final com.ybsdk.feature.savings.internal.data.b e;
    public final c f;

    public b(nbp0 nbp0Var, com.ybsdk.utils.poller.b bVar, AppAnalyticsReporter appAnalyticsReporter, gbm0 gbm0Var, com.ybsdk.feature.savings.internal.data.b bVar2, c cVar) {
        this.a = nbp0Var;
        this.b = bVar;
        this.c = appAnalyticsReporter;
        this.d = gbm0Var;
        this.e = bVar2;
        this.f = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tq11 tq11Var, Map map, ContinuationImpl continuationImpl) {
        SavingsDashboardInteractorV4$getDashboard$1 savingsDashboardInteractorV4$getDashboard$1;
        int i;
        if (continuationImpl instanceof SavingsDashboardInteractorV4$getDashboard$1) {
            savingsDashboardInteractorV4$getDashboard$1 = (SavingsDashboardInteractorV4$getDashboard$1) continuationImpl;
            int i2 = savingsDashboardInteractorV4$getDashboard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardInteractorV4$getDashboard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsDashboardInteractorV4$getDashboard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardInteractorV4$getDashboard$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SavingsDashboardInteractorV4$getDashboard$2 savingsDashboardInteractorV4$getDashboard$2 = new SavingsDashboardInteractorV4$getDashboard$2(this, tq11Var, map, null);
                    savingsDashboardInteractorV4$getDashboard$1.label = 1;
                    obj = bvf0.n(savingsDashboardInteractorV4$getDashboard$2, savingsDashboardInteractorV4$getDashboard$1);
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
        savingsDashboardInteractorV4$getDashboard$1 = new SavingsDashboardInteractorV4$getDashboard$1(this, continuationImpl);
        Object obj2 = savingsDashboardInteractorV4$getDashboard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardInteractorV4$getDashboard$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q1e0 q1e0Var, Map map, ContinuationImpl continuationImpl) {
        SavingsDashboardInteractorV4$pollDashboard$1 savingsDashboardInteractorV4$pollDashboard$1;
        int i;
        if (continuationImpl instanceof SavingsDashboardInteractorV4$pollDashboard$1) {
            savingsDashboardInteractorV4$pollDashboard$1 = (SavingsDashboardInteractorV4$pollDashboard$1) continuationImpl;
            int i2 = savingsDashboardInteractorV4$pollDashboard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardInteractorV4$pollDashboard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsDashboardInteractorV4$pollDashboard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardInteractorV4$pollDashboard$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.utils.poller.c c = this.b.c(q1e0Var, new SavingsDashboardInteractorV4$pollDashboard$2(this, null), new SavingsDashboardInteractorV4$pollDashboard$3(this, map, null));
                    savingsDashboardInteractorV4$pollDashboard$1.label = 1;
                    obj = c.d(null, savingsDashboardInteractorV4$pollDashboard$1);
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
                return new acu((tpr) obj, 21);
            }
        }
        savingsDashboardInteractorV4$pollDashboard$1 = new SavingsDashboardInteractorV4$pollDashboard$1(this, continuationImpl);
        Object obj2 = savingsDashboardInteractorV4$pollDashboard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardInteractorV4$pollDashboard$1.label;
        if (i != 0) {
        }
        return new acu((tpr) obj2, 21);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, List list, ContinuationImpl continuationImpl) {
        SavingsDashboardInteractorV4$setOrder$1 savingsDashboardInteractorV4$setOrder$1;
        int i;
        if (continuationImpl instanceof SavingsDashboardInteractorV4$setOrder$1) {
            savingsDashboardInteractorV4$setOrder$1 = (SavingsDashboardInteractorV4$setOrder$1) continuationImpl;
            int i2 = savingsDashboardInteractorV4$setOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardInteractorV4$setOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsDashboardInteractorV4$setOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardInteractorV4$setOrder$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                SavingsDashboardInteractorV4$setOrder$2 savingsDashboardInteractorV4$setOrder$2 = new SavingsDashboardInteractorV4$setOrder$2(this, list, null);
                savingsDashboardInteractorV4$setOrder$1.label = 1;
                Object O = this.f.O(savingsDashboardInteractorV4$setOrder$2, str, savingsDashboardInteractorV4$setOrder$1);
                return O == coroutineSingletons ? coroutineSingletons : O;
            }
        }
        savingsDashboardInteractorV4$setOrder$1 = new SavingsDashboardInteractorV4$setOrder$1(this, continuationImpl);
        Object obj2 = savingsDashboardInteractorV4$setOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardInteractorV4$setOrder$1.label;
        if (i == 0) {
        }
    }
}
