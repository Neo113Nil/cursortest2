package defpackage;

/* loaded from: classes10.dex */
public final class lf61 implements kf61 {
    public float a;
    public final float b;
    public final float c;
    public float d;

    public lf61(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.kf61
    public final float a() {
        return this.b;
    }

    @Override // defpackage.kf61
    public final float b() {
        return this.d;
    }

    @Override // defpackage.kf61
    public final float c() {
        return this.c;
    }

    @Override // defpackage.kf61
    public final float d() {
        return this.a;
    }

    public final void e(float f) {
        if (f > 1.0f || f < 0.0f) {
            ny61.g(x4e.f("Requested linearZoom ", " is not within valid range [0..1]", f));
        } else {
            this.d = f;
            this.a = g70.D(f, this.c, this.b);
        }
    }

    public final void f(float f) {
        float f2 = this.b;
        float f3 = this.c;
        if (f > f2 || f < f3) {
            ny61.g(uw51.i(oo31.k("Requested zoomRatio ", f, " is not within valid range [", f3, " , "), f2, "]"));
        } else {
            this.a = f;
            this.d = g70.C(f, f3, f2);
        }
    }
}
