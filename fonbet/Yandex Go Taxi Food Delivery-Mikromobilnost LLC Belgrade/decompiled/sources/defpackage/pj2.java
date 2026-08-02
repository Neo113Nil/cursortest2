package defpackage;

/* loaded from: classes10.dex */
public final class pj2 extends sj2 {
    public float a;
    public float b;

    public pj2(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.sj2
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.sj2
    public final int b() {
        return 2;
    }

    @Override // defpackage.sj2
    public final sj2 c() {
        return new pj2(0.0f, 0.0f);
    }

    @Override // defpackage.sj2
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.sj2
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pj2)) {
            return false;
        }
        pj2 pj2Var = (pj2) obj;
        return pj2Var.a == this.a && pj2Var.b == this.b;
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
