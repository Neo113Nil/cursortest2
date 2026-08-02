package xsna;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: ConfigureRoomParticipantsAction.kt */
/* loaded from: classes7.dex */
public interface j0j extends kj50 {

    /* compiled from: ConfigureRoomParticipantsAction.kt */
    public static final class a implements j0j {
        public static final a b = new a();
    }

    /* compiled from: ConfigureRoomParticipantsAction.kt */
    public static final class b implements j0j {
        public static final b b = new b();
    }

    /* compiled from: ConfigureRoomParticipantsAction.kt */
    public static final class c implements j0j {
        public static final c b = new c();
    }

    /* compiled from: ConfigureRoomParticipantsAction.kt */
    public static final class d implements j0j {
        public static final d b = new d();
    }

    /* compiled from: ConfigureRoomParticipantsAction.kt */
    public static final class e implements j0j {
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
            return "Load(roomId=" + this.b + ')';
        }
    }

    /* compiled from: ConfigureRoomParticipantsAction.kt */
    public static final class f implements j0j {
        public final ParticipantId b;
        public final SessionRoomId c;

        public f(ParticipantId participantId, SessionRoomId sessionRoomId) {
            this.b = participantId;
            this.c = sessionRoomId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "MoveParticipant(participantId=" + this.b + ", roomId=" + this.c + ')';
        }
    }

    /* compiled from: ConfigureRoomParticipantsAction.kt */
    public static final class g implements j0j {
        public static final g b = new g();
    }

    /* compiled from: ConfigureRoomParticipantsAction.kt */
    public static final class h implements j0j {
        public static final h b = new h();
    }

    /* compiled from: ConfigureRoomParticipantsAction.kt */
    public static final class i implements j0j {
        public final String b;

        public i(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Search(searchString="), this.b, ')');
        }
    }

    /* compiled from: ConfigureRoomParticipantsAction.kt */
    public static final class j implements j0j {
        public final SessionRoomId b;

        public j(SessionRoomId sessionRoomId) {
            this.b = sessionRoomId;
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
            return "SetActiveRoom(roomId=" + this.b + ')';
        }
    }

    /* compiled from: ConfigureRoomParticipantsAction.kt */
    public static final class k implements j0j {
        public final ParticipantId b;
        public final boolean c;

        public k(ParticipantId participantId, boolean z) {
            this.b = participantId;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.b, kVar.b) && this.c == kVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToggleParticipantAssignment(participantId=");
            sb.append(this.b);
            sb.append(", auto=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
