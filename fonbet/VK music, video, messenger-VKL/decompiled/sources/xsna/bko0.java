package xsna;

/* compiled from: TextOverflow.kt */
@vby
/* loaded from: classes11.dex */
public final class bko0 {
    public final int a;

    public static String a(int i) {
        return i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bko0) {
            return this.a == ((bko0) obj).a;
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
