package defpackage;

/* loaded from: classes.dex */
public final class chy {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof chy) {
            return this.a == ((chy) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "LineHeightStyle.Mode.Fixed" : i == 1 ? "LineHeightStyle.Mode.Minimum" : i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
