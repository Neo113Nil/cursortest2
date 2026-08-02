package com.yandex.go.payments.data.model;

import com.yandex.go.payments.data.model.TransportCardDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class p0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TransportCardDto.CardStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
