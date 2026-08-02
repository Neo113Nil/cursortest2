package com.yandex.go.taxi.order.cache.api.data.model;

import com.yandex.go.taxi.order.cache.api.data.model.OrderCacheParams;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OrderCacheParams.Service.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
