package xsna;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: PhotoTagsState.kt */
/* loaded from: classes4.dex */
public final class eda0 implements km50 {
    public static final eda0 e = new eda0(null, null, EmptySet.b);
    public final List<qba0> b;
    public final Throwable c;
    public final Set<Integer> d;

    public eda0(List<qba0> list, Throwable th, Set<Integer> set) {
        this.b = list;
        this.c = th;
        this.d = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static eda0 a(eda0 eda0Var, List list, Throwable th, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            list = eda0Var.b;
        }
        if ((i & 2) != 0) {
            th = eda0Var.c;
        }
        Set set = linkedHashSet;
        if ((i & 4) != 0) {
            set = eda0Var.d;
        }
        eda0Var.getClass();
        return new eda0(list, th, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eda0)) {
            return false;
        }
        eda0 eda0Var = (eda0) obj;
        return epx.f(this.b, eda0Var.b) && epx.f(this.c, eda0Var.c) && epx.f(this.d, eda0Var.d);
    }

    public final int hashCode() {
        List<qba0> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Throwable th = this.c;
        return this.d.hashCode() + ((hashCode + (th != null ? th.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoTagsState(tags=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", acceptedRestrictions=");
        return ur.c(sb, this.d, ')');
    }
}
