package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import java.util.List;
import xsna.q2j;

/* compiled from: ConfigureSessionRoomsViewState.kt */
/* loaded from: classes7.dex */
public final class r2j implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;
    public final fi50 e;
    public final fi50 f;

    /* compiled from: ConfigureSessionRoomsViewState.kt */
    public static final class a implements fm50<q2j.b> {
        public static final a a = new a();
    }

    /* compiled from: ConfigureSessionRoomsViewState.kt */
    public static final class b implements fm50<q2j.c> {
        public final yzt0<Integer> a;
        public final yzt0<Integer> b;
        public final yzt0<Boolean> c;
        public final yzt0<Boolean> d;
        public final yzt0<Integer> e;
        public final yzt0<Boolean> f;
        public final yzt0<c> g;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CreateRooms(participantsPerRoom=");
            sb.append(this.a);
            sb.append(", roomsCount=");
            sb.append(this.b);
            sb.append(", assignRandomly=");
            sb.append(this.c);
            sb.append(", setTimeLimit=");
            sb.append(this.d);
            sb.append(", timeLimit=");
            sb.append(this.e);
            sb.append(", canCreateRooms=");
            sb.append(this.f);
            sb.append(", error=");
            return tr.c(sb, this.g, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsViewState.kt */
    public interface c {

        /* compiled from: ConfigureSessionRoomsViewState.kt */
        public static final class a implements c {
            public final int a;

            public a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("CommonMessage(messageId="), this.a, ')');
            }
        }

        /* compiled from: ConfigureSessionRoomsViewState.kt */
        public static final class b implements c {
            public static final b a = new b();
        }

        /* compiled from: ConfigureSessionRoomsViewState.kt */
        /* renamed from: xsna.r2j$c$c, reason: collision with other inner class name */
        public static final class C3594c implements c {
            public final int a;

            public C3594c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3594c) && this.a == ((C3594c) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(50) + shy.a(1, Integer.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                return h5s.c(this.a, ", minCount=1, maxCount=50)", new StringBuilder("RoomCountIsOutOfBounds(count="));
            }
        }

        /* compiled from: ConfigureSessionRoomsViewState.kt */
        public static final class d implements c {
            public final int a;
            public final String b;

            public d(int i, String str) {
                this.a = i;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a == dVar.a && epx.f(this.b, dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RoomMessage(messageId=");
                sb.append(this.a);
                sb.append(", roomName=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: ConfigureSessionRoomsViewState.kt */
    public static final class d implements fm50<q2j.e> {
        public static final d a = new d();
    }

    /* compiled from: ConfigureSessionRoomsViewState.kt */
    public static final class e implements fm50<q2j.f> {
        public static final e a = new e();
    }

    /* compiled from: ConfigureSessionRoomsViewState.kt */
    public static final class f implements fm50<q2j.g> {
        public final yzt0<q2j.a> a;

        public f(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Loading(autoCreateRooms="), this.a, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsViewState.kt */
    public static final class g implements fm50<q2j.h> {
        public final yzt0<q2j.h.a> a;
        public final yzt0<h> b;
        public final yzt0<c> c;

        public g(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoomsReady(editState=");
            sb.append(this.a);
            sb.append(", readyState=");
            sb.append(this.b);
            sb.append(", error=");
            return tr.c(sb, this.c, ')');
        }
    }

    /* compiled from: ConfigureSessionRoomsViewState.kt */
    public static final class h {
        public final int a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final i f;
        public final List<lvi0> g;

        public h(int i, boolean z, boolean z2, boolean z3, boolean z4, i iVar, List<lvi0> list) {
            this.a = i;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = iVar;
            this.g = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && this.b == hVar.b && this.c == hVar.c && this.d == hVar.d && this.e == hVar.e && epx.f(this.f, hVar.f) && epx.f(this.g, hVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoomsReadyState(title=");
            sb.append(this.a);
            sb.append(", canModifyRooms=");
            sb.append(this.b);
            sb.append(", roomsUpdateInProgress=");
            sb.append(this.c);
            sb.append(", canOpenRooms=");
            sb.append(this.d);
            sb.append(", canCloseRooms=");
            sb.append(this.e);
            sb.append(", participants=");
            sb.append(this.f);
            sb.append(", rooms=");
            return ms9.a(')', sb, this.g);
        }
    }

    /* compiled from: ConfigureSessionRoomsViewState.kt */
    public interface i {

        /* compiled from: ConfigureSessionRoomsViewState.kt */
        public static final class a implements i {
            public final int a;
            public final boolean b;

            public a(int i, boolean z) {
                this.a = i;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ByCount(count=");
                sb.append(this.a);
                sb.append(", assignmentInProgress=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: ConfigureSessionRoomsViewState.kt */
        public static final class b implements i {
            public final List<SessionRoomParticipantModel> a;

            public b(List<SessionRoomParticipantModel> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("ByList(participants="), this.a);
            }
        }

        /* compiled from: ConfigureSessionRoomsViewState.kt */
        public static final class c implements i {
            public static final c a = new c();
        }
    }

    public r2j(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4, fi50 fi50Var5, fi50 fi50Var6) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
        this.e = fi50Var5;
        this.f = fi50Var6;
    }
}
