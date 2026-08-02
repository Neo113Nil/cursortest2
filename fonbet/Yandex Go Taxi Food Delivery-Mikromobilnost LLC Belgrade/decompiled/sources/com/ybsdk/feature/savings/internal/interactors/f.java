package com.ybsdk.feature.savings.internal.interactors;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.q;
import defpackage.acu;
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
public final class f {
    public final com.ybsdk.feature.savings.internal.data.b a;
    public final q b;
    public final AppAnalyticsReporter c;
    public final com.ybsdk.utils.poller.b d;
    public final com.ybsdk.feature.savings.internal.screens.dashboard.a e;

    public f(com.ybsdk.feature.savings.internal.data.b bVar, q qVar, AppAnalyticsReporter appAnalyticsReporter, com.ybsdk.utils.poller.b bVar2, com.ybsdk.feature.savings.internal.screens.dashboard.a aVar) {
        this.a = bVar;
        this.b = qVar;
        this.c = appAnalyticsReporter;
        this.d = bVar2;
        this.e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tq11 tq11Var, Map map, ContinuationImpl continuationImpl) {
        SavingsDashboardInteractor$getData$1 savingsDashboardInteractor$getData$1;
        int i;
        if (continuationImpl instanceof SavingsDashboardInteractor$getData$1) {
            savingsDashboardInteractor$getData$1 = (SavingsDashboardInteractor$getData$1) continuationImpl;
            int i2 = savingsDashboardInteractor$getData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardInteractor$getData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsDashboardInteractor$getData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardInteractor$getData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    savingsDashboardInteractor$getData$1.label = 1;
                    Object d = this.a.d(tq11Var, map, savingsDashboardInteractor$getData$1);
                    return d == coroutineSingletons ? coroutineSingletons : d;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        savingsDashboardInteractor$getData$1 = new SavingsDashboardInteractor$getData$1(this, continuationImpl);
        Object obj2 = savingsDashboardInteractor$getData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardInteractor$getData$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q1e0 q1e0Var, Map map, ContinuationImpl continuationImpl) {
        SavingsDashboardInteractor$pollStatus$1 savingsDashboardInteractor$pollStatus$1;
        int i;
        if (continuationImpl instanceof SavingsDashboardInteractor$pollStatus$1) {
            savingsDashboardInteractor$pollStatus$1 = (SavingsDashboardInteractor$pollStatus$1) continuationImpl;
            int i2 = savingsDashboardInteractor$pollStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardInteractor$pollStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsDashboardInteractor$pollStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardInteractor$pollStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.utils.poller.c c = this.d.c(q1e0Var, new SavingsDashboardInteractor$pollStatus$2(this, null), new SavingsDashboardInteractor$pollStatus$3(this, map, null));
                    savingsDashboardInteractor$pollStatus$1.label = 1;
                    obj = c.d(null, savingsDashboardInteractor$pollStatus$1);
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
                return new acu((tpr) obj, 20);
            }
        }
        savingsDashboardInteractor$pollStatus$1 = new SavingsDashboardInteractor$pollStatus$1(this, continuationImpl);
        Object obj2 = savingsDashboardInteractor$pollStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardInteractor$pollStatus$1.label;
        if (i != 0) {
        }
        return new acu((tpr) obj2, 20);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, List list, ContinuationImpl continuationImpl) {
        SavingsDashboardInteractor$setOrder$1 savingsDashboardInteractor$setOrder$1;
        int i;
        if (continuationImpl instanceof SavingsDashboardInteractor$setOrder$1) {
            savingsDashboardInteractor$setOrder$1 = (SavingsDashboardInteractor$setOrder$1) continuationImpl;
            int i2 = savingsDashboardInteractor$setOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardInteractor$setOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsDashboardInteractor$setOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardInteractor$setOrder$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                SavingsDashboardInteractor$setOrder$2 savingsDashboardInteractor$setOrder$2 = new SavingsDashboardInteractor$setOrder$2(this, list, null);
                savingsDashboardInteractor$setOrder$1.label = 1;
                Object O = this.e.O(savingsDashboardInteractor$setOrder$2, str, savingsDashboardInteractor$setOrder$1);
                return O == coroutineSingletons ? coroutineSingletons : O;
            }
        }
        savingsDashboardInteractor$setOrder$1 = new SavingsDashboardInteractor$setOrder$1(this, continuationImpl);
        Object obj2 = savingsDashboardInteractor$setOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardInteractor$setOrder$1.label;
        if (i == 0) {
        }
    }
}
