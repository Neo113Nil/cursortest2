package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: FriendsCleanupAction.kt */
/* loaded from: classes15.dex */
public interface mms extends kj50 {

    /* compiled from: FriendsCleanupAction.kt */
    public static final class a implements mms {
        public static final a b = new a();
    }

    /* compiled from: FriendsCleanupAction.kt */
    public static final class b implements mms {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("DeleteAllSuggestedFriends(keepInFollowers="), this.b, ')');
        }
    }

    /* compiled from: FriendsCleanupAction.kt */
    public static final class c implements mms {
        public static final c b = new c();
    }

    /* compiled from: FriendsCleanupAction.kt */
    public static final class d implements mms {
        public final UserId b;
        public final boolean c;

        public d(UserId userId, boolean z) {
            this.b = userId;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeleteFriend(userId=");
            sb.append(this.b);
            sb.append(", keepInFollowers=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: FriendsCleanupAction.kt */
    public static final class e implements mms {
        public static final e b = new e();
    }

    /* compiled from: FriendsCleanupAction.kt */
    public interface f extends mms {

        /* compiled from: FriendsCleanupAction.kt */
        public static final class a implements f {
            public static final a b = new a();
        }

        /* compiled from: FriendsCleanupAction.kt */
        public static final class b implements f {
            public static final b b = new b();
        }
    }

    /* compiled from: FriendsCleanupAction.kt */
    public interface g extends mms {

        /* compiled from: FriendsCleanupAction.kt */
        public static final class a implements g {
        }

        /* compiled from: FriendsCleanupAction.kt */
        public static final class b implements g {
            public static final b b = new b();
        }
    }
}
