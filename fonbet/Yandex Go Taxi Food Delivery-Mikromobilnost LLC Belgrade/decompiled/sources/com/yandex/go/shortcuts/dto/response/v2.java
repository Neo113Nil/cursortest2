package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.TextStyleDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class v2 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TextStyleDto.HorizontalAlignment.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
