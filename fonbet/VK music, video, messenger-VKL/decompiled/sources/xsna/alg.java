package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CommonMarkupRenderer.kt */
/* loaded from: classes4.dex */
public final class alg {
    public static final lyk0 a = new lyk0();
    public static final Paint b;

    static {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        b = paint;
    }

    public static ota0 a(ota0 ota0Var, vlo vloVar) {
        Bitmap bitmap;
        ld7 ld7Var = ota0Var instanceof ld7 ? (ld7) ota0Var : null;
        if (ld7Var == null || (bitmap = ld7Var.a) == null) {
            return ota0Var;
        }
        Canvas canvas = new Canvas(bitmap);
        vlo f = xlo.f(vloVar, bitmap.getWidth(), bitmap.getHeight());
        lyk0 lyk0Var = a;
        ((pb7) lyk0Var.c).a(bitmap.getWidth(), bitmap.getHeight());
        xlo.a(f, lyk0Var);
        pb7 pb7Var = (pb7) lyk0Var.c;
        pb7Var.b();
        Bitmap bitmap2 = pb7Var.a;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b);
            s3q0 s3q0Var = s3q0.a;
        }
        lyk0Var.clear();
        return new ld7(bitmap);
    }
}
