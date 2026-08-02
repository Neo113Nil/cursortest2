package xsna;

/* compiled from: VideoMinimizableDiscoveryMotionSceneTransitions.kt */
/* loaded from: classes7.dex */
public final class zlp0 {
    public final int a;
    public final int b;
    public final int c;

    public zlp0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlp0)) {
            return false;
        }
        zlp0 zlp0Var = (zlp0) obj;
        return this.a == zlp0Var.a && this.b == zlp0Var.b && this.c == zlp0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition(id=");
        sb.append(this.a);
        sb.append(", constraintSetStart=");
        sb.append(this.b);
        sb.append(", constraintSetEnd=");
        return vu5.b(sb, this.c, ')');
    }
}
