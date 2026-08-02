package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.DeliveryExtra;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class u0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DeliveryExtra.DeliveryFlowType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
