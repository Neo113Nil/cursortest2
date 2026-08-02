package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class ywy0 {
    public static Bitmap a(int i) {
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
        float f = i;
        float f2 = f / 100.0f;
        Paint paint = new Paint();
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Canvas canvas = new Canvas(bitmap);
        float f3 = 3.0f * f2;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(1711276032);
        canvas.drawOval(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f), paint2);
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setStrokeWidth(f3);
        paint3.setColor(-1);
        float f4 = i / 2;
        canvas.drawCircle(f4, f4, f4 - (f3 / 2.0f), paint3);
        paint.setStrokeWidth(f3);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f5 = 33.0f * f2;
        path.moveTo(f5, f5);
        float f6 = 66.0f * f2;
        path.lineTo(f6, f6);
        path.moveTo(f5, f6);
        float f7 = 50.0f * f2;
        path.lineTo(f7, f7);
        path.moveTo(55.0f * f2, f2 * 45.0f);
        path.lineTo(f6, f5);
        path.close();
        canvas.drawPath(path, paint);
        return bitmap;
    }

    public static Bitmap b(int i, Context context, boolean z) {
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
        Canvas canvas = new Canvas(bitmap);
        if (z) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(1711276032);
            float f = i;
            canvas.drawOval(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f), paint);
        }
        Path d = rq90.d("M11.25,16C11.25,17.243 10.243,18.25 9,18.25C7.757,18.25 6.75,17.243 6.75,16C6.75,14.757 7.757,13.75 9,13.75C10.243,13.75 11.25,14.757 11.25,16ZM18.25,16C18.25,17.243 17.243,18.25 16,18.25C14.757,18.25 13.75,17.243 13.75,16C13.75,14.757 14.757,13.75 16,13.75C17.243,13.75 18.25,14.757 18.25,16ZM23,18.25C24.243,18.25 25.25,17.243 25.25,16C25.25,14.757 24.243,13.75 23,13.75C21.757,13.75 20.75,14.757 20.75,16C20.75,17.243 21.757,18.25 23,18.25Z");
        RectF rectF = new RectF();
        d.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f2 = context.getResources().getDisplayMetrics().density;
        matrix.postScale(f2, f2);
        float f3 = i;
        matrix.postTranslate((f3 - (rectF.width() * f2)) / 2.0f, (f3 - (rectF.height() * f2)) / 2.0f);
        d.transform(matrix);
        Paint paint2 = new Paint();
        if (z) {
            paint2.setColor(-1);
        } else {
            paint2.setColor(-6708563);
        }
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawPath(d, paint2);
        return bitmap;
    }

    public static Bitmap c(int i, Context context) {
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
        Path d = rq90.d("M8.133 6.10517L18.63 12.3502C18.7417 12.4166 18.8342 12.511 18.8984 12.624C18.9627 12.737 18.9964 12.8647 18.9964 12.9947C18.9964 13.1246 18.9627 13.2524 18.8984 13.3654C18.8342 13.4783 18.7417 13.5727 18.63 13.6392L8.135 19.8942C8.02115 19.9623 7.89127 19.999 7.75861 20.0005C7.62595 20.002 7.49526 19.9683 7.37988 19.9028C7.26449 19.8374 7.16854 19.7425 7.1018 19.6278C7.03506 19.5131 6.99994 19.3828 7 19.2502V6.75017C6.99997 6.61771 7.03502 6.48762 7.10158 6.3731C7.16814 6.25859 7.26384 6.16375 7.37895 6.09822C7.49406 6.03269 7.62446 5.99881 7.75691 6.00003C7.88936 6.00125 8.01912 6.03753 8.133 6.10517Z");
        Path d2 = rq90.d("M7.75879 5.75C7.93538 5.75163 8.1089 5.80044 8.26074 5.89062L18.7578 12.1357C18.9066 12.2243 19.0306 12.3495 19.1162 12.5C19.2019 12.6506 19.2461 12.8218 19.2461 12.9951C19.246 13.1683 19.2018 13.3387 19.1162 13.4893C19.0306 13.6398 18.9066 13.7649 18.7578 13.8535L8.2627 20.1094L8.26172 20.1084C8.11024 20.1988 7.9381 20.2479 7.76172 20.25C7.58491 20.252 7.41064 20.2073 7.25684 20.1201C7.10308 20.0329 6.97472 19.9067 6.88574 19.7539C6.79676 19.601 6.74992 19.4269 6.75 19.25V6.75C6.75 6.57347 6.79703 6.39969 6.88574 6.24707C6.97443 6.09466 7.10166 5.96814 7.25488 5.88086C7.40824 5.79356 7.58234 5.74845 7.75879 5.75Z");
        RectF rectF = new RectF();
        d.computeBounds(rectF, true);
        d2.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = i;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        d.transform(matrix);
        d2.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        paint2.setColor(520093696);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(0.5f);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setShadowLayer(5.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 687865856);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawPath(d, paint);
        canvas.drawPath(d2, paint2);
        canvas.drawPath(d2, paint3);
        return bitmap;
    }
}
