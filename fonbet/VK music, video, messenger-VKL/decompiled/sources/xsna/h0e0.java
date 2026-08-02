package xsna;

import com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions;
import java.util.List;

/* compiled from: ProfileTabOptionsState.kt */
/* loaded from: classes5.dex */
public final class h0e0 implements km50 {
    public final List<ProfileTabOptions> b;

    /* JADX WARN: Multi-variable type inference failed */
    public h0e0(List<? extends ProfileTabOptions> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0e0) && epx.f(this.b, ((h0e0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ProfileTabOptionsState(content="), this.b);
    }
}
