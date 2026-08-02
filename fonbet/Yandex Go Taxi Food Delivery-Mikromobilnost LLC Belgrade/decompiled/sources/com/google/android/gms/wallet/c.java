package com.google.android.gms.wallet;

import defpackage.cvw;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes11.dex */
public final class c {
    public final /* synthetic */ PaymentDataRequest a;

    public /* synthetic */ c(PaymentDataRequest paymentDataRequest) {
        this.a = paymentDataRequest;
    }

    public final void a(Collection collection) {
        boolean z = false;
        if (collection != null && !collection.isEmpty()) {
            z = true;
        }
        cvw.d("allowedPaymentMethods can't be null or empty!", z);
        PaymentDataRequest paymentDataRequest = this.a;
        if (paymentDataRequest.zzf == null) {
            paymentDataRequest.zzf = new ArrayList();
        }
        paymentDataRequest.zzf.addAll(collection);
    }

    public final PaymentDataRequest b() {
        PaymentDataRequest paymentDataRequest = this.a;
        if (paymentDataRequest.zzj == null && paymentDataRequest.zzk == null) {
            cvw.m(paymentDataRequest.zzf, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
            cvw.m(paymentDataRequest.zzc, "Card requirements must be set!");
            if (paymentDataRequest.zzg != null) {
                cvw.m(paymentDataRequest.zzh, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
            }
        }
        return paymentDataRequest;
    }

    public final void c(CardRequirements cardRequirements) {
        this.a.zzc = cardRequirements;
    }

    public final void d(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
        this.a.zzg = paymentMethodTokenizationParameters;
    }

    public final void e(TransactionInfo transactionInfo) {
        this.a.zzh = transactionInfo;
    }

    public final void f(boolean z) {
        this.a.zzi = z;
    }
}
