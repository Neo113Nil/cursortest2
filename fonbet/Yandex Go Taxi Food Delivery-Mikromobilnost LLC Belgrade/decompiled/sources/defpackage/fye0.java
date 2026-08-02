package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import androidx.camera.view.c;

/* loaded from: classes10.dex */
public final class fye0 extends t920 {
    public static final PointF e = new PointF(2.0f, 2.0f);
    public final c b;
    public Rect c = null;
    public Matrix d;

    public fye0(c cVar) {
        this.b = cVar;
    }

    @Override // defpackage.t920
    public final PointF a(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            try {
                Matrix matrix = this.d;
                if (matrix == null) {
                    return e;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
