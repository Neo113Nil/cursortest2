package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class kmc0 implements nmc0 {
    public final String a;
    public final Map b;

    public kmc0(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final Map a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmc0)) {
            return false;
        }
        kmc0 kmc0Var = (kmc0) obj;
        return jl40.l(this.a, kmc0Var.a) && jl40.l(this.b, kmc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSpecific(type=");
        sb.append(this.a);
        sb.append(", items=");
        return smw0.n(sb, this.b, ')');
    }
}
