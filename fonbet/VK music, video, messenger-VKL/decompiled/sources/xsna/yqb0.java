package xsna;

import xsna.xrb0;
import xsna.zqb0;

/* compiled from: PollPatch.kt */
/* loaded from: classes6.dex */
public final class yqb0 implements zqb0.a {
    public final xrb0.a.d.C4042a b;

    public yqb0(xrb0.a.d.C4042a c4042a) {
        this.b = c4042a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqb0) && epx.f(this.b, ((yqb0) obj).b);
    }

    @Override // xsna.zqb0.a
    public final xrb0.a h() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "StarSelected(action=" + this.b + ')';
    }
}
