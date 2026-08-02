package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AutoGraphicsProvider.kt */
/* loaded from: classes16.dex */
public final class mg5 {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r4 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap a(int i, Integer num, String str) {
        Object obj;
        Bitmap.Config config;
        if ((i & 2) != 0) {
            num = null;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        Bitmap k = mcr0.k(str);
        if (k != null) {
            if (k.isRecycled()) {
                k = null;
            }
        }
        try {
            obj = itg0.d(mcr0.h(Uri.parse(str)), 5000L);
        } catch (Throwable unused) {
            obj = null;
        }
        k = (Bitmap) obj;
        if (k == null) {
            return null;
        }
        if (num == null || (config = k.getConfig()) == null) {
            return k;
        }
        Bitmap copy = k.copy(config, true);
        Canvas canvas = new Canvas(copy);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(k, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        return copy;
    }
}
