package xsna;

import java.util.List;

/* compiled from: ManagedGroupsListState.kt */
/* loaded from: classes3.dex */
public final class si00 implements km50 {
    public final List<xh00> b;

    public si00(List<xh00> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si00) && epx.f(this.b, ((si00) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ManagedGroupsListState(groupsList="), this.b);
    }
}
