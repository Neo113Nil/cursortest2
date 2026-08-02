package xsna;

/* compiled from: PinchProperties.kt */
/* loaded from: classes3.dex */
public final class una0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public una0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof una0)) {
            return false;
        }
        una0 una0Var = (una0) obj;
        return Float.compare(this.a, una0Var.a) == 0 && Float.compare(this.b, una0Var.b) == 0 && Float.compare(this.c, una0Var.c) == 0 && Float.compare(this.d, una0Var.d) == 0 && Float.compare(this.e, una0Var.e) == 0 && Float.compare(this.f, una0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PinchProperties(alpha=");
        sb.append(this.a);
        sb.append(", scale=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", x=");
        sb.append(this.e);
        sb.append(", y=");
        return xq.c(')', this.f, sb);
    }
}
