package xsna;

import com.vk.dto.user.RequestUserProfile;

/* compiled from: SocialGraphFriendsMvi.kt */
/* loaded from: classes5.dex */
public abstract class wdk0 {

    /* compiled from: SocialGraphFriendsMvi.kt */
    public static final class a extends wdk0 {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("AddUserError(throwable="), this.a, ')');
        }
    }

    /* compiled from: SocialGraphFriendsMvi.kt */
    public static final class b extends wdk0 {
        public final RequestUserProfile a;

        public b(RequestUserProfile requestUserProfile) {
            this.a = requestUserProfile;
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
            return "FriendsStateChanged(user=" + this.a + ')';
        }
    }
}
