package defpackage;

/* loaded from: classes2.dex */
public final class oe70 {
    public final String a;
    public final ws60 b;

    public oe70(String str, ws60 ws60Var) {
        this.a = str;
        this.b = ws60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe70)) {
            return false;
        }
        oe70 oe70Var = (oe70) obj;
        return this.a.equals(oe70Var.a) && this.b.equals(oe70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Plan(__typename=" + this.a + ", offerPlan=" + this.b + ')';
    }
}
