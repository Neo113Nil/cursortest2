package yads;

import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class r40 {
    public final List a;

    public r40(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r40) && epx.f(this.a, ((r40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.wq.c("DebugPanelAdUnitMediationData(adapters=", ")", this.a);
    }
}
