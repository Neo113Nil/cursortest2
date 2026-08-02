package defpackage;

/* loaded from: classes2.dex */
public final class gk21 {
    public final String a;
    public final ek21 b;

    public gk21(String str, ek21 ek21Var) {
        this.a = str;
        this.b = ek21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk21)) {
            return false;
        }
        gk21 gk21Var = (gk21) obj;
        return this.a.equals(gk21Var.a) && this.b.equals(gk21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "User(id=" + this.a + ", avatar=" + this.b + ')';
    }
}
