package defpackage;

/* loaded from: classes9.dex */
public final class ilt0 {
    public final int a;

    public ilt0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ilt0) {
            return this.a == ((ilt0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return 1860 + this.a;
    }
}
