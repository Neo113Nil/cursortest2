package yads;

import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class vc3 implements xc3 {
    public final List a;

    public vc3(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vc3) && epx.f(this.a, ((vc3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.wq.c("Success(warnings=", ")", this.a);
    }
}
