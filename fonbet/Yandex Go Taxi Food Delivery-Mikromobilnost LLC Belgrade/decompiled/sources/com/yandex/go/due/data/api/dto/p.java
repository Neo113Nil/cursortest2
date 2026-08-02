package com.yandex.go.due.data.api.dto;

import com.yandex.go.due.data.api.dto.ScheduledOrderButton;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class p {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScheduledOrderButton.ButtonStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
