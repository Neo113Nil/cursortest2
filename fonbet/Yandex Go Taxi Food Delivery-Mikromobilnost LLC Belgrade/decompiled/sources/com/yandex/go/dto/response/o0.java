package com.yandex.go.dto.response;

import com.yandex.go.dto.response.Action$RouteInput;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class o0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Action$RouteInput.AdditionalActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
