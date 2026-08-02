package defpackage;

import java.util.Map;

/* loaded from: classes8.dex */
public final class omc0 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final boolean d;

    public omc0(Map map, Map map2, Map map3, boolean z) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omc0)) {
            return false;
        }
        omc0 omc0Var = (omc0) obj;
        return jl40.l(this.a, omc0Var.a) && jl40.l(this.b, omc0Var.b) && jl40.l(this.c, omc0Var.c) && this.d == omc0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.d(unr0.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueExternalContext(conditionValues=");
        sb.append(this.a);
        sb.append(", templates=");
        sb.append(this.b);
        sb.append(", switchesStates=");
        sb.append(this.c);
        sb.append(", defaultSwitchState=");
        return unr0.u(sb, this.d, ')');
    }
}
