package defpackage;

/* loaded from: classes.dex */
public final class oj2 extends sj2 {
    public float a;

    public oj2(float f) {
        this.a = f;
    }

    @Override // defpackage.sj2
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.sj2
    public final int b() {
        return 1;
    }

    @Override // defpackage.sj2
    public final sj2 c() {
        return new oj2(0.0f);
    }

    @Override // defpackage.sj2
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.sj2
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oj2) && ((oj2) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
