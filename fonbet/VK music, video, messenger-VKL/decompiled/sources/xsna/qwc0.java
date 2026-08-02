package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityPostsSubscriptionRxBus.kt */
/* loaded from: classes5.dex */
public final class qwc0 {
    public final UserId a = UserId.d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qwc0) && epx.f(this.a, ((qwc0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("PostsSubscriptionEvent(ownerId="), this.a, ')');
    }
}
