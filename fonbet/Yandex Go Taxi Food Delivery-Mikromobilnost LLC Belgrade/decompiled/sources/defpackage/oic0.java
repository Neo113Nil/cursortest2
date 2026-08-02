package defpackage;

/* loaded from: classes2.dex */
public final class oic0 {
    public final String a;
    public final zrc0 b;

    public oic0(String str, zrc0 zrc0Var) {
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
        if (!(obj instanceof oic0)) {
            return false;
        }
        oic0 oic0Var = (oic0) obj;
        return this.a.equals(oic0Var.a) && this.b.equals(oic0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item1(__typename=" + this.a + ", plaqueUnit=" + this.b + ')';
    }
}
