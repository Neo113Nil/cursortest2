package defpackage;

/* loaded from: classes10.dex */
public final class a1u {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof a1u) {
            return this.a == ((a1u) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.a + ')';
    }
}
