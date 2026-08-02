package xsna;

import java.util.List;
import java.util.Set;

/* compiled from: ArchiveChannelsViewState.kt */
/* loaded from: classes15.dex */
public final class hh3 implements ao50 {
    public final List<fi3> a;
    public final Set<Long> b;

    public hh3(Set set, List list) {
        this.a = list;
        this.b = set;
    }

    public static hh3 a(hh3 hh3Var, List list) {
        Set<Long> set = hh3Var.b;
        hh3Var.getClass();
        return new hh3(set, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh3)) {
            return false;
        }
        hh3 hh3Var = (hh3) obj;
        return epx.f(this.a, hh3Var.a) && epx.f(this.b, hh3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArchiveChannelsViewState(items=");
        sb.append(this.a);
        sb.append(", selectedItems=");
        return ur.c(sb, this.b, ')');
    }
}
