package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.SectionTypedHeader;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class h2 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SectionTypedHeader.HeaderType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
