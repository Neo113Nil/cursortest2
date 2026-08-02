package defpackage;

/* loaded from: classes2.dex */
public final class bha0 {
    public final String a;
    public final i3k0 b;

    public bha0(String str, i3k0 i3k0Var) {
        this.a = str;
        this.b = i3k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bha0)) {
            return false;
        }
        bha0 bha0Var = (bha0) obj;
        return this.a.equals(bha0Var.a) && this.b.equals(bha0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BenefitTitle(__typename=" + this.a + ", richText=" + this.b + ')';
    }
}
