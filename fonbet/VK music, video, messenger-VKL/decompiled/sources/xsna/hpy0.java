package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class hpy0 {
    public static Bitmap a(Context context, String str, int i, int i2) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            gu8.c(null, "BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path d = rq90.d(str);
        d.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = new RectF();
        d.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = i;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        d.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(i2);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        new Canvas(bitmap).drawPath(d, paint);
        return bitmap;
    }
}
