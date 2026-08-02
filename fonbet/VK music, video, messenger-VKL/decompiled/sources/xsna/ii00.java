package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ManagedGroupsEvent.kt */
/* loaded from: classes3.dex */
public interface ii00 {

    /* compiled from: ManagedGroupsEvent.kt */
    public static final class a implements ii00 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 474993963;
        }

        public final String toString() {
            return "CacheInvalidate";
        }
    }

    /* compiled from: ManagedGroupsEvent.kt */
    public static final class b implements ii00 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1593529618;
        }

        public final String toString() {
            return "CountersUpdate";
        }
    }

    /* compiled from: ManagedGroupsEvent.kt */
    public static final class c implements ii00 {
        public final Peer.Group a;
        public final int b;

        public c(Peer.Group group, int i) {
            this.a = group;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupCounterUpdate(group=");
            sb.append(this.a);
            sb.append(", unreadCount=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: ManagedGroupsEvent.kt */
    public static final class d implements ii00 {
        public final boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            dVar.getClass();
            return this.a == dVar.a;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("GroupMuteChange(group=null, isMuted="), this.a, ')');
        }
    }

    /* compiled from: ManagedGroupsEvent.kt */
    public static final class e implements ii00 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -19678819;
        }

        public final String toString() {
            return "Reset";
        }
    }
}
