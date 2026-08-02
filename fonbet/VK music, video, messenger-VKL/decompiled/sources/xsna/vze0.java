package xsna;

/* compiled from: ReactionsAdapter.kt */
/* loaded from: classes16.dex */
public final class vze0 {
    public final boolean a;
    public final y0f0 b;

    public vze0(y0f0 y0f0Var, boolean z) {
        this.a = z;
        this.b = y0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vze0)) {
            return false;
        }
        vze0 vze0Var = (vze0) obj;
        return this.a == vze0Var.a && epx.f(this.b, vze0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Reaction(isSelected=" + this.a + ", item=" + this.b + ')';
    }
}
