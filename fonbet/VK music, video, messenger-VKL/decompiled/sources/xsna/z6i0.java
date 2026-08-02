package xsna;

import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SelectChannelViewState.kt */
/* loaded from: classes16.dex */
public final class z6i0 implements ao50 {
    public final User a;
    public final List<Group> b;
    public final List<Long> c;
    public final boolean d;

    public z6i0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6i0)) {
            return false;
        }
        z6i0 z6i0Var = (z6i0) obj;
        return epx.f(this.a, z6i0Var.a) && epx.f(this.b, z6i0Var.b) && epx.f(this.c, z6i0Var.c) && this.d == z6i0Var.d;
    }

    public final int hashCode() {
        User user = this.a;
        return Boolean.hashCode(this.d) + fw3.a(fw3.a((user == null ? 0 : user.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectChannelViewState(user=");
        sb.append(this.a);
        sb.append(", groups=");
        sb.append(this.b);
        sb.append(", canSelectIds=");
        sb.append(this.c);
        sb.append(", isLoading=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public z6i0(User user, List<Group> list, List<Long> list2, boolean z) {
        this.a = user;
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z6i0(int i) {
        this(null, r3, r3, true);
        EmptyList emptyList = EmptyList.b;
    }
}
