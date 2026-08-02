package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.NonNull;

/* compiled from: MeteringPointFactory.java */
/* loaded from: classes11.dex */
public abstract class fj20 {
    @NonNull
    public final ej20 a(float f, float f2, float f3) {
        PointF pointF;
        f6d0 f6d0Var = (f6d0) this;
        float[] fArr = {f, f2};
        synchronized (f6d0Var) {
            try {
                Matrix matrix = f6d0Var.b;
                if (matrix == null) {
                    pointF = f6d0.c;
                } else {
                    matrix.mapPoints(fArr);
                    pointF = new PointF(fArr[0], fArr[1]);
                }
            } finally {
            }
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        ej20 ej20Var = new ej20();
        ej20Var.a = f4;
        ej20Var.b = f5;
        ej20Var.c = f3;
        return ej20Var;
    }
}
