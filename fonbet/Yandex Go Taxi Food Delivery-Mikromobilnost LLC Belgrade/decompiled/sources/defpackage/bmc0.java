package defpackage;

/* loaded from: classes8.dex */
public final class bmc0 {
    public final String a;
    public final qqc0 b;

    public bmc0(String str, qqc0 qqc0Var) {
        this.a = str;
        this.b = qqc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmc0)) {
            return false;
        }
        bmc0 bmc0Var = (bmc0) obj;
        return this.a.equals(bmc0Var.a) && this.b.equals(bmc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundShapeSettings(__typename=" + this.a + ", plaqueShapeSettings=" + this.b + ')';
    }
}
