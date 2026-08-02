package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: SubscribedStoriesEvent.kt */
/* loaded from: classes6.dex */
public final class ywm0 {
    public final boolean a;
    public final UserId b;

    public ywm0(UserId userId, boolean z) {
        this.a = z;
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywm0)) {
            return false;
        }
        ywm0 ywm0Var = (ywm0) obj;
        return this.a == ywm0Var.a && epx.f(this.b, ywm0Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscribedStoriesEvent(isSubscribeStories=");
        sb.append(this.a);
        sb.append(", ownerId=");
        return gp.b(sb, this.b, ')');
    }
}
