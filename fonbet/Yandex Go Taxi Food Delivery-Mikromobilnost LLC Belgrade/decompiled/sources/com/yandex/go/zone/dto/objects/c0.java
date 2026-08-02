package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.ComboExtra;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class c0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ComboExtra.RouteDisplayType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
