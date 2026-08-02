package com.yandex.go.payments.shared.business.accountcreation;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.SharedPayment;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rfa0;
import defpackage.rmr0;
import defpackage.uw6;
import defpackage.v8a0;
import defpackage.vw6;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class b {
    public final ru.yandex.taxi.order.view.b a;

    public b(ru.yandex.taxi.order.view.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Account account, rmr0 rmr0Var, boolean z, ContinuationImpl continuationImpl) {
        BusinessAccountPaymentViewModelConverter$generatePaymentState$1 businessAccountPaymentViewModelConverter$generatePaymentState$1;
        int i;
        Object obj;
        v8a0 v8a0Var;
        if (continuationImpl instanceof BusinessAccountPaymentViewModelConverter$generatePaymentState$1) {
            businessAccountPaymentViewModelConverter$generatePaymentState$1 = (BusinessAccountPaymentViewModelConverter$generatePaymentState$1) continuationImpl;
            int i2 = businessAccountPaymentViewModelConverter$generatePaymentState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                businessAccountPaymentViewModelConverter$generatePaymentState$1.label = i2 - Integer.MIN_VALUE;
                BusinessAccountPaymentViewModelConverter$generatePaymentState$1 businessAccountPaymentViewModelConverter$generatePaymentState$12 = businessAccountPaymentViewModelConverter$generatePaymentState$1;
                Object obj2 = businessAccountPaymentViewModelConverter$generatePaymentState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = businessAccountPaymentViewModelConverter$generatePaymentState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!z) {
                        vw6 vw6Var = vw6.d;
                        uw6 uw6Var = new uw6();
                        uw6Var.b = rmr0Var.d;
                        return new vw6(uw6Var);
                    }
                    SharedPayment sharedPayment = account.e;
                    Iterator it = sharedPayment.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(sharedPayment.b, ((rfa0) obj).b)) {
                            break;
                        }
                    }
                    rfa0 rfa0Var = (rfa0) obj;
                    if (rfa0Var != null) {
                        PaymentMethod$Type paymentMethod$Type = rfa0Var.a;
                        String str = rfa0Var.b;
                        businessAccountPaymentViewModelConverter$generatePaymentState$12.L$0 = null;
                        businessAccountPaymentViewModelConverter$generatePaymentState$12.L$1 = rmr0Var;
                        businessAccountPaymentViewModelConverter$generatePaymentState$12.L$2 = null;
                        businessAccountPaymentViewModelConverter$generatePaymentState$12.L$3 = null;
                        businessAccountPaymentViewModelConverter$generatePaymentState$12.Z$0 = z;
                        businessAccountPaymentViewModelConverter$generatePaymentState$12.label = 1;
                        obj2 = this.a.d(paymentMethod$Type, str, null, null, businessAccountPaymentViewModelConverter$generatePaymentState$12);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    vw6 vw6Var2 = vw6.d;
                    uw6 uw6Var2 = new uw6();
                    uw6Var2.b = rmr0Var.e;
                    return new vw6(uw6Var2);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rmr0Var = (rmr0) businessAccountPaymentViewModelConverter$generatePaymentState$12.L$1;
                kotlin.b.b(obj2);
                v8a0Var = (v8a0) obj2;
                if (v8a0Var != null) {
                    vw6 vw6Var3 = vw6.d;
                    uw6 uw6Var3 = new uw6();
                    uw6Var3.a = rmr0Var.f;
                    uw6Var3.b = v8a0Var.a;
                    uw6Var3.c = v8a0Var.b;
                    return new vw6(uw6Var3);
                }
                vw6 vw6Var22 = vw6.d;
                uw6 uw6Var22 = new uw6();
                uw6Var22.b = rmr0Var.e;
                return new vw6(uw6Var22);
            }
        }
        businessAccountPaymentViewModelConverter$generatePaymentState$1 = new BusinessAccountPaymentViewModelConverter$generatePaymentState$1(this, continuationImpl);
        BusinessAccountPaymentViewModelConverter$generatePaymentState$1 businessAccountPaymentViewModelConverter$generatePaymentState$122 = businessAccountPaymentViewModelConverter$generatePaymentState$1;
        Object obj22 = businessAccountPaymentViewModelConverter$generatePaymentState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = businessAccountPaymentViewModelConverter$generatePaymentState$122.label;
        if (i != 0) {
        }
        v8a0Var = (v8a0) obj22;
        if (v8a0Var != null) {
        }
        vw6 vw6Var222 = vw6.d;
        uw6 uw6Var222 = new uw6();
        uw6Var222.b = rmr0Var.e;
        return new vw6(uw6Var222);
    }
}
