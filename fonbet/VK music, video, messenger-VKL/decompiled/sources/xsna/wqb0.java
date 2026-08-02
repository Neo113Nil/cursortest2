package xsna;

import xsna.xrb0;
import xsna.zqb0;

/* compiled from: PollPatch.kt */
/* loaded from: classes6.dex */
public final class wqb0 implements zqb0.a {
    public final xrb0.a.b.C4040a b;

    public wqb0(xrb0.a.b.C4040a c4040a) {
        this.b = c4040a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqb0) && epx.f(this.b, ((wqb0) obj).b);
    }

    @Override // xsna.zqb0.a
    public final xrb0.a h() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Updated(action=" + this.b + ')';
    }
}
