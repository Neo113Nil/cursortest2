package xsna;

/* compiled from: FontStyle.kt */
@vby
/* loaded from: classes11.dex */
public final class u5s {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof u5s) {
            return this.a == ((u5s) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}
