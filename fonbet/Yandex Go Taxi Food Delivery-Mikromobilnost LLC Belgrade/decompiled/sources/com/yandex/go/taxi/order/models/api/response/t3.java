package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.RatingDisplayPolicy;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class t3 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RatingDisplayPolicy.DisplayOnType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
