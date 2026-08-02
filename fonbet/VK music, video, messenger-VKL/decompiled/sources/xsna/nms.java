package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: FriendsCleanupAction.kt */
/* loaded from: classes15.dex */
public final class nms implements mms {
    public final UserId b;

    public nms(UserId userId) {
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nms) && epx.f(this.b, ((nms) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("ActionButtonClick(userId="), this.b, ')');
    }
}
