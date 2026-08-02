package com.yandex.go.payments.addmethod.data.model;

import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class s0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = WebviewBindingFlow.PaymentMethodBindResponseSignalParam.Action.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
