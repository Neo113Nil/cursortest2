package defpackage;

/* loaded from: classes2.dex */
public final class q130 implements r130 {
    public final int a;

    public q130(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q130) && this.a == ((q130) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("Percent(value="), this.a, ')');
    }
}
