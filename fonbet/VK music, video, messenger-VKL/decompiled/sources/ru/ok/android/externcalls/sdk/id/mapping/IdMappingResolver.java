package ru.ok.android.externcalls.sdk.id.mapping;

import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.utils.Consumer;

/* compiled from: IdMappingResolver.kt */
/* loaded from: classes9.dex */
public interface IdMappingResolver {
    void resolveExternalsByInternalsIds(List<CallParticipant.ParticipantId> list, Runnable runnable, Runnable runnable2);

    void withInternalId(ParticipantId participantId, Consumer<CallParticipant.ParticipantId> consumer, Runnable runnable);
}
