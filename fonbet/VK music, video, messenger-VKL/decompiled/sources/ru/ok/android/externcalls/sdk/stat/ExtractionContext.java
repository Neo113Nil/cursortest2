package ru.ok.android.externcalls.sdk.stat;

import kotlin.NotImplementedError;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* compiled from: StatDefinitions.kt */
/* loaded from: classes9.dex */
public interface ExtractionContext extends ExtractionContextState {
    default ParticipantId participantId() {
        throw new NotImplementedError("participantId not implemented by context");
    }
}
