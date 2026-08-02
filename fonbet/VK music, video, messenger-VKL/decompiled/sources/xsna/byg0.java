package xsna;

import java.util.List;
import xsna.ukj0;

/* compiled from: SDKViewerSideControlConfig.kt */
/* loaded from: classes16.dex */
public final class byg0 {
    public final List<ukj0> a;

    public byg0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byg0) && epx.f(this.a, ((byg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return vp.b(", customControlsProvider=null)", new StringBuilder("SDKViewerSideControlConfig(controls="), this.a);
    }

    public byg0() {
        this(e43.l(new ukj0.e(null), new ukj0.a(null), new ukj0.h(0), new ukj0.d(null), ukj0.g.a, new ukj0.c(null), new ukj0.f(null)));
    }
}
