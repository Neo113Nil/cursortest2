package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import defpackage.g8e;
import defpackage.n891;
import defpackage.ny61;
import defpackage.uvb1;
import defpackage.yci0;
import defpackage.z0s;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public class PathInterpolatorCompat implements Interpolator {
    public static final double EPSILON = 1.0E-5d;
    public static final int MAX_NUM_POINTS = 3000;
    private static final float PRECISION = 0.002f;
    private float[] mX;
    private float[] mY;

    public PathInterpolatorCompat(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray i = uvb1.i(resources, theme, attributeSet, z0s.g);
        parseInterpolatorFromTypeArray(i, xmlPullParser);
        i.recycle();
    }

    private void initCubic(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        initPath(path);
    }

    private void initPath(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / PRECISION)) + 1);
        if (min <= 0) {
            yci0.g(length, "The Path has a invalid length ");
            return;
        }
        this.mX = new float[min];
        this.mY = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.mX[i2] = fArr[0];
            this.mY[i2] = fArr[1];
        }
        if (Math.abs(this.mX[0]) <= 1.0E-5d && Math.abs(this.mY[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.mX[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.mY[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < min) {
                    float[] fArr2 = this.mX;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        yci0.g(f2, "The Path cannot loop back on itself, x :");
                        return;
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    ny61.g("The Path should be continuous, can't have 2+ contours");
                    return;
                }
                return;
            }
        }
        int i6 = min - 1;
        throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.mX[0] + "," + this.mY[0] + " end:" + this.mX[i6] + "," + this.mY[i6]);
    }

    private void initQuad(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        initPath(path);
    }

    private void parseInterpolatorFromTypeArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (uvb1.h(xmlPullParser, "pathData")) {
            initPath(n891.i(!uvb1.h(xmlPullParser, "pathData") ? null : typedArray.getString(4)));
            return;
        }
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlX1") == null) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlY1") == null) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float f = !uvb1.h(xmlPullParser, "controlX1") ? 0.0f : typedArray.getFloat(0, 0.0f);
        float f2 = !uvb1.h(xmlPullParser, "controlY1") ? 0.0f : typedArray.getFloat(1, 0.0f);
        boolean z = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlX2") != null;
        if (z != (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlY2") != null)) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (z) {
            initCubic(f, f2, !uvb1.h(xmlPullParser, "controlX2") ? 0.0f : typedArray.getFloat(2, 0.0f), uvb1.h(xmlPullParser, "controlY2") ? typedArray.getFloat(3, 0.0f) : 0.0f);
        } else {
            initQuad(f, f2);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float[] fArr;
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.mX.length - 1;
        int i = 0;
        while (true) {
            int i2 = length - i;
            fArr = this.mX;
            if (i2 <= 1) {
                break;
            }
            int i3 = (i + length) / 2;
            if (f < fArr[i3]) {
                length = i3;
            } else {
                i = i3;
            }
        }
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        float[] fArr2 = this.mY;
        if (f4 == 0.0f) {
            return fArr2[i];
        }
        float f5 = fArr2[i];
        return g8e.b(fArr2[length], f5, (f - f3) / f4, f5);
    }

    public PathInterpolatorCompat(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }
}
