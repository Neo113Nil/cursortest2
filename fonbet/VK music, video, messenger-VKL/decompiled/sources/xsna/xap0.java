package xsna;

import xsna.mno0;
import xsna.rmw;

/* compiled from: TopshelfCardIconButtonState.kt */
/* loaded from: classes2.dex */
public final class xap0 {
    public final rmw.d a;
    public final mno0.i b;

    public xap0(rmw.d dVar, mno0.i iVar) {
        this.a = dVar;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xap0)) {
            return false;
        }
        xap0 xap0Var = (xap0) obj;
        return this.a.equals(xap0Var.a) && this.b.equals(xap0Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + urd0.a(Integer.hashCode(this.a.a) * 31, 31, this.b.a);
    }

    public final String toString() {
        return "TopshelfCardIconButtonState(icon=" + this.a + ", contentDescription=" + this.b + ", enabled=true)";
    }
}
