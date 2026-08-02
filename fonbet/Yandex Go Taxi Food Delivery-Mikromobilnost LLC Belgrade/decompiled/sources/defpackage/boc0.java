package defpackage;

import java.util.Map;

/* loaded from: classes8.dex */
public final class boc0 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final boolean d;

    public boc0(Map map, Map map2, Map map3, boolean z) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = z;
    }

    public static boc0 a(boc0 boc0Var, Map map) {
        return new boc0(map, boc0Var.b, boc0Var.c, boc0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boc0)) {
            return false;
        }
        boc0 boc0Var = (boc0) obj;
        return this.a.equals(boc0Var.a) && jl40.l(this.b, boc0Var.b) && jl40.l(this.c, boc0Var.c) && this.d == boc0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.d(unr0.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueMergedContext(conditionValues=");
        sb.append(this.a);
        sb.append(", templates=");
        sb.append(this.b);
        sb.append(", switchesStates=");
        sb.append(this.c);
        sb.append(", defaultSwitchState=");
        return unr0.u(sb, this.d, ')');
    }
}
