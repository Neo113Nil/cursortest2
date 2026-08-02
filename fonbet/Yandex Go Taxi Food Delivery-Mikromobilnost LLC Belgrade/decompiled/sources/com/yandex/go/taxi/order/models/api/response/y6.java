package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsWishSelector;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class y6 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RideCardItemDto$TipsWishSelector.StyleType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
