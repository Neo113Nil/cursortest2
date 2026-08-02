package xsna;

/* compiled from: ZoomRateViewState.kt */
/* loaded from: classes8.dex */
public final class w6y0 implements l2u0 {
    public static final w6y0 d = new w6y0(1.0f, false, false);
    public final boolean a;
    public final boolean b;
    public final float c;

    public w6y0(float f, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6y0)) {
            return false;
        }
        w6y0 w6y0Var = (w6y0) obj;
        return this.a == w6y0Var.a && this.b == w6y0Var.b && Float.compare(this.c, w6y0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return shy.c(this.c, ")", gp.c("ZoomRateViewState(isVisible=", ", isInAnimation=", ", rate=", this.a, this.b));
    }
}
