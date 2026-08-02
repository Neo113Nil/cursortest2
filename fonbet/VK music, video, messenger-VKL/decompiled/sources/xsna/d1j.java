package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import java.util.Collection;
import java.util.List;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.l1j;

/* compiled from: ConfigureRoomParticipantsPatch.kt */
/* loaded from: classes7.dex */
public interface d1j extends xl50 {

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class a implements d1j {
        public static final a b = new a();
    }

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class b implements d1j {
        public static final b b = new b();
    }

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class c implements d1j {
        public static final c b = new c();
    }

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class d implements d1j {
        public final Collection<SessionRoomParticipantModel> b;
        public final Collection<SessionRoomParticipantModel> c;

        public d(Collection collection, List list) {
            this.b = list;
            this.c = collection;
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
            Collection<SessionRoomParticipantModel> collection = this.b;
            int hashCode = (collection == null ? 0 : collection.hashCode()) * 31;
            Collection<SessionRoomParticipantModel> collection2 = this.c;
            return hashCode + (collection2 != null ? collection2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExternalParticipantsUpdate(roomParticipants=");
            sb.append(this.b);
            sb.append(", mainCallParticipants=");
            return l4.h(sb, this.c, ')');
        }
    }

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class e implements d1j {
        public final l1j.e b;

        public e(l1j.e eVar) {
            this.b = eVar;
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
            return "ParticipantsUpdate(participants=" + this.b + ')';
        }
    }

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class f implements d1j {
        public final SessionRoomId.Room b;
        public final SessionRoomParticipantModel c;

        public f(SessionRoomId.Room room, SessionRoomParticipantModel sessionRoomParticipantModel) {
            this.b = room;
            this.c = sessionRoomParticipantModel;
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
            return "SelectMoveAction(fromRoomId=" + this.b + ", participant=" + this.c + ')';
        }
    }

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class g implements d1j {
        public final SessionRoomId.Room b;
        public final SessionRoomParticipantModel c;

        public g(SessionRoomId.Room room, SessionRoomParticipantModel sessionRoomParticipantModel) {
            this.b = room;
            this.c = sessionRoomParticipantModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "SelectRoomForParticipant(fromRoomId=" + this.b + ", participant=" + this.c + ')';
        }
    }

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class h implements d1j {
        public final SessionRoomId b;

        public h(SessionRoomId sessionRoomId) {
            this.b = sessionRoomId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetActiveRoom(roomId=" + this.b + ')';
        }
    }

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class i implements d1j {
        public static final i b = new i();
    }

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class j implements d1j {
    }

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class k implements d1j {
        public final String b;
        public final SessionRoomId.Room c;
        public final boolean d;

        public k(String str, SessionRoomId.Room room, boolean z) {
            this.b = str;
            this.c = room;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.b, kVar.b) && epx.f(this.c, kVar.c) && this.d == kVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetLoading(roomName=");
            sb.append(this.b);
            sb.append(", roomId=");
            sb.append(this.c);
            sb.append(", roomIsActive=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class l implements d1j {
        public static final l b = new l();
    }

    /* compiled from: ConfigureRoomParticipantsPatch.kt */
    public static final class m implements d1j {
        public final String b;

        public m(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("SetSearchString(searchString="), this.b, ')');
        }
    }
}
