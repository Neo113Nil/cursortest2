package defpackage;

import android.graphics.Matrix;
import androidx.compose.ui.platform.ViewLayer;

/* loaded from: classes10.dex */
public final class nxx {
    public final wls a;
    public Matrix b;
    public boolean e;
    public boolean f;
    public final float[] c = n810.a();
    public final float[] d = n810.a();
    public boolean g = true;
    public boolean h = true;

    public nxx(wls wlsVar) {
        this.a = wlsVar;
    }

    public final float[] a(ViewLayer viewLayer) {
        boolean z = this.f;
        float[] fArr = this.d;
        if (z) {
            this.g = kp50.B(b(viewLayer), fArr);
            this.f = false;
        }
        if (this.g) {
            return fArr;
        }
        return null;
    }

    public final float[] b(ViewLayer viewLayer) {
        boolean z = this.e;
        float[] fArr = this.c;
        if (!z) {
            return fArr;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.a.invoke(viewLayer, matrix);
        gtq0.N(matrix, fArr);
        this.e = false;
        this.h = ooc.s(fArr);
        return fArr;
    }

    public final void c() {
        this.e = true;
        this.f = true;
    }

    public final void d(ViewLayer viewLayer, gz40 gz40Var) {
        float[] b = b(viewLayer);
        if (this.h) {
            return;
        }
        n810.c(b, gz40Var);
    }

    public final long e(ViewLayer viewLayer, long j) {
        return !this.h ? n810.b(j, b(viewLayer)) : j;
    }

    public final void f(ViewLayer viewLayer, gz40 gz40Var) {
        float[] a = a(viewLayer);
        if (a == null) {
            gz40Var.c(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.h) {
                return;
            }
            n810.c(a, gz40Var);
        }
    }

    public final long g(ViewLayer viewLayer, long j) {
        float[] a = a(viewLayer);
        if (a == null) {
            return 9187343241974906880L;
        }
        return !this.h ? n810.b(j, a) : j;
    }

    public final void h() {
        this.e = false;
        this.f = false;
        this.h = true;
        this.g = true;
        n810.d(this.c);
        n810.d(this.d);
    }
}
