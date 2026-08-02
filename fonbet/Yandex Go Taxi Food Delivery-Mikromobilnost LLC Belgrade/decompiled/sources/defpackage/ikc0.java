package defpackage;

/* loaded from: classes2.dex */
public final class ikc0 {
    public final String a;
    public final vpc0 b;

    public ikc0(String str, vpc0 vpc0Var) {
        this.a = str;
        this.b = vpc0Var;
    }

    public final vpc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikc0)) {
            return false;
        }
        ikc0 ikc0Var = (ikc0) obj;
        return this.a.equals(ikc0Var.a) && this.b.equals(ikc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(__typename=" + this.a + ", plaqueProperty=" + this.b + ')';
    }
}
