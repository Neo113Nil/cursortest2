package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.webrtc.participant.CallParticipant;

/* compiled from: ConversationParticipantExtensions.kt */
/* loaded from: classes9.dex */
public final class ConversationParticipantExtensionsKt {
    public static final ConversationParticipant createConversationParticipantFromInternal(CallParticipant.ParticipantId participantId, IdMappingWrapper idMappingWrapper) {
        return ConversationParticipant.fromInternal(participantId, idMappingWrapper);
    }

    public static final void deAnonymizeExt(ConversationParticipant conversationParticipant, CallParticipant callParticipant, ParticipantId participantId, ParticipantId participantId2, LocalIdMappings localIdMappings) {
        conversationParticipant.deAnonymize(callParticipant, participantId, participantId2, localIdMappings);
    }

    public static final CallParticipant.ParticipantId getInternalIdExt(ConversationParticipant conversationParticipant) {
        return conversationParticipant.getInternalId();
    }

    public static final LocalParticipantId getLocalParticipantIdExt(ConversationParticipant conversationParticipant) {
        return conversationParticipant.getLocalParticipantId();
    }

    public static final boolean isReportedExt(ConversationParticipant conversationParticipant) {
        return conversationParticipant.isReported();
    }

    public static final ConversationParticipant newConversationParticipant(ParticipantId participantId, IdMappingWrapper idMappingWrapper) {
        return ConversationParticipant.fromExternal(participantId, idMappingWrapper);
    }

    public static final void setCallParticipantExt(ConversationParticipant conversationParticipant, CallParticipant callParticipant, LocalIdMappings localIdMappings) {
        conversationParticipant.setCallParticipant(callParticipant, localIdMappings);
    }

    public static final void setReportedExt(ConversationParticipant conversationParticipant, boolean z) {
        conversationParticipant.setReported(z);
    }

    public static /* synthetic */ void setReportedExt$default(ConversationParticipant conversationParticipant, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        setReportedExt(conversationParticipant, z);
    }
}
