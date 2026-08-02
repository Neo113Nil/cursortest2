package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.l1j;

/* compiled from: ConfigureRoomParticipantsViewState.kt */
/* loaded from: classes7.dex */
public final class m1j implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;
    public final fi50 e;
    public final fi50 f;

    /* compiled from: ConfigureRoomParticipantsViewState.kt */
    public static final class a implements fm50<l1j.a> {
        public static final a a = new a();
    }

    /* compiled from: ConfigureRoomParticipantsViewState.kt */
    public static final class b implements fm50<l1j.b> {
        public static final b a = new b();
    }

    /* compiled from: ConfigureRoomParticipantsViewState.kt */
    public static final class c implements fm50<l1j.c> {
        public static final c a = new c();
    }

    /* compiled from: ConfigureRoomParticipantsViewState.kt */
    public static final class d implements fm50<l1j.d> {
        public final yzt0<String> a;

        public d(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Loading(name="), this.a, ')');
        }
    }

    /* compiled from: ConfigureRoomParticipantsViewState.kt */
    public static final class e implements fm50<l1j.f> {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<pvi0> c;
        public final yzt0<b> d;
        public final yzt0<a> e;

        /* compiled from: ConfigureRoomParticipantsViewState.kt */
        public interface a {

            /* compiled from: ConfigureRoomParticipantsViewState.kt */
            /* renamed from: xsna.m1j$e$a$a, reason: collision with other inner class name */
            public static final class C3317a implements a {
                public final int a;

                public C3317a(int i) {
                    this.a = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3317a) && this.a == ((C3317a) obj).a;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.a);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("Message(messageId="), this.a, ')');
                }
            }

            /* compiled from: ConfigureRoomParticipantsViewState.kt */
            public static final class b implements a {
                public static final b a = new b();
            }
        }

        /* compiled from: ConfigureRoomParticipantsViewState.kt */
        public interface b {

            /* compiled from: ConfigureRoomParticipantsViewState.kt */
            public static final class a implements b {
                public static final a a = new a();
            }

            /* compiled from: ConfigureRoomParticipantsViewState.kt */
            /* renamed from: xsna.m1j$e$b$b, reason: collision with other inner class name */
            public static final class C3318b implements b {
                public final SessionRoomId.Room a;
                public final SessionRoomParticipantModel b;

                public C3318b(SessionRoomId.Room room, SessionRoomParticipantModel sessionRoomParticipantModel) {
                    this.a = room;
                    this.b = sessionRoomParticipantModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3318b)) {
                        return false;
                    }
                    C3318b c3318b = (C3318b) obj;
                    return epx.f(this.a, c3318b.a) && epx.f(this.b, c3318b.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "SelectDestination(fromRoomId=" + this.a + ", participant=" + this.b + ')';
                }
            }

            /* compiled from: ConfigureRoomParticipantsViewState.kt */
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
                    return "SelectRoomAndMove(fromRoomId=" + this.a + ", participant=" + this.b + ')';
                }
            }
        }

        public e(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(roomIsActive=");
            sb.append(this.a);
            sb.append(", joinAvailable=");
            sb.append(this.b);
            sb.append(", participants=");
            sb.append(this.c);
            sb.append(", moveRequest=");
            sb.append(this.d);
            sb.append(", error=");
            return tr.c(sb, this.e, ')');
        }
    }

    /* compiled from: ConfigureRoomParticipantsViewState.kt */
    public static final class f implements fm50<l1j.g> {
        public static final f a = new f();
    }

    public m1j(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4, fi50 fi50Var5, fi50 fi50Var6) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
        this.e = fi50Var5;
        this.f = fi50Var6;
    }
}
