package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: BirthdaysGroup.kt */
/* loaded from: classes6.dex */
public final class ha7 {
    public final String a;
    public final List<UserId> b;

    public ha7(String str, List<UserId> list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha7)) {
            return false;
        }
        ha7 ha7Var = (ha7) obj;
        return epx.f(this.a, ha7Var.a) && epx.f(this.b, ha7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BirthdaysGroup(groupTitle=");
        sb.append(this.a);
        sb.append(", userIds=");
        return ms9.a(')', sb, this.b);
    }
}
