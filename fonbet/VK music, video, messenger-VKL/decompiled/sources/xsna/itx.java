package xsna;

import com.vk.dto.user.RequestUserProfile;

/* compiled from: Item.kt */
/* loaded from: classes5.dex */
public interface itx {

    /* compiled from: Item.kt */
    public static final class a implements itx {
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
            return "Profile(requestUserProfile=" + this.a + ')';
        }
    }

    /* compiled from: Item.kt */
    public static final class b implements itx {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1632006681;
        }

        public final String toString() {
            return "Title";
        }
    }
}
