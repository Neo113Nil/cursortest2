package xsna;

import com.vk.dto.user.RequestUserProfile;

/* compiled from: FriendsAndFollowersListViewItem.kt */
/* loaded from: classes15.dex */
public interface mks extends hfz {

    /* compiled from: FriendsAndFollowersListViewItem.kt */
    public static final class a implements mks {
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

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(Long.hashCode(this.b.c.b));
        }

        @Override // xsna.mks
        public final RequestUserProfile getProfile() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Regular(profile=" + this.b + ')';
        }
    }

    /* compiled from: FriendsAndFollowersListViewItem.kt */
    public static final class b implements mks {
        public final RequestUserProfile b;

        public b(RequestUserProfile requestUserProfile) {
            this.b = requestUserProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(Long.hashCode(this.b.c.b));
        }

        @Override // xsna.mks
        public final RequestUserProfile getProfile() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "WithFollowButton(profile=" + this.b + ')';
        }
    }

    RequestUserProfile getProfile();
}
