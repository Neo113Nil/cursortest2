package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: FriendsCleanupViewEvent.kt */
/* loaded from: classes15.dex */
public final class bos implements yns {
    public final UserId a;

    public bos(UserId userId) {
        this.a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bos) && epx.f(this.a, ((bos) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("ProfileClick(userId="), this.a, ')');
    }
}
