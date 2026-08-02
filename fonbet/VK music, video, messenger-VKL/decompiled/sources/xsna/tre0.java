package xsna;

import java.util.Map;
import java.util.Set;

/* compiled from: QueueSubscriptionResult.kt */
/* loaded from: classes5.dex */
public final class tre0 {
    public final Object a;
    public final Set<String> b;

    public tre0(Map<String, xqe0> map, Set<String> set) {
        this.a = map;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tre0)) {
            return false;
        }
        tre0 tre0Var = (tre0) obj;
        return this.a.equals(tre0Var.a) && epx.f(this.b, tre0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueSubscriptionResult(accessParams=");
        sb.append(this.a);
        sb.append(", failedQueueIds=");
        return ur.c(sb, this.b, ')');
    }
}
