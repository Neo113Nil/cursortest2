package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: InviteFriendsAction.kt */
/* loaded from: classes14.dex */
public final class hqx implements gqx {
    public final UserId b;

    public hqx(UserId userId) {
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqx) && epx.f(this.b, ((hqx) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("Deselect(userId="), this.b, ')');
    }
}
