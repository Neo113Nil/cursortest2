package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class l8 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton.AdditionalOrderOptionButtonAction.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
