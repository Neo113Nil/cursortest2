package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.a;

/* loaded from: classes11.dex */
public final class ges0 implements ajy {
    public final float A;
    public final i3y a;
    public float b;
    public float c;
    public final Matrix w;
    public final Matrix x;
    public final RectF y;
    public float z;

    public ges0(int[] iArr, float[] fArr, float f) {
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.a = a.a(new xlp0(iArr, fArr, this));
        this.w = new Matrix();
        this.x = new Matrix();
        this.y = new RectF();
        this.A = f;
    }

    @Override // defpackage.ajy
    public final void a(float f, float f2, float f3, float f4) {
        RectF rectF = this.y;
        rectF.set(f, f2, f3, f4);
        float width = rectF.width();
        float height = rectF.height();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f5 = this.A;
        if (f5 >= 90.0f) {
            float f6 = 180.0f;
            if (f5 >= 180.0f) {
                if (f5 < 270.0f) {
                    f5 -= 180.0f;
                } else {
                    f6 = 360.0f;
                }
            }
            f5 = f6 - f5;
        }
        double radians = Math.toRadians(f5);
        this.z = (float) (Math.cos(((float) Math.asin(width / r4)) - radians) * ((float) Math.sqrt((height * height) + (width * width))));
        d();
    }

    @Override // defpackage.ajy
    public final Shader b() {
        return (LinearGradient) this.a.getValue();
    }

    @Override // defpackage.ajy
    public final void c(float f) {
        this.b = f;
        d();
    }

    public final void d() {
        Matrix matrix = this.w;
        matrix.reset();
        float f = this.z;
        matrix.postScale(f, f);
        matrix.postRotate(this.A);
        RectF rectF = this.y;
        matrix.postTranslate((rectF.width() / 2.0f) + rectF.left + this.b, (rectF.height() / 2.0f) + rectF.top + this.c);
        Matrix matrix2 = this.x;
        matrix2.set(matrix);
        matrix2.preTranslate(0.0f, -0.0f);
        ((LinearGradient) this.a.getValue()).setLocalMatrix(matrix2);
    }

    @Override // defpackage.ajy
    public final void i(float f) {
        this.c = f;
        d();
    }
}
