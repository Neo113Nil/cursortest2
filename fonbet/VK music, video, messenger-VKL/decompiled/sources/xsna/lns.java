package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: FriendsCleanupPatch.kt */
/* loaded from: classes15.dex */
public final class lns implements jns {
    public final UserId b;

    public lns(UserId userId) {
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lns) && epx.f(this.b, ((lns) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("Deleted(userId="), this.b, ')');
    }
}
