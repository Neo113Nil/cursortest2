package defpackage;

/* loaded from: classes2.dex */
public final class aha0 {
    public final fha0 a;
    public final cha0 b;

    public aha0(fha0 fha0Var, cha0 cha0Var) {
        this.a = fha0Var;
        this.b = cha0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aha0)) {
            return false;
        }
        aha0 aha0Var = (aha0) obj;
        return this.a.equals(aha0Var.a) && this.b.equals(aha0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundColor(light=" + this.a + ", dark=" + this.b + ')';
    }
}
