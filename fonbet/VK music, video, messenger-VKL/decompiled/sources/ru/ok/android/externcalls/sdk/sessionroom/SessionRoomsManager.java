package ru.ok.android.externcalls.sdk.sessionroom;

import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;
import ru.ok.android.webrtc.sessionroom.SessionRoom;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.sessionroom.admin.ActivateRoomsParams;
import ru.ok.android.webrtc.sessionroom.admin.RemoveRoomsParams;
import ru.ok.android.webrtc.sessionroom.admin.UpdateRoomsParams;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SessionRoomsManager.kt */
/* loaded from: classes9.dex */
public interface SessionRoomsManager extends SessionRoomParticipantsDataProvider {

    /* compiled from: SessionRoomsManager.kt */
    /* loaded from: classes11.dex */
    public interface OwnRoomsListener {
        void onActiveRoomChanged(SessionRoomInfo sessionRoomInfo);

        void onProposedRoomChanged(SessionRoomInfo sessionRoomInfo);

        void onRoomRemoved(SessionRoomInfo sessionRoomInfo);

        void onRoomUpdated(SessionRoomInfo sessionRoomInfo);
    }

    /* compiled from: SessionRoomsManager.kt */
    public static final class SessionRoomInfo {
        private final SessionRoom room;
        private final SessionRoomId roomId;

        public SessionRoomInfo(SessionRoomId sessionRoomId, SessionRoom sessionRoom) {
            this.roomId = sessionRoomId;
            this.room = sessionRoom;
        }

        public static /* synthetic */ SessionRoomInfo copy$default(SessionRoomInfo sessionRoomInfo, SessionRoomId sessionRoomId, SessionRoom sessionRoom, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionRoomId = sessionRoomInfo.roomId;
            }
            if ((i & 2) != 0) {
                sessionRoom = sessionRoomInfo.room;
            }
            return sessionRoomInfo.copy(sessionRoomId, sessionRoom);
        }

        public final SessionRoomId component1() {
            return this.roomId;
        }

        public final SessionRoom component2() {
            return this.room;
        }

        public final SessionRoomInfo copy(SessionRoomId sessionRoomId, SessionRoom sessionRoom) {
            return new SessionRoomInfo(sessionRoomId, sessionRoom);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionRoomInfo)) {
                return false;
            }
            SessionRoomInfo sessionRoomInfo = (SessionRoomInfo) obj;
            return epx.f(this.roomId, sessionRoomInfo.roomId) && epx.f(this.room, sessionRoomInfo.room);
        }

        public final SessionRoom getRoom() {
            return this.room;
        }

        public final SessionRoomId getRoomId() {
            return this.roomId;
        }

        public int hashCode() {
            int hashCode = this.roomId.hashCode() * 31;
            SessionRoom sessionRoom = this.room;
            return hashCode + (sessionRoom == null ? 0 : sessionRoom.hashCode());
        }

        public String toString() {
            return "SessionRoomInfo(roomId=" + this.roomId + ", room=" + this.room + ")";
        }
    }

    void activateRooms(ActivateRoomsParams activateRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void addListener(OwnRoomsListener ownRoomsListener);

    void assignParticipantsToRooms(AssignParticipantsToRoomsParams assignParticipantsToRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    SessionRoomInfo getOwnActiveRoom();

    SessionRoomInfo getOwnProposedRoom();

    void joinRoom(SessionRoomId.Room room, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void leaveRoom(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void moveParticipant(MoveParticipantParams moveParticipantParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void removeListener(OwnRoomsListener ownRoomsListener);

    void removeRooms(RemoveRoomsParams removeRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void requestAttention(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void updateRooms(UpdateRoomsParams updateRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
