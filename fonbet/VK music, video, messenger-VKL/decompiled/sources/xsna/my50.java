package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: NavigationEventHistory.kt */
/* loaded from: classes.dex */
public final class my50 {
    public final List<ny50> a;
    public final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public my50(List<? extends ny50> list, int i) {
        this.a = list;
        this.b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder b = ji.b(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        b.append(e43.g(list));
        b.append("'.");
        throw new IllegalArgumentException(b.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || my50.class != obj.getClass()) {
            return false;
        }
        my50 my50Var = (my50) obj;
        return this.b == my50Var.b && epx.f(this.a, my50Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEventHistory(currentIndex=");
        sb.append(this.b);
        sb.append(", mergedHistory=");
        return ms9.a(')', sb, this.a);
    }

    public my50() {
        this(EmptyList.b, -1);
    }
}
