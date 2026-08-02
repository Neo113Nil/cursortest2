package ru.ok.android.webrtc.signaling.sessionroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.asr.AsrParser;
import ru.ok.android.webrtc.signaling.asr.CallAsrInfo;
import ru.ok.android.webrtc.signaling.participant.ParticipantListChunkParser;
import ru.ok.android.webrtc.signaling.participant.ParticipantsParser;
import ru.ok.android.webrtc.signaling.participant.model.SignalingParticipantListChunk;
import ru.ok.android.webrtc.signaling.record.RecordInfoParser;
import ru.ok.android.webrtc.signaling.record.event.SignalingRecordInfo;
import ru.ok.android.webrtc.signaling.sessionroom.event.SessionRoomUpdatedEvent;
import ru.ok.android.webrtc.signaling.sessionroom.event.SessionRoomsEventType;
import ru.ok.android.webrtc.signaling.sessionroom.event.SessionRoomsUpdatedEvent;
import ru.ok.android.webrtc.signaling.sessionroom.event.SignalingSessionRoom;
import ru.ok.android.webrtc.signaling.urlsharing.SignalingUrlSharingInfo;
import ru.ok.android.webrtc.signaling.urlsharing.UrlSharingParser;
import ru.ok.android.webrtc.signaling.util.JSONExtensionsKt;
import xsna.jgp;

/* loaded from: classes9.dex */
public final class SessionRoomUpdateParser {
    public final RTCLog a;
    public final ParticipantsParser b;
    public final ParticipantListChunkParser c;
    public final RecordInfoParser d;
    public final AsrParser e;
    public final UrlSharingParser f;

    public SessionRoomUpdateParser(RTCLog rTCLog, ParticipantsParser participantsParser, ParticipantListChunkParser participantListChunkParser, RecordInfoParser recordInfoParser, AsrParser asrParser, UrlSharingParser urlSharingParser) {
        this.a = rTCLog;
        this.b = participantsParser;
        this.c = participantListChunkParser;
        this.d = recordInfoParser;
        this.e = asrParser;
        this.f = urlSharingParser;
    }

    public final SessionRoomUpdatedEvent a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("events");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            SessionRoomsEventType a = a(jSONArray.getString(i));
            if (a != null) {
                linkedHashSet.add(a);
            }
        }
        int i2 = jSONObject.getInt(SignalingProtocol.KEY_ROOM_ID);
        boolean optBoolean = jSONObject.optBoolean(SignalingProtocol.KEY_DEACTIVATE);
        JSONObject optJSONObject = jSONObject.optJSONObject(SignalingProtocol.KEY_ROOM);
        return new SessionRoomUpdatedEvent(linkedHashSet, i2, optJSONObject != null ? parseRoomUpdateUnsafe(optJSONObject) : null, optBoolean);
    }

    public final SessionRoomsUpdatedEvent b(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(SignalingProtocol.KEY_UPDATES);
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            SessionRoomsEventType a = a(next);
            if (a != null) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                if (jSONObject3.has(SignalingProtocol.KEY_ROOMS)) {
                    JSONArray jSONArray = jSONObject3.getJSONArray(SignalingProtocol.KEY_ROOMS);
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList2.add(parseRoomUpdateUnsafe(jSONArray.getJSONObject(i)));
                    }
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        SignalingSessionRoom signalingSessionRoom = (SignalingSessionRoom) obj;
                        arrayList.add(new SessionRoomUpdatedEvent(Collections.singleton(a), signalingSessionRoom.getId(), signalingSessionRoom, false));
                    }
                } else {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray(SignalingProtocol.KEY_ROOM_IDS);
                    ArrayList arrayList3 = new ArrayList();
                    int length2 = jSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        arrayList3.add(Integer.valueOf(jSONArray2.getInt(i3)));
                    }
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList3.get(i4);
                        i4++;
                        arrayList.add(new SessionRoomUpdatedEvent(Collections.singleton(a), ((Number) obj2).intValue(), null, false));
                    }
                }
            }
        }
        return new SessionRoomsUpdatedEvent(arrayList);
    }

    public final SessionRoomUpdatedEvent parseRoomUpdate(JSONObject jSONObject) {
        try {
            return a(jSONObject);
        } catch (JSONException e) {
            this.a.logException("SessionRoomParser", "Can't parse room update notification", e);
            return null;
        }
    }

    public final SignalingSessionRoom parseRoomUpdateUnsafe(JSONObject jSONObject) {
        int i;
        SignalingParticipantListChunk signalingParticipantListChunk;
        int i2 = jSONObject.getInt("id");
        String string = jSONObject.getString("name");
        Boolean optBooleanOrNull = JSONExtensionsKt.optBooleanOrNull(jSONObject, SignalingProtocol.KEY_ACTIVE);
        Integer optIntOrNull = JSONExtensionsKt.optIntOrNull(jSONObject, SignalingProtocol.KEY_COUNTDOWN_SEC);
        Long optLongOrNull = JSONExtensionsKt.optLongOrNull(jSONObject, SignalingProtocol.KEY_TIMEOUT_MS);
        int optInt = jSONObject.optInt(SignalingProtocol.KEY_PARTICIPANT_COUNT);
        JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_PARTICIPANT_IDS);
        List<CallParticipant.ParticipantId> parseParticipantIds = optJSONArray != null ? this.b.parseParticipantIds(optJSONArray) : null;
        JSONArray optJSONArray2 = jSONObject.optJSONArray(SignalingProtocol.KEY_ADD_PARTICIPANT_IDS);
        List<CallParticipant.ParticipantId> parseParticipantIds2 = optJSONArray2 != null ? this.b.parseParticipantIds(optJSONArray2) : null;
        JSONArray optJSONArray3 = jSONObject.optJSONArray(SignalingProtocol.KEY_REMOVE_PARTICIPANT_IDS);
        List<CallParticipant.ParticipantId> parseParticipantIds3 = optJSONArray3 != null ? this.b.parseParticipantIds(optJSONArray3) : null;
        JSONObject optJSONObject = jSONObject.optJSONObject(SignalingProtocol.KEY_RECORD_INFO);
        SignalingRecordInfo parseRecordInfo = optJSONObject != null ? this.d.parseRecordInfo(optJSONObject) : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(SignalingProtocol.KEY_ASR_INFO);
        CallAsrInfo parse = optJSONObject2 != null ? this.e.parse(optJSONObject2) : null;
        Map createMediaOptionStates = jSONObject.has(SignalingProtocol.KEY_MUTE_STATES) ? SignalingProtocol.createMediaOptionStates(jSONObject, SignalingProtocol.KEY_MUTE_STATES) : jgp.b;
        JSONObject optJSONObject3 = jSONObject.optJSONObject(SignalingProtocol.KEY_PARTICIPANTS);
        if (optJSONObject3 != null) {
            i = optInt;
            signalingParticipantListChunk = this.c.parse(optJSONObject3, new SessionRoomId.Room(i2));
        } else {
            i = optInt;
            signalingParticipantListChunk = null;
        }
        boolean isNull = jSONObject.isNull(SignalingProtocol.KEY_PINNED_PARTICIPANT_ID);
        String optStringOrNull = JSONExtensionsKt.optStringOrNull(jSONObject, SignalingProtocol.KEY_PINNED_PARTICIPANT_ID);
        CallParticipant.ParticipantId fromStringValue = (isNull || optStringOrNull == null) ? null : CallParticipant.ParticipantId.fromStringValue(optStringOrNull);
        JSONObject optJSONObject4 = jSONObject.optJSONObject(SignalingProtocol.KEY_URL_SHARING_INFO);
        SignalingUrlSharingInfo parseUrlSharingInfo = optJSONObject4 != null ? this.f.parseUrlSharingInfo(optJSONObject4) : null;
        int i3 = i;
        return new SignalingSessionRoom(i2, string, optBooleanOrNull, parseParticipantIds, parseParticipantIds2, parseParticipantIds3, optIntOrNull, optLongOrNull, Integer.valueOf(i3), parseRecordInfo, parse, createMediaOptionStates, signalingParticipantListChunk, fromStringValue, parseUrlSharingInfo);
    }

    public final SessionRoomsUpdatedEvent parseRoomsUpdate(JSONObject jSONObject) {
        try {
            return b(jSONObject);
        } catch (JSONException e) {
            this.a.logException("SessionRoomParser", "Can't parse rooms update notification", e);
            return null;
        }
    }

    public static SessionRoomsEventType a(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1881281404) {
            if (str.equals(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE)) {
                return SessionRoomsEventType.REMOVE;
            }
            return null;
        }
        if (hashCode == -1785516855) {
            if (str.equals(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_UPDATE)) {
                return SessionRoomsEventType.UPDATE;
            }
            return null;
        }
        if (hashCode == -873347853) {
            if (str.equals(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_ACTIVATE)) {
                return SessionRoomsEventType.ACTIVATE;
            }
            return null;
        }
        if (hashCode == -595928767 && str.equals("TIMEOUT")) {
            return SessionRoomsEventType.TIMEOUT;
        }
        return null;
    }
}
