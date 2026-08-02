package xsna;

import com.vk.voip.ui.sessionrooms.f;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: SessionRoomsFeatureAction.kt */
/* loaded from: classes7.dex */
public interface qwi0 extends kj50 {

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class a implements qwi0 {
        public final ParticipantId b;

        public a(ParticipantId participantId) {
            this.b = participantId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ApplyAssistanceRequest(participantId=" + this.b + ')';
        }
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class b implements qwi0 {
        public final ParticipantId b;
        public final SessionRoomId c;

        public b(ParticipantId participantId, SessionRoomId sessionRoomId) {
            this.b = participantId;
            this.c = sessionRoomId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "ApplyAssistanceRequestDetails(participantId=" + this.b + ", roomId=" + this.c + ')';
        }
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class c implements qwi0 {
        public static final c b = new c();
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class d implements qwi0 {
        public final SessionRoomId.Room b;
        public final String c;
        public final boolean d;
        public final int e;
        public final List<CallParticipant.ParticipantId> f;

        public d(SessionRoomId.Room room, String str, boolean z, int i, List<CallParticipant.ParticipantId> list) {
            this.b = room;
            this.c = str;
            this.d = z;
            this.e = i;
            this.f = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && epx.f(this.f, dVar.f);
        }

        public final int hashCode() {
            int a = shy.a(this.e, qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31);
            List<CallParticipant.ParticipantId> list = this.f;
            return a + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InvitedToRoom(roomId=");
            sb.append(this.b);
            sb.append(", roomName=");
            sb.append(this.c);
            sb.append(", isActive=");
            sb.append(this.d);
            sb.append(", participantCount=");
            sb.append(this.e);
            sb.append(", participantIds=");
            return ms9.a(')', sb, this.f);
        }
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class e implements qwi0 {
        public final f.a.b b;

        public e() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            f.a.b bVar = this.b;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public final String toString() {
            return "JoinRoom(room=" + this.b + ')';
        }

        public e(f.a.b bVar) {
            this.b = bVar;
        }
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class f implements qwi0 {
        public static final f b = new f();
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class g implements qwi0 {
        public final SessionRoomId b;

        public g(SessionRoomId sessionRoomId) {
            this.b = sessionRoomId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ParticipantMoved(toRoomId=" + this.b + ')';
        }
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class h implements qwi0 {
        public static final h b = new h();
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class i implements qwi0 {
        public static final i b = new i();
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class j implements qwi0 {
        public final SessionRoomId.Room b;
        public final String c;
        public final boolean d;
        public final int e;
        public final List<CallParticipant.ParticipantId> f;

        public j(SessionRoomId.Room room, String str, boolean z, int i, List<CallParticipant.ParticipantId> list) {
            this.b = room;
            this.c = str;
            this.d = z;
            this.e = i;
            this.f = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c) && this.d == jVar.d && this.e == jVar.e && epx.f(this.f, jVar.f);
        }

        public final int hashCode() {
            int a = shy.a(this.e, qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31);
            List<CallParticipant.ParticipantId> list = this.f;
            return a + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoomJoined(roomId=");
            sb.append(this.b);
            sb.append(", roomName=");
            sb.append(this.c);
            sb.append(", isActive=");
            sb.append(this.d);
            sb.append(", participantCount=");
            sb.append(this.e);
            sb.append(", participantIds=");
            return ms9.a(')', sb, this.f);
        }
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class k implements qwi0 {
        public static final k b = new k();
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class l implements qwi0 {
        public final SessionRoomId.Room b;

        public l(SessionRoomId.Room room) {
            this.b = room;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.b, ((l) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RoomRemoved(roomId=" + this.b + ')';
        }
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class m implements qwi0 {
        public final SessionRoomId.Room b;
        public final String c;
        public final boolean d;
        public final int e;
        public final List<CallParticipant.ParticipantId> f;
        public final Long g;

        public m(SessionRoomId.Room room, String str, boolean z, int i, List<CallParticipant.ParticipantId> list, Long l) {
            this.b = room;
            this.c = str;
            this.d = z;
            this.e = i;
            this.f = list;
            this.g = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.b, mVar.b) && epx.f(this.c, mVar.c) && this.d == mVar.d && this.e == mVar.e && epx.f(this.f, mVar.f) && epx.f(this.g, mVar.g);
        }

        public final int hashCode() {
            int a = shy.a(this.e, qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31);
            List<CallParticipant.ParticipantId> list = this.f;
            int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
            Long l = this.g;
            return hashCode + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoomUpdated(roomId=");
            sb.append(this.b);
            sb.append(", roomName=");
            sb.append(this.c);
            sb.append(", isActive=");
            sb.append(this.d);
            sb.append(", participantCount=");
            sb.append(this.e);
            sb.append(", participantIds=");
            sb.append(this.f);
            sb.append(", timeoutMs=");
            return iq.b(sb, this.g, ')');
        }
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class n implements qwi0 {
        public final boolean b;

        public n(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.b == ((n) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetAdminStatus(isAdmin="), this.b, ')');
        }
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class o implements qwi0 {
        public final String b;

        public o(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("ShowAdminMessage(text="), this.b, ')');
        }
    }

    /* compiled from: SessionRoomsFeatureAction.kt */
    public static final class p implements qwi0 {
        public static final p b = new p();
    }
}
