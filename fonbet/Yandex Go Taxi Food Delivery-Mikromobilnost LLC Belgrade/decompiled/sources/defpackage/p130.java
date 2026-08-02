package defpackage;

/* loaded from: classes2.dex */
public final class p130 implements r130 {
    public final int a;

    public p130(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p130) && this.a == ((p130) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("Fixed(value="), this.a, ')');
    }
}
