package xsna;

import com.vk.dto.user.RequestUserProfile;

/* compiled from: FollowersListViewItem.kt */
/* loaded from: classes15.dex */
public abstract class v3s implements hfz {

    /* compiled from: FollowersListViewItem.kt */
    public static final class a extends v3s {
        public final RequestUserProfile b;

        public a(RequestUserProfile requestUserProfile) {
            this.b = requestUserProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        @Override // xsna.v3s, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(Long.hashCode(this.b.c.b));
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Follower(profile=" + this.b + ')';
        }
    }

    /* compiled from: FollowersListViewItem.kt */
    public static final class b extends v3s {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("NewFollowersHeader(newFollowersCount="), this.b, ')');
        }
    }

    /* compiled from: FollowersListViewItem.kt */
    public static final class c extends v3s {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OtherFollowersHeader(otherFollowersCount="), this.b, ')');
        }
    }

    /* compiled from: FollowersListViewItem.kt */
    public static final class d extends v3s {
        public final Throwable b;

        public d(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("PageLoadingError(throwable="), this.b, ')');
        }
    }

    /* compiled from: FollowersListViewItem.kt */
    public static final class e extends v3s {
        public static final e b = new e();
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
