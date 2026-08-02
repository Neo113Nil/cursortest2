package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: FollowersListSnackbarEvent.kt */
/* loaded from: classes15.dex */
public abstract class s3s {

    /* compiled from: FollowersListSnackbarEvent.kt */
    public static final class a extends s3s {
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
            return gp.b(new StringBuilder("FollowerDeleted(userId="), this.a, ')');
        }
    }

    /* compiled from: FollowersListSnackbarEvent.kt */
    public static final class b extends s3s {
        public final UserId a;

        public b(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("FriendAdded(userId="), this.a, ')');
        }
    }

    /* compiled from: FollowersListSnackbarEvent.kt */
    public static final class c extends s3s {
        public static final c a = new c();
    }
}
