package xsna;

/* compiled from: AdTrackerState.kt */
/* loaded from: classes6.dex */
public final class zi0 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public zi0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi0)) {
            return false;
        }
        zi0 zi0Var = (zi0) obj;
        return this.a == zi0Var.a && this.b == zi0Var.b && this.c == zi0Var.c && this.d == zi0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdTrackerState(isFullscreen=");
        sb.append(this.a);
        sb.append(", isResumed=");
        sb.append(this.b);
        sb.append(", isErrorTracked=");
        sb.append(this.c);
        sb.append(", isVolumeOn=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public zi0(int i) {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
    }
}
