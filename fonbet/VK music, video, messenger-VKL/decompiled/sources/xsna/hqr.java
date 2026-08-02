package xsna;

/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class hqr extends phy<Float> {
    public hqr() {
        throw null;
    }

    @Override // xsna.tf6
    public final Object g(nhy nhyVar, float f) {
        return Float.valueOf(n(nhyVar, f));
    }

    public final float m() {
        return n(b(), d());
    }

    public final float n(nhy<Float> nhyVar, float f) {
        float f2;
        Float f3 = nhyVar.b;
        Float f4 = nhyVar.b;
        if (f3 == null || nhyVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        a900<A> a900Var = this.e;
        if (a900Var != 0) {
            f2 = f;
            Float f5 = (Float) a900Var.b(nhyVar.g, nhyVar.h.floatValue(), f4, nhyVar.c, f2, e(), this.d);
            if (f5 != null) {
                return f5.floatValue();
            }
        } else {
            f2 = f;
        }
        if (nhyVar.i == -3987645.8f) {
            nhyVar.i = f4.floatValue();
        }
        float f6 = nhyVar.i;
        if (nhyVar.j == -3987645.8f) {
            nhyVar.j = nhyVar.c.floatValue();
        }
        return ls20.f(f6, nhyVar.j, f2);
    }
}
