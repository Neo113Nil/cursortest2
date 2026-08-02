package defpackage;

import java.util.List;

/* loaded from: classes8.dex */
public final class hkc0 {
    public final List a;
    public final List b;

    public hkc0(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkc0)) {
            return false;
        }
        hkc0 hkc0Var = (hkc0) obj;
        return jl40.l(this.a, hkc0Var.a) && jl40.l(this.b, hkc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueConfiguration(conditionalPlaques=");
        sb.append(this.a);
        sb.append(", defaultPlaques=");
        return unr0.t(sb, this.b, ')');
    }
}
