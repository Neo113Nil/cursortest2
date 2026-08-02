package com.yandex.go.due.data.api.dto;

import com.yandex.go.due.data.api.dto.ScheduledOrderButton;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class q {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScheduledOrderButton.ButtonType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
