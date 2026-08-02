package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class a4 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ServiceLevel.Branding.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
