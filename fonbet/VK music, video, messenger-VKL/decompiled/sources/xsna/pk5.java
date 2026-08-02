package xsna;

import java.util.Collections;
import java.util.List;

/* compiled from: AutoValue_ArrayBasedTraceState.java */
/* loaded from: classes11.dex */
public final class pk5 extends ok3 {
    public final List<String> a;

    public pk5() {
        List<String> list = Collections.EMPTY_LIST;
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.a = list;
    }

    @Override // xsna.ok3
    public final List<String> b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ok3) {
            return this.a.equals(((ok3) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return vp.b("}", new StringBuilder("ArrayBasedTraceState{entries="), this.a);
    }
}
