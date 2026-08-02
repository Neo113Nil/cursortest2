package defpackage;

/* loaded from: classes2.dex */
public final class orc0 {
    public final String a;
    public final zrc0 b;

    public orc0(String str, zrc0 zrc0Var) {
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
        if (!(obj instanceof orc0)) {
            return false;
        }
        orc0 orc0Var = (orc0) obj;
        return this.a.equals(orc0Var.a) && this.b.equals(orc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(__typename=" + this.a + ", plaqueUnit=" + this.b + ')';
    }
}
