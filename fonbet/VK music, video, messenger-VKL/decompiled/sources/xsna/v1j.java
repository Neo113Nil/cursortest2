package xsna;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: ConfigureSessionRoomsAction.kt */
/* loaded from: classes7.dex */
public interface v1j extends kj50 {

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class a implements v1j {
        public final ParticipantId b;
        public final SessionRoomId.Room c;

        public a(SessionRoomId.Room room, ParticipantId participantId) {
            this.b = participantId;
            this.c = room;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "AssignParticipantToRoom(participantId=" + this.b + ", roomId=" + this.c + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class b implements v1j {
        public final ParticipantId b;

        public b(ParticipantId participantId) {
            this.b = participantId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AssignParticipantToRoomBegin(participantId=" + this.b + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class c implements v1j {
        public static final c b = new c();
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class d implements v1j {
        public static final d b = new d();
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class e implements v1j {
        public final SessionRoomId.Room b;

        public e(SessionRoomId.Room room) {
            this.b = room;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ConfigureRoomParticipants(roomId=" + this.b + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class f implements v1j {
        public static final f b = new f();
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class g implements v1j {
        public static final g b = new g();
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class h implements v1j {
        public static final h b = new h();
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class i implements v1j {
        public static final i b = new i();
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class j implements v1j {
        public final String b;

        public j(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("RoomAddConfirm(name="), this.b, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class k implements v1j {
        public final SessionRoomId.Room b;

        public k(SessionRoomId.Room room) {
            this.b = room;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RoomEditBegin(roomId=" + this.b + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class l implements v1j {
        public static final l b = new l();
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class m implements v1j {
        public final SessionRoomId.Room b;
        public final String c;

        public m(SessionRoomId.Room room, String str) {
            this.b = room;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.b, mVar.b) && epx.f(this.c, mVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoomRemove(roomId=");
            sb.append(this.b);
            sb.append(", name=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class n implements v1j {
        public final SessionRoomId.Room b;
        public final String c;

        public n(SessionRoomId.Room room, String str) {
            this.b = room;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return epx.f(this.b, nVar.b) && epx.f(this.c, nVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoomRename(roomId=");
            sb.append(this.b);
            sb.append(", name=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class o implements v1j {
        public final SessionRoomId.Room b;

        public o(SessionRoomId.Room room) {
            this.b = room;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.b, ((o) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RoomRenameBegin(roomId=" + this.b + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class p implements v1j {
        public static final p b = new p();
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class q implements v1j {
        public static final q b = new q();
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class r implements v1j {
        public static final r b = new r();
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class s implements v1j {
        public final boolean b;

        public s(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.b == ((s) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetAssignParticipantsRandomly(assignRandomly="), this.b, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class t implements v1j {
        public final int b;

        public t(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.b == ((t) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SetRoomsCount(roomsCount="), this.b, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class u implements v1j {
        public final boolean b;

        public u(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.b == ((u) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetSetTimeLimit(setTimeLimit="), this.b, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsAction.kt */
    public static final class v implements v1j {
        public final boolean b;
        public final int c;

        public v(boolean z, int i) {
            this.b = z;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.b == vVar.b && this.c == vVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetTimeLimit(isTimerPreset=");
            sb.append(this.b);
            sb.append(", timeLimit=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
