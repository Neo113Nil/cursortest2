package com.yandex.go.zone.dto.response;

import com.yandex.go.zone.dto.response.SearchScreen;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class f {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SearchScreen.DisplaySettings.PreferredOrderDetailsType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
