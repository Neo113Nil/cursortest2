package xsna;

import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;

/* compiled from: DonutPostTeaserActionParams.kt */
/* loaded from: classes4.dex */
public final class r1o {
    public final UserId a;
    public final int b;
    public final Action c;

    public r1o(UserId userId, int i, Action action) {
        this.a = userId;
        this.b = i;
        this.c = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1o)) {
            return false;
        }
        r1o r1oVar = (r1o) obj;
        return epx.f(this.a, r1oVar.a) && this.b == r1oVar.b && epx.f(this.c, r1oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
    }

    public final String toString() {
        return "DonutPostTeaserActionParams(ownerId=" + this.a + ", postId=" + this.b + ", action=" + this.c + ')';
    }
}
