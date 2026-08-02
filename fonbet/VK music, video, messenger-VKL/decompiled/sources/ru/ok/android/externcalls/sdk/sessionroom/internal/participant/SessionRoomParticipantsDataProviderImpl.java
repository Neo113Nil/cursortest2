package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoom;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.utils.Consumer;
import xsna.a2d;
import xsna.ax5;
import xsna.c5g;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.k50;
import xsna.s3q0;
import xsna.ttp0;
import xsna.u52;
import xsna.x52;

/* compiled from: SessionRoomParticipantsDataProviderImpl.kt */
/* loaded from: classes9.dex */
public final class SessionRoomParticipantsDataProviderImpl implements SessionRoomParticipantsDataProvider {
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final Map<SessionRoomId.Room, SessionRoom> knownSessionRooms = new LinkedHashMap();
    private final SessionRoomParticipantsDataProviderImpl$roomsListener$1 roomsListener;
    private final ParticipantStore store;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager$OwnRoomsListener, ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl$roomsListener$1] */
    public SessionRoomParticipantsDataProviderImpl(ParticipantStore participantStore, SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper) {
        this.store = participantStore;
        this.idMappingResolver = idMappingResolver;
        this.idMappingWrapper = idMappingWrapper;
        ?? r1 = new SessionRoomsManager.OwnRoomsListener() { // from class: ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl$roomsListener$1
            @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
            public void onRoomRemoved(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
                Map map;
                map = SessionRoomParticipantsDataProviderImpl.this.knownSessionRooms;
                ttp0.c(map).remove(sessionRoomInfo.getRoomId());
            }

            @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
            public void onRoomUpdated(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
                Map map;
                SessionRoom room = sessionRoomInfo.getRoom();
                if (room == null) {
                    return;
                }
                map = SessionRoomParticipantsDataProviderImpl.this.knownSessionRooms;
                map.put(room.getId(), room);
            }

            @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
            public void onActiveRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
            }

            @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
            public void onProposedRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
            }
        };
        this.roomsListener = r1;
        sessionRoomListenerManagerImpl.addListener(r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 getAllInRoomParticipants$lambda$0(Set set, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl, izs izsVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            SessionRoomId.Room room = (SessionRoomId.Room) it.next();
            arrayList.add(new SessionRoomParticipants(room, sessionRoomParticipantsDataProviderImpl.mapInternalIdsToSessionRoomParticipants(room, sessionRoomParticipantsDataProviderImpl.getRoomParticipantIds(room))));
        }
        izsVar.invoke(arrayList);
        return s3q0.a;
    }

    private final Collection<CallParticipant.ParticipantId> getAllRoomParticipantIds() {
        Collection<SessionRoom> values = this.knownSessionRooms.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            List<CallParticipant.ParticipantId> participantIds = ((SessionRoom) it.next()).getParticipantIds();
            if (participantIds != null) {
                arrayList.add(participantIds);
            }
        }
        return c5g.v(arrayList);
    }

    private final void getMainCallParticipantIds(izs<? super SessionRoomParticipants, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        Set S0 = j5g.S0(getAllRoomParticipantIds());
        Collection<ConversationParticipant> participants = this.store.getParticipants(SessionRoomId.MainCall.INSTANCE);
        ArrayList arrayList = new ArrayList();
        for (Object obj : participants) {
            ConversationParticipant conversationParticipant = (ConversationParticipant) obj;
            if (!conversationParticipant.isAdmin() && !conversationParticipant.isCreator() && !S0.contains(conversationParticipant.getInternalId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(mapConversationParticipantToSessionRoomParticipant((ConversationParticipant) it.next()));
        }
        izsVar.invoke(new SessionRoomParticipants(SessionRoomId.MainCall.INSTANCE, arrayList2));
    }

    private final Set<SessionRoomId.Room> getRoomIds() {
        return j5g.S0(this.knownSessionRooms.keySet());
    }

    private final Collection<CallParticipant.ParticipantId> getRoomParticipantIds(SessionRoomId.Room room) {
        List<CallParticipant.ParticipantId> participantIds;
        List O0;
        SessionRoom sessionRoom = this.knownSessionRooms.get(room);
        return (sessionRoom == null || (participantIds = sessionRoom.getParticipantIds()) == null || (O0 = j5g.O0(participantIds)) == null) ? EmptyList.b : O0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 getRoomParticipants$lambda$0(izs izsVar, SessionRoomId sessionRoomId, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl, Collection collection) {
        izsVar.invoke(new SessionRoomParticipants(sessionRoomId, sessionRoomParticipantsDataProviderImpl.mapInternalIdsToSessionRoomParticipants(sessionRoomId, collection)));
        return s3q0.a;
    }

    private final List<CallParticipant.ParticipantId> getUnresolvedExternalIds(Collection<CallParticipant.ParticipantId> collection) {
        ArrayList arrayList = new ArrayList();
        for (CallParticipant.ParticipantId participantId : collection) {
            if (this.idMappingWrapper.getByInternal(participantId) == null) {
                arrayList.add(participantId);
            }
        }
        return arrayList;
    }

    private final SessionRoomParticipants.Participant mapConversationParticipantToSessionRoomParticipant(ConversationParticipant conversationParticipant) {
        return new SessionRoomParticipants.Participant(conversationParticipant.getExternalId(), this.store.getParticipantRoomId(conversationParticipant), conversationParticipant);
    }

    private final SessionRoomParticipants.Participant mapInternalIdToSessionRoomParticipant(CallParticipant.ParticipantId participantId) {
        ConversationParticipant byInternal = this.store.getByInternal(participantId);
        if (byInternal != null) {
            return mapConversationParticipantToSessionRoomParticipant(byInternal);
        }
        ParticipantId byInternal2 = this.idMappingWrapper.getByInternal(participantId);
        if (byInternal2 != null) {
            return new SessionRoomParticipants.Participant(byInternal2, null, null);
        }
        return null;
    }

    private final Collection<SessionRoomParticipants.Participant> mapInternalIdsToSessionRoomParticipants(SessionRoomId sessionRoomId, Collection<CallParticipant.ParticipantId> collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            SessionRoomParticipants.Participant mapInternalIdToSessionRoomParticipant = mapInternalIdToSessionRoomParticipant((CallParticipant.ParticipantId) it.next());
            if (mapInternalIdToSessionRoomParticipant != null) {
                linkedHashMap.put(mapInternalIdToSessionRoomParticipant.getId(), mapInternalIdToSessionRoomParticipant);
            }
        }
        for (ConversationParticipant conversationParticipant : this.store.getParticipants(sessionRoomId)) {
            if (!linkedHashMap.containsKey(conversationParticipant.getExternalId()) && (conversationParticipant.isAdmin() || conversationParticipant.isCreator())) {
                linkedHashMap.put(conversationParticipant.getExternalId(), mapConversationParticipantToSessionRoomParticipant(conversationParticipant));
            }
        }
        return linkedHashMap.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveInternalIdByExternal$lambda$0(izs izsVar, izs izsVar2, ParticipantId participantId, CallParticipant.ParticipantId participantId2) {
        if (participantId2 != null) {
            izsVar.invoke(participantId2);
        } else if (izsVar2 != null) {
            izsVar2.invoke(new RuntimeException("Requested external id " + participantId + " resolved to null"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveInternalIdByExternal$lambda$1(izs izsVar, ParticipantId participantId) {
        if (izsVar != null) {
            izsVar.invoke(new RuntimeException("Requested external id " + participantId + " could not be resolved to internal"));
        }
    }

    private final void resolveParticipantIds(Collection<CallParticipant.ParticipantId> collection, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        if (collection.isEmpty()) {
            gzsVar.invoke();
            return;
        }
        List<CallParticipant.ParticipantId> unresolvedExternalIds = getUnresolvedExternalIds(collection);
        if (unresolvedExternalIds.isEmpty()) {
            gzsVar.invoke();
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(unresolvedExternalIds, new u52(1, gzsVar), new x52(izsVar, 9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveParticipantIds$lambda$1(izs izsVar) {
        if (izsVar != null) {
            izsVar.invoke(new RuntimeException("Can't resolve external ids"));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getAllInRoomParticipants(izs<? super List<SessionRoomParticipants>, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        Set<SessionRoomId.Room> roomIds = getRoomIds();
        if (roomIds.isEmpty()) {
            izsVar.invoke(EmptyList.b);
        } else {
            resolveParticipantIds(getAllRoomParticipantIds(), new ax5(roomIds, this, izsVar, 6), izsVar2);
        }
    }

    public final Map<ParticipantId, CallParticipant.ParticipantId> getInternalIdsByExternal(Collection<ParticipantId> collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ParticipantId participantId : collection) {
            CallParticipant.ParticipantId byExternal = this.idMappingWrapper.getByExternal(participantId);
            if (byExternal == null) {
                throw new RuntimeException("Unresolved external participant id " + participantId);
            }
            linkedHashMap.put(participantId, byExternal);
        }
        return linkedHashMap;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getParticipantRoomId(ParticipantId participantId, izs<? super SessionRoomId, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        if (byExternal == null) {
            if (izsVar2 != null) {
                izsVar2.invoke(new RuntimeException("Participant " + participantId + " not found"));
                return;
            }
            return;
        }
        SessionRoomId participantRoomId = this.store.getParticipantRoomId(byExternal);
        if (participantRoomId != null) {
            izsVar.invoke(participantRoomId);
        } else if (izsVar2 != null) {
            izsVar2.invoke(new RuntimeException("Can't find room data for participant " + participantId));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getRoomParticipants(SessionRoomId sessionRoomId, izs<? super SessionRoomParticipants, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        if (sessionRoomId instanceof SessionRoomId.MainCall) {
            getMainCallParticipantIds(izsVar, izsVar2);
        } else {
            if (!(sessionRoomId instanceof SessionRoomId.Room)) {
                throw new NoWhenBranchMatchedException();
            }
            Collection<CallParticipant.ParticipantId> roomParticipantIds = getRoomParticipantIds((SessionRoomId.Room) sessionRoomId);
            resolveParticipantIds(roomParticipantIds, new a2d(izsVar, sessionRoomId, this, roomParticipantIds, 2), izsVar2);
        }
    }

    public final void resolveInternalIdByExternal(final ParticipantId participantId, final izs<? super CallParticipant.ParticipantId, s3q0> izsVar, final izs<? super Throwable, s3q0> izsVar2) {
        this.idMappingResolver.withInternalId(participantId, new Consumer() { // from class: xsna.ovi0
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                SessionRoomParticipantsDataProviderImpl.resolveInternalIdByExternal$lambda$0(izsVar, izsVar2, participantId, (CallParticipant.ParticipantId) obj);
            }
        }, new k50(7, izsVar2, participantId));
    }
}
