package defpackage;

/* loaded from: classes2.dex */
public final class glc0 {
    public final String a;
    public final yhc0 b;

    public glc0(String str, yhc0 yhc0Var) {
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
        if (!(obj instanceof glc0)) {
            return false;
        }
        glc0 glc0Var = (glc0) obj;
        return this.a.equals(glc0Var.a) && this.b.equals(glc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PrefetchPlaqueList(__typename=" + this.a + ", plaque=" + this.b + ')';
    }
}
