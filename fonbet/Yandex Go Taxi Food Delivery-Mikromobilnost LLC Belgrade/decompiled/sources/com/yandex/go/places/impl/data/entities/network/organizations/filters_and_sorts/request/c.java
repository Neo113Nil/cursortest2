package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request;

import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FilterRequestDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FilterRequestDto.FilterTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
