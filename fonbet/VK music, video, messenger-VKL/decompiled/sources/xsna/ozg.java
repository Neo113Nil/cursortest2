package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityCreationOnboardingFinishEvent.kt */
/* loaded from: classes5.dex */
public final class ozg implements pzg {
    public final UserId a;

    public ozg(UserId userId) {
        this.a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozg) && epx.f(this.a, ((ozg) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("OpenCommunity(groupId="), this.a, ')');
    }
}
