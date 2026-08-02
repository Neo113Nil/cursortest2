package defpackage;

/* loaded from: classes.dex */
public final class hzr {
    public final int a;

    public /* synthetic */ hzr(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hzr) {
            return this.a == ((hzr) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
