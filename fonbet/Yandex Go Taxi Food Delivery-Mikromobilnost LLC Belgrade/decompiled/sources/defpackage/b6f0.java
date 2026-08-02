package defpackage;

/* loaded from: classes10.dex */
public final class b6f0 {
    public final int a;

    public b6f0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b6f0) {
            return this.a == ((b6f0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
