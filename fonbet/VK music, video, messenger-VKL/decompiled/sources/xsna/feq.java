package xsna;

import android.content.Context;
import android.graphics.Matrix;
import java.util.NoSuchElementException;
import xsna.ang0;
import xsna.nc30;
import xsna.p4h0;

/* compiled from: ExternalElementGestureDetector.kt */
/* loaded from: classes4.dex */
public final class feq implements p4h0.a, nc30.a, ang0.a {
    public final Matrix a = new Matrix();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final Matrix d = new Matrix();
    public float e = 1.0f;
    public skp0 f;
    public final float[] g;
    public final p4h0 h;
    public final nc30 i;
    public final ang0 j;

    public feq(Context context) {
        float[] fArr = new float[2];
        for (int i = 0; i < 2; i++) {
            fArr[i] = 0.0f;
        }
        this.g = fArr;
        p4h0 p4h0Var = new p4h0(context);
        this.h = p4h0Var;
        nc30 nc30Var = new nc30();
        this.i = nc30Var;
        ang0 ang0Var = new ang0();
        this.j = ang0Var;
        p4h0Var.a = this;
        nc30Var.e = this;
        ang0Var.h = this;
    }

    @Override // xsna.ang0.a
    public final void a(float f, float f2, float f3) {
        Matrix matrix = this.d;
        matrix.reset();
        this.c.invert(matrix);
        float[] fArr = this.g;
        fArr[0] = f2;
        fArr[1] = f3;
        matrix.mapPoints(fArr);
        skp0 skp0Var = this.f;
        if (skp0Var != null) {
            float J = rl3.J(fArr);
            if (fArr.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            skp0Var.g(f, J, fArr[fArr.length - 1]);
        }
    }

    @Override // xsna.nc30.a
    public final void b(float f, float f2) {
        skp0 skp0Var = this.f;
        if (skp0Var != null) {
            float f3 = this.e;
            skp0Var.e(f * f3, f2 * f3);
        }
    }

    @Override // xsna.p4h0.a
    public final void onScale(float f, float f2, float f3) {
        Matrix matrix = this.d;
        matrix.reset();
        this.c.invert(matrix);
        float[] fArr = this.g;
        fArr[0] = f2;
        fArr[1] = f3;
        matrix.mapPoints(fArr);
        skp0 skp0Var = this.f;
        if (skp0Var != null) {
            float J = rl3.J(fArr);
            if (fArr.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            skp0Var.f(f, J, fArr[fArr.length - 1]);
        }
    }
}
