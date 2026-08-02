package xsna;

/* compiled from: PicturePageUiState.kt */
/* loaded from: classes5.dex */
public final class vka0 {
    public final float a;
    public final uka0 b;

    public vka0(float f, uka0 uka0Var) {
        this.a = f;
        this.b = uka0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vka0)) {
            return false;
        }
        vka0 vka0Var = (vka0) obj;
        return Float.compare(this.a, vka0Var.a) == 0 && epx.f(this.b, vka0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PicturePageUiState(imageScale=" + this.a + ", overlay=" + this.b + ')';
    }
}
