package com.yandex.go.chargers.feedback.data;

import com.yandex.go.chargers.feedback.data.ChargersFinishedOrderDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class t {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChargersFinishedOrderDto.FinishingStage.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
