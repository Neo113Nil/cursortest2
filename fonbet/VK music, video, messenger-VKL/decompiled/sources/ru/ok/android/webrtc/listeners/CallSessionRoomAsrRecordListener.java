package ru.ok.android.webrtc.listeners;

import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.asr.CallAsrInfo;

/* loaded from: classes9.dex */
public interface CallSessionRoomAsrRecordListener {

    public static final class SessionRoomAsrRecordState {
        public final CallAsrInfo a;
        public final SessionRoomId.Room b;

        public SessionRoomAsrRecordState(CallAsrInfo callAsrInfo, SessionRoomId.Room room) {
            this.a = callAsrInfo;
            this.b = room;
        }

        public final CallAsrInfo getCallAsrInfo() {
            return this.a;
        }

        public final SessionRoomId.Room getSessionRoomId() {
            return this.b;
        }
    }

    void onSessionRoomAsrRecordInfo(SessionRoomAsrRecordState sessionRoomAsrRecordState);
}
