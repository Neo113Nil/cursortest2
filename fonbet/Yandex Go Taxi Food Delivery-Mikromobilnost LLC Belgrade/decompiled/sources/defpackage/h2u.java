package defpackage;

/* loaded from: classes2.dex */
public final class h2u {
    public final String a;
    public final g351 b;

    public h2u(String str, g351 g351Var) {
        this.a = str;
        this.b = g351Var;
    }

    public final g351 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2u)) {
            return false;
        }
        h2u h2uVar = (h2u) obj;
        return this.a.equals(h2uVar.a) && this.b.equals(h2uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Width(__typename=" + this.a + ", widgetGroupWidth=" + this.b + ')';
    }
}
