package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hqc0 {
    public final ArrayList a;
    public final fqc0 b;

    public hqc0(ArrayList arrayList, fqc0 fqc0Var) {
        this.a = arrayList;
        this.b = fqc0Var;
    }

    public final fqc0 a() {
        return this.b;
    }

    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqc0)) {
            return false;
        }
        hqc0 hqc0Var = (hqc0) obj;
        return this.a.equals(hqc0Var.a) && this.b.equals(hqc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaqueRadialGradient(colors=" + this.a + ", centralPoint=" + this.b + ')';
    }
}
