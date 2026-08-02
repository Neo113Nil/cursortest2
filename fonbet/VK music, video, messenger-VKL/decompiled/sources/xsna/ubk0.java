package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.medianative.MediaNative;

/* compiled from: SnippetBlurTransform.kt */
/* loaded from: classes3.dex */
public final class ubk0 extends mk6 {
    public final int c = 40;
    public final int d;
    public final Paint e;

    public ubk0(int i) {
        this.d = i;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        this.e = paint;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        Paint paint = this.e;
        uvf<Bitmap> c = hta0Var.c(bitmap.getWidth() / 6, bitmap.getHeight() / 6, Bitmap.Config.ARGB_8888);
        try {
            try {
                paint.setColor(this.d);
                paint.setAlpha(255);
                Bitmap r = c.r();
                Canvas canvas = new Canvas(r);
                paint.setColor(this.d);
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight(), paint);
                f(bitmap, r);
                MediaNative.blurBitmap(r, this.c);
                uvf<Bitmap> n = c.n();
                c.close();
                return n;
            } catch (UnsatisfiedLinkError unused) {
                c.close();
                c = hta0Var.a(bitmap);
                uvf<Bitmap> n2 = c.n();
                c.close();
                return n2;
            }
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    public final void f(Bitmap bitmap, Bitmap bitmap2) {
        int i = this.d;
        Paint paint = this.e;
        paint.setColor(i);
        paint.setAlpha(255);
        new Canvas(bitmap2).drawBitmap(bitmap, (Rect) null, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), paint);
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return ubk0.class.getSimpleName();
    }
}
