package xsna;

/* compiled from: VideoMinimizableDiscoveryMotionSceneArgs.kt */
/* loaded from: classes7.dex */
public final class xvs0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public xvs0() {
        this(true, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvs0)) {
            return false;
        }
        xvs0 xvs0Var = (xvs0) obj;
        return this.a == xvs0Var.a && this.b == xvs0Var.b && this.c == xvs0Var.c && this.d == xvs0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMinimizableDiscoveryMotionSceneArgs(isCollapsedStateEnabled=");
        sb.append(this.a);
        sb.append(", isDoc2DocSliderEnabled=");
        sb.append(this.b);
        sb.append(", isCompleteConstraintsSetup=");
        sb.append(this.c);
        sb.append(", isTransitionRedesignEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public xvs0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }
}
