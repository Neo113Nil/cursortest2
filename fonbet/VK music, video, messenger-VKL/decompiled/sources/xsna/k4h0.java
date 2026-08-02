package xsna;

import one.video.transform.TransformController;

/* compiled from: ScaleButtonState.kt */
/* loaded from: classes8.dex */
public final class k4h0 implements x0u0, n2u0 {
    public static final k4h0 c = new k4h0(TransformController.ScaleType.FIT, false);
    public final boolean a;
    public final TransformController.ScaleType b;

    public k4h0(TransformController.ScaleType scaleType, boolean z) {
        this.a = z;
        this.b = scaleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4h0)) {
            return false;
        }
        k4h0 k4h0Var = (k4h0) obj;
        return this.a == k4h0Var.a && this.b == k4h0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return "ScaleButtonState(isVisible=" + this.a + ", scaleType=" + this.b + ")";
    }
}
