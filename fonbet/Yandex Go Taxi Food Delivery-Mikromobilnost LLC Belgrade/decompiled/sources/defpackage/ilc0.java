package defpackage;

/* loaded from: classes2.dex */
public final class ilc0 {
    public final String a;
    public final xsc0 b;

    public ilc0(String str, xsc0 xsc0Var) {
        this.a = str;
        this.b = xsc0Var;
    }

    public final xsc0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilc0)) {
            return false;
        }
        ilc0 ilc0Var = (ilc0) obj;
        return this.a.equals(ilc0Var.a) && this.b.equals(ilc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WidgetGroup(__typename=" + this.a + ", plaqueWidgetGroup=" + this.b + ')';
    }
}
