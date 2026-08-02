package com.yandex.go.payments.paymentlist.experiments;

import com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class l {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MainMenuPaymentMethodsSelectorExperiment.PaymentTypes.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
