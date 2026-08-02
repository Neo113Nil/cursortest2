package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import defpackage.ny61;

/* loaded from: classes10.dex */
public class PatternPathMotion extends PathMotion {
    public final Path a;
    public final Matrix b;

    public PatternPathMotion(Path path) {
        Path path2 = new Path();
        this.a = path2;
        Matrix matrix = new Matrix();
        this.b = matrix;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            ny61.g("pattern must not end at the starting point");
            throw null;
        }
        matrix.setTranslate(-f3, -f4);
        float f5 = f2 - f4;
        float sqrt = 1.0f / ((float) Math.sqrt((f5 * f5) + (r3 * r3)));
        matrix.postScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f5, f - f3)));
        path.transform(matrix, path2);
    }

    @Override // androidx.transition.PathMotion
    public final Path a(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        float sqrt = (float) Math.sqrt((f5 * f5) + (r6 * r6));
        double atan2 = Math.atan2(f5, f3 - f);
        Matrix matrix = this.b;
        matrix.setScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(atan2));
        matrix.postTranslate(f, f2);
        Path path = new Path();
        this.a.transform(matrix, path);
        return path;
    }

    public PatternPathMotion() {
        Path path = new Path();
        this.a = path;
        this.b = new Matrix();
        path.lineTo(1.0f, 0.0f);
    }
}
