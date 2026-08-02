package defpackage;

/* loaded from: classes2.dex */
public final class gqc0 {
    public final String a;
    public final qjc0 b;

    public gqc0(String str, qjc0 qjc0Var) {
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
        if (!(obj instanceof gqc0)) {
            return false;
        }
        gqc0 gqc0Var = (gqc0) obj;
        return this.a.equals(gqc0Var.a) && this.b.equals(gqc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Color(__typename=" + this.a + ", plaqueColor=" + this.b + ')';
    }
}
