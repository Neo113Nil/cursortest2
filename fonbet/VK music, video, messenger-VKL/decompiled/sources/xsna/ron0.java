package xsna;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class ron0 extends n3a {
    public final Set<String> a;
    public final Set<String> b;

    public ron0(Set set, LinkedHashSet linkedHashSet) {
        this.a = set;
        this.b = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ron0)) {
            return false;
        }
        ron0 ron0Var = (ron0) obj;
        return epx.f(this.a, ron0Var.a) && epx.f(this.b, ron0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Set<String> set = this.b;
        return hashCode + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncWithUniqueIdsCmd(uniqueIds=");
        sb.append(this.a);
        sb.append(", removedIds=");
        return ur.c(sb, this.b, ')');
    }

    public ron0(String str) {
        this(Collections.singleton(str), null);
    }
}
