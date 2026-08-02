package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipsPlaylistEventsBus.kt */
/* loaded from: classes16.dex */
public interface kqe {

    /* compiled from: ClipsPlaylistEventsBus.kt */
    public static final class a implements kqe {
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
            return gp.b(new StringBuilder("FullReload(ownerId="), this.a, ')');
        }
    }
}
