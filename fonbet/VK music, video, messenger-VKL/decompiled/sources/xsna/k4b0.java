package xsna;

/* compiled from: ClipsGridBlockState.kt */
/* loaded from: classes17.dex */
public final class k4b0 {
    public final boolean a;
    public final boolean b;

    public k4b0() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4b0)) {
            return false;
        }
        k4b0 k4b0Var = (k4b0) obj;
        return this.a == k4b0Var.a && this.b == k4b0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerState(isPlaying=");
        sb.append(this.a);
        sb.append(", isError=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public k4b0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
