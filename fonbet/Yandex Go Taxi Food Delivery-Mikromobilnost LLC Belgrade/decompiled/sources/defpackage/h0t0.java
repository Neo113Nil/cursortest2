package defpackage;

/* loaded from: classes10.dex */
public final class h0t0 implements s820 {
    public final float a;
    public final int b;

    public h0t0(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0t0.class == obj.getClass()) {
            h0t0 h0t0Var = (h0t0) obj;
            if (this.a == h0t0Var.a && this.b == h0t0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return g8e.c(this.a, 527, 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }
}
