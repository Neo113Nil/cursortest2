package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RoundPostprocessor.kt */
/* loaded from: classes12.dex */
public final class zng0 extends mk6 {
    public final boolean c = true;
    public final ppj0 d = new ppj0("XferRoundFilter");

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return this.d;
    }

    @Override // xsna.mk6
    public final void e(Bitmap bitmap, Bitmap bitmap2) {
        Paint paint;
        Paint paint2;
        bitmap.setHasAlpha(true);
        if (this.c) {
            paint = new Paint(1);
            paint2 = new Paint(1);
        } else {
            paint = new Paint();
            paint2 = new Paint();
        }
        paint.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        float width = bitmap2.getWidth() / 2.0f;
        float height = bitmap2.getHeight() / 2.0f;
        Canvas canvas = new Canvas(bitmap);
        canvas.drawCircle(width, height, Math.min(width, height), paint);
        canvas.drawBitmap(bitmap2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint2);
    }
}
