package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class n0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MapRouteParametersDto.ZoomableObjectType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
