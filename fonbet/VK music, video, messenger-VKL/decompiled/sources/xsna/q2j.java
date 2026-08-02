package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vk.voip.ui.sessionrooms.f;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: ConfigureSessionRoomsState.kt */
/* loaded from: classes7.dex */
public interface q2j extends km50 {

    /* compiled from: ConfigureSessionRoomsState.kt */
    public interface a {

        /* compiled from: ConfigureSessionRoomsState.kt */
        /* renamed from: xsna.q2j$a$a, reason: collision with other inner class name */
        public static final class C3544a implements a {
            public final int a;
            public final boolean b;
            public final boolean c;
            public final int d;

            public C3544a(int i, int i2, boolean z, boolean z2) {
                this.a = i;
                this.b = z;
                this.c = z2;
                this.d = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3544a)) {
                    return false;
                }
                C3544a c3544a = (C3544a) obj;
                return this.a == c3544a.a && this.b == c3544a.b && this.c == c3544a.c && this.d == c3544a.d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.d) + qoy.b(qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Create(roomsCount=");
                sb.append(this.a);
                sb.append(", assignRandomly=");
                sb.append(this.b);
                sb.append(", setTimeLimit=");
                sb.append(this.c);
                sb.append(", timeLimitMin=");
                return vu5.b(sb, this.d, ')');
            }
        }

        /* compiled from: ConfigureSessionRoomsState.kt */
        public static final class b implements a {
            public static final b a = new b();
        }
    }

    /* compiled from: ConfigureSessionRoomsState.kt */
    public static final class b implements q2j {
        public static final b b = new b();
    }

    /* compiled from: ConfigureSessionRoomsState.kt */
    public static final class c implements q2j {
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final int g;
        public final d h;

        public c(int i, int i2, boolean z, boolean z2, boolean z3, int i3, d dVar) {
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = i3;
            this.h = dVar;
        }

        public static c a(c cVar, int i, boolean z, boolean z2, boolean z3, int i2, d dVar, int i3) {
            int i4 = i;
            int i5 = cVar.b;
            if ((i3 & 2) != 0) {
                i4 = cVar.c;
            }
            if ((i3 & 4) != 0) {
                z = cVar.d;
            }
            if ((i3 & 8) != 0) {
                z2 = cVar.e;
            }
            if ((i3 & 16) != 0) {
                z3 = cVar.f;
            }
            if ((i3 & 32) != 0) {
                i2 = cVar.g;
            }
            if ((i3 & 64) != 0) {
                dVar = cVar.h;
            }
            d dVar2 = dVar;
            cVar.getClass();
            int i6 = i2;
            boolean z4 = z3;
            boolean z5 = z2;
            return new c(i5, i4, z, z5, z4, i6, dVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && epx.f(this.h, cVar.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + shy.a(this.g, qoy.b(qoy.b(qoy.b(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31);
        }

        public final String toString() {
            return "CreateRooms(mainCallParticipantCount=" + this.b + ", roomsCount=" + this.c + ", assignRandomly=" + this.d + ", isTimerPreset=" + this.e + ", setTimeLimit=" + this.f + ", timeLimitMin=" + this.g + ", error=" + this.h + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsState.kt */
    public interface d {

        /* compiled from: ConfigureSessionRoomsState.kt */
        public static final class a implements d {
            public static final a a = new a();
        }

        /* compiled from: ConfigureSessionRoomsState.kt */
        public static final class b implements d {
            public static final b a = new b();
        }

        /* compiled from: ConfigureSessionRoomsState.kt */
        public static final class c implements d {
            public static final c a = new c();
        }

        /* compiled from: ConfigureSessionRoomsState.kt */
        /* renamed from: xsna.q2j$d$d, reason: collision with other inner class name */
        public static final class C3545d implements d {
            public static final C3545d a = new C3545d();
        }

        /* compiled from: ConfigureSessionRoomsState.kt */
        public static final class e implements d {
            public static final e a = new e();
        }

        /* compiled from: ConfigureSessionRoomsState.kt */
        public static final class f implements d {
            public static final f a = new f();
        }

        /* compiled from: ConfigureSessionRoomsState.kt */
        public static final class g implements d {
            public final String a;

            public g(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("CanNotRemoveSessionRoom(roomName="), this.a, ')');
            }
        }

        /* compiled from: ConfigureSessionRoomsState.kt */
        public static final class h implements d {
            public final String a;

            public h(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("CanNotRenameSessionRoom(roomName="), this.a, ')');
            }
        }

        /* compiled from: ConfigureSessionRoomsState.kt */
        public static final class i implements d {
            public static final i a = new i();
        }

        /* compiled from: ConfigureSessionRoomsState.kt */
        public static final class j implements d {
            public final int a;

            public j(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.a == ((j) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(50) + shy.a(1, Integer.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                return h5s.c(this.a, ", minCount=1, maxCount=50)", new StringBuilder("RoomsCountIsOutOfBounds(count="));
            }
        }
    }

    /* compiled from: ConfigureSessionRoomsState.kt */
    public static final class e implements q2j {
        public static final e b = new e();
    }

    /* compiled from: ConfigureSessionRoomsState.kt */
    public static final class f implements q2j {
        public static final f b = new f();
    }

    /* compiled from: ConfigureSessionRoomsState.kt */
    public static final class g implements q2j {
        public final boolean b;
        public final a c;

        public g(boolean z, a aVar) {
            this.b = z;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && this.c.equals(gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "Loading(initial=" + this.b + ", autoCreateRooms=" + this.c + ')';
        }
    }

    /* compiled from: ConfigureSessionRoomsState.kt */
    public static final class h implements q2j {
        public final f.a b;
        public final int c;
        public final List<SessionRoomParticipantModel> d;
        public final List<lvi0> e;
        public final boolean f;
        public final a g;
        public final svi0 h;
        public final d i;

        /* compiled from: ConfigureSessionRoomsState.kt */
        public interface a {

            /* compiled from: ConfigureSessionRoomsState.kt */
            /* renamed from: xsna.q2j$h$a$a, reason: collision with other inner class name */
            public static final class C3546a implements a {
                public static final C3546a a = new C3546a();
            }

            /* compiled from: ConfigureSessionRoomsState.kt */
            public static final class b implements a {
                public static final b a = new b();
            }

            /* compiled from: ConfigureSessionRoomsState.kt */
            public static final class c implements a {
                public final ParticipantId a;

                public c(ParticipantId participantId) {
                    this.a = participantId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "AssignParticipant(participantId=" + this.a + ')';
                }
            }

            /* compiled from: ConfigureSessionRoomsState.kt */
            public static final class d implements a {
                public final ParticipantId a;
                public final SessionRoomId.Room b;

                public d(SessionRoomId.Room room, ParticipantId participantId) {
                    this.a = participantId;
                    this.b = room;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "AssignParticipantToRoom(participantId=" + this.a + ", roomId=" + this.b + ')';
                }
            }

            /* compiled from: ConfigureSessionRoomsState.kt */
            public static final class e implements a {
                public final SessionRoomId.Room a;

                public e(SessionRoomId.Room room) {
                    this.a = room;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "ChooseAction(roomId=" + this.a + ')';
                }
            }

            /* compiled from: ConfigureSessionRoomsState.kt */
            public static final class f implements a {
                public final SessionRoomId.Room a;

                public f(SessionRoomId.Room room) {
                    this.a = room;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "ConfigureParticipants(roomId=" + this.a + ')';
                }
            }

            /* compiled from: ConfigureSessionRoomsState.kt */
            public static final class g implements a {
                public static final g a = new g();
            }

            /* compiled from: ConfigureSessionRoomsState.kt */
            /* renamed from: xsna.q2j$h$a$h, reason: collision with other inner class name */
            public static final class C3547h implements a {
                public final SessionRoomId.Room a;

                public C3547h(SessionRoomId.Room room) {
                    this.a = room;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3547h) && epx.f(this.a, ((C3547h) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Rename(roomId=" + this.a + ')';
                }
            }
        }

        public h(f.a aVar, int i, List<SessionRoomParticipantModel> list, List<lvi0> list2, boolean z, a aVar2, svi0 svi0Var, d dVar) {
            this.b = aVar;
            this.c = i;
            this.d = list;
            this.e = list2;
            this.f = z;
            this.g = aVar2;
            this.h = svi0Var;
            this.i = dVar;
        }

        public static h a(h hVar, a aVar, d dVar, int i) {
            f.a aVar2 = hVar.b;
            int i2 = hVar.c;
            List<SessionRoomParticipantModel> list = hVar.d;
            List<lvi0> list2 = hVar.e;
            boolean z = hVar.f;
            if ((i & 32) != 0) {
                aVar = hVar.g;
            }
            a aVar3 = aVar;
            svi0 svi0Var = hVar.h;
            if ((i & 128) != 0) {
                dVar = hVar.i;
            }
            hVar.getClass();
            return new h(aVar2, i2, list, list2, z, aVar3, svi0Var, dVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && this.c == hVar.c && epx.f(this.d, hVar.d) && epx.f(this.e, hVar.e) && this.f == hVar.f && epx.f(this.g, hVar.g) && epx.f(this.h, hVar.h) && epx.f(this.i, hVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + qoy.b(fw3.a(fw3.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31);
        }

        public final String toString() {
            return "RoomsReady(activeRoom=" + this.b + ", mainCallParticipantCount=" + this.c + ", mainCallParticipants=" + this.d + ", rooms=" + this.e + ", roomsAreActive=" + this.f + ", roomEditState=" + this.g + ", countdownTimerState=" + this.h + ", error=" + this.i + ')';
        }
    }
}
