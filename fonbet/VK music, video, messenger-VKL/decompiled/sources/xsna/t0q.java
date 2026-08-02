package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: EventWallPost.kt */
/* loaded from: classes6.dex */
public final class t0q {
    public final int a;
    public final UserId b;

    public t0q(int i, UserId userId) {
        this.a = i;
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0q)) {
            return false;
        }
        t0q t0qVar = (t0q) obj;
        return this.a == t0qVar.a && epx.f(this.b, t0qVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventWallPost(postId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        return gp.b(sb, this.b, ')');
    }
}
