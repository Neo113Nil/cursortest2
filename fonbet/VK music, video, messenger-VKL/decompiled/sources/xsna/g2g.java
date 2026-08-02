package xsna;

import java.util.HashMap;
import java.util.Map;

/* compiled from: CollageSlotsConfig.kt */
@ozl
/* loaded from: classes4.dex */
public final class g2g {
    public final Map<n2k0, c2g> a;

    public g2g(Map<n2k0, c2g> map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2g) && epx.f(this.a, ((g2g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CollageSlotsConfig(slots=" + this.a + ")";
    }

    public g2g() {
        this(new HashMap());
    }
}
