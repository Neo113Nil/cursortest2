package com.yandex.go.chargers.tariff_item_info.api.data.model;

import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDetailItemDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class f {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChargersTariffDetailItemDto.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
