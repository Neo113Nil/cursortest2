package ru.ok.android.webrtc.listeners;

import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.record.event.SignalingRecordInfo;

/* loaded from: classes9.dex */
public interface CallSessionRoomRecordInfoListener {

    public static final class SessionRoomRecordInfoState {
        public final SignalingRecordInfo a;
        public final SessionRoomId.Room b;

        public SessionRoomRecordInfoState(SignalingRecordInfo signalingRecordInfo, SessionRoomId.Room room) {
            this.a = signalingRecordInfo;
            this.b = room;
        }

        public final SignalingRecordInfo getRecordInfo() {
            return this.a;
        }

        public final SessionRoomId.Room getSessionRoomId() {
            return this.b;
        }
    }

    void onSessionRoomRecordInfo(SessionRoomRecordInfoState sessionRoomRecordInfoState);
}
