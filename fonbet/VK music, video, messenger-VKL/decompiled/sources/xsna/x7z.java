package xsna;

/* compiled from: AndroidDensity.android.kt */
/* loaded from: classes11.dex */
public final class x7z implements q5s {
    public final float a;

    public x7z(float f) {
        this.a = f;
    }

    @Override // xsna.q5s
    public final float a(float f) {
        return f * this.a;
    }

    @Override // xsna.q5s
    public final float b(float f) {
        return f / this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7z) && Float.compare(this.a, ((x7z) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return xq.c(')', this.a, new StringBuilder("LinearFontScaleConverter(fontScale="));
    }
}
