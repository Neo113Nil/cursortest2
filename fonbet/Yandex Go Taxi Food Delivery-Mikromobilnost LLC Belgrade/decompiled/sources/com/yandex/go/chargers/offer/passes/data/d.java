package com.yandex.go.chargers.offer.passes.data;

import defpackage.e2e0;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e2e0 e2e0Var, String str, ContinuationImpl continuationImpl) {
        ChargersPassPurchasingPollingContractKt$waitForPurchaseResult$1 chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1;
        int i;
        if (continuationImpl instanceof ChargersPassPurchasingPollingContractKt$waitForPurchaseResult$1) {
            chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1 = (ChargersPassPurchasingPollingContractKt$waitForPurchaseResult$1) continuationImpl;
            int i2 = chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(e2e0Var.f(str));
                    ChargersPassPurchasingPollingContractKt$waitForPurchaseResult$3 chargersPassPurchasingPollingContractKt$waitForPurchaseResult$3 = new ChargersPassPurchasingPollingContractKt$waitForPurchaseResult$3(2, null);
                    chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1.L$0 = null;
                    chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1.L$1 = null;
                    chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.x(cVar, chargersPassPurchasingPollingContractKt$waitForPurchaseResult$3, chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1);
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
        chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1 = new ChargersPassPurchasingPollingContractKt$waitForPurchaseResult$1(continuationImpl);
        Object obj2 = chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassPurchasingPollingContractKt$waitForPurchaseResult$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e2e0 e2e0Var, ContinuationImpl continuationImpl) {
        ChargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1 chargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1;
        int i;
        if (continuationImpl instanceof ChargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1) {
            chargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1 = (ChargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1) continuationImpl;
            int i2 = chargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1.L$0 = null;
                    chargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1.label = 1;
                    Object a = a(e2e0Var, "SUPER_PASS_PURCHASING_POLLING_SERVICE", chargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        chargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1 = new ChargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1(continuationImpl);
        Object obj2 = chargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassPurchasingPollingContractKt$waitForSuperPassPurchaseResult$1.label;
        if (i != 0) {
        }
    }
}
