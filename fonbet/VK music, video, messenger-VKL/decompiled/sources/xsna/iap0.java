package xsna;

import xsna.mno0;
import xsna.rmw;

/* compiled from: TopshelfCardButtonState.kt */
/* loaded from: classes2.dex */
public final class iap0 {
    public final mno0.i a;
    public final rmw.d b;

    public iap0(rmw.d dVar, mno0.i iVar) {
        this.a = iVar;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iap0)) {
            return false;
        }
        iap0 iap0Var = (iap0) obj;
        return this.a.equals(iap0Var.a) && this.b.equals(iap0Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + shy.a(this.b.a, this.a.a.hashCode() * 31, 961);
    }

    public final String toString() {
        return "TopshelfCardButtonState(text=" + this.a + ", icon=" + this.b + ", contentDescription=null, enabled=true)";
    }
}
