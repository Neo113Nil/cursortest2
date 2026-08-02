package ru.ok.android.webrtc.signaling.sessionroom.event;

import java.util.Set;

/* loaded from: classes9.dex */
public final class SessionRoomUpdatedEvent {
    public final Set a;
    public final int b;
    public final SignalingSessionRoom c;
    public final boolean d;

    public SessionRoomUpdatedEvent(Set<? extends SessionRoomsEventType> set, int i, SignalingSessionRoom signalingSessionRoom, boolean z) {
        this.a = set;
        this.b = i;
        this.c = signalingSessionRoom;
        this.d = z;
    }

    public final boolean getDeactivate() {
        return this.d;
    }

    public final Set<SessionRoomsEventType> getEvents() {
        return this.a;
    }

    public final SignalingSessionRoom getRoom() {
        return this.c;
    }

    public final int getRoomId() {
        return this.b;
    }
}
