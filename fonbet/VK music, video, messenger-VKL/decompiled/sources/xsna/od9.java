package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: CallsQueueUserInfoProvider.kt */
/* loaded from: classes11.dex */
public final class od9 {
    public final boolean a;
    public final UserId b;
    public final List<UserId> c;

    public od9(boolean z, UserId userId, List<UserId> list) {
        this.a = z;
        this.b = userId;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od9)) {
            return false;
        }
        od9 od9Var = (od9) obj;
        return this.a == od9Var.a && epx.f(this.b, od9Var.b) && epx.f(this.c, od9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthState(isLoggedIn=");
        sb.append(this.a);
        sb.append(", currentId=");
        sb.append(this.b);
        sb.append(", authenticatedIds=");
        return ms9.a(')', sb, this.c);
    }
}
