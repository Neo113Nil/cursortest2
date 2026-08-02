package defpackage;

/* loaded from: classes8.dex */
public final class msc0 {
    public final String a;
    public final xtc0 b;

    public msc0(String str, xtc0 xtc0Var) {
        this.a = str;
        this.b = xtc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msc0)) {
            return false;
        }
        msc0 msc0Var = (msc0) obj;
        return this.a.equals(msc0Var.a) && this.b.equals(msc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisplayWidgetRules(__typename=" + this.a + ", plaqueWidgetRules=" + this.b + ')';
    }
}
