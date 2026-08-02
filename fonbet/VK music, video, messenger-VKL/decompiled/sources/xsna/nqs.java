package xsna;

import com.vk.dto.user.RequestUserProfile;

/* compiled from: FriendsListItem.kt */
/* loaded from: classes15.dex */
public interface nqs {

    /* compiled from: FriendsListItem.kt */
    public static final class a implements nqs {
        public final RequestUserProfile a;

        public a(RequestUserProfile requestUserProfile) {
            this.a = requestUserProfile;
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
            return "Friend(profile=" + this.a + ')';
        }
    }
}
