package com.yandex.go.payments.addmethod.data.model;

import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class k {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AddPaymentHomeResponse.DisplayType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
