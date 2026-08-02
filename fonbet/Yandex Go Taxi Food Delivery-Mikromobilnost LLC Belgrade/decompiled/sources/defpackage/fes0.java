package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.a;

/* loaded from: classes6.dex */
public final class fes0 implements ziy {
    public final i3y a;
    public float b;
    public float c;
    public final Matrix d;
    public final Matrix e;
    public float f;
    public float g;
    public float h;
    public final float i;

    public fes0(int[] iArr, float[] fArr, float f, Shader.TileMode tileMode) {
        this.a = a.a(new r8c0(iArr, fArr, tileMode, this, 11));
        this.d = new Matrix();
        this.e = new Matrix();
        this.i = f;
    }

    @Override // defpackage.ziy
    public final void a(int i, int i2) {
        e(i, i2);
    }

    public final void c() {
        Matrix matrix = this.d;
        matrix.reset();
        float f = this.h;
        matrix.postScale(f, f);
        matrix.postRotate(this.i);
        matrix.postTranslate((this.f / 2.0f) + this.b, (this.g / 2.0f) + this.c);
        Matrix matrix2 = this.e;
        matrix2.set(matrix);
        matrix2.preTranslate(0.0f, -0.0f);
        b().setLocalMatrix(matrix2);
    }

    @Override // defpackage.ziy
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final LinearGradient b() {
        return (LinearGradient) this.a.getValue();
    }

    public final void e(float f, float f2) {
        this.f = f;
        this.g = f2;
        float f3 = this.i;
        if (f3 >= 90.0f) {
            float f4 = 180.0f;
            if (f3 >= 180.0f) {
                if (f3 < 270.0f) {
                    f3 -= 180.0f;
                } else {
                    f4 = 360.0f;
                }
            }
            f3 = f4 - f3;
        }
        float radians = (float) Math.toRadians(f3);
        float f5 = this.f / 2.0f;
        float f6 = this.g / 2.0f;
        this.h = ((float) Math.cos(((float) Math.asin(f5 / r1)) - radians)) * ((float) Math.sqrt((f6 * f6) + (f5 * f5))) * 2.0f;
        c();
    }

    public final void f(float f) {
        this.b = f;
        c();
    }

    public final void g(float f) {
        this.c = f;
        c();
    }

    public /* synthetic */ fes0(int[] iArr, float[] fArr, float f) {
        this(iArr, fArr, f, Shader.TileMode.REPEAT);
    }
}
