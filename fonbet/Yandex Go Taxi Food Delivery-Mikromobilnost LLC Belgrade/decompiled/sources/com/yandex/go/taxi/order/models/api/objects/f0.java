package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class f0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
