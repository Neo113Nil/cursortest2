package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.taxi.order.models.api.objects.ButtonModifierDTO;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class g {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ButtonModifierDTO.ButtonName.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
