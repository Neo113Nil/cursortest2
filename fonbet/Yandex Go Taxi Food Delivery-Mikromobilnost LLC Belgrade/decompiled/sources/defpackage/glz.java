package defpackage;

import com.yandex.plus.log.api.LogPriority;
import java.util.List;

/* loaded from: classes2.dex */
public final class glz {
    public final LogPriority a;
    public final List b;

    public glz(LogPriority logPriority, List list) {
        this.a = logPriority;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glz)) {
            return false;
        }
        glz glzVar = (glz) obj;
        return this.a == glzVar.a && this.b.equals(glzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogsScreenState(priorityFilter=");
        sb.append(this.a);
        sb.append(", logs=");
        return unr0.t(sb, this.b, ')');
    }
}
