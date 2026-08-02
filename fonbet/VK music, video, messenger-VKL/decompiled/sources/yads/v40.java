package yads;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class v40 {
    public final List a;

    public v40(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v40) && epx.f(this.a, ((v40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.wq.c("DebugPanelAdUnitsData(adUnits=", ")", this.a);
    }
}
