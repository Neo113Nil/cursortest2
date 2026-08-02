package com.yandex.go.zone.dto.response;

import com.yandex.go.zone.dto.response.ZoneAcceptance$Default;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class n {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ZoneAcceptance$Default.IconStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
