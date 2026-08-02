package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: FriendsReviewCountEvent.kt */
/* loaded from: classes18.dex */
public abstract class sss {

    /* compiled from: FriendsReviewCountEvent.kt */
    public static final class a extends sss {
        public static final a a = new a();
    }

    /* compiled from: FriendsReviewCountEvent.kt */
    public static final class b extends sss {
        public final UserId a;
        public final int b;

        public b(UserId userId, int i) {
            this.a = userId;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToFriendReviewItem(communityId=");
            sb.append(this.a);
            sb.append(", reviewId=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: FriendsReviewCountEvent.kt */
    public static final class c extends sss {
    }
}
