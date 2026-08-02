package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: RxUserFriendsEventsBus.kt */
/* loaded from: classes6.dex */
public abstract class dkq0 {

    /* compiled from: RxUserFriendsEventsBus.kt */
    public static final class a extends dkq0 {
        public final UserId a;

        public a(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("AddedToFriends(uid="), this.a, ')');
        }
    }

    /* compiled from: RxUserFriendsEventsBus.kt */
    public static final class b extends dkq0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "DeletedFromFollowers(uid=null)";
        }
    }
}
