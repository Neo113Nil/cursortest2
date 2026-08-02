package xsna;

/* compiled from: ManageCommunitiesNotificationsSideEffect.kt */
/* loaded from: classes5.dex */
public interface ch00 {

    /* compiled from: ManageCommunitiesNotificationsSideEffect.kt */
    public static final class a implements ch00 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1069375622;
        }

        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ManageCommunitiesNotificationsSideEffect.kt */
    public static final class b implements ch00 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1771941317;
        }

        public final String toString() {
            return "OpenAddCommunity";
        }
    }

    /* compiled from: ManageCommunitiesNotificationsSideEffect.kt */
    public static final class c implements ch00 {
        public final long a;
        public final String b;

        public c(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenEditCommunity(id=");
            sb.append(this.a);
            sb.append(", name=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: ManageCommunitiesNotificationsSideEffect.kt */
    public static final class d implements ch00 {
        public final long a;
        public final String b;

        public d(long j, String str) {
            this.a = j;
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
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowDeleteCommunityDialog(id=");
            sb.append(this.a);
            sb.append(", name=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: ManageCommunitiesNotificationsSideEffect.kt */
    public static final class e implements ch00 {
        public final Throwable a;

        public e(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("ShowDeleteCommunityError(error="), this.a, ')');
        }
    }
}
