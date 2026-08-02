package com.yandex.go.payments.mbank.navigation;

import com.yandex.go.payments.data.model.response.MBankAccount;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.lz90;
import defpackage.nf0;
import defpackage.ny61;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c implements nf0 {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.nf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AddMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1 addMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1;
        int i;
        if (continuationImpl instanceof AddMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1) {
            addMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1 = (AddMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1) continuationImpl;
            int i2 = addMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1.label;
                d dVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = (i) dVar.G.get();
                    addMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1.label = 1;
                    obj = iVar.s(addMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1);
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
                MBankAccount mBankAccount = ((PaymentMethods) obj).r.a;
                return mBankAccount != null ? EmptyList.a : Collections.singletonList(((lz90) dVar.D.get()).g(mBankAccount));
            }
        }
        addMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1 = new AddMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1(this, continuationImpl);
        Object obj2 = addMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addMBankAccountStackRouter$createAddMBankPaymentMethodsInteractor$1$updateAndGetPaymentMethods$1.label;
        d dVar2 = this.a;
        if (i != 0) {
        }
        MBankAccount mBankAccount2 = ((PaymentMethods) obj2).r.a;
        if (mBankAccount2 != null) {
        }
    }
}
