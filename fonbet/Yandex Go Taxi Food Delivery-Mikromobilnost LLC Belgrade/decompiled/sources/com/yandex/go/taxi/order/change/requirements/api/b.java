package com.yandex.go.taxi.order.change.requirements.api;

import com.yandex.go.taxi.order.change.requirements.api.ChangeRequirementsResponse;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChangeRequirementsResponse.ChangeStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
