package defpackage;

/* loaded from: classes2.dex */
public final class ek21 {
    public final String a;
    public final xa4 b;

    public ek21(String str, xa4 xa4Var) {
        this.a = str;
        this.b = xa4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek21)) {
            return false;
        }
        ek21 ek21Var = (ek21) obj;
        return this.a.equals(ek21Var.a) && this.b.equals(ek21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Avatar(__typename=" + this.a + ", avatar=" + this.b + ')';
    }
}
