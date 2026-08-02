package xsna;

import android.graphics.Matrix;

/* compiled from: Presentation.java */
/* loaded from: classes12.dex */
public final class i2d0 implements un10 {
    public final int a;
    public final int b;
    public float c = -1.0f;
    public final int d = 9729;
    public final int e = 1;
    public float f = -1.0f;
    public float g = -1.0f;
    public Matrix h = new Matrix();

    public i2d0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static i2d0 h(int i, int i2) {
        fxc0.l(i, "width %s must be positive", i > 0);
        fxc0.l(i2, "height %s must be positive", i2 > 0);
        return new i2d0(i, i2);
    }

    @Override // xsna.un10
    public final Matrix b() {
        Matrix matrix = this.h;
        fxc0.t(matrix, "configure must be called first");
        return matrix;
    }

    @Override // xsna.j0u
    public final int d() {
        return this.d;
    }

    @Override // xsna.j0u
    public final jxj0 e(int i, int i2) {
        fxc0.q(i > 0, "inputWidth must be positive");
        fxc0.q(i2 > 0, "inputHeight must be positive");
        Matrix matrix = new Matrix();
        this.h = matrix;
        float f = i;
        this.f = f;
        float f2 = i2;
        this.g = f2;
        int i3 = this.a;
        int i4 = this.b;
        if (i3 != -1 && i4 != -1) {
            this.c = i3 / i4;
        }
        float f3 = this.c;
        if (f3 != -1.0f) {
            float f4 = f / f2;
            if (f3 > f4) {
                matrix.setScale(f4 / f3, 1.0f);
                this.f = this.g * this.c;
            } else {
                matrix.setScale(1.0f, f3 / f4);
                this.g = this.f / this.c;
            }
        }
        if (i4 != -1) {
            if (i3 != -1) {
                this.f = i3;
                this.g = i4;
            } else {
                float f5 = i4;
                float f6 = (this.f * f5) / this.g;
                this.f = f6;
                double d = f6;
                int i5 = this.e;
                this.f = Math.round(d / i5) * i5;
                this.g = f5;
            }
        }
        return new jxj0(Math.round(this.f), Math.round(this.g));
    }

    @Override // xsna.c0u
    public final boolean g(int i, int i2) {
        e(i, i2);
        Matrix matrix = this.h;
        matrix.getClass();
        return matrix.isIdentity() && i == Math.round(this.f) && i2 == Math.round(this.g);
    }
}
