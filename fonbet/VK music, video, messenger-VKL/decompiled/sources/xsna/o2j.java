package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vk.voip.ui.sessionrooms.f;
import java.util.Collection;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: ConfigureSessionRoomsPatch.kt */
/* loaded from: classes7.dex */
public interface o2j extends xl50 {

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class a implements o2j {
        public static final a b = new a();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class a0 implements o2j {
        public final boolean b;
        public final int c;

        public a0(boolean z, int i) {
            this.b = z;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return this.b == a0Var.b && this.c == a0Var.c;
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

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class b implements o2j {
        public static final b b = new b();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class c implements o2j {
        public final ParticipantId b;

        public c(ParticipantId participantId) {
            this.b = participantId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AssignParticipant(participantId=" + this.b + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class d implements o2j {
        public final ParticipantId b;
        public final SessionRoomId.Room c;

        public d(SessionRoomId.Room room, ParticipantId participantId) {
            this.b = participantId;
            this.c = room;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "AssignParticipantToRoom(participantId=" + this.b + ", roomId=" + this.c + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class e implements o2j {
        public static final e b = new e();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class f implements o2j {
        public static final f b = new f();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class g implements o2j {
        public static final g b = new g();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class h implements o2j {
        public static final h b = new h();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class i implements o2j {
        public static final i b = new i();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class j implements o2j {
        public static final j b = new j();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class k implements o2j {
        public final String b;

        public k(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("CanNotRemoveSessionRoom(roomName="), this.b, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class l implements o2j {
        public final String b;

        public l(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("CanNotRenameSessionRoom(roomName="), this.b, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class m implements o2j {
        public final SessionRoomId.Room b;

        public m(SessionRoomId.Room room) {
            this.b = room;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ConfigureRoomParticipants(roomId=" + this.b + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class n implements o2j {
        public final SessionRoomId.Room b;

        public n(SessionRoomId.Room room) {
            this.b = room;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "EditRoom(roomId=" + this.b + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class o implements o2j {
        public static final o b = new o();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class p implements o2j {
        public static final p b = new p();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class q implements o2j {
        public final boolean b;

        public q(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.b == ((q) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("LoadRoomsInfo(initial="), this.b, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class r implements o2j {
        public static final r b = new r();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class s implements o2j {
        public final SessionRoomId.Room b;

        public s(SessionRoomId.Room room) {
            this.b = room;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.b, ((s) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RenameRoom(roomId=" + this.b + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class t implements o2j {
        public static final t b = new t();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class u implements o2j {
        public static final u b = new u();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class v implements o2j {
        public static final v b = new v();
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class w implements o2j {
        public final int b;

        public w(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.b == ((w) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SetRoomsCount(roomsCount="), this.b, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class x implements o2j {
        public final f.a b;
        public final boolean c;
        public final int d;
        public final Collection<SessionRoomParticipantModel> e;
        public final Collection<lvi0> f;
        public final svi0 g;

        public x(f.a aVar, boolean z, int i, Collection<SessionRoomParticipantModel> collection, Collection<lvi0> collection2, svi0 svi0Var) {
            this.b = aVar;
            this.c = z;
            this.d = i;
            this.e = collection;
            this.f = collection2;
            this.g = svi0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return epx.f(this.b, xVar.b) && this.c == xVar.c && this.d == xVar.d && epx.f(this.e, xVar.e) && epx.f(this.f, xVar.f) && epx.f(this.g, xVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + s3j0.a(s3j0.a(shy.a(this.d, qoy.b(this.b.hashCode() * 31, 31, this.c), 31), this.e, 31), this.f, 31);
        }

        public final String toString() {
            return "SetRoomsInfo(activeRoom=" + this.b + ", roomsAreActive=" + this.c + ", mainCallParticipantCount=" + this.d + ", mainCallParticipants=" + this.e + ", rooms=" + this.f + ", countdownTimerState=" + this.g + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class y implements o2j {
        public final boolean b;

        public y(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && this.b == ((y) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetSetTimeLimit(setTimeLimit="), this.b, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsPatch.kt */
    public static final class z implements o2j {
        public final boolean b;

        public z(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && this.b == ((z) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetSpreadParticipantsRandomly(spreadParticipantsRandomly="), this.b, ')');
        }
    }
}
