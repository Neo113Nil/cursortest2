package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: FriendsRequestsCellEvent.kt */
/* loaded from: classes16.dex */
public abstract class gss {

    /* compiled from: FriendsRequestsCellEvent.kt */
    public static final class a extends gss {
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
            return gp.b(new StringBuilder("FollowerDeleted(uid="), this.a, ')');
        }
    }

    /* compiled from: FriendsRequestsCellEvent.kt */
    public static final class b extends gss {
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
            return gp.b(new StringBuilder("FriendAdded(uid="), this.a, ')');
        }
    }

    /* compiled from: FriendsRequestsCellEvent.kt */
    public static final class c extends gss {
        public final UserId a;

        public c(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("FriendDeleted(uid="), this.a, ')');
        }
    }

    /* compiled from: FriendsRequestsCellEvent.kt */
    public static final class d extends gss {
        public final UserId a;

        public d(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("StartedFollowing(uid="), this.a, ')');
        }
    }
}
