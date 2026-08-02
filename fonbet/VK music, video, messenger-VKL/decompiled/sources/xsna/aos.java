package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: FriendsCleanupViewEvent.kt */
/* loaded from: classes15.dex */
public final class aos implements yns {
    public final UserId a;

    public aos(UserId userId) {
        this.a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aos) && epx.f(this.a, ((aos) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("ProfileActionButtonClick(userId="), this.a, ')');
    }
}
