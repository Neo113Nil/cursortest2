package defpackage;

/* loaded from: classes8.dex */
public final class bqc0 {
    public final String a;
    public final klc0 b;

    public bqc0(String str, klc0 klc0Var) {
        this.a = str;
        this.b = klc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqc0)) {
            return false;
        }
        bqc0 bqc0Var = (bqc0) obj;
        return this.a.equals(bqc0Var.a) && this.b.equals(bqc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Plaque(__typename=" + this.a + ", plaqueDefinitions=" + this.b + ')';
    }
}
