package xsna;

/* compiled from: GameFeatureBanner.kt */
/* loaded from: classes17.dex */
public final class b7t {
    public final float a;
    public final float b;
    public final float c;

    public b7t(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7t)) {
            return false;
        }
        b7t b7tVar = (b7t) obj;
        return pco.b(this.a, b7tVar.a) && pco.b(this.b, b7tVar.b) && pco.b(this.c, b7tVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameFeatureBannerSize(bannerWidth=");
        oq.f(this.a, ", bannerHeight=", sb);
        oq.f(this.b, ", gradientHeight=", sb);
        return ir.f(')', this.c, sb);
    }
}
