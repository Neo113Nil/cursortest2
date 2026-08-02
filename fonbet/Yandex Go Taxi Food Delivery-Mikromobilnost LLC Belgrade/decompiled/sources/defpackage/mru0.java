package defpackage;

import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class mru0 {
    public final Map a;
    public final int b;

    public mru0() {
        this(b.f(), Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mru0)) {
            return false;
        }
        mru0 mru0Var = (mru0) obj;
        return jl40.l(this.a, mru0Var.a) && this.b == mru0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb.append(this.a);
        sb.append(", maxSupportedFrameRate=");
        return oyr.s(sb, this.b, ')');
    }

    public mru0(Map map, int i) {
        this.a = map;
        this.b = i;
    }
}
