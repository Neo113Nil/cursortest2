package ru.ok.android.webrtc.listeners;

import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.asr.CallAsrInfo;

/* loaded from: classes9.dex */
public interface CallAsrListener {

    public static final class AsrRecordStartInfo {
        public final SessionRoomId a;
        public final CallAsrInfo b;

        public AsrRecordStartInfo(SessionRoomId sessionRoomId, CallAsrInfo callAsrInfo) {
            this.a = sessionRoomId;
            this.b = callAsrInfo;
        }

        public final CallAsrInfo getCallAsrInfo() {
            return this.b;
        }

        public final SessionRoomId getSessionRoomId() {
            return this.a;
        }
    }

    public static final class AsrRecordStopInfo {
        public final SessionRoomId a;

        public AsrRecordStopInfo(SessionRoomId sessionRoomId) {
            this.a = sessionRoomId;
        }

        public final SessionRoomId getSessionRoomId() {
            return this.a;
        }
    }

    void onAsrRecordStarted(AsrRecordStartInfo asrRecordStartInfo);

    void onAsrRecordStopped(AsrRecordStopInfo asrRecordStopInfo);
}
