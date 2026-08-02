package xsna;

import java.util.List;

/* compiled from: QuickMessagesInfo.kt */
/* loaded from: classes18.dex */
public final class pse0 {
    public final List a;
    public final ose0 b;

    public pse0(List list, ose0 ose0Var) {
        this.a = list;
        this.b = ose0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pse0)) {
            return false;
        }
        pse0 pse0Var = (pse0) obj;
        return epx.f(this.a, pse0Var.a) && epx.f(this.b, pse0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ose0 ose0Var = this.b;
        return hashCode + (ose0Var == null ? 0 : ose0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickMessagesInfo(quickMessageItems=");
        mr.c(", quickMessageResponseTime=", sb, this.a);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
