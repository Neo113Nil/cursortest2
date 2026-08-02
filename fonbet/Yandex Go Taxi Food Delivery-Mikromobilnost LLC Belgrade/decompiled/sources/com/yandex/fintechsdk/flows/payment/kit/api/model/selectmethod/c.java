package com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod;

import defpackage.tls;
import defpackage.whq0;

/* loaded from: classes12.dex */
public final class c {
    public final tls a;
    public final tls b;

    public c(whq0 whq0Var) {
        SelectedPaymentMethodResolver$1 selectedPaymentMethodResolver$1 = new SelectedPaymentMethodResolver$1(1, whq0Var, whq0.class, "matches", "matches(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedPaymentMethodPayload;)Z", 0);
        SelectedPaymentMethodResolver$2 selectedPaymentMethodResolver$2 = new SelectedPaymentMethodResolver$2(1, whq0Var, whq0.class, "toParcelable", "toParcelable(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedPaymentMethodPayload;)Landroid/os/Parcelable;", 0);
        this.a = selectedPaymentMethodResolver$1;
        this.b = selectedPaymentMethodResolver$2;
    }
}
