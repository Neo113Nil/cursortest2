package ru.ok.android.webrtc.signaling.sessionroom.event;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class SessionRoomsEventType {
    public static final SessionRoomsEventType ACTIVATE;
    public static final SessionRoomsEventType REMOVE;
    public static final SessionRoomsEventType TIMEOUT;
    public static final SessionRoomsEventType UPDATE;
    public static final /* synthetic */ SessionRoomsEventType[] a;
    public static final /* synthetic */ zrp b;

    static {
        SessionRoomsEventType sessionRoomsEventType = new SessionRoomsEventType(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_UPDATE, 0);
        UPDATE = sessionRoomsEventType;
        SessionRoomsEventType sessionRoomsEventType2 = new SessionRoomsEventType(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 1);
        REMOVE = sessionRoomsEventType2;
        SessionRoomsEventType sessionRoomsEventType3 = new SessionRoomsEventType(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_ACTIVATE, 2);
        ACTIVATE = sessionRoomsEventType3;
        SessionRoomsEventType sessionRoomsEventType4 = new SessionRoomsEventType("TIMEOUT", 3);
        TIMEOUT = sessionRoomsEventType4;
        SessionRoomsEventType[] sessionRoomsEventTypeArr = {sessionRoomsEventType, sessionRoomsEventType2, sessionRoomsEventType3, sessionRoomsEventType4};
        a = sessionRoomsEventTypeArr;
        b = new asp(sessionRoomsEventTypeArr);
    }

    public SessionRoomsEventType(String str, int i) {
    }

    public static zrp<SessionRoomsEventType> getEntries() {
        return b;
    }

    public static SessionRoomsEventType valueOf(String str) {
        return (SessionRoomsEventType) Enum.valueOf(SessionRoomsEventType.class, str);
    }

    public static SessionRoomsEventType[] values() {
        return (SessionRoomsEventType[]) a.clone();
    }
}
