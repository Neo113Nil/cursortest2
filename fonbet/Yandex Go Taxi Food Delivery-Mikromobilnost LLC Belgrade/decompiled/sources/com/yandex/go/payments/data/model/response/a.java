package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.ActionButton;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class a {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ActionButton.ActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
