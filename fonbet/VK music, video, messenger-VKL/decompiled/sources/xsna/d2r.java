package xsna;

import java.util.Set;
import xsna.c2r;

/* compiled from: FeedPatch.kt */
/* loaded from: classes17.dex */
public final class d2r implements c2r.e {
    public final Set<String> b;

    public d2r(Set<String> set) {
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2r) && epx.f(this.b, ((d2r) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ur.c(new StringBuilder("Batch(itemsUniqueKeys="), this.b, ')');
    }
}
