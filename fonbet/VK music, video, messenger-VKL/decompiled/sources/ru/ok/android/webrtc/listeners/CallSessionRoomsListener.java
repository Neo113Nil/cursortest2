package ru.ok.android.webrtc.listeners;

import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoom;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.epx;

/* loaded from: classes9.dex */
public interface CallSessionRoomsListener {

    public static final class ActiveRoomChangedParams {
        public final SessionRoomId a;
        public SessionRoom b;

        public ActiveRoomChangedParams(SessionRoomId sessionRoomId, SessionRoom sessionRoom) {
            this.a = sessionRoomId;
            this.b = sessionRoom;
        }

        public static /* synthetic */ ActiveRoomChangedParams copy$default(ActiveRoomChangedParams activeRoomChangedParams, SessionRoomId sessionRoomId, SessionRoom sessionRoom, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionRoomId = activeRoomChangedParams.a;
            }
            if ((i & 2) != 0) {
                sessionRoom = activeRoomChangedParams.b;
            }
            return activeRoomChangedParams.copy(sessionRoomId, sessionRoom);
        }

        public final SessionRoomId component1() {
            return this.a;
        }

        public final SessionRoom component2() {
            return this.b;
        }

        public final ActiveRoomChangedParams copy(SessionRoomId sessionRoomId, SessionRoom sessionRoom) {
            return new ActiveRoomChangedParams(sessionRoomId, sessionRoom);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActiveRoomChangedParams)) {
                return false;
            }
            ActiveRoomChangedParams activeRoomChangedParams = (ActiveRoomChangedParams) obj;
            return epx.f(this.a, activeRoomChangedParams.a) && epx.f(this.b, activeRoomChangedParams.b);
        }

        public final SessionRoom getRoom() {
            return this.b;
        }

        public final SessionRoomId getRoomId() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            SessionRoom sessionRoom = this.b;
            return hashCode + (sessionRoom == null ? 0 : sessionRoom.hashCode());
        }

        public final void setRoom(SessionRoom sessionRoom) {
            this.b = sessionRoom;
        }

        public String toString() {
            return "ActiveRoomChangedParams(roomId=" + this.a + ", room=" + this.b + ")";
        }
    }

    public static final class InvitedParams {
        public final CallParticipant a;
        public final SessionRoomId b;
        public SessionRoom c;

        public InvitedParams(CallParticipant callParticipant, SessionRoomId sessionRoomId, SessionRoom sessionRoom) {
            this.a = callParticipant;
            this.b = sessionRoomId;
            this.c = sessionRoom;
        }

        public static /* synthetic */ InvitedParams copy$default(InvitedParams invitedParams, CallParticipant callParticipant, SessionRoomId sessionRoomId, SessionRoom sessionRoom, int i, Object obj) {
            if ((i & 1) != 0) {
                callParticipant = invitedParams.a;
            }
            if ((i & 2) != 0) {
                sessionRoomId = invitedParams.b;
            }
            if ((i & 4) != 0) {
                sessionRoom = invitedParams.c;
            }
            return invitedParams.copy(callParticipant, sessionRoomId, sessionRoom);
        }

        public final CallParticipant component1() {
            return this.a;
        }

        public final SessionRoomId component2() {
            return this.b;
        }

        public final SessionRoom component3() {
            return this.c;
        }

        public final InvitedParams copy(CallParticipant callParticipant, SessionRoomId sessionRoomId, SessionRoom sessionRoom) {
            return new InvitedParams(callParticipant, sessionRoomId, sessionRoom);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvitedParams)) {
                return false;
            }
            InvitedParams invitedParams = (InvitedParams) obj;
            return epx.f(this.a, invitedParams.a) && epx.f(this.b, invitedParams.b) && epx.f(this.c, invitedParams.c);
        }

        public final CallParticipant getMe() {
            return this.a;
        }

        public final SessionRoom getRoom() {
            return this.c;
        }

        public final SessionRoomId getRoomId() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            SessionRoom sessionRoom = this.c;
            return hashCode + (sessionRoom == null ? 0 : sessionRoom.hashCode());
        }

        public final void setRoom(SessionRoom sessionRoom) {
            this.c = sessionRoom;
        }

        public String toString() {
            return "InvitedParams(me=" + this.a + ", roomId=" + this.b + ", room=" + this.c + ")";
        }
    }

    public static final class RemovedParams {
        public final SessionRoomId a;

        public RemovedParams(SessionRoomId sessionRoomId) {
            this.a = sessionRoomId;
        }

        public static /* synthetic */ RemovedParams copy$default(RemovedParams removedParams, SessionRoomId sessionRoomId, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionRoomId = removedParams.a;
            }
            return removedParams.copy(sessionRoomId);
        }

        public final SessionRoomId component1() {
            return this.a;
        }

        public final RemovedParams copy(SessionRoomId sessionRoomId) {
            return new RemovedParams(sessionRoomId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemovedParams) && epx.f(this.a, ((RemovedParams) obj).a);
        }

        public final SessionRoomId getRoomId() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "RemovedParams(roomId=" + this.a + ")";
        }
    }

    public static final class UpdatedParams {
        public final SessionRoomId a;
        public SessionRoom b;

        public UpdatedParams(SessionRoomId sessionRoomId, SessionRoom sessionRoom) {
            this.a = sessionRoomId;
            this.b = sessionRoom;
        }

        public static /* synthetic */ UpdatedParams copy$default(UpdatedParams updatedParams, SessionRoomId sessionRoomId, SessionRoom sessionRoom, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionRoomId = updatedParams.a;
            }
            if ((i & 2) != 0) {
                sessionRoom = updatedParams.b;
            }
            return updatedParams.copy(sessionRoomId, sessionRoom);
        }

        public final SessionRoomId component1() {
            return this.a;
        }

        public final SessionRoom component2() {
            return this.b;
        }

        public final UpdatedParams copy(SessionRoomId sessionRoomId, SessionRoom sessionRoom) {
            return new UpdatedParams(sessionRoomId, sessionRoom);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdatedParams)) {
                return false;
            }
            UpdatedParams updatedParams = (UpdatedParams) obj;
            return epx.f(this.a, updatedParams.a) && epx.f(this.b, updatedParams.b);
        }

        public final SessionRoom getRoom() {
            return this.b;
        }

        public final SessionRoomId getRoomId() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final void setRoom(SessionRoom sessionRoom) {
            this.b = sessionRoom;
        }

        public String toString() {
            return "UpdatedParams(roomId=" + this.a + ", room=" + this.b + ")";
        }
    }

    default void onCurrentParticipantActiveRoomChanged(ActiveRoomChangedParams activeRoomChangedParams) {
    }

    default void onCurrentParticipantInvitedToRoom(InvitedParams invitedParams) {
    }

    default void onRoomRemoved(RemovedParams removedParams) {
    }

    default void onRoomUpdated(UpdatedParams updatedParams) {
    }
}
