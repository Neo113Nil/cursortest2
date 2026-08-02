package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class j1 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RouteInfo.Position.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
