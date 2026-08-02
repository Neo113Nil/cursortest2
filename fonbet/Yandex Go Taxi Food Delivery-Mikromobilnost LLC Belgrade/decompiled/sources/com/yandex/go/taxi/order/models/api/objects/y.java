package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.taxi.order.models.api.objects.MapObject;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class y {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MapObject.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
