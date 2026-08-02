package xsna;

/* compiled from: FontSynthesis.kt */
@vby
/* loaded from: classes11.dex */
public final class v5s {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof v5s) {
            return this.a == ((v5s) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
