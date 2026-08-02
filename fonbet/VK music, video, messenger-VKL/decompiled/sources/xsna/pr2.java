package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AnimojiDependency.kt */
/* loaded from: classes7.dex */
public final class pr2 {
    public final UserId a;

    public pr2(UserId userId) {
        this.a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr2) && epx.f(this.a, ((pr2) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("RefreshAvatar(userId="), this.a, ')');
    }
}
