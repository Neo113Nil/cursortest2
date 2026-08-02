package xsna;

import xsna.xrb0;
import xsna.zqb0;

/* compiled from: PollPatch.kt */
/* loaded from: classes6.dex */
public final class vqb0 implements zqb0.a {
    public final xrb0.a.InterfaceC4038a.C4039a b;

    public vqb0(xrb0.a.InterfaceC4038a.C4039a c4039a) {
        this.b = c4039a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqb0) && epx.f(this.b, ((vqb0) obj).b);
    }

    @Override // xsna.zqb0.a
    public final xrb0.a h() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Selected(action=" + this.b + ')';
    }
}
