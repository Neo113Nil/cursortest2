package com.yandex.go.taxi.order.models.api.request;

import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OrderStatusParam.PromoAction.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
