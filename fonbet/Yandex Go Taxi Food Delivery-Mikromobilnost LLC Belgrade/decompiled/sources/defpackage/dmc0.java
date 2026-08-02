package defpackage;

import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class dmc0 {
    public final cmc0 a;
    public final ArrayList b;
    public final bmc0 c;

    public dmc0(cmc0 cmc0Var, ArrayList arrayList, bmc0 bmc0Var) {
        this.a = cmc0Var;
        this.b = arrayList;
        this.c = bmc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmc0)) {
            return false;
        }
        dmc0 dmc0Var = (dmc0) obj;
        return this.a.equals(dmc0Var.a) && this.b.equals(dmc0Var.b) && this.c.equals(dmc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "PlaqueDisplayRules(indentRules=" + this.a + ", backgroundColorSettings=" + this.b + ", backgroundShapeSettings=" + this.c + ')';
    }
}
