package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class c1 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OrderChangesDto.Status.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
