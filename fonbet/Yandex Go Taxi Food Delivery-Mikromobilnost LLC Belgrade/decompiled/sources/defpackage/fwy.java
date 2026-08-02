package defpackage;

/* loaded from: classes10.dex */
public final class fwy {
    public final int a;

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public final /* synthetic */ int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fwy) {
            return this.a == ((fwy) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Polite" : i == 1 ? "Assertive" : "Unknown";
    }
}
