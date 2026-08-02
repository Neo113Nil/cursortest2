package yads;

import java.util.Map;
import xsna.epx;

/* loaded from: classes10.dex */
public final class h51 implements i51 {
    public final Map a;

    public h51(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h51) && epx.f(this.a, ((h51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(images=" + this.a + ")";
    }
}
