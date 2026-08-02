package xsna;

/* compiled from: ManageCommunitiesNotificationsAction.kt */
/* loaded from: classes5.dex */
public interface qg00 extends kj50 {

    /* compiled from: ManageCommunitiesNotificationsAction.kt */
    public static final class a implements qg00 {
        public static final a b = new a();
    }

    /* compiled from: ManageCommunitiesNotificationsAction.kt */
    public static final class b implements qg00 {
        public static final b b = new b();
    }

    /* compiled from: ManageCommunitiesNotificationsAction.kt */
    public static final class c implements qg00 {
        public final long b;
        public final String c;

        public c(long j, String str) {
            this.b = j;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeleteCommunityClicked(id=");
            sb.append(this.b);
            sb.append(", name=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ManageCommunitiesNotificationsAction.kt */
    public static final class d implements qg00 {
        public final long b;

        public d(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("DeleteCommunityConfirmed(id="));
        }
    }

    /* compiled from: ManageCommunitiesNotificationsAction.kt */
    public static final class e implements qg00 {
        public final long b;
        public final String c;

        public e(long j, String str) {
            this.b = j;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EditCommunity(id=");
            sb.append(this.b);
            sb.append(", name=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ManageCommunitiesNotificationsAction.kt */
    public static final class f implements qg00 {
        public static final f b = new f();
    }

    /* compiled from: ManageCommunitiesNotificationsAction.kt */
    public static final class g implements qg00 {
        public static final g b = new g();
    }
}
