package ru.ok.android.webrtc.signaling.sessionroom.event;

import java.util.List;

/* loaded from: classes9.dex */
public final class SessionRoomsUpdatedEvent {
    public final List a;

    public SessionRoomsUpdatedEvent(List<SessionRoomUpdatedEvent> list) {
        this.a = list;
    }

    public final List<SessionRoomUpdatedEvent> getUpdates() {
        return this.a;
    }
}
