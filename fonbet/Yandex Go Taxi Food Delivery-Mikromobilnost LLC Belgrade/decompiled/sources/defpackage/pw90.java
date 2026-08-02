package defpackage;

/* loaded from: classes2.dex */
public final class pw90 {
    public final String a;
    public final i3k0 b;

    public pw90(String str, i3k0 i3k0Var) {
        this.a = str;
        this.b = i3k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw90)) {
            return false;
        }
        pw90 pw90Var = (pw90) obj;
        return this.a.equals(pw90Var.a) && this.b.equals(pw90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BadgeText(__typename=" + this.a + ", richText=" + this.b + ')';
    }
}
