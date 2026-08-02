package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: SquircleTransform.kt */
/* loaded from: classes2.dex */
public final class gnk0 extends mk6 {
    public final double c;
    public final float d;
    public final int e;

    public gnk0(double d, float f, int i) {
        this.c = d;
        this.d = f;
        this.e = i;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return new ppj0("SquirclePostprocessor: " + this.c);
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        int i;
        Matrix matrix = hnk0.a;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new Matrix(), null);
        int min = Math.min(width, height) / 2;
        Path a = ink0.a(this.c, min);
        Matrix matrix2 = new Matrix();
        float f = width / 2.0f;
        float f2 = min;
        float f3 = height / 2.0f;
        matrix2.postTranslate(f - f2, f3 - f2);
        a.transform(matrix2);
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        a.setFillType(Path.FillType.INVERSE_WINDING);
        canvas.drawPath(a, paint);
        float f4 = this.d;
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i = this.e) != 0) {
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(i);
            paint2.setStrokeWidth(f4);
            float f5 = min * 2;
            float f6 = (f5 - f4) / f5;
            matrix2.postScale(f6, f6, f, f3);
            a.transform(matrix2);
            a.setFillType(Path.FillType.WINDING);
            canvas.drawPath(a, paint2);
        }
        return hta0Var.a(createBitmap).n();
    }
}
