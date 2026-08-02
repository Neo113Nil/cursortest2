package defpackage;

/* loaded from: classes10.dex */
public final class pg2 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof pg2) {
            return this.a.equals(((pg2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
