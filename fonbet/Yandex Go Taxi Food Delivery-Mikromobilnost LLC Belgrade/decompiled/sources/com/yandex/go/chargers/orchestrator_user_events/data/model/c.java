package com.yandex.go.chargers.orchestrator_user_events.data.model;

import com.yandex.go.chargers.orchestrator_user_events.data.model.OrchestratorUserEventDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OrchestratorUserEventDto.EventType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
