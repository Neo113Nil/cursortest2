package xsna;

import java.util.List;

/* compiled from: MsgHistoryInfo.kt */
/* loaded from: classes2.dex */
public final class qj30 {
    public final List<lj30> a;
    public final gkx0 b;

    public qj30(List<lj30> list, gkx0 gkx0Var) {
        this.a = list;
        this.b = gkx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj30)) {
            return false;
        }
        qj30 qj30Var = (qj30) obj;
        return epx.f(this.a, qj30Var.a) && epx.f(this.b, qj30Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MsgHistoryInfo(list=" + this.a + ", anchor=" + this.b + ')';
    }
}
