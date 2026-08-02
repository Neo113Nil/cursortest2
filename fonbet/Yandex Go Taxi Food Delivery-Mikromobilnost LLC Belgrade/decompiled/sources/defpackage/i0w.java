package defpackage;

/* loaded from: classes.dex */
public final class i0w {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof i0w) {
            return this.a == ((i0w) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
