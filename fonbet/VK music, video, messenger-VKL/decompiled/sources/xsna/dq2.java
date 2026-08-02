package xsna;

import android.view.animation.Interpolator;

/* compiled from: AnimationProperties.kt */
/* loaded from: classes17.dex */
public final class dq2 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final Interpolator k;

    public dq2(float f, float f2, int i, int i2, float f3, float f4, long j, int i3, long j2, long j3, Interpolator interpolator) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = f3;
        this.f = f4;
        this.g = j;
        this.h = i3;
        this.i = j2;
        this.j = j3;
        this.k = interpolator;
    }

    public final dq2 a() {
        long j = this.j;
        long j2 = this.i;
        return new dq2(this.b, this.a, this.d, this.c, this.f, this.e, (j - j2) - this.g, this.h == 0 ? 4 : 0, j2, j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq2)) {
            return false;
        }
        dq2 dq2Var = (dq2) obj;
        return Float.compare(this.a, dq2Var.a) == 0 && Float.compare(this.b, dq2Var.b) == 0 && this.c == dq2Var.c && this.d == dq2Var.d && Float.compare(this.e, dq2Var.e) == 0 && Float.compare(this.f, dq2Var.f) == 0 && this.g == dq2Var.g && this.h == dq2Var.h && this.i == dq2Var.i && this.j == dq2Var.j && epx.f(this.k, dq2Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + bh10.a(bh10.a(shy.a(this.h, bh10.a(io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, shy.a(this.d, shy.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31, this.g), 31), 31, this.i), 31, this.j);
    }

    public final String toString() {
        return "AnimationProperties(scaleFrom=" + this.a + ", scaleTo=" + this.b + ", bgAlphaFrom=" + this.c + ", bgAlphaTo=" + this.d + ", bubbleAlphaFrom=" + this.e + ", bubbleAlphaTo=" + this.f + ", bubbleAlphaStartDelay=" + this.g + ", bubbleStartVisibility=" + this.h + ", bubbleAlphaAnimationDuration=" + this.i + ", animationDuration=" + this.j + ", interpolator=" + this.k + ')';
    }
}
