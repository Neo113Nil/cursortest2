package defpackage;

/* loaded from: classes10.dex */
public final class jwd0 {
    public final int a;

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public static String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jwd0) {
            return this.a == ((jwd0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
