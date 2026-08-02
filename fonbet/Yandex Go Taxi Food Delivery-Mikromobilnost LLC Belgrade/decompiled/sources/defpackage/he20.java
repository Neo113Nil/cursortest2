package defpackage;

/* loaded from: classes2.dex */
public final class he20 implements fe20 {
    public final int a;

    public he20(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he20) && this.a == ((he20) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("Solid(color="), this.a, ')');
    }
}
