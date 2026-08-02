package com.yandex.go.payments.mbank.domain;

import com.yandex.go.payments.data.q;
import com.yandex.go.payments.paymentlist.data.c;
import defpackage.ie60;
import defpackage.ny61;
import defpackage.tje;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class a {
    public final c a;
    public final q b;

    public a(c cVar, q qVar) {
        this.a = cVar;
        this.b = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        MBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1 mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1;
        int i;
        Object a;
        if (continuationImpl instanceof MBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1) {
            mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1 = (MBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1) continuationImpl;
            int i2 = mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.label;
                if (i != 0) {
                    b.b(obj);
                    String code = PaymentMethod$Type.MBANK_ACCOUNT.getCode();
                    mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.L$0 = str;
                    mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.label = 1;
                    a = this.b.a(str, code, mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.L$1;
                        b.b(obj);
                        return obj2;
                    }
                    str = (String) mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.L$0;
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    ie60 ie60Var = ie60.a;
                    MBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$2$1 mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$2$1 = new MBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$2$1(this, str, null);
                    mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.L$0 = null;
                    mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.L$1 = a;
                    mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.L$2 = null;
                    mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.label = 2;
                    if (tje.k0(ie60Var, mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$2$1, mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return a;
            }
        }
        mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1 = new MBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1(this, continuationImpl);
        Object obj3 = mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mBankAccountUnbindingInteractor$unbindMBankAccountWithPaymentMethodsUpdate$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        return a;
    }
}
