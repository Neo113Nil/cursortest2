package xsna;

import com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions;
import java.util.List;

/* compiled from: ProfileTabOptionsViewState.kt */
/* loaded from: classes5.dex */
public final class j0e0 implements ao50 {
    public final fi50 a;

    /* compiled from: ProfileTabOptionsViewState.kt */
    public static final class a implements fm50<h0e0> {
        public final yzt0<List<ProfileTabOptions>> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Data(tabs="), this.a, ')');
        }
    }

    public j0e0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
