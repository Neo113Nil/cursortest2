package com.yandex.go.taxi.order.models.api.feedback;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
