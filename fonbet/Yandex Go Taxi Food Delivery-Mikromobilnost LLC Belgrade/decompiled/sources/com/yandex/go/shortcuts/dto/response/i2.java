package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.SectionTypedHeader;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class i2 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SectionTypedHeader.Lead.AppearanceType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
