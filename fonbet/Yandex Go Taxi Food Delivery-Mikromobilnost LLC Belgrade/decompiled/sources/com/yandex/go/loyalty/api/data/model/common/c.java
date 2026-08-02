package com.yandex.go.loyalty.api.data.model.common;

import com.yandex.go.loyalty.api.data.model.common.ColorSettings;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ColorSettings.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
