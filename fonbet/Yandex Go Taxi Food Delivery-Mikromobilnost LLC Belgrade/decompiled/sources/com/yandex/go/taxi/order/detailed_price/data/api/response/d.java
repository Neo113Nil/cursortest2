package com.yandex.go.taxi.order.detailed_price.data.api.response;

import com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem$DetailedPrice;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem.DividerType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
