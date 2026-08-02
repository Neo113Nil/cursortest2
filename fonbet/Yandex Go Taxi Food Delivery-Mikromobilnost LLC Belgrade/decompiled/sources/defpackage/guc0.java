package defpackage;

/* loaded from: classes8.dex */
public final class guc0 {
    public final String a;
    public final dmc0 b;

    public guc0(String str, dmc0 dmc0Var) {
        this.a = str;
        this.b = dmc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guc0)) {
            return false;
        }
        guc0 guc0Var = (guc0) obj;
        return this.a.equals(guc0Var.a) && this.b.equals(guc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisplayRules(__typename=" + this.a + ", plaqueDisplayRules=" + this.b + ')';
    }
}
