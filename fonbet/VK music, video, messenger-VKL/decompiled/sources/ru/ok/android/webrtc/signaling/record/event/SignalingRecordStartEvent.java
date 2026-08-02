package ru.ok.android.webrtc.signaling.record.event;

import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public final class SignalingRecordStartEvent {
    public final SignalingRecordInfo a;
    public final SessionRoomId b;

    public SignalingRecordStartEvent(SignalingRecordInfo signalingRecordInfo, SessionRoomId sessionRoomId) {
        this.a = signalingRecordInfo;
        this.b = sessionRoomId;
    }

    public final SignalingRecordInfo getRecordInfo() {
        return this.a;
    }

    public final SessionRoomId getSessionRoomId() {
        return this.b;
    }
}
