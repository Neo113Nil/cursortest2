package com.yandex.go.safety.center.api;

import com.yandex.go.safety.center.api.AccidentsResponse;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AccidentsResponse.Status.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
