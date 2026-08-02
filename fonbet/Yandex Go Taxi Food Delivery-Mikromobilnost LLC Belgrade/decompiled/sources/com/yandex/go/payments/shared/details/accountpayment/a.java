package com.yandex.go.payments.shared.details.accountpayment;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.SharedPayment;
import defpackage.avj0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.rfa0;
import defpackage.tl;
import defpackage.v8a0;
import defpackage.zuj0;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.order.view.b;

/* loaded from: classes13.dex */
public final class a {
    public final b a;
    public final zuj0 b;

    public a(b bVar, zuj0 zuj0Var) {
        this.a = bVar;
        this.b = zuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Account account, rfa0 rfa0Var, ContinuationImpl continuationImpl) {
        AccountPaymentConverter$toAccountPaymentViewModel$2 accountPaymentConverter$toAccountPaymentViewModel$2;
        int i;
        if (continuationImpl instanceof AccountPaymentConverter$toAccountPaymentViewModel$2) {
            accountPaymentConverter$toAccountPaymentViewModel$2 = (AccountPaymentConverter$toAccountPaymentViewModel$2) continuationImpl;
            int i2 = accountPaymentConverter$toAccountPaymentViewModel$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountPaymentConverter$toAccountPaymentViewModel$2.label = i2 - Integer.MIN_VALUE;
                AccountPaymentConverter$toAccountPaymentViewModel$2 accountPaymentConverter$toAccountPaymentViewModel$22 = accountPaymentConverter$toAccountPaymentViewModel$2;
                Object obj = accountPaymentConverter$toAccountPaymentViewModel$22.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountPaymentConverter$toAccountPaymentViewModel$22.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PaymentMethod$Type paymentMethod$Type = rfa0Var.a;
                    String str = rfa0Var.b;
                    accountPaymentConverter$toAccountPaymentViewModel$22.L$0 = account;
                    accountPaymentConverter$toAccountPaymentViewModel$22.L$1 = null;
                    accountPaymentConverter$toAccountPaymentViewModel$22.label = 1;
                    obj = this.a.d(paymentMethod$Type, str, null, null, accountPaymentConverter$toAccountPaymentViewModel$22);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    account = (Account) accountPaymentConverter$toAccountPaymentViewModel$22.L$0;
                    kotlin.b.b(obj);
                }
                v8a0 v8a0Var = (v8a0) obj;
                return new tl(!evu0.J(account.j) ? ((avj0) this.b).h(kyh0.shared_payments_details_payment_method) : null, v8a0Var == null ? v8a0Var.a : null, account.j, v8a0Var != null ? v8a0Var.b : null);
            }
        }
        accountPaymentConverter$toAccountPaymentViewModel$2 = new AccountPaymentConverter$toAccountPaymentViewModel$2(this, continuationImpl);
        AccountPaymentConverter$toAccountPaymentViewModel$2 accountPaymentConverter$toAccountPaymentViewModel$222 = accountPaymentConverter$toAccountPaymentViewModel$2;
        Object obj2 = accountPaymentConverter$toAccountPaymentViewModel$222.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountPaymentConverter$toAccountPaymentViewModel$222.label;
        if (i != 0) {
        }
        v8a0 v8a0Var2 = (v8a0) obj2;
        return new tl(!evu0.J(account.j) ? ((avj0) this.b).h(kyh0.shared_payments_details_payment_method) : null, v8a0Var2 == null ? v8a0Var2.a : null, account.j, v8a0Var2 != null ? v8a0Var2.b : null);
    }

    public final Object b(Account account, ContinuationImpl continuationImpl) {
        Object obj;
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
            return a(account, rfa0Var, continuationImpl);
        }
        return new tl(((avj0) this.b).h(kyh0.shared_payments_details_choose_card), account.j, 9);
    }
}
