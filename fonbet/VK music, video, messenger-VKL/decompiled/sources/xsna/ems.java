package xsna;

import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;

/* compiled from: FriendsCatalogItemEvent.kt */
/* loaded from: classes16.dex */
public interface ems extends l3a {

    /* compiled from: FriendsCatalogItemEvent.kt */
    public static final class a implements ems {
        public final UIBlockProfile a;

        public a(UIBlockProfile uIBlockProfile) {
            this.a = uIBlockProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AddedToFriends(block=" + this.a + ')';
        }
    }

    /* compiled from: FriendsCatalogItemEvent.kt */
    public static final class b implements ems {
        public final UIBlockProfile a;

        public b(UIBlockProfile uIBlockProfile) {
            this.a = uIBlockProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CancelledFollowing(block=" + this.a + ')';
        }
    }

    /* compiled from: FriendsCatalogItemEvent.kt */
    public static final class c implements ems {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* compiled from: FriendsCatalogItemEvent.kt */
    public static final class d implements ems {
        public final UIBlockProfile a;

        public d(UIBlockProfile uIBlockProfile) {
            this.a = uIBlockProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RemovedFromFriendsToFollower(block=" + this.a + ')';
        }
    }

    /* compiled from: FriendsCatalogItemEvent.kt */
    public static final class e implements ems {
        public final UIBlockProfile a;

        public e(UIBlockProfile uIBlockProfile) {
            this.a = uIBlockProfile;
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
            return "StartedFollowing(block=" + this.a + ')';
        }
    }
}
