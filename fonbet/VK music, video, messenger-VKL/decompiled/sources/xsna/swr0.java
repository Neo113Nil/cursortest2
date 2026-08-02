package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: SdkVideoAction.kt */
/* loaded from: classes17.dex */
public final class swr0 extends llh0 {
    public final UserId a;

    public swr0(UserId userId) {
        this.a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swr0) && epx.f(this.a, ((swr0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("VideoActionClipsPlaylistDelete(ownerId="), this.a, ')');
    }
}
