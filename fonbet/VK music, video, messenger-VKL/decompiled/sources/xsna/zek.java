package xsna;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: Crop.kt */
/* loaded from: classes4.dex */
public final class zek {
    public static final float[] a = new float[8];
    public static final float[] b = new float[8];
    public static final float[] c = new float[8];
    public static final float[] d = new float[8];
    public static final float[] e = new float[8];
    public static final RectF f = new RectF();
    public static final Matrix g = new Matrix();

    public static void a(int i, int i2) {
        float[] fArr = c;
        float f2 = i;
        float f3 = fArr[0] * f2;
        float[] fArr2 = d;
        fArr2[0] = f3;
        float f4 = i2;
        fArr2[1] = fArr[1] * f4;
        fArr2[2] = fArr[2] * f2;
        fArr2[3] = fArr[3] * f4;
        fArr2[4] = fArr[4] * f2;
        fArr2[5] = fArr[5] * f4;
        fArr2[6] = fArr[6] * f2;
        fArr2[7] = fArr[7] * f4;
        float o = edi.o(fArr2);
        float n = edi.n(fArr2);
        float[] fArr3 = e;
        Arrays.fill(fArr3, 0, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fArr3[2] = o;
        fArr3[4] = o;
        fArr3[5] = n;
        fArr3[7] = n;
    }

    public static void b(afk afkVar, flp0 flp0Var) {
        Matrix b2 = flp0Var.b();
        float width = flp0Var.getWidth();
        float height = flp0Var.getHeight();
        b2.invert(b2);
        RectF cropRect = afkVar.getCropRect();
        RectF rectF = f;
        rectF.set(cropRect);
        float f2 = rectF.left;
        float[] fArr = a;
        fArr[0] = f2;
        float f3 = rectF.top;
        fArr[1] = f3;
        float f4 = rectF.right;
        fArr[2] = f4;
        fArr[3] = f3;
        fArr[4] = f4;
        float f5 = rectF.bottom;
        fArr[5] = f5;
        fArr[6] = f2;
        fArr[7] = f5;
        b2.mapPoints(fArr);
        Matrix matrix = g;
        matrix.reset();
        matrix.postTranslate((-(afkVar.getFullWidth() - width)) / 2.0f, (-(afkVar.getFullHeight() - height)) / 2.0f);
        matrix.mapPoints(fArr);
        float f6 = fArr[0] / width;
        float[] fArr2 = c;
        fArr2[0] = f6;
        fArr2[1] = fArr[1] / height;
        fArr2[2] = fArr[2] / width;
        fArr2[3] = fArr[3] / height;
        fArr2[4] = fArr[4] / width;
        fArr2[5] = fArr[5] / height;
        fArr2[6] = fArr[6] / width;
        fArr2[7] = fArr[7] / height;
        float o = edi.o(fArr);
        float n = edi.n(fArr);
        float[] fArr3 = b;
        Arrays.fill(fArr3, 0, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fArr3[2] = o;
        fArr3[4] = o;
        fArr3[5] = n;
        fArr3[7] = n;
    }
}
