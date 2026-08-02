package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: DeliveryPointIconDrawer.kt */
/* loaded from: classes18.dex */
public final class kwl {
    public static final kwl a = new kwl();
    public static final int b = iah0.a(20);
    public static final int c = iah0.a(22);
    public static final int d;
    public static final int e;
    public static final int f;
    public static final Paint g;
    public static final Path h;

    static {
        int c2 = dhr0.t.c(R.attr.vk_ui_background_contrast);
        d = c2;
        e = Color.argb(an10.b(20.4f), 0, 0, 0);
        f = iah0.a(14);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(c2);
        g = paint;
        Path path = new Path();
        path.moveTo(20.0f, 40.0f);
        path.cubicTo(20.0f, 40.0f, 20.0f, 40.0f, 20.0f, 40.0f);
        path.cubicTo(20.0f, 40.0f, 20.0f, 40.0f, 20.0f, 40.0f);
        path.lineTo(20.0f, 43.0f);
        path.cubicTo(19.393f, 43.0f, 19.123f, 42.646f, 18.506f, 41.839f);
        path.lineTo(18.4f, 41.7f);
        path.cubicTo(17.682f, 40.762f, 17.004f, 40.223f, 16.0f, 39.7f);
        path.cubicTo(15.8f, 39.603f, 15.633f, 39.542f, 15.477f, 39.486f);
        path.cubicTo(6.61f, 37.437f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 29.49f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f);
        path.cubicTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.954f, 8.954f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.cubicTo(31.046f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40.0f, 8.954f, 40.0f, 20.0f);
        path.cubicTo(40.0f, 29.49f, 33.39f, 37.437f, 24.523f, 39.487f);
        path.cubicTo(24.367f, 39.543f, 24.2f, 39.603f, 24.0f, 39.7f);
        path.cubicTo(22.996f, 40.223f, 22.318f, 40.762f, 21.6f, 41.7f);
        path.lineTo(21.494f, 41.839f);
        path.cubicTo(20.878f, 42.646f, 20.607f, 43.0f, 20.0f, 43.0f);
        path.lineTo(20.0f, 40.0f);
        path.close();
        path.moveTo(20.0f, 40.0f);
        h = path;
    }

    public static Bitmap a(Bitmap bitmap, int i, float f2, boolean z) {
        float f3 = b * f2;
        float f4 = (c * f2) + (z ? f : 0);
        int i2 = ((int) 4.0f) * 2;
        int i3 = (int) f3;
        Bitmap createBitmap = Bitmap.createBitmap(i2 + i3, i2 + ((int) f4), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        int i4 = d;
        Paint paint = g;
        paint.setColor(i4);
        paint.setShadowLayer(16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, e);
        RectF rectF = new RectF();
        Path path = h;
        path.computeBounds(rectF, true);
        float width = f3 / rectF.width();
        Matrix matrix = new Matrix();
        matrix.setScale(width, width);
        matrix.postTranslate(4.0f, 4.0f);
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.drawPath(path2, paint);
        int a2 = iah0.a(1);
        if (bitmap != null) {
            int i5 = i3 - (a2 * 2);
            float f5 = a2 + 4.0f;
            float f6 = i5 + f5;
            canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap, i5, i5, true), (Rect) null, new RectF(f5, f5, f6, f6), (Paint) null);
            return createBitmap;
        }
        paint.setColor(i);
        paint.clearShadowLayer();
        float width2 = canvas.getWidth() / 2.0f;
        canvas.drawCircle(width2, width2, (f3 / 2) - a2, paint);
        return createBitmap;
    }
}
