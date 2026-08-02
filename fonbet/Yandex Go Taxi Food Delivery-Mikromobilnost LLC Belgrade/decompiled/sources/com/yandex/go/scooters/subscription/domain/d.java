package com.yandex.go.scooters.subscription.domain;

import defpackage.e2e0;
import defpackage.ny61;
import defpackage.vyo0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class d {
    public final e2e0 a;
    public final vyo0 b;

    public d(e2e0 e2e0Var, vyo0 vyo0Var) {
        this.a = e2e0Var;
        this.b = vyo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1 scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1;
        int i;
        if (continuationImpl instanceof ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1) {
            scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1 = (ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1) continuationImpl;
            int i2 = scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(this.a.f("subscription"));
                    ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$2 scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$2 = new ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$2(2, null);
                    scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1.label = 1;
                    obj = e.x(cVar, scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$2, scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1);
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
        scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1 = new ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
