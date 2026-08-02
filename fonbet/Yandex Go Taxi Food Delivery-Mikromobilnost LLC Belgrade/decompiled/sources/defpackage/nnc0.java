package defpackage;

/* loaded from: classes2.dex */
public final class nnc0 {
    public final String a;
    public final qjc0 b;

    public nnc0(String str, qjc0 qjc0Var) {
        this.a = str;
        this.b = qjc0Var;
    }

    public final qjc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnc0)) {
            return false;
        }
        nnc0 nnc0Var = (nnc0) obj;
        return this.a.equals(nnc0Var.a) && this.b.equals(nnc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Color(__typename=" + this.a + ", plaqueColor=" + this.b + ')';
    }
}
