package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class h0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DeliveryPaymentMethod.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
