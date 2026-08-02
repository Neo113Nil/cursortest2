package com.yandex.go.scooters.passes.domain;

import defpackage.e2e0;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class g {
    public final e2e0 a;

    public g(e2e0 e2e0Var) {
        this.a = e2e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1 scootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1;
        int i;
        if (continuationImpl instanceof ScootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1) {
            scootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1 = (ScootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1) continuationImpl;
            int i2 = scootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1.label = 1;
                    Object b = b("package", scootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1);
                    return b == obj2 ? obj2 : b;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        scootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1 = new ScootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1(this, continuationImpl);
        Object obj3 = scootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassPurchasingPollingInteractorImpl$waitForPackagePurchaseResult$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ScootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1 scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1;
        int i;
        if (continuationImpl instanceof ScootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1) {
            scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1 = (ScootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1) continuationImpl;
            int i2 = scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(this.a.f(str));
                    ScootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$3 scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$3 = new ScootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$3(2, null);
                    scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1.L$0 = null;
                    scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.x(fVar, scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$3, scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1);
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
        scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1 = new ScootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1(this, continuationImpl);
        Object obj2 = scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassPurchasingPollingInteractorImpl$waitForPurchaseResult$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ScootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1 scootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1;
        int i;
        if (continuationImpl instanceof ScootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1) {
            scootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1 = (ScootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1) continuationImpl;
            int i2 = scootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1.label = 1;
                    Object b = b("superpass", scootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1);
                    return b == obj2 ? obj2 : b;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        scootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1 = new ScootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1(this, continuationImpl);
        Object obj3 = scootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassPurchasingPollingInteractorImpl$waitForSuperPassPurchaseResult$1.label;
        if (i != 0) {
        }
    }
}
