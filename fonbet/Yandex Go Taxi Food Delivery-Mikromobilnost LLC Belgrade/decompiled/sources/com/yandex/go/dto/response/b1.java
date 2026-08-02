package com.yandex.go.dto.response;

import com.yandex.go.dto.response.Action$SdcRouteSelection;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class b1 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Action$SdcRouteSelection.ScreenType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
