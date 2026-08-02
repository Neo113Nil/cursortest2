package defpackage;

/* loaded from: classes2.dex */
public final class fqc0 {
    public final String a;
    public final woc0 b;

    public fqc0(String str, woc0 woc0Var) {
        this.a = str;
        this.b = woc0Var;
    }

    public final woc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqc0)) {
            return false;
        }
        fqc0 fqc0Var = (fqc0) obj;
        return this.a.equals(fqc0Var.a) && this.b.equals(fqc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CentralPoint(__typename=" + this.a + ", plaquePoint=" + this.b + ')';
    }
}
