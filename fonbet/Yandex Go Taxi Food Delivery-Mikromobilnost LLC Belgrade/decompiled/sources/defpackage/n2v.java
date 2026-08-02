package defpackage;

/* loaded from: classes.dex */
public final class n2v {
    public final int a;

    public /* synthetic */ n2v(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n2v) {
            return this.a == ((n2v) obj).a;
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
