package xsna;

/* compiled from: PreviewCarouselRatio.kt */
/* loaded from: classes18.dex */
public final class s3d0 {
    public final float a;
    public final float b;

    public s3d0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3d0)) {
            return false;
        }
        s3d0 s3d0Var = (s3d0) obj;
        return Float.compare(this.a, s3d0Var.a) == 0 && Float.compare(this.b, s3d0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewCarouselRatio(min=");
        sb.append(this.a);
        sb.append(", max=");
        return xq.c(')', this.b, sb);
    }

    public s3d0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public /* synthetic */ s3d0(int i) {
        this(0.75f, 1.33f);
    }
}
