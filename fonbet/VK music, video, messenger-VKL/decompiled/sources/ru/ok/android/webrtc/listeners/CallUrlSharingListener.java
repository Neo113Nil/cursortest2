package ru.ok.android.webrtc.listeners;

import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.urlsharing.SignalingUrlSharingInfo;

/* loaded from: classes9.dex */
public interface CallUrlSharingListener {

    public static final class UrlSharingState {
        public final SessionRoomId a;
        public final SignalingUrlSharingInfo b;

        public UrlSharingState(SessionRoomId sessionRoomId, SignalingUrlSharingInfo signalingUrlSharingInfo) {
            this.a = sessionRoomId;
            this.b = signalingUrlSharingInfo;
        }

        public final SignalingUrlSharingInfo getInfo() {
            return this.b;
        }

        public final SessionRoomId getRoomId() {
            return this.a;
        }
    }

    void onUrlSharingInfoUpdated(UrlSharingState urlSharingState);
}
