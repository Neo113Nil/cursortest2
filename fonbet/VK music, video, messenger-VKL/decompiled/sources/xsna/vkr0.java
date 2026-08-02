package xsna;

/* compiled from: Vector3D.kt */
/* loaded from: classes17.dex */
public final class vkr0 {
    public final float a;
    public final float b;
    public final float c;

    public vkr0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        double d = 2;
        Math.sqrt(((float) Math.pow(f, d)) + ((float) Math.pow(f2, d)) + ((float) Math.pow(f3, d)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkr0)) {
            return false;
        }
        vkr0 vkr0Var = (vkr0) obj;
        return Float.compare(this.a, vkr0Var.a) == 0 && Float.compare(this.b, vkr0Var.b) == 0 && Float.compare(this.c, vkr0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vector3D(x=");
        sb.append(this.a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", z=");
        return xq.c(')', this.c, sb);
    }
}
