package com.yandex.go.taxi.order.models.api.cancel;

import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class k0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OrderCancelNotification.Style.IconAlignment.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
