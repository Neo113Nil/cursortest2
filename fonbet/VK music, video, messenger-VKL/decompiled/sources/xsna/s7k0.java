package xsna;

import xsna.qy40;

/* compiled from: SnackbarEventState.kt */
/* loaded from: classes3.dex */
public final class s7k0 {
    public final qy40 a;
    public final int b;

    public s7k0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7k0)) {
            return false;
        }
        s7k0 s7k0Var = (s7k0) obj;
        return epx.f(this.a, s7k0Var.a) && this.b == s7k0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnackbarEventState(event=");
        sb.append(this.a);
        sb.append(", count=");
        return vu5.b(sb, this.b, ')');
    }

    public s7k0(qy40 qy40Var, int i) {
        this.a = qy40Var;
        this.b = i;
    }

    public /* synthetic */ s7k0(int i) {
        this(qy40.b.a, 0);
    }
}
