package defpackage;

/* loaded from: classes2.dex */
public final class grc0 {
    public final String a;
    public final zrc0 b;

    public grc0(String str, zrc0 zrc0Var) {
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
        if (!(obj instanceof grc0)) {
            return false;
        }
        grc0 grc0Var = (grc0) obj;
        return this.a.equals(grc0Var.a) && this.b.equals(grc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(__typename=" + this.a + ", plaqueUnit=" + this.b + ')';
    }
}
