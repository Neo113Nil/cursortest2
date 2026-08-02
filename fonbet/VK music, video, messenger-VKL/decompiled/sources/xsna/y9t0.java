package xsna;

/* compiled from: VideoProviderData.kt */
/* loaded from: classes2.dex */
public final class y9t0 {
    public final yg5 a;
    public final ni5 b;

    public y9t0(yg5 yg5Var, ni5 ni5Var) {
        this.a = yg5Var;
        this.b = ni5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9t0)) {
            return false;
        }
        y9t0 y9t0Var = (y9t0) obj;
        return epx.f(this.a, y9t0Var.a) && epx.f(this.b, y9t0Var.b);
    }

    public final int hashCode() {
        yg5 yg5Var = this.a;
        return this.b.hashCode() + ((yg5Var == null ? 0 : yg5Var.hashCode()) * 31);
    }

    public final String toString() {
        return "VideoProviderData(autoPlay=" + this.a + ", trackingData=" + this.b + ')';
    }
}
