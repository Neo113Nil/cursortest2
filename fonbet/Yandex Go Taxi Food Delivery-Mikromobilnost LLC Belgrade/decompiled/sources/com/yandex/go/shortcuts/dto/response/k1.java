package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class k1 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ProductMode$Taxi.TopItemAlign.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
