package yads;

import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class xh3 extends yh3 {
    public final List a;

    public xh3(List list) {
        super(0);
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh3) && epx.f(this.a, ((xh3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.wq.c("Success(result=", ")", this.a);
    }
}
