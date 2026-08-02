package ru.ok.android.externcalls.sdk.participant.collection;

import java.util.Collection;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.gcy;
import xsna.ozl;

/* compiled from: ParticipantCollection.kt */
/* loaded from: classes9.dex */
public interface ParticipantCollection extends Collection<ConversationParticipant>, gcy {
    @Override // java.util.Collection
    /* bridge */ default boolean contains(Object obj) {
        if (obj instanceof ConversationParticipant) {
            return contains((ConversationParticipant) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    default boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(((ConversationParticipant) it.next()).getExternalId())) {
                return false;
            }
        }
        return true;
    }

    default ConversationParticipant get(ParticipantId participantId) {
        return getParticipantById(participantId);
    }

    @ozl
    default ConversationParticipant getByExternal(ParticipantId participantId) {
        return getParticipantById(participantId);
    }

    @ozl
    ConversationParticipant getByInternal(CallParticipant.ParticipantId participantId);

    ConversationParticipant getMe();

    ConversationParticipant getParticipantById(ParticipantId participantId);

    Collection<ConversationParticipant> getParticipants();

    int getSize();

    boolean hasOtherParticipants();

    @Override // java.util.Collection
    @ozl
    boolean isEmpty();

    default boolean contains(ParticipantId participantId) {
        return getParticipantById(participantId) != null;
    }

    default boolean contains(ConversationParticipant conversationParticipant) {
        return contains(conversationParticipant.getExternalId());
    }

    @ozl
    static /* synthetic */ void getParticipants$annotations() {
    }
}
