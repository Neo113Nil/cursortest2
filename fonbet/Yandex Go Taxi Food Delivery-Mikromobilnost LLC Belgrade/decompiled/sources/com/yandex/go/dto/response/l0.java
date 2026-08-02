package com.yandex.go.dto.response;

import com.yandex.go.dto.response.Action$Payload;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class l0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Action$Payload.ObjectType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
