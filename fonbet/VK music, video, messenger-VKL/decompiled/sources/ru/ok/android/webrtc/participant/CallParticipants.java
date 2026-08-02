package ru.ok.android.webrtc.participant;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.connection.BadNetworkIndicatorConfig;
import ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener;
import ru.ok.android.webrtc.listeners.CallParticipantsListener;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.listeners.proxy.CallListenersProxy;
import ru.ok.android.webrtc.media_options.internal.MutableMediaOptions;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.talking.TalkingParticipantsCollection;
import ru.ok.android.webrtc.participant.update.ParticipantAddOrUpdateParams;
import ru.ok.android.webrtc.sessionroom.CallSessionRooms;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.topology.direct.CalcNetworkStatusConfig;
import xsna.biy0;
import xsna.c5g;
import xsna.epx;
import xsna.j5g;

/* loaded from: classes9.dex */
public final class CallParticipants {
    public final CallParticipant a;
    public final CallListenersProxy b;
    public final CallSessionRooms c;
    public final RTCLog d;
    public final TalkingParticipantsCollection e = new TalkingParticipantsCollection();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final LongSparseArray h = new LongSparseArray();
    public CallParticipant.ParticipantId i;
    public SessionRoomId j;
    public SessionRoomId k;

    public CallParticipants(CallParticipant callParticipant, CallListenersProxy callListenersProxy, CallSessionRooms callSessionRooms, RTCLog rTCLog) {
        this.a = callParticipant;
        this.b = callListenersProxy;
        this.c = callSessionRooms;
        this.d = rTCLog;
        SessionRoomId.MainCall mainCall = SessionRoomId.MainCall.INSTANCE;
        this.j = mainCall;
        this.k = mainCall;
    }

    public static /* synthetic */ CallParticipant addOrUpdate$default(CallParticipants callParticipants, ParticipantAddOrUpdateParams participantAddOrUpdateParams, SessionRoomId sessionRoomId, int i, Object obj) {
        if ((i & 2) != 0) {
            sessionRoomId = null;
        }
        return callParticipants.addOrUpdate(participantAddOrUpdateParams, sessionRoomId);
    }

    public static /* synthetic */ List addOrUpdateBatch$default(CallParticipants callParticipants, List list, SessionRoomId sessionRoomId, int i, Object obj) {
        if ((i & 2) != 0) {
            sessionRoomId = null;
        }
        return callParticipants.addOrUpdateBatch(list, sessionRoomId);
    }

    public static /* synthetic */ List removeBatch$default(CallParticipants callParticipants, List list, SessionRoomId sessionRoomId, int i, Object obj) {
        if ((i & 2) != 0) {
            sessionRoomId = null;
        }
        return callParticipants.removeBatch(list, sessionRoomId);
    }

    public final SessionRoomId a(CallParticipant.ParticipantId participantId) {
        SessionRoomId sessionRoomId = (SessionRoomId) this.g.get(participantId);
        return sessionRoomId == null ? epx.f(participantId, this.a.getParticipantId()) ? this.k : SessionRoomId.MainCall.INSTANCE : sessionRoomId;
    }

    public final CallParticipant addOrUpdate(ParticipantAddOrUpdateParams participantAddOrUpdateParams) {
        return addOrUpdate$default(this, participantAddOrUpdateParams, null, 2, null);
    }

    public final List<CallParticipant> addOrUpdateBatch(List<ParticipantAddOrUpdateParams> list) {
        return addOrUpdateBatch$default(this, list, null, 2, null);
    }

    public final void clear() {
        ArrayList arrayList = new ArrayList(a(this.k).values());
        this.e.clear();
        this.i = null;
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.b.getActiveSessionRoomParticipantsListenerProxy().onActiveParticipantsRemoved(new CallActiveSessionRoomParticipantsListener.RemovedParams(arrayList, EmptyList.b, this.a));
        this.c.clear();
    }

    public final CallParticipant deAnon(CallParticipant.ParticipantId participantId, CallExternalId callExternalId) {
        if (getParticipant(participantId) == null) {
            return null;
        }
        SessionRoomId a = a(participantId);
        biy0 a2 = a(new ParticipantAddOrUpdateParams.Builder(participantId).setExternalIdIfNotNull(callExternalId).build(), a);
        List singletonList = Collections.singletonList(a2.a);
        if (epx.f(a, this.k)) {
            Map a3 = a(this.k);
            this.b.getActiveSessionRoomParticipantsListenerProxy().onActiveParticipantsDeAnonimized(new CallActiveSessionRoomParticipantsListener.DeAnonParams(singletonList, a3.values(), this.a));
        }
        this.b.getParticipantsListenerProxy().onCallParticipantsDeAnonimized(new CallParticipantsListener.DeAnonParams(a, singletonList));
        return a2.a;
    }

    public final List<CallParticipant.ParticipantId> getActiveParticipantsIds() {
        return new ArrayList(a(this.k).keySet());
    }

    public final SessionRoomId getActiveRoomId() {
        return this.k;
    }

    public final Set<CallParticipant.ParticipantId> getActiveSessionRoomParticipantIds() {
        return a(this.k).keySet();
    }

    public final Collection<CallParticipant> getActiveSessionRoomParticipants() {
        return a(this.k).values();
    }

    public final CallParticipant getCurrentUserParticipant() {
        return this.a;
    }

    public final CallParticipant getParticipant(CallParticipant.ParticipantId participantId) {
        if (this.a.isIdEquals(participantId)) {
            return this.a;
        }
        SessionRoomId sessionRoomId = (SessionRoomId) this.g.get(participantId);
        if (sessionRoomId != null) {
            return (CallParticipant) a(sessionRoomId).get(participantId);
        }
        return null;
    }

    public final Collection<CallParticipant> getParticipantsByUserId(CallParticipant.ParticipantId participantId) {
        CallParticipant callParticipant;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.a.isIdEquals(participantId)) {
            linkedHashSet.add(this.a);
            return linkedHashSet;
        }
        Set<CallParticipant.ParticipantId> set = (Set) this.h.get(participantId.id);
        if (set != null) {
            for (CallParticipant.ParticipantId participantId2 : set) {
                SessionRoomId sessionRoomId = (SessionRoomId) this.g.get(participantId2);
                if (sessionRoomId != null && (callParticipant = (CallParticipant) a(sessionRoomId).get(participantId2)) != null) {
                    linkedHashSet.add(callParticipant);
                }
            }
        }
        return linkedHashSet;
    }

    public final SessionRoomId getProposedRoomId() {
        return this.j;
    }

    public final Set<CallParticipant.ParticipantId> getSessionRoomParticipantIds(SessionRoomId sessionRoomId) {
        return a(sessionRoomId).keySet();
    }

    public final boolean has(CallParticipant callParticipant) {
        if (callParticipant == null) {
            return false;
        }
        CallParticipant.ParticipantId participantId = callParticipant.getParticipantId();
        return (participantId != null ? getParticipant(participantId) : null) != null;
    }

    public final boolean hasRegisteredPeers() {
        Iterator<CallParticipant> it = getActiveSessionRoomParticipants().iterator();
        while (it.hasNext()) {
            if (it.next().hasRegisteredPeers()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isEmpty() {
        return isEmpty(this.k);
    }

    public final void notifyCurrentParticipantChanged() {
        CallParticipant.ParticipantId participantId = this.a.getParticipantId();
        if (participantId == null) {
            return;
        }
        a(Collections.singletonList(this.a), a(participantId));
    }

    public final void registerPeer(CallParticipant.ParticipantId participantId, Peer peer, String str, String str2) {
        CallParticipant participant = getParticipant(participantId);
        if (participant == null || peer == null) {
            return;
        }
        boolean isEmpty = participant.d.isEmpty();
        participant.d.put(peer, new Pair(str, str2));
        if (CallParticipant.isPeerEquals(participant.i, peer)) {
            participant.k = str;
            participant.j = str2;
        }
        if (isEmpty && participant.i == null) {
            SessionRoomId sessionRoomId = (SessionRoomId) this.g.get(participantId);
            if (sessionRoomId == null) {
                sessionRoomId = this.k;
            }
            a(Collections.singletonList(participant), sessionRoomId);
        }
    }

    public final void release() {
        this.e.clear();
        this.i = null;
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.c.clear();
    }

    public final CallParticipant remove(CallParticipant.ParticipantId participantId) {
        return (CallParticipant) j5g.a0(removeBatch$default(this, Collections.singletonList(participantId), null, 2, null));
    }

    public final List<CallParticipant> removeBatch(List<CallParticipant.ParticipantId> list) {
        return removeBatch$default(this, list, null, 2, null);
    }

    public final void setActiveRoomId(SessionRoomId sessionRoomId) {
        SessionRoomId sessionRoomId2 = this.k;
        this.k = sessionRoomId;
        if (epx.f(sessionRoomId2, sessionRoomId)) {
            return;
        }
        this.b.getActiveSessionRoomParticipantsListenerProxy().onActiveParticipantUpdated(new CallActiveSessionRoomParticipantsListener.UpdatedParams(a(sessionRoomId2).values(), sessionRoomId2, a(sessionRoomId).values(), sessionRoomId, sessionRoomId instanceof SessionRoomId.Room ? this.c.getSessionRoom((SessionRoomId.Room) sessionRoomId) : null, this.a));
    }

    public final void setConnectivityForBatch(Map<CallParticipant, Boolean> map) {
        ArrayList arrayList = new ArrayList();
        for (CallParticipant callParticipant : map.keySet()) {
            boolean booleanValue = map.get(callParticipant).booleanValue();
            if (has(callParticipant) && callParticipant.isConnected() != booleanValue) {
                callParticipant.setConnected(booleanValue);
                arrayList.add(callParticipant);
            }
        }
        a(arrayList, this.k);
    }

    public final void setMeTalking(boolean z) {
        boolean isTalkingWithAudioCheck = this.a.isTalkingWithAudioCheck();
        CallParticipant callParticipant = this.a;
        callParticipant.m = z;
        if (isTalkingWithAudioCheck != callParticipant.isTalkingWithAudioCheck()) {
            notifyCurrentParticipantChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setNetworkStatus(Map<CallParticipant.ParticipantId, Float> map, BadNetworkIndicatorConfig badNetworkIndicatorConfig) {
        ArrayList arrayList = new ArrayList();
        for (CallParticipant.ParticipantId participantId : map.keySet()) {
            CallParticipant participant = getParticipant(participantId);
            Float f = map.get(participantId);
            if (participant != null && f != null) {
                float floatValue = f.floatValue();
                RTCLog rTCLog = this.d;
                CalcNetworkStatusConfig calcNetworkStatusConfig = badNetworkIndicatorConfig.getCalcNetworkStatusConfig();
                if (calcNetworkStatusConfig != null) {
                    NetworkStatus networkStatus = participant.h;
                    double redline = calcNetworkStatusConfig.getRedline();
                    float redlineMargin = (float) (calcNetworkStatusConfig.getRedlineMargin() + redline);
                    float redlineMargin2 = (float) (redline - calcNetworkStatusConfig.getRedlineMargin());
                    NetworkStatus networkStatus2 = NetworkStatus.GOOD;
                    if (networkStatus != networkStatus2 || floatValue >= redlineMargin2) {
                        if (networkStatus == NetworkStatus.BAD && floatValue >= redlineMargin) {
                            participant.h = networkStatus2;
                        }
                        if (badNetworkIndicatorConfig.getDebugLoggingConfig().getDebugLogging()) {
                            StringBuilder sb = new StringBuilder("last status: ");
                            sb.append(networkStatus.name());
                            sb.append("; current check: ");
                            sb.append(floatValue);
                            sb.append(" ");
                            if (networkStatus == networkStatus2) {
                                sb.append("< ");
                                sb.append(redlineMargin2);
                            } else if (networkStatus == NetworkStatus.BAD) {
                                sb.append(">= ");
                                sb.append(redlineMargin);
                            } else {
                                sb.append("ERROR: INVALID STATE");
                            }
                            if (r8) {
                                sb.append("; PASSES, now ");
                                sb.append(participant.h.name());
                            }
                            badNetworkIndicatorConfig.getDebugLoggingConfig().log(rTCLog, "CallParticipant", sb.toString());
                        }
                        participant.g = floatValue;
                    } else {
                        participant.h = NetworkStatus.BAD;
                    }
                    r8 = true;
                    if (badNetworkIndicatorConfig.getDebugLoggingConfig().getDebugLogging()) {
                    }
                    participant.g = floatValue;
                } else {
                    if (floatValue > 0.6f) {
                        participant.h = NetworkStatus.GOOD;
                    } else if (floatValue > 0.3f) {
                        participant.h = NetworkStatus.MEDIUM;
                    } else {
                        participant.h = NetworkStatus.BAD;
                    }
                    r8 = floatValue != participant.g;
                    participant.g = floatValue;
                }
                if (r8) {
                    arrayList.add(participant);
                }
            }
        }
        this.b.getNetworkStatusListenerProxy().onCallParticipantNetworkStatusChanged(arrayList);
    }

    public final void setPrimarySpeakerId(CallParticipant.ParticipantId participantId) {
        if (participantId == this.i) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        CallParticipant.ParticipantId participantId2 = this.i;
        CallParticipant participant = participantId2 != null ? getParticipant(participantId2) : null;
        if (participant != null) {
            boolean isPrimarySpeaker = participant.isPrimarySpeaker();
            participant.n = false;
            if (isPrimarySpeaker != participant.isPrimarySpeaker()) {
                arrayList.add(participant);
            }
        }
        CallParticipant participant2 = participantId != null ? getParticipant(participantId) : null;
        if (participant2 != null) {
            boolean isPrimarySpeaker2 = participant2.isPrimarySpeaker();
            participant2.n = true;
            if (isPrimarySpeaker2 != participant2.isPrimarySpeaker()) {
                arrayList.add(participant2);
            }
        }
        a(arrayList, this.k);
        this.i = participantId;
    }

    public final void setProposedRoomId(SessionRoomId sessionRoomId) {
        SessionRoomId sessionRoomId2 = this.j;
        this.j = sessionRoomId;
        if (epx.f(sessionRoomId2, sessionRoomId)) {
            return;
        }
        this.b.getSessionRoomsListenerProxy().onCurrentParticipantInvitedToRoom(new CallSessionRoomsListener.InvitedParams(this.a, sessionRoomId, sessionRoomId instanceof SessionRoomId.Room ? this.c.getSessionRoom((SessionRoomId.Room) sessionRoomId) : null));
    }

    public final void setTalkingParticipants(List<CallParticipant.ParticipantId> list) {
        a(this.e.setTalkingParticipants(list, a(this.k)).getChangedParticipants(), this.k);
    }

    public final int size() {
        return size(this.k);
    }

    public final CallParticipant addOrUpdate(ParticipantAddOrUpdateParams participantAddOrUpdateParams, SessionRoomId sessionRoomId) {
        return (CallParticipant) j5g.Y(addOrUpdateBatch(Collections.singletonList(participantAddOrUpdateParams), sessionRoomId));
    }

    public final List<CallParticipant> addOrUpdateBatch(List<ParticipantAddOrUpdateParams> list, SessionRoomId sessionRoomId) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (ParticipantAddOrUpdateParams participantAddOrUpdateParams : list) {
            SessionRoomId a = sessionRoomId == null ? a(participantAddOrUpdateParams.getParticipantId()) : sessionRoomId;
            biy0 a2 = a(participantAddOrUpdateParams, a);
            CallParticipant callParticipant = a2.a;
            SessionRoomId sessionRoomId2 = a2.c;
            CallParticipant callParticipant2 = a2.a;
            arrayList.add(callParticipant);
            if (a2.b) {
                Object obj = linkedHashMap.get(a);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(a, obj);
                }
                ((List) obj).add(callParticipant2);
            } else {
                Object obj2 = linkedHashMap2.get(a);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(a, obj2);
                }
                ((List) obj2).add(callParticipant2);
            }
            if (sessionRoomId2 != null && !sessionRoomId2.equals(a)) {
                Object obj3 = linkedHashMap3.get(sessionRoomId2);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap3.put(sessionRoomId2, obj3);
                }
                ((List) obj3).add(callParticipant2);
            }
        }
        for (SessionRoomId sessionRoomId3 : linkedHashMap3.keySet()) {
            List list2 = (List) linkedHashMap3.get(sessionRoomId3);
            if (list2 == null) {
                list2 = EmptyList.b;
            }
            if (epx.f(sessionRoomId3, this.k)) {
                this.b.getActiveSessionRoomParticipantsListenerProxy().onActiveParticipantsRemoved(new CallActiveSessionRoomParticipantsListener.RemovedParams(list2, a(this.k).values(), this.a));
            }
            this.b.getParticipantsListenerProxy().onCallParticipantsRemoved(new CallParticipantsListener.RemovedParams(sessionRoomId3, list2));
        }
        for (SessionRoomId sessionRoomId4 : linkedHashMap.keySet()) {
            List list3 = (List) linkedHashMap.get(sessionRoomId4);
            if (list3 == null) {
                list3 = EmptyList.b;
            }
            if (epx.f(sessionRoomId4, this.k)) {
                this.b.getActiveSessionRoomParticipantsListenerProxy().onActiveParticipantsAdded(new CallActiveSessionRoomParticipantsListener.AddedParams(list3, a(this.k).values(), this.a));
            }
            this.b.getParticipantsListenerProxy().onCallParticipantsAdded(new CallParticipantsListener.AddedParams(sessionRoomId4, list3));
        }
        for (SessionRoomId sessionRoomId5 : linkedHashMap2.keySet()) {
            List list4 = (List) linkedHashMap2.get(sessionRoomId5);
            if (list4 == null) {
                list4 = EmptyList.b;
            }
            a(list4, sessionRoomId5);
        }
        return arrayList;
    }

    public final boolean isEmpty(SessionRoomId sessionRoomId) {
        Map map = (Map) this.f.get(sessionRoomId);
        return map == null || map.isEmpty();
    }

    public final List<CallParticipant> removeBatch(List<CallParticipant.ParticipantId> list, SessionRoomId sessionRoomId) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CallParticipant.ParticipantId participantId : list) {
            SessionRoomId a = sessionRoomId == null ? a(participantId) : sessionRoomId;
            CallParticipant a2 = a(participantId, a);
            if (a2 != null) {
                Object obj = linkedHashMap.get(a);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(a, obj);
                }
                ((List) obj).add(a2);
            }
        }
        for (SessionRoomId sessionRoomId2 : linkedHashMap.keySet()) {
            List list2 = (List) linkedHashMap.get(sessionRoomId2);
            if (list2 == null) {
                list2 = EmptyList.b;
            }
            if (epx.f(sessionRoomId2, this.k)) {
                this.b.getActiveSessionRoomParticipantsListenerProxy().onActiveParticipantsRemoved(new CallActiveSessionRoomParticipantsListener.RemovedParams(list2, a(this.k).values(), this.a));
            }
            this.b.getParticipantsListenerProxy().onCallParticipantsRemoved(new CallParticipantsListener.RemovedParams(sessionRoomId2, list2));
        }
        return c5g.v(linkedHashMap.values());
    }

    public final int size(SessionRoomId sessionRoomId) {
        Map map = (Map) this.f.get(sessionRoomId);
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    public final biy0 a(ParticipantAddOrUpdateParams participantAddOrUpdateParams, SessionRoomId sessionRoomId) {
        boolean z;
        SessionRoomId sessionRoomId2;
        CallParticipant participant = getParticipant(participantAddOrUpdateParams.getParticipantId());
        if (participant == null) {
            participant = new CallParticipant(participantAddOrUpdateParams.getParticipantId(), participantAddOrUpdateParams.getAcceptedCallPeerUpdate().getValueOrNull(), participantAddOrUpdateParams.getMediaOptionsUpdate().getValueOrNull(), participantAddOrUpdateParams.getMediaSettingsUpdate().getValueOrNull());
            a(participant, sessionRoomId);
            sessionRoomId2 = null;
            z = true;
        } else {
            if (participantAddOrUpdateParams.getAcceptedCallPeerUpdate().hasUpdate()) {
                participant.setCallAccepted(participantAddOrUpdateParams.getAcceptedCallPeerUpdate().requireValue());
            }
            if (participantAddOrUpdateParams.getMediaOptionsUpdate().hasUpdate()) {
                MutableMediaOptions requireValue = participantAddOrUpdateParams.getMediaOptionsUpdate().requireValue();
                participant.mediaOptions.setAudioState(requireValue.getAudioState());
                participant.mediaOptions.setVideoState(requireValue.getVideoState());
                participant.mediaOptions.setScreenshareState(requireValue.getScreenshareState());
                participant.mediaOptions.setMovieSharingState(requireValue.getMovieSharingState());
            }
            if (participantAddOrUpdateParams.getMediaSettingsUpdate().hasUpdate()) {
                participant.mediaSettings.updateBy(participantAddOrUpdateParams.getMediaSettingsUpdate().requireValue());
            }
            SessionRoomId sessionRoomId3 = (SessionRoomId) this.g.get(participantAddOrUpdateParams.getParticipantId());
            if (sessionRoomId3 == null) {
                sessionRoomId3 = this.k;
            }
            z = !epx.f(sessionRoomId3, sessionRoomId);
            if (!epx.f(sessionRoomId3, sessionRoomId)) {
                a(participantAddOrUpdateParams.getParticipantId(), sessionRoomId3);
                a(participant, sessionRoomId);
            }
            sessionRoomId2 = sessionRoomId3;
        }
        if (participantAddOrUpdateParams.getParticipantId() == this.i) {
            participant.n = true;
        }
        if (participantAddOrUpdateParams.getRolesUpdate().hasUpdate()) {
            participant.setRoles(participantAddOrUpdateParams.getRolesUpdate().requireValue());
        }
        if (participantAddOrUpdateParams.getExternalIdUpdate().hasUpdate()) {
            participant.setExternalId(participantAddOrUpdateParams.getExternalIdUpdate().requireValue());
        }
        if (participantAddOrUpdateParams.getMoviesUpdate().hasUpdate()) {
            participant.setMovies(participantAddOrUpdateParams.getMoviesUpdate().requireValue());
        }
        if (participantAddOrUpdateParams.getCapabilitiesUpdate().hasUpdate()) {
            participant.setCapabilities(participantAddOrUpdateParams.getCapabilitiesUpdate().requireValue().intValue());
        }
        if (participantAddOrUpdateParams.getSessionStateUpdate().hasUpdate()) {
            participant.setSessionState(participantAddOrUpdateParams.getSessionStateUpdate().requireValue());
        }
        return new biy0(participant, z, sessionRoomId2);
    }

    public final void a(CallParticipant callParticipant, SessionRoomId sessionRoomId) {
        CallParticipant.ParticipantId participantId = callParticipant.getParticipantId();
        if (participantId == null) {
            return;
        }
        HashMap hashMap = this.f;
        Object obj = hashMap.get(sessionRoomId);
        if (obj == null) {
            obj = new LinkedHashMap();
            hashMap.put(sessionRoomId, obj);
        }
        ((Map) obj).put(participantId, callParticipant);
        this.g.put(participantId, sessionRoomId);
        this.d.log("CallParticipants", "Participant added { participantId=\"" + participantId + "\", roomId=\"" + sessionRoomId + "\" }");
        long j = participantId.id;
        Set set = (Set) this.h.get(j);
        if (set == null) {
            set = new LinkedHashSet();
            this.h.put(j, set);
        }
        set.add(participantId);
    }

    public final CallParticipant a(CallParticipant.ParticipantId participantId, SessionRoomId sessionRoomId) {
        SessionRoomId sessionRoomId2 = (SessionRoomId) this.g.get(participantId);
        if (sessionRoomId2 == null) {
            return null;
        }
        if (sessionRoomId2.equals(sessionRoomId)) {
            long j = participantId.id;
            Set set = (Set) this.h.get(j);
            if (set != null) {
                set.remove(participantId);
                if (set.isEmpty()) {
                    this.h.remove(j);
                }
            }
            this.g.remove(participantId);
            HashMap hashMap = this.f;
            Object obj = hashMap.get(sessionRoomId);
            if (obj == null) {
                obj = new LinkedHashMap();
                hashMap.put(sessionRoomId, obj);
            }
            return (CallParticipant) ((Map) obj).remove(participantId);
        }
        this.d.log("CallParticipants", "Tried to remove " + participantId + " from " + sessionRoomId + " but participant is in " + sessionRoomId2);
        return null;
    }

    public final Map a(SessionRoomId sessionRoomId) {
        HashMap hashMap = this.f;
        Object obj = hashMap.get(sessionRoomId);
        if (obj == null) {
            obj = new LinkedHashMap();
            hashMap.put(sessionRoomId, obj);
        }
        return (Map) obj;
    }

    public final void a(List list, SessionRoomId sessionRoomId) {
        if (epx.f(sessionRoomId, this.k)) {
            Map a = a(this.k);
            this.b.getActiveSessionRoomParticipantsListenerProxy().onActiveParticipantsChanged(new CallActiveSessionRoomParticipantsListener.ChangedParams(list, a.values(), this.a));
        }
        this.b.getParticipantsListenerProxy().onCallParticipantsChanged(new CallParticipantsListener.ChangedParams(sessionRoomId, list));
    }
}
