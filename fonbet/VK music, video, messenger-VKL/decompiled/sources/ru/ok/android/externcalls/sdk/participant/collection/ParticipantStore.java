package ru.ok.android.externcalls.sdk.participant.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoom;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.epx;
import xsna.z4g;

/* compiled from: ParticipantStore.kt */
/* loaded from: classes9.dex */
public final class ParticipantStore implements ParticipantCollection {
    private SessionRoom activeRoom;
    private final LocalIdMappings localIdMappings;

    /* renamed from: me, reason: collision with root package name */
    private final ConversationParticipant f109me;
    private SessionRoom proposedRoom;
    private SessionRoomId proposedRoomId;
    private final HashMap<SessionRoomId, LinkedHashMap<LocalParticipantId, ConversationParticipant>> roomToIdToParticipantMap = new HashMap<>();
    private final HashMap<LocalParticipantId, SessionRoomId> localIdToSessionRoomMap = new HashMap<>();
    private SessionRoomId activeRoomId = SessionRoomId.MainCall.INSTANCE;

    public ParticipantStore(ConversationParticipant conversationParticipant, LocalIdMappings localIdMappings) {
        this.localIdMappings = localIdMappings;
        this.f109me = conversationParticipant;
        updateMe(conversationParticipant);
    }

    private final ConversationParticipant getByLocal(LocalParticipantId localParticipantId) {
        LinkedHashMap<LocalParticipantId, ConversationParticipant> linkedHashMap;
        SessionRoomId sessionRoomId = this.localIdToSessionRoomMap.get(localParticipantId);
        if (sessionRoomId == null || (linkedHashMap = this.roomToIdToParticipantMap.get(sessionRoomId)) == null) {
            return null;
        }
        return linkedHashMap.get(localParticipantId);
    }

    private final LinkedHashMap<LocalParticipantId, ConversationParticipant> getSessionRoomParticipantsMap(SessionRoomId sessionRoomId) {
        HashMap<SessionRoomId, LinkedHashMap<LocalParticipantId, ConversationParticipant>> hashMap = this.roomToIdToParticipantMap;
        LinkedHashMap<LocalParticipantId, ConversationParticipant> linkedHashMap = hashMap.get(sessionRoomId);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            hashMap.put(sessionRoomId, linkedHashMap);
        }
        return linkedHashMap;
    }

    private final void onActiveRoomChanged(SessionRoomId sessionRoomId, SessionRoomId sessionRoomId2) {
        ConversationParticipant me2;
        if (epx.f(sessionRoomId, sessionRoomId2) || (me2 = getMe()) == null) {
            return;
        }
        removeByLocalId(ConversationParticipantExtensionsKt.getLocalParticipantIdExt(me2));
        add(me2, sessionRoomId2);
    }

    private final void removeByLocalId(LocalParticipantId localParticipantId) {
        ConversationParticipant byLocal = getByLocal(localParticipantId);
        if (byLocal != null) {
            this.localIdMappings.removedMappings(byLocal);
        }
        SessionRoomId sessionRoomId = this.localIdToSessionRoomMap.get(localParticipantId);
        if (sessionRoomId == null) {
            return;
        }
        LinkedHashMap<LocalParticipantId, ConversationParticipant> linkedHashMap = this.roomToIdToParticipantMap.get(sessionRoomId);
        if (linkedHashMap != null) {
            linkedHashMap.remove(localParticipantId);
        }
        this.localIdToSessionRoomMap.remove(localParticipantId);
    }

    private final void setActiveRoomId(SessionRoomId sessionRoomId) {
        if (epx.f(this.activeRoomId, sessionRoomId)) {
            return;
        }
        SessionRoomId sessionRoomId2 = this.activeRoomId;
        this.activeRoomId = sessionRoomId;
        onActiveRoomChanged(sessionRoomId2, sessionRoomId);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(ConversationParticipant conversationParticipant) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ConversationParticipant> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addToActiveSessionRoom(ConversationParticipant conversationParticipant) {
        add(conversationParticipant, this.activeRoomId);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clearMapping() {
        this.localIdMappings.clearMapping();
    }

    public final boolean containsByInternal(CallParticipant.ParticipantId participantId) {
        return getByInternal(participantId) != null;
    }

    public final SessionRoom getActiveRoom() {
        return this.activeRoom;
    }

    public final SessionRoomId getActiveRoomId() {
        return this.activeRoomId;
    }

    public final ConversationParticipant getByExternalWithAnyDevice(ParticipantId participantId) {
        LocalParticipantId anyLocalId = this.localIdMappings.getAnyLocalId(participantId);
        if (anyLocalId == null) {
            return null;
        }
        return getByLocal(anyLocalId);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public ConversationParticipant getByInternal(CallParticipant.ParticipantId participantId) {
        LocalParticipantId localId = this.localIdMappings.getLocalId(participantId);
        if (localId == null) {
            return null;
        }
        return getByLocal(localId);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public ConversationParticipant getMe() {
        return this.f109me;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public ConversationParticipant getParticipantById(ParticipantId participantId) {
        LocalParticipantId localId = this.localIdMappings.getLocalId(participantId);
        if (localId == null) {
            return null;
        }
        return getByLocal(localId);
    }

    public final SessionRoomId getParticipantRoomId(ConversationParticipant conversationParticipant) {
        return this.localIdToSessionRoomMap.get(ConversationParticipantExtensionsKt.getLocalParticipantIdExt(conversationParticipant));
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public Collection<ConversationParticipant> getParticipants() {
        return getParticipants(this.activeRoomId);
    }

    public final SessionRoom getProposedRoom() {
        return this.proposedRoom;
    }

    public final SessionRoomId getProposedRoomId() {
        return this.proposedRoomId;
    }

    public final Map<SessionRoomId, Map<LocalParticipantId, ConversationParticipant>> getRoomToParticipantsMap() {
        return this.roomToIdToParticipantMap;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public int getSize() {
        return getParticipants().size();
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public boolean hasOtherParticipants() {
        return size() > 1;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection, java.util.Collection
    public boolean isEmpty() {
        return getParticipants().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<ConversationParticipant> iterator() {
        return getParticipants().iterator();
    }

    public final void maybeUpdateRoom(SessionRoom sessionRoom) {
        if (epx.f(this.activeRoomId, sessionRoom.getId())) {
            this.activeRoom = sessionRoom;
        }
        if (epx.f(this.proposedRoomId, sessionRoom.getId())) {
            this.proposedRoom = sessionRoom;
        }
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void removeByExternal(ParticipantId participantId) {
        LocalParticipantId localId = this.localIdMappings.getLocalId(participantId);
        if (localId == null) {
            return;
        }
        removeByLocalId(localId);
    }

    public final void removeByInternal(CallParticipant.ParticipantId participantId) {
        LocalParticipantId localId = this.localIdMappings.getLocalId(participantId);
        if (localId == null) {
            return;
        }
        removeByLocalId(localId);
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super ConversationParticipant> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setActiveSessionRoom(SessionRoomId sessionRoomId, SessionRoom sessionRoom) {
        setActiveRoomId(sessionRoomId);
        this.activeRoom = sessionRoom;
    }

    public final void setProposedSessionRoom(SessionRoomId sessionRoomId, SessionRoom sessionRoom) {
        this.proposedRoomId = sessionRoomId;
        this.proposedRoom = sessionRoom;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return z4g.h(this);
    }

    public final void updateMe(ConversationParticipant conversationParticipant) {
        add(conversationParticipant, this.activeRoomId);
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public boolean add2(ConversationParticipant conversationParticipant) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Collection<ConversationParticipant> getParticipants(SessionRoomId sessionRoomId) {
        return getSessionRoomParticipantsMap(sessionRoomId).values();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) z4g.i(this, tArr);
    }

    public final void add(ConversationParticipant conversationParticipant, SessionRoomId sessionRoomId) {
        this.localIdMappings.addMappings(conversationParticipant);
        getSessionRoomParticipantsMap(sessionRoomId).put(ConversationParticipantExtensionsKt.getLocalParticipantIdExt(conversationParticipant), conversationParticipant);
        this.localIdToSessionRoomMap.put(ConversationParticipantExtensionsKt.getLocalParticipantIdExt(conversationParticipant), sessionRoomId);
    }

    public final void removeByInternal(Collection<CallParticipant.ParticipantId> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            removeByInternal((CallParticipant.ParticipantId) it.next());
        }
    }
}
