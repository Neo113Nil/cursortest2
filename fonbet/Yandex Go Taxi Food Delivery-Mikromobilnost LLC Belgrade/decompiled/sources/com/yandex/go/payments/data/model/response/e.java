package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.AddPaymentMethodButton;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class e {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AddPaymentMethodButton.AddButtonType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
