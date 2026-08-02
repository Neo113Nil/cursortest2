package defpackage;

/* loaded from: classes13.dex */
public final class pmp {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof pmp) {
            return this.a == ((pmp) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.e(')', this.a, "TitleRes(titleRes=");
    }
}
