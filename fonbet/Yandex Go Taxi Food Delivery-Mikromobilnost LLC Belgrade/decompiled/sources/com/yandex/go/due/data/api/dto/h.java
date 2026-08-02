package com.yandex.go.due.data.api.dto;

import com.yandex.go.due.data.api.dto.PricePrefetch;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class h {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PricePrefetch.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
