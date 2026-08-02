package xsna;

import com.vk.dto.user.RequestUserProfile;

/* compiled from: SocialGraphFriendsMvi.kt */
/* loaded from: classes5.dex */
public abstract class kdk0 implements kj50 {

    /* compiled from: SocialGraphFriendsMvi.kt */
    public static final class a extends kdk0 {
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

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AddUser(user=" + this.b + ')';
        }
    }

    /* compiled from: SocialGraphFriendsMvi.kt */
    public static final class b extends kdk0 {
        public static final b b = new b();
    }

    /* compiled from: SocialGraphFriendsMvi.kt */
    public static final class c extends kdk0 {
        public static final c b = new c();
    }

    /* compiled from: SocialGraphFriendsMvi.kt */
    public static final class d extends kdk0 {
        public static final d b = new d();
    }

    /* compiled from: SocialGraphFriendsMvi.kt */
    public static final class e extends kdk0 {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Search(query="), this.b, ')');
        }
    }
}
