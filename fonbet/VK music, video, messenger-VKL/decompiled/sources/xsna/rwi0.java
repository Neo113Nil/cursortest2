package xsna;

import com.vk.voip.dto.RecordType;
import com.vk.voip.ui.sessionrooms.f;
import xsna.wwi0;

/* compiled from: SessionRoomsFeatureNotification.kt */
/* loaded from: classes7.dex */
public interface rwi0 {

    /* compiled from: SessionRoomsFeatureNotification.kt */
    public interface a extends rwi0 {

        /* compiled from: SessionRoomsFeatureNotification.kt */
        /* renamed from: xsna.rwi0$a$a, reason: collision with other inner class name */
        public static final class C3639a implements a {
            public final String a;
            public final f.a.b b;
            public final boolean c;

            public C3639a(String str, f.a.b bVar, boolean z) {
                this.a = str;
                this.b = bVar;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3639a)) {
                    return false;
                }
                C3639a c3639a = (C3639a) obj;
                return epx.f(this.a, c3639a.a) && epx.f(this.b, c3639a.b) && this.c == c3639a.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AssistanceRequested(participantName=");
                sb.append(this.a);
                sb.append(", room=");
                sb.append(this.b);
                sb.append(", isCurrentRoom=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class b implements a {
            public final f540 a;

            public b(f540 f540Var) {
                this.a = f540Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "CountdownTimerEnded(onCloseRooms=" + this.a + ')';
            }
        }

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class c implements a {
            public static final c a = new c();
        }

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class d implements a {
            public static final d a = new d();
        }

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class e implements a {
            public static final e a = new e();
        }

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class f implements a {
            public static final f a = new f();
        }
    }

    /* compiled from: SessionRoomsFeatureNotification.kt */
    public interface b extends rwi0 {

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class a implements b {
            public final boolean a;
            public final RecordType b;

            public a(boolean z, RecordType recordType) {
                this.a = z;
                this.b = recordType;
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
                return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "OnSessionRoomsClosed(isShowClosedDialog=" + this.a + ", recordType=" + this.b + ')';
            }
        }
    }

    /* compiled from: SessionRoomsFeatureNotification.kt */
    public interface c extends rwi0 {

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class a implements c {
            public static final a a = new a();
        }

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class b implements c {
            public static final b a = new b();
        }

        /* compiled from: SessionRoomsFeatureNotification.kt */
        /* renamed from: xsna.rwi0$c$c, reason: collision with other inner class name */
        public static final class C3640c implements c {
            public static final C3640c a = new C3640c();
        }

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class d implements c {
            public static final d a = new d();
        }

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class e implements c {
            public static final e a = new e();
        }

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class f implements c {
            public final String a;

            public f(String str) {
                this.a = str;
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
                return ho8.a(new StringBuilder("ParticipantMovedToRoom(roomName="), this.a, ')');
            }
        }

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class g implements c {
            public final wwi0.c.C3962c a;

            public g(wwi0.c.C3962c c3962c) {
                this.a = c3962c;
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
                return "SessionRoomJoined(room=" + this.a + ')';
            }
        }

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class h implements c {
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
                return ho8.a(new StringBuilder("ShowAdminMessage(text="), this.a, ')');
            }
        }
    }

    /* compiled from: SessionRoomsFeatureNotification.kt */
    public interface d extends rwi0 {

        /* compiled from: SessionRoomsFeatureNotification.kt */
        public static final class a implements d {
            public static final a a = new a();
        }
    }
}
