package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: LiveSpectatorsAction.kt */
/* loaded from: classes3.dex */
public interface nlz extends kj50 {

    /* compiled from: LiveSpectatorsAction.kt */
    public static final class a implements nlz {
        public static final a b = new a();
    }

    /* compiled from: LiveSpectatorsAction.kt */
    public static final class b implements nlz {
        public final UserId b;

        public b(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("SpectatorClicked(userId="), this.b, ')');
        }
    }
}
