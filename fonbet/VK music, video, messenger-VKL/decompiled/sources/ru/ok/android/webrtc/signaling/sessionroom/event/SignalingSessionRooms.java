package ru.ok.android.webrtc.signaling.sessionroom.event;

import java.util.List;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public final class SignalingSessionRooms {
    public final SessionRoomId a;
    public final List b;

    public SignalingSessionRooms(SessionRoomId sessionRoomId, List<SignalingSessionRoom> list) {
        this.a = sessionRoomId;
        this.b = list;
    }

    public final SessionRoomId getRoomId() {
        return this.a;
    }

    public final List<SignalingSessionRoom> getRooms() {
        return this.b;
    }
}
