package com.yandex.go.payments.paymentlist.navigation;

import defpackage.a000;
import defpackage.jfa0;
import defpackage.nf0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.zba0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b implements nf0 {
    public final /* synthetic */ f a;

    public b(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r5 != r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0.h(true, r1) == r6) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.nf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1 paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1;
        int i;
        zba0 zba0Var = this.a.k0;
        if (continuationImpl instanceof PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1) {
            paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1 = (PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1) continuationImpl;
            int i2 = paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        List list = ((jfa0) obj).a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof a000) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    }
                    kotlin.b.b(obj);
                }
                tpr b = zba0Var.b();
                paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1.label = 2;
                obj = kotlinx.coroutines.flow.e.y(b, paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1);
            }
        }
        paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1 = new PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1(this, continuationImpl);
        Object obj3 = paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1.label;
        if (i != 0) {
        }
        tpr b2 = zba0Var.b();
        paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1.label = 2;
        obj3 = kotlinx.coroutines.flow.e.y(b2, paymentMethodsListRouter$PaymentMethodsListNavigatorInner$createAddMBankRouter$1$updateAndGetPaymentMethods$1);
    }
}
