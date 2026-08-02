package xsna;

import xsna.xrb0;
import xsna.zqb0;

/* compiled from: PollPatch.kt */
/* loaded from: classes6.dex */
public final class xqb0 implements zqb0.a {
    public final xrb0.a.c.C4041a b;

    public xqb0(xrb0.a.c.C4041a c4041a) {
        this.b = c4041a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqb0) && epx.f(this.b, ((xqb0) obj).b);
    }

    @Override // xsna.zqb0.a
    public final xrb0.a h() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Edited(action=" + this.b + ')';
    }
}
