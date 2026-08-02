package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: StoryPrivacyGroups.kt */
/* loaded from: classes16.dex */
public final class q9m0 {
    public final List<UserId> a;
    public final List<UserId> b;
    public final List<UserId> c;

    public q9m0(List<UserId> list, List<UserId> list2, List<UserId> list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9m0)) {
            return false;
        }
        q9m0 q9m0Var = (q9m0) obj;
        return epx.f(this.a, q9m0Var.a) && epx.f(this.b, q9m0Var.b) && epx.f(this.c, q9m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryPrivacyGroups(bestFriends=");
        sb.append(this.a);
        sb.append(", excludedFriends=");
        sb.append(this.b);
        sb.append(", includedFriends=");
        return ms9.a(')', sb, this.c);
    }
}
