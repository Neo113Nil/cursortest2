package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.Availability;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class k {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Availability.Action.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
