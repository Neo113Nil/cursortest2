package xsna;

import com.vk.dto.user.UserProfile;
import java.util.List;

/* compiled from: LiveSpectatorsState.kt */
/* loaded from: classes3.dex */
public abstract class bmz implements km50 {

    /* compiled from: LiveSpectatorsState.kt */
    public static final class a extends bmz {
        public final List<UserProfile> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends UserProfile> list) {
            this.b = list;
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
            return ms9.a(')', new StringBuilder("Data(liveSpectators="), this.b);
        }
    }

    /* compiled from: LiveSpectatorsState.kt */
    public static final class b extends bmz {
        public static final b b = new b();
    }

    /* compiled from: LiveSpectatorsState.kt */
    public static final class c extends bmz {
        public static final c b = new c();
    }
}
