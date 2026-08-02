package xsna;

/* compiled from: FriendsRequestsCellViewType.kt */
/* loaded from: classes16.dex */
public interface hss {

    /* compiled from: FriendsRequestsCellViewType.kt */
    public static final class a implements hss {
        public final boolean a;
        public final boolean b;

        public a() {
            this(3);
        }

        @Override // xsna.hss
        public final boolean I() {
            return this.b;
        }

        @Override // xsna.hss
        public final boolean a() {
            return this.a;
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
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AddFriendSuggest(isRecommendation=");
            sb.append(this.a);
            sb.append(", isDefault=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public /* synthetic */ a(int i) {
            this((i & 1) == 0, (i & 2) == 0);
        }

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: FriendsRequestsCellViewType.kt */
    public static final class b implements hss {
        public final boolean a;

        public b() {
            this(false);
        }

        @Override // xsna.hss
        public final boolean I() {
            return false;
        }

        @Override // xsna.hss
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("FollowSuggest(isRecommendation="), this.a, ')');
        }

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: FriendsRequestsCellViewType.kt */
    public static final class c implements hss {
        public static final c a = new c();

        @Override // xsna.hss
        public final boolean I() {
            return false;
        }

        @Override // xsna.hss
        public final boolean a() {
            return false;
        }
    }

    default boolean I() {
        return false;
    }

    default boolean a() {
        return false;
    }
}
