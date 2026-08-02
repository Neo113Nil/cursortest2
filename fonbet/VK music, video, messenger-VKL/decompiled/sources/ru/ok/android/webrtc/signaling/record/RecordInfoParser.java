package ru.ok.android.webrtc.signaling.record;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.record.RecordType;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.record.event.SignalingRecordInfo;
import ru.ok.android.webrtc.signaling.record.event.SignalingRecordRolesChangedEvent;
import ru.ok.android.webrtc.signaling.record.event.SignalingRecordStartEvent;
import ru.ok.android.webrtc.signaling.record.event.SignalingRecordStopEvent;
import ru.ok.android.webrtc.signaling.sessionroom.SessionRoomCommonParser;
import ru.ok.android.webrtc.signaling.util.JSONExtensionsKt;

/* loaded from: classes9.dex */
public final class RecordInfoParser {
    public final RTCLog a;
    public final SessionRoomCommonParser b;

    public RecordInfoParser(RTCLog rTCLog, SessionRoomCommonParser sessionRoomCommonParser) {
        this.a = rTCLog;
        this.b = sessionRoomCommonParser;
    }

    public static SignalingRecordInfo a(JSONObject jSONObject) {
        CallParticipant.ParticipantId fromStringValue = CallParticipant.ParticipantId.fromStringValue(jSONObject.getString(SignalingProtocol.KEY_INITIATOR));
        long j = jSONObject.getLong(SignalingProtocol.KEY_RECORD_MOVIE_ID);
        String string = jSONObject.getString(SignalingProtocol.KEY_RECORD_TYPE);
        return new SignalingRecordInfo(j, string.equals("STREAM") ? RecordType.STREAM : string.equals("RECORD") ? RecordType.RECORD : RecordType.NOTHING, fromStringValue, jSONObject.optLong(SignalingProtocol.KEY_RECORD_START_TIME, System.currentTimeMillis()), JSONExtensionsKt.optStringOrNull(jSONObject, SignalingProtocol.KEY_RECORD_EXTERNAL_MOVIE_ID), JSONExtensionsKt.optStringOrNull(jSONObject, SignalingProtocol.KEY_RECORD_EXTERNAL_OWNER_ID));
    }

    public static /* synthetic */ SignalingRecordInfo parseRecordInfoFromParent$default(RecordInfoParser recordInfoParser, JSONObject jSONObject, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = SignalingProtocol.KEY_RECORD_INFO;
        }
        return recordInfoParser.parseRecordInfoFromParent(jSONObject, str);
    }

    public final SignalingRecordInfo parseRecordInfo(JSONObject jSONObject) {
        try {
            return a(jSONObject);
        } catch (JSONException e) {
            this.a.logException("RecordInfoParser", "Can't parse record info", e);
            return null;
        }
    }

    public final SignalingRecordInfo parseRecordInfoFromParent(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return parseRecordInfo(jSONObject.getJSONObject(str));
            }
            return null;
        } catch (JSONException e) {
            this.a.logException("RecordInfoParser", "Can't parse record info from parent", e);
            return null;
        }
    }

    public final SignalingRecordRolesChangedEvent parseRolesChangedNotification(JSONObject jSONObject) {
        try {
            return new SignalingRecordRolesChangedEvent();
        } catch (JSONException e) {
            this.a.logException("RecordInfoParser", "Can't parse record roles changed", e);
            return null;
        }
    }

    public final SignalingRecordStartEvent parseStartNotification(JSONObject jSONObject) {
        try {
            return new SignalingRecordStartEvent(a(jSONObject.getJSONObject(SignalingProtocol.KEY_RECORD_INFO)), this.b.parseRoomIdUnsafe(jSONObject));
        } catch (JSONException e) {
            this.a.logException("RecordInfoParser", "Can't parse record start info", e);
            return null;
        }
    }

    public final SignalingRecordStopEvent parseStopNotification(JSONObject jSONObject) {
        try {
            String optStringOrNull = JSONExtensionsKt.optStringOrNull(jSONObject, SignalingProtocol.KEY_PARTICIPANT);
            return new SignalingRecordStopEvent(this.b.parseRoomIdUnsafe(jSONObject), optStringOrNull != null ? CallParticipant.ParticipantId.fromStringValue(optStringOrNull) : null, JSONExtensionsKt.optLongOrNull(jSONObject, SignalingProtocol.KEY_RECORD_MOVIE_ID));
        } catch (JSONException e) {
            this.a.logException("RecordInfoParser", "Can't parse record stop info", e);
            return null;
        }
    }
}
