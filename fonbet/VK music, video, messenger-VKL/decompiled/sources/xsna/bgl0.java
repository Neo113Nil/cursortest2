package xsna;

/* compiled from: StopLogic.java */
/* loaded from: classes11.dex */
public final class bgl0 extends ma30 {
    public final cgl0 a;
    public ymk0 b;
    public zfl0 c;

    public bgl0() {
        cgl0 cgl0Var = new cgl0();
        cgl0Var.k = false;
        this.a = cgl0Var;
        this.c = cgl0Var;
    }

    @Override // xsna.ma30
    public final float a() {
        return this.c.a();
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        cgl0 cgl0Var = this.a;
        this.c = cgl0Var;
        cgl0Var.l = f;
        boolean z = f > f2;
        cgl0Var.k = z;
        if (z) {
            cgl0Var.d(-f3, f - f2, f5, f6, f4);
        } else {
            cgl0Var.d(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
