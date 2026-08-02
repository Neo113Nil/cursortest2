package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.SectionTypedHeader;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class n2 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SectionTypedHeader.Trail.TrailType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
