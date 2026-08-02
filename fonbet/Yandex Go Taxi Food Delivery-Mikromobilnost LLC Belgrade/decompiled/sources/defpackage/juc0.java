package defpackage;

import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class juc0 {
    public final String a;
    public final fuc0 b;
    public final ArrayList c;
    public final guc0 d;
    public final iuc0 e;

    public juc0(String str, fuc0 fuc0Var, ArrayList arrayList, guc0 guc0Var, iuc0 iuc0Var) {
        this.a = str;
        this.b = fuc0Var;
        this.c = arrayList;
        this.d = guc0Var;
        this.e = iuc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juc0)) {
            return false;
        }
        juc0 juc0Var = (juc0) obj;
        return this.a.equals(juc0Var.a) && jl40.l(this.b, juc0Var.b) && this.c.equals(juc0Var.c) && this.d.equals(juc0Var.d) && jl40.l(this.e, juc0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fuc0 fuc0Var = this.b;
        int hashCode2 = (this.d.hashCode() + ly3.b((hashCode + (fuc0Var == null ? 0 : fuc0Var.hashCode())) * 31, 31, this.c)) * 31;
        iuc0 iuc0Var = this.e;
        return hashCode2 + (iuc0Var != null ? iuc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlaqueWidgetsLevel(widgetsLevelId=" + this.a + ", contentDescription=" + this.b + ", elements=" + this.c + ", displayRules=" + this.d + ", strictAction=" + this.e + ')';
    }
}
