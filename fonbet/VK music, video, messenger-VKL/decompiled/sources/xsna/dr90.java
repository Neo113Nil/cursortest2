package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PatternPathMotion.java */
/* loaded from: classes12.dex */
public final class dr90 extends pq90 {
    public final Path a = new Path();
    public final Matrix b = new Matrix();

    public dr90(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jtm0.j);
        try {
            String h = ytp0.h(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (h == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            b(rq90.d(h));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // xsna.pq90
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

    public final void b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        Matrix matrix = this.b;
        matrix.setTranslate(-f3, -f4);
        float f5 = f2 - f4;
        float sqrt = 1.0f / ((float) Math.sqrt((f5 * f5) + (r2 * r2)));
        matrix.postScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f5, f - f3)));
        path.transform(matrix, this.a);
    }
}
