package xsna;

/* compiled from: PinchToZoomData.kt */
/* loaded from: classes8.dex */
public final class vna0 {
    public final float a;
    public final float b;
    public final float c;

    public vna0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vna0)) {
            return false;
        }
        vna0 vna0Var = (vna0) obj;
        return Float.compare(this.a, vna0Var.a) == 0 && Float.compare(this.b, vna0Var.b) == 0 && Float.compare(this.c, vna0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return shy.c(this.c, ")", bxj0.a("PinchToZoomData(zoom=", this.a, ", translateX=", this.b, ", translateY="));
    }
}
