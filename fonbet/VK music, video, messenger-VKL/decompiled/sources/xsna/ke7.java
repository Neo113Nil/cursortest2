package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: BlacklistState.kt */
/* loaded from: classes18.dex */
public final class ke7 implements km50 {
    public static final ke7 h;
    public final int b;
    public final int c;
    public final List<UserId> d;
    public final Map<UserId, UserProfile> e;
    public final Map<UserId, Group> f;
    public final Boolean g;

    static {
        EmptyList emptyList = EmptyList.b;
        jgp jgpVar = jgp.b;
        h = new ke7(0, 0, emptyList, jgpVar, jgpVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ke7(int i, int i2, List<UserId> list, Map<UserId, ? extends UserProfile> map, Map<UserId, ? extends Group> map2, Boolean bool) {
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = map;
        this.f = map2;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke7)) {
            return false;
        }
        ke7 ke7Var = (ke7) obj;
        return this.b == ke7Var.b && this.c == ke7Var.c && epx.f(this.d, ke7Var.d) && epx.f(this.e, ke7Var.e) && epx.f(this.f, ke7Var.f) && epx.f(this.g, ke7Var.g);
    }

    public final int hashCode() {
        int a = v11.a(v11.a(fw3.a(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d), 31, this.e), 31, this.f);
        Boolean bool = this.g;
        return a + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlacklistState(total=");
        sb.append(this.b);
        sb.append(", offset=");
        sb.append(this.c);
        sb.append(", ownerIds=");
        sb.append(this.d);
        sb.append(", profiles=");
        sb.append(this.e);
        sb.append(", groups=");
        sb.append(this.f);
        sb.append(", isEmpty=");
        return tn.a(sb, this.g, ')');
    }
}
