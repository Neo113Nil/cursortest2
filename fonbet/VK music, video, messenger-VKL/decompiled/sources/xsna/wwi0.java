package xsna;

import java.util.Collection;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: SessionRoomsFeatureState.kt */
/* loaded from: classes7.dex */
public final class wwi0 implements km50 {
    public final c b;
    public final Collection<c.C3962c> c;
    public final boolean d;
    public final b e;
    public final a f;
    public final b g;

    /* compiled from: SessionRoomsFeatureState.kt */
    /* loaded from: classes11.dex */
    public static final class a {
        public final long a;
        public final boolean b;
        public final boolean c;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CountDownTimer(time=");
            sb.append(this.a);
            sb.append(", isVisible=");
            sb.append(this.b);
            sb.append(", isFinishState=");
            return defpackage.q0.a(sb, this.c, ')');
        }

        public /* synthetic */ a(int i) {
            this(0L, false, false);
        }

        public a(long j, boolean z, boolean z2) {
            this.a = j;
            this.b = z;
            this.c = z2;
        }
    }

    /* compiled from: SessionRoomsFeatureState.kt */
    public interface b {

        /* compiled from: SessionRoomsFeatureState.kt */
        public static final class a implements b {
            public static final a a = new a();
        }

        /* compiled from: SessionRoomsFeatureState.kt */
        /* renamed from: xsna.wwi0$b$b, reason: collision with other inner class name */
        public static final class C3961b implements b {
            public final c.C3962c a;
            public final boolean b;

            public C3961b(c.C3962c c3962c, boolean z) {
                this.a = c3962c;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3961b)) {
                    return false;
                }
                C3961b c3961b = (C3961b) obj;
                return epx.f(this.a, c3961b.a) && this.b == c3961b.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("InRoom(activeRoom=");
                sb.append(this.a);
                sb.append(", notifyOnUpdate=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: SessionRoomsFeatureState.kt */
        public static final class c implements b {
            public final c a;
            public final c b;

            public c(c cVar, c cVar2) {
                this.a = cVar;
                this.b = cVar2;
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
                return "Transition(from=" + this.a + ", to=" + this.b + ')';
            }
        }
    }

    /* compiled from: SessionRoomsFeatureState.kt */
    public interface c {

        /* compiled from: SessionRoomsFeatureState.kt */
        public static final class a implements c {
            public static final a a = new a();
        }

        /* compiled from: SessionRoomsFeatureState.kt */
        public static final class b implements c {
            public static final b a = new b();
        }

        /* compiled from: SessionRoomsFeatureState.kt */
        /* renamed from: xsna.wwi0$c$c, reason: collision with other inner class name */
        public static final class C3962c implements c {
            public final SessionRoomId.Room a;
            public final String b;
            public final boolean c;
            public final int d;

            public C3962c(SessionRoomId.Room room, String str, boolean z, int i) {
                this.a = room;
                this.b = str;
                this.c = z;
                this.d = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3962c)) {
                    return false;
                }
                C3962c c3962c = (C3962c) obj;
                return epx.f(this.a, c3962c.a) && epx.f(this.b, c3962c.b) && this.c == c3962c.c && this.d == c3962c.d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.d) + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ParticularRoom(id=");
                sb.append(this.a);
                sb.append(", name=");
                sb.append(this.b);
                sb.append(", isActive=");
                sb.append(this.c);
                sb.append(", participantCount=");
                return vu5.b(sb, this.d, ')');
            }
        }
    }

    public wwi0() {
        this(0);
    }

    public static wwi0 a(wwi0 wwi0Var, c cVar, Collection collection, boolean z, b bVar, a aVar, b bVar2, int i) {
        if ((i & 1) != 0) {
            cVar = wwi0Var.b;
        }
        c cVar2 = cVar;
        if ((i & 2) != 0) {
            collection = wwi0Var.c;
        }
        Collection collection2 = collection;
        if ((i & 4) != 0) {
            z = wwi0Var.d;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            bVar = wwi0Var.e;
        }
        b bVar3 = bVar;
        if ((i & 16) != 0) {
            aVar = wwi0Var.f;
        }
        a aVar2 = aVar;
        if ((i & 32) != 0) {
            bVar2 = wwi0Var.g;
        }
        wwi0Var.getClass();
        return new wwi0(cVar2, collection2, z2, bVar3, aVar2, bVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwi0)) {
            return false;
        }
        wwi0 wwi0Var = (wwi0) obj;
        return epx.f(this.b, wwi0Var.b) && epx.f(this.c, wwi0Var.c) && this.d == wwi0Var.d && epx.f(this.e, wwi0Var.e) && epx.f(this.f, wwi0Var.f) && epx.f(this.g, wwi0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + qoy.b(s3j0.a(this.b.hashCode() * 31, this.c, 31), 31, this.d)) * 31)) * 31);
    }

    public final String toString() {
        return "SessionRoomsFeatureState(proposedRoom=" + this.b + ", rooms=" + this.c + ", isAdmin=" + this.d + ", presence=" + this.e + ", countdownTimer=" + this.f + ", lastActiveRoom=" + this.g + ')';
    }

    public wwi0(c cVar, Collection<c.C3962c> collection, boolean z, b bVar, a aVar, b bVar2) {
        this.b = cVar;
        this.c = collection;
        this.d = z;
        this.e = bVar;
        this.f = aVar;
        this.g = bVar2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wwi0(int i) {
        this(r1, r2, false, r4, r5, r4);
        EmptyList emptyList = EmptyList.b;
        a aVar = new a(0);
        c.b bVar = c.b.a;
        b.a aVar2 = b.a.a;
    }
}
