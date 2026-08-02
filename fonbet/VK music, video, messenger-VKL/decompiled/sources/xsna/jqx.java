package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: InviteFriendsAction.kt */
/* loaded from: classes14.dex */
public final class jqx implements gqx {
    public final UserId b;

    public jqx(UserId userId) {
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqx) && epx.f(this.b, ((jqx) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("Select(userId="), this.b, ')');
    }
}
