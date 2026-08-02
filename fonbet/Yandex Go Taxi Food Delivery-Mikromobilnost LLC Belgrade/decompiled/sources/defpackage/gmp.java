package defpackage;

/* loaded from: classes13.dex */
public final class gmp {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof gmp) {
            return this.a == ((gmp) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.e(')', this.a, "LocalIcon(iconRes=");
    }
}
