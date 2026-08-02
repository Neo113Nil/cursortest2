package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityRepliesPatch.kt */
/* loaded from: classes18.dex */
public final class twh implements pwh {
    public final UserId b;

    public twh(UserId userId) {
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twh) && epx.f(this.b, ((twh) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("ReplyFromChanged(userReplyFrom="), this.b, ')');
    }
}
