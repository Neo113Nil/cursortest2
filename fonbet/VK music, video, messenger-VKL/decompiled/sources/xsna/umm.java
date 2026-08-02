package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogWriteRestrictionLpEvent.kt */
/* loaded from: classes2.dex */
public final class umm implements e900 {
    public final a a;
    public final Peer b;
    public final Peer c;

    /* compiled from: DialogWriteRestrictionLpEvent.kt */
    public static abstract class a {

        /* compiled from: DialogWriteRestrictionLpEvent.kt */
        /* renamed from: xsna.umm$a$a, reason: collision with other inner class name */
        public static final class C3809a extends a {
            public static final C3809a a = new C3809a();
        }

        /* compiled from: DialogWriteRestrictionLpEvent.kt */
        public static final class b extends a {
            public final long a;

            public b(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("RestrictedTemporarily(beforeTime="));
            }
        }

        /* compiled from: DialogWriteRestrictionLpEvent.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    public umm(a aVar, Peer peer, Peer peer2) {
        this.a = aVar;
        this.b = peer;
        this.c = peer2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umm)) {
            return false;
        }
        umm ummVar = (umm) obj;
        return epx.f(this.a, ummVar.a) && epx.f(this.b, ummVar.b) && epx.f(this.c, ummVar.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c.b) + bh10.a(this.a.hashCode() * 31, 31, this.b.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogWriteRestrictionLpEvent(subtype=");
        sb.append(this.a);
        sb.append(", dialog=");
        sb.append(this.b);
        sb.append(", member=");
        return eq.a(sb, this.c, ')');
    }
}
