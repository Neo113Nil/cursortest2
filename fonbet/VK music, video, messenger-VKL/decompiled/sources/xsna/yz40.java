package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.medianative.MediaNative;

/* compiled from: MusicPlaylistHeaderBlurTransform.kt */
/* loaded from: classes3.dex */
public final class yz40 extends mk6 {
    public final int c = 75;
    public int d;
    public int e;
    public final Paint f;

    public yz40(int i, int i2) {
        this.d = i;
        this.e = i2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        this.f = paint;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        Paint paint = this.f;
        uvf<Bitmap> c = hta0Var.c(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
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
                paint.setColor(this.e);
                paint.setAlpha(204);
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight(), paint);
                uvf<Bitmap> n = c.n();
                c.close();
                return n;
            } catch (UnsatisfiedLinkError unused) {
                c.close();
                uvf<Bitmap> a = hta0Var.a(bitmap);
                uvf<Bitmap> n2 = a.n();
                a.close();
                return n2;
            }
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    public final void f(Bitmap bitmap, Bitmap bitmap2) {
        int i = this.d;
        Paint paint = this.f;
        paint.setColor(i);
        paint.setAlpha(255);
        int b = an10.b(bitmap2.getHeight() * 0.2f);
        int b2 = an10.b(bitmap.getWidth() * 0.8f);
        int b3 = an10.b(bitmap.getHeight() * 0.8f);
        int width = (bitmap.getWidth() / 2) - (b2 / 2);
        int height = ((bitmap.getHeight() / 2) - (b3 / 2)) - b;
        new Canvas(bitmap2).drawBitmap(bitmap, (Rect) null, new Rect(width, height, b2 + width, b3 + height), paint);
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return yz40.class.getSimpleName();
    }
}
