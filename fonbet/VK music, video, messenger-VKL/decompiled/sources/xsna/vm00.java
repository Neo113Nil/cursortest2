package xsna;

/* compiled from: CameraPosition.kt */
/* loaded from: classes18.dex */
public final class vm00 {
    public static final vm00 b = new vm00(3.0f);
    public static final vm00 c = new vm00(13.0f);
    public static final vm00 d = new vm00(15.0f);
    public static final vm00 e = new vm00(17.0f);
    public final float a;

    public vm00(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vm00) && Float.compare(this.a, ((vm00) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return xq.c(')', this.a, new StringBuilder("MapZoom(zoom="));
    }
}
