package com.yandex.go.morphlex.action.route_address;

import com.yandex.go.morphlex.action.route_address.SetRouteAddressAction;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SetRouteAddressAction.PointType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
