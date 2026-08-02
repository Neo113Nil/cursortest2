package ru.ok.android.webrtc.sessionroom;

/* loaded from: classes9.dex */
public final class CallSessionRoomKt {
    public static final SessionRoom toSessionRoom(CallSessionRoom callSessionRoom) {
        return new SessionRoom(callSessionRoom.getId(), callSessionRoom.getName(), callSessionRoom.isActive(), callSessionRoom.getParticipantCount(), callSessionRoom.getParticipantIds(), callSessionRoom.getPinnedParticipantId(), callSessionRoom.getTimeoutMs());
    }
}
