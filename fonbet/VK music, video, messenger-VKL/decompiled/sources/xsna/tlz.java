package xsna;

import com.vk.dto.user.UserProfile;
import java.util.List;

/* compiled from: LiveSpectatorsPatch.kt */
/* loaded from: classes3.dex */
public abstract class tlz implements xl50 {

    /* compiled from: LiveSpectatorsPatch.kt */
    public static final class a extends tlz {
        public static final a b = new a();
    }

    /* compiled from: LiveSpectatorsPatch.kt */
    public static final class b extends tlz {
        public static final b b = new b();
    }

    /* compiled from: LiveSpectatorsPatch.kt */
    public static final class c extends tlz {
        public final List<UserProfile> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends UserProfile> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Result(items="), this.b);
        }
    }
}
