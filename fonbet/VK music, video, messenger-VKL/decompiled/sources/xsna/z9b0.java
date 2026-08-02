package xsna;

/* compiled from: PlaylistHeaderParamsData.kt */
/* loaded from: classes3.dex */
public final class z9b0 {
    public final float a;
    public final lg90 b;

    public z9b0(float f, lg90 lg90Var) {
        this.a = f;
        this.b = lg90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9b0)) {
            return false;
        }
        z9b0 z9b0Var = (z9b0) obj;
        return pco.b(this.a, z9b0Var.a) && epx.f(this.b, z9b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistHeaderParamsData(statusBarHeight=");
        oq.f(this.a, ", backgroundPainter=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
