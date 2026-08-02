package defpackage;

/* loaded from: classes2.dex */
public final class flc0 {
    public final String a;
    public final yhc0 b;

    public flc0(String str, yhc0 yhc0Var) {
        this.a = str;
        this.b = yhc0Var;
    }

    public final yhc0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flc0)) {
            return false;
        }
        flc0 flc0Var = (flc0) obj;
        return this.a.equals(flc0Var.a) && this.b.equals(flc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Plaque(__typename=" + this.a + ", plaque=" + this.b + ')';
    }
}
