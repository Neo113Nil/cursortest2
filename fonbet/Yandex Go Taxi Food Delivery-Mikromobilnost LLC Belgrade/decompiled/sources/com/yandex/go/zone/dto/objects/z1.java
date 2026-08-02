package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.DeliveryZoneTariffExtra;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class z1 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DeliveryZoneTariffExtra.DeliveryFlowType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
