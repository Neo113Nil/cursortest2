package com.yandex.go.chargers.data.model;

import com.yandex.go.chargers.data.model.ChargersOfferButtonDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class q {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChargersOfferButtonDto.Action.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
