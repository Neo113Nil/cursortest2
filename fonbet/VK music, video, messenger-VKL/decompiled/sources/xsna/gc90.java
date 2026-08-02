package xsna;

/* compiled from: PagerSnapDistance.kt */
/* loaded from: classes11.dex */
public final class gc90 {
    public final int a;

    public gc90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gc90) {
            return this.a == ((gc90) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
