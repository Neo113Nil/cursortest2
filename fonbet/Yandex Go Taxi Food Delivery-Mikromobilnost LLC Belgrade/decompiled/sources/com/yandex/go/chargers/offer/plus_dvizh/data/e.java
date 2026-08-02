package com.yandex.go.chargers.offer.plus_dvizh.data;

import defpackage.e2e0;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public abstract class e {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e2e0 e2e0Var, ContinuationImpl continuationImpl) {
        ChargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1 chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1;
        int i;
        if (continuationImpl instanceof ChargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1) {
            chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1 = (ChargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1) continuationImpl;
            int i2 = chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(e2e0Var.f("PLUS_DVIZH_PURCHASING_POLLING_SERVICE"));
                    ChargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$3 chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$3 = new ChargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$3(2, null);
                    chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1.L$0 = null;
                    chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.x(dVar, chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$3, chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1);
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
        chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1 = new ChargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1(continuationImpl);
        Object obj2 = chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPlusDvizhPurchasePollingContractKt$waitForPlusDvizhPurchaseResult$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
