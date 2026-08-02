package xsna;

import xsna.tlo0;

/* compiled from: StorefrontState.kt */
/* loaded from: classes18.dex */
public final class a7k0 {
    public final tlo0 a;
    public final tlo0 b;

    public a7k0() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7k0)) {
            return false;
        }
        a7k0 a7k0Var = (a7k0) obj;
        return epx.f(this.a, a7k0Var.a) && epx.f(this.b, a7k0Var.b);
    }

    public final int hashCode() {
        tlo0 tlo0Var = this.a;
        int hashCode = (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31;
        tlo0 tlo0Var2 = this.b;
        return hashCode + (tlo0Var2 != null ? tlo0Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnackBarState(title=");
        sb.append(this.a);
        sb.append(", message=");
        return bt.a(sb, this.b, ')');
    }

    public a7k0(tlo0.f fVar, tlo0 tlo0Var) {
        this.a = fVar;
        this.b = tlo0Var;
    }
}
