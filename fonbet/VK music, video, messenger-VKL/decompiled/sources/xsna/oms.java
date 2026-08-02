package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: FriendsCleanupAction.kt */
/* loaded from: classes15.dex */
public final class oms implements mms {
    public final UserId b;

    public oms(UserId userId) {
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oms) && epx.f(this.b, ((oms) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("ProfileClick(userId="), this.b, ')');
    }
}
