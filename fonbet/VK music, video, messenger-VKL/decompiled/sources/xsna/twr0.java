package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VideoEvents.kt */
/* loaded from: classes14.dex */
public final class twr0 extends bwr0 {
    public final UserId a;

    public twr0(UserId userId) {
        this.a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twr0) && epx.f(this.a, ((twr0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("VideoActionClipsPlaylistUpdated(ownerId="), this.a, ')');
    }
}
