package com.ybsdk.feature.push.impl.domain;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.bvf0;
import defpackage.m2g0;
import defpackage.ny61;
import defpackage.qc20;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final com.ybsdk.feature.push.impl.data.a a;
    public final m2g0 b;
    public final qc20 c;
    public final AppAnalyticsReporter d;

    public b(com.ybsdk.feature.push.impl.data.a aVar, m2g0 m2g0Var, qc20 qc20Var, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = aVar;
        this.b = m2g0Var;
        this.c = qc20Var;
        this.d = appAnalyticsReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        PushNotificationsSubscriptionInteractor$subscribe$1 pushNotificationsSubscriptionInteractor$subscribe$1;
        int i;
        if (continuationImpl instanceof PushNotificationsSubscriptionInteractor$subscribe$1) {
            pushNotificationsSubscriptionInteractor$subscribe$1 = (PushNotificationsSubscriptionInteractor$subscribe$1) continuationImpl;
            int i2 = pushNotificationsSubscriptionInteractor$subscribe$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushNotificationsSubscriptionInteractor$subscribe$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushNotificationsSubscriptionInteractor$subscribe$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushNotificationsSubscriptionInteractor$subscribe$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PushNotificationsSubscriptionInteractor$subscribe$2 pushNotificationsSubscriptionInteractor$subscribe$2 = new PushNotificationsSubscriptionInteractor$subscribe$2(this, str3, str2, str, str4, null);
                    pushNotificationsSubscriptionInteractor$subscribe$1.label = 1;
                    obj = bvf0.n(pushNotificationsSubscriptionInteractor$subscribe$2, pushNotificationsSubscriptionInteractor$subscribe$1);
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
                return obj;
            }
        }
        pushNotificationsSubscriptionInteractor$subscribe$1 = new PushNotificationsSubscriptionInteractor$subscribe$1(this, continuationImpl);
        Object obj2 = pushNotificationsSubscriptionInteractor$subscribe$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushNotificationsSubscriptionInteractor$subscribe$1.label;
        if (i != 0) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        PushNotificationsSubscriptionInteractor$unsubscribe$1 pushNotificationsSubscriptionInteractor$unsubscribe$1;
        int i;
        if (continuationImpl instanceof PushNotificationsSubscriptionInteractor$unsubscribe$1) {
            pushNotificationsSubscriptionInteractor$unsubscribe$1 = (PushNotificationsSubscriptionInteractor$unsubscribe$1) continuationImpl;
            int i2 = pushNotificationsSubscriptionInteractor$unsubscribe$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushNotificationsSubscriptionInteractor$unsubscribe$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushNotificationsSubscriptionInteractor$unsubscribe$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushNotificationsSubscriptionInteractor$unsubscribe$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PushNotificationsSubscriptionInteractor$unsubscribe$2 pushNotificationsSubscriptionInteractor$unsubscribe$2 = new PushNotificationsSubscriptionInteractor$unsubscribe$2(this, str, null);
                    pushNotificationsSubscriptionInteractor$unsubscribe$1.label = 1;
                    obj = bvf0.n(pushNotificationsSubscriptionInteractor$unsubscribe$2, pushNotificationsSubscriptionInteractor$unsubscribe$1);
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
                return obj;
            }
        }
        pushNotificationsSubscriptionInteractor$unsubscribe$1 = new PushNotificationsSubscriptionInteractor$unsubscribe$1(this, continuationImpl);
        Object obj2 = pushNotificationsSubscriptionInteractor$unsubscribe$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushNotificationsSubscriptionInteractor$unsubscribe$1.label;
        if (i != 0) {
        }
        return obj2;
    }
}
