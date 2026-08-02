package yads;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class d50 {
    public final List a;

    public d50(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d50) && epx.f(this.a, ((d50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.wq.c("DebugPanelAdaptersData(adapters=", ")", this.a);
    }
}
