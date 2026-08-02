package defpackage;

/* loaded from: classes2.dex */
public final class g4k0 {
    public final b4k0 a;

    public g4k0(b4k0 b4k0Var) {
        this.a = b4k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g4k0) && this.a.equals(((g4k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnCheckoutTitleIconItem(image=" + this.a + ')';
    }
}
