package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class j1 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ProductMode$Taxi.SectionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
