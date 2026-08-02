package xsna;

/* compiled from: InputModeManager.kt */
@vby
/* loaded from: classes11.dex */
public final class m2x {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof m2x) {
            return this.a == ((m2x) obj).a;
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
