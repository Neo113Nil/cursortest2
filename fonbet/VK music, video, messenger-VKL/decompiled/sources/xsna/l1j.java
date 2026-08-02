package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: ConfigureRoomParticipantsState.kt */
/* loaded from: classes7.dex */
public interface l1j extends km50 {

    /* compiled from: ConfigureRoomParticipantsState.kt */
    public static final class a implements l1j {
        public static final a b = new a();
    }

    /* compiled from: ConfigureRoomParticipantsState.kt */
    public static final class b implements l1j {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Failed(roomId=null, roomName=null)";
        }
    }

    /* compiled from: ConfigureRoomParticipantsState.kt */
    public static final class c implements l1j {
        public static final c b = new c();
    }

    /* compiled from: ConfigureRoomParticipantsState.kt */
    public static final class d implements l1j {
        public final SessionRoomId.Room b;
        public final String c;
        public final boolean d;

        public d(String str, SessionRoomId.Room room, boolean z) {
            this.b = room;
            this.c = str;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(roomId=");
            sb.append(this.b);
            sb.append(", roomName=");
            sb.append(this.c);
            sb.append(", roomIsActive=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ConfigureRoomParticipantsState.kt */
    public static final class e {
        public final LinkedHashMap a;
        public final LinkedHashSet b;
        public final LinkedHashSet c;
        public final Set<ParticipantId> d;
        public final Set<ParticipantId> e;

        public e(LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, Set set, Set set2) {
            this.a = linkedHashMap;
            this.b = linkedHashSet;
            this.c = linkedHashSet2;
            this.d = set;
            this.e = set2;
        }

        public static e a(e eVar, Set set, Set set2, int i) {
            LinkedHashMap linkedHashMap = eVar.a;
            LinkedHashSet linkedHashSet = eVar.b;
            LinkedHashSet linkedHashSet2 = eVar.c;
            if ((i & 8) != 0) {
                set = eVar.d;
            }
            Set set3 = set;
            if ((i & 16) != 0) {
                set2 = eVar.e;
            }
            eVar.getClass();
            return new e(linkedHashMap, linkedHashSet, linkedHashSet2, set3, set2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c.equals(eVar.c) && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + fw3.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Participants(allParticipants=");
            sb.append(this.a);
            sb.append(", roomParticipants=");
            sb.append(this.b);
            sb.append(", callParticipants=");
            sb.append(this.c);
            sb.append(", assignedToRoom=");
            sb.append(this.d);
            sb.append(", assignedToCall=");
            return ur.c(sb, this.e, ')');
        }
    }

    /* compiled from: ConfigureRoomParticipantsState.kt */
    public static final class f implements l1j {
        public final SessionRoomId.Room b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final String f;
        public final e g;
        public final b h;
        public final a i;

        /* compiled from: ConfigureRoomParticipantsState.kt */
        public interface a {

            /* compiled from: ConfigureRoomParticipantsState.kt */
            /* renamed from: xsna.l1j$f$a$a, reason: collision with other inner class name */
            public static final class C3225a implements a {
                public static final C3225a a = new C3225a();
            }

            /* compiled from: ConfigureRoomParticipantsState.kt */
            public static final class b implements a {
                public static final b a = new b();
            }

            /* compiled from: ConfigureRoomParticipantsState.kt */
            public static final class c implements a {
                public static final c a = new c();
            }
        }

        /* compiled from: ConfigureRoomParticipantsState.kt */
        public interface b {

            /* compiled from: ConfigureRoomParticipantsState.kt */
            public static final class a implements b {
                public static final a a = new a();
            }

            /* compiled from: ConfigureRoomParticipantsState.kt */
            /* renamed from: xsna.l1j$f$b$b, reason: collision with other inner class name */
            public static final class C3226b implements b {
                public final SessionRoomId.Room a;
                public final SessionRoomParticipantModel b;

                public C3226b(SessionRoomId.Room room, SessionRoomParticipantModel sessionRoomParticipantModel) {
                    this.a = room;
                    this.b = sessionRoomParticipantModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3226b)) {
                        return false;
                    }
                    C3226b c3226b = (C3226b) obj;
                    return epx.f(this.a, c3226b.a) && epx.f(this.b, c3226b.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "SelectDestination(roomId=" + this.a + ", participant=" + this.b + ')';
                }
            }

            /* compiled from: ConfigureRoomParticipantsState.kt */
            public static final class c implements b {
                public final SessionRoomId.Room a;
                public final SessionRoomParticipantModel b;

                public c(SessionRoomId.Room room, SessionRoomParticipantModel sessionRoomParticipantModel) {
                    this.a = room;
                    this.b = sessionRoomParticipantModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "SelectRoomAndMove(roomId=" + this.a + ", participant=" + this.b + ')';
                }
            }
        }

        public f(SessionRoomId.Room room, String str, boolean z, boolean z2, String str2, e eVar, b bVar, a aVar) {
            this.b = room;
            this.c = str;
            this.d = z;
            this.e = z2;
            this.f = str2;
            this.g = eVar;
            this.h = bVar;
            this.i = aVar;
        }

        public static f a(f fVar, boolean z, String str, e eVar, b bVar, a aVar, int i) {
            SessionRoomId.Room room = fVar.b;
            String str2 = fVar.c;
            boolean z2 = fVar.d;
            if ((i & 8) != 0) {
                z = fVar.e;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                str = fVar.f;
            }
            String str3 = str;
            if ((i & 32) != 0) {
                eVar = fVar.g;
            }
            e eVar2 = eVar;
            if ((i & 64) != 0) {
                bVar = fVar.h;
            }
            b bVar2 = bVar;
            if ((i & 128) != 0) {
                aVar = fVar.i;
            }
            fVar.getClass();
            return new f(room, str2, z2, z3, str3, eVar2, bVar2, aVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && this.d == fVar.d && this.e == fVar.e && epx.f(this.f, fVar.f) && epx.f(this.g, fVar.g) && epx.f(this.h, fVar.h) && epx.f(this.i, fVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + urd0.a(qoy.b(qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31);
        }

        public final String toString() {
            return "Ready(roomId=" + this.b + ", roomName=" + this.c + ", roomIsActive=" + this.d + ", joinAvailable=" + this.e + ", searchString=" + this.f + ", participants=" + this.g + ", moveState=" + this.h + ", error=" + this.i + ')';
        }
    }

    /* compiled from: ConfigureRoomParticipantsState.kt */
    public static final class g implements l1j {
        public final SessionRoomId.Room b;

        public g(SessionRoomId.Room room) {
            this.b = room;
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
            return "SavingChanges(roomId=" + this.b + ')';
        }
    }
}
