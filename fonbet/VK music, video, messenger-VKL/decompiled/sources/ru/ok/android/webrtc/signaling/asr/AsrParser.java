package ru.ok.android.webrtc.signaling.asr;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.sessionroom.SessionRoomCommonParser;
import ru.ok.android.webrtc.signaling.util.JSONExtensionsKt;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class AsrParser {
    public static final Companion Companion = new Companion(null);
    public final RTCLog a;
    public final SessionRoomCommonParser b;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public static final class StartAsrRecord {
        public final SessionRoomId a;
        public final CallAsrInfo b;

        public StartAsrRecord(SessionRoomId sessionRoomId, CallAsrInfo callAsrInfo) {
            this.a = sessionRoomId;
            this.b = callAsrInfo;
        }

        public static /* synthetic */ StartAsrRecord copy$default(StartAsrRecord startAsrRecord, SessionRoomId sessionRoomId, CallAsrInfo callAsrInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionRoomId = startAsrRecord.a;
            }
            if ((i & 2) != 0) {
                callAsrInfo = startAsrRecord.b;
            }
            return startAsrRecord.copy(sessionRoomId, callAsrInfo);
        }

        public final SessionRoomId component1() {
            return this.a;
        }

        public final CallAsrInfo component2() {
            return this.b;
        }

        public final StartAsrRecord copy(SessionRoomId sessionRoomId, CallAsrInfo callAsrInfo) {
            return new StartAsrRecord(sessionRoomId, callAsrInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartAsrRecord)) {
                return false;
            }
            StartAsrRecord startAsrRecord = (StartAsrRecord) obj;
            return epx.f(this.a, startAsrRecord.a) && epx.f(this.b, startAsrRecord.b);
        }

        public final CallAsrInfo getCallAsrInfo() {
            return this.b;
        }

        public final SessionRoomId getSessionRoomId() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            return "StartAsrRecord(sessionRoomId=" + this.a + ", callAsrInfo=" + this.b + ")";
        }
    }

    public static final class StopAsrRecord {
        public final SessionRoomId a;

        public StopAsrRecord(SessionRoomId sessionRoomId) {
            this.a = sessionRoomId;
        }

        public static /* synthetic */ StopAsrRecord copy$default(StopAsrRecord stopAsrRecord, SessionRoomId sessionRoomId, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionRoomId = stopAsrRecord.a;
            }
            return stopAsrRecord.copy(sessionRoomId);
        }

        public final SessionRoomId component1() {
            return this.a;
        }

        public final StopAsrRecord copy(SessionRoomId sessionRoomId) {
            return new StopAsrRecord(sessionRoomId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopAsrRecord) && epx.f(this.a, ((StopAsrRecord) obj).a);
        }

        public final SessionRoomId getSessionRoomId() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "StopAsrRecord(sessionRoomId=" + this.a + ")";
        }
    }

    public AsrParser(RTCLog rTCLog, SessionRoomCommonParser sessionRoomCommonParser) {
        this.a = rTCLog;
        this.b = sessionRoomCommonParser;
    }

    public static /* synthetic */ CallAsrInfo parseRecordInfoFromParent$default(AsrParser asrParser, JSONObject jSONObject, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = SignalingProtocol.KEY_ASR_INFO;
        }
        return asrParser.parseRecordInfoFromParent(jSONObject, str);
    }

    public final CallAsrInfo parse(JSONObject jSONObject) {
        CallParticipant.ParticipantId fromStringValueSafe = CallParticipant.ParticipantId.fromStringValueSafe(jSONObject.optString(SignalingProtocol.KEY_INITIATOR_ID));
        if (fromStringValueSafe == null) {
            return null;
        }
        return new CallAsrInfo(fromStringValueSafe, JSONExtensionsKt.optLongOrNull(jSONObject, SignalingProtocol.KEY_MOVIE_ID));
    }

    public final CallAsrInfo parseRecordInfoFromParent(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return parse(jSONObject.getJSONObject(str));
            }
            return null;
        } catch (JSONException e) {
            this.a.logException("AsrParser", "Can't parse record info from parent", e);
            return null;
        }
    }

    public final StartAsrRecord parseStartNotification(JSONObject jSONObject) {
        try {
            CallAsrInfo parse = parse(jSONObject.getJSONObject(SignalingProtocol.KEY_ASR_INFO));
            if (parse == null) {
                return null;
            }
            return new StartAsrRecord(this.b.parseRoomIdUnsafe(jSONObject), parse);
        } catch (JSONException e) {
            this.a.logException("AsrParser", "Can't parse record start info", e);
            return null;
        }
    }

    public final StopAsrRecord parseStopNotification(JSONObject jSONObject) {
        try {
            return new StopAsrRecord(this.b.parseRoomIdUnsafe(jSONObject));
        } catch (JSONException e) {
            this.a.logException("AsrParser", "Can't parse record stop info", e);
            return null;
        }
    }
}
