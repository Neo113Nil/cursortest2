package defpackage;

/* loaded from: classes10.dex */
public final class lkj extends jh91 {
    public final int a;

    public lkj(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        ny61.g("px must be > 0.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lkj) {
            return this.a == ((lkj) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
