package defpackage;

/* loaded from: classes2.dex */
public final class pic0 {
    public final String a;
    public final zrc0 b;

    public pic0(String str, zrc0 zrc0Var) {
        this.a = str;
        this.b = zrc0Var;
    }

    public final zrc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pic0)) {
            return false;
        }
        pic0 pic0Var = (pic0) obj;
        return this.a.equals(pic0Var.a) && this.b.equals(pic0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item2(__typename=" + this.a + ", plaqueUnit=" + this.b + ')';
    }
}
