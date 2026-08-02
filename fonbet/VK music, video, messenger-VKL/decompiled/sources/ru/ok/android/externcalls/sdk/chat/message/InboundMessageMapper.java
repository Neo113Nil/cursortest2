package ru.ok.android.externcalls.sdk.chat.message;

import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

/* compiled from: InboundMessageMapper.kt */
/* loaded from: classes9.dex */
public final class InboundMessageMapper {
    public static final InboundMessageMapper INSTANCE = new InboundMessageMapper();

    private InboundMessageMapper() {
    }

    public final InboundMessage fromInternal(ru.ok.android.webrtc.chat.message.InboundMessage inboundMessage, ParticipantStore participantStore) {
        ConversationParticipant byInternal = participantStore.getByInternal(inboundMessage.getSenderId());
        return new InboundMessage(byInternal != null ? byInternal.getExternalId() : null, inboundMessage.getText(), inboundMessage.isDirect());
    }
}
