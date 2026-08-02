package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: LiveSpectatorsNavigationEvent.kt */
/* loaded from: classes3.dex */
public abstract class slz {

    /* compiled from: LiveSpectatorsNavigationEvent.kt */
    public static final class a extends slz {
        public static final a a = new a();
    }

    /* compiled from: LiveSpectatorsNavigationEvent.kt */
    public static final class b extends slz {
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
            return gp.b(new StringBuilder("OpenUserProfile(userId="), this.a, ')');
        }
    }
}
