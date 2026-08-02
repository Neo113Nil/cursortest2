package defpackage;

/* loaded from: classes.dex */
public final class izr {
    public final int a;

    public /* synthetic */ izr(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof izr) {
            return this.a == ((izr) obj).a;
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
