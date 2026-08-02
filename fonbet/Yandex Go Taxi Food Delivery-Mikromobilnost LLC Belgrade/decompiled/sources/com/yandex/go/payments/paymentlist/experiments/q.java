package com.yandex.go.payments.paymentlist.experiments;

import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsAddButtonExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class q {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PaymentMethodsAddButtonExperiment.PaymentMethodsAddButtonPosition.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
