package defpackage;

/* loaded from: classes.dex */
public final class kor extends skx {
    @Override // defpackage.i35
    public final Object g(rkx rkxVar, float f) {
        return Float.valueOf(n(rkxVar, f));
    }

    public final float m() {
        return n(b(), d());
    }

    public final float n(rkx rkxVar, float f) {
        float f2;
        Object obj = rkxVar.b;
        Object obj2 = rkxVar.b;
        if (obj == null || rkxVar.c == null) {
            ny61.r("Missing values for keyframe.");
            return 0.0f;
        }
        puz puzVar = this.e;
        if (puzVar != null) {
            f2 = f;
            Float f3 = (Float) puzVar.b(rkxVar.g, rkxVar.h.floatValue(), (Float) obj2, (Float) rkxVar.c, f2, e(), this.d);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        if (rkxVar.i == -3987645.8f) {
            rkxVar.i = ((Float) obj2).floatValue();
        }
        float f4 = rkxVar.i;
        if (rkxVar.j == -3987645.8f) {
            rkxVar.j = ((Float) rkxVar.c).floatValue();
        }
        return ti20.f(f4, rkxVar.j, f2);
    }
}
