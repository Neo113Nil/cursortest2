package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.pci_dss.data.model.SupplyPaymentBillingRequest;
import com.yandex.go.payments.cards.pci_dss.data.model.SupplyPaymentData;
import defpackage.biw0;
import defpackage.ny61;
import defpackage.ql3;
import defpackage.tx90;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f {
    public final h a;
    public final ql3 b;

    public f(h hVar, ql3 ql3Var) {
        this.a = hVar;
        this.b = ql3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, tx90 tx90Var, biw0 biw0Var, ContinuationImpl continuationImpl) {
        SupplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1 supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1;
        int i;
        if (continuationImpl instanceof SupplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1) {
            supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1 = (SupplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1) continuationImpl;
            int i2 = supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$0 = str;
                    supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$1 = tx90Var;
                    supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$2 = biw0Var;
                    supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.label = 1;
                    obj = this.b.a.a(supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    biw0Var = (biw0) supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$2;
                    tx90Var = (tx90) supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$1;
                    str = (String) supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$0;
                    kotlin.b.b(obj);
                }
                SupplyPaymentBillingRequest supplyPaymentBillingRequest = new SupplyPaymentBillingRequest(new SupplyPaymentData((String) obj, str, biw0Var.a));
                supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$0 = null;
                supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$1 = null;
                supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$2 = null;
                supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$3 = null;
                supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.label = 2;
                Object b = this.a.b(tx90Var, supplyPaymentBillingRequest, supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1 = new SupplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1(this, continuationImpl);
        Object obj2 = supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.label;
        if (i != 0) {
        }
        SupplyPaymentBillingRequest supplyPaymentBillingRequest2 = new SupplyPaymentBillingRequest(new SupplyPaymentData((String) obj2, str, biw0Var.a));
        supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$0 = null;
        supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$1 = null;
        supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$2 = null;
        supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.L$3 = null;
        supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1.label = 2;
        Object b2 = this.a.b(tx90Var, supplyPaymentBillingRequest2, supplyCvnInteractorImpl$supplyCvnWithPurchaseToken$1);
        if (b2 != coroutineSingletons2) {
        }
    }
}
