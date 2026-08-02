package yads;

import java.util.List;
import xsna.epx;
import xsna.qoy;

/* loaded from: classes10.dex */
public final class p90 {
    public final p90 a;
    public final s70 b;
    public final boolean c;
    public final List d;

    public p90(p90 p90Var, s70 s70Var, boolean z, List list) {
        this.a = p90Var;
        this.b = s70Var;
        this.c = z;
        this.d = list;
    }

    public static p90 a(p90 p90Var, p90 p90Var2, s70 s70Var, boolean z, List list, int i) {
        if ((i & 1) != 0) {
            p90Var2 = p90Var.a;
        }
        if ((i & 2) != 0) {
            s70Var = p90Var.b;
        }
        if ((i & 4) != 0) {
            z = p90Var.c;
        }
        if ((i & 8) != 0) {
            list = p90Var.d;
        }
        p90Var.getClass();
        return new p90(p90Var2, s70Var, z, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p90)) {
            return false;
        }
        p90 p90Var = (p90) obj;
        return epx.f(this.a, p90Var.a) && epx.f(this.b, p90Var.b) && this.c == p90Var.c && epx.f(this.d, p90Var.d);
    }

    public final int hashCode() {
        p90 p90Var = this.a;
        return this.d.hashCode() + qoy.b((this.b.hashCode() + ((p90Var == null ? 0 : p90Var.hashCode()) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "DebugPanelUiState(prevState=" + this.a + ", destination=" + this.b + ", isLoading=" + this.c + ", uiData=" + this.d + ")";
    }
}
