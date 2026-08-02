package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PlatformBitmapFactory.java */
/* loaded from: classes.dex */
public abstract class hta0 {

    /* compiled from: PlatformBitmapFactory.java */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final uvf<Bitmap> a(Bitmap bitmap) {
        return b(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uvf b(Bitmap bitmap, int i, int i2, int i3, int i4) {
        Bitmap.Config config;
        Bitmap r;
        sex0.e(bitmap, "Source bitmap cannot be null");
        sex0.b("x must be >= 0", i >= 0);
        sex0.b("y must be >= 0", i2 >= 0);
        sex0.b("width must be > 0", i3 > 0);
        sex0.b("height must be > 0", i4 > 0);
        int i5 = i + i3;
        sex0.b("x + width must be <= bitmap.width()", i5 <= bitmap.getWidth());
        int i6 = i2 + i4;
        sex0.b("y + height must be <= bitmap.height()", i6 <= bitmap.getHeight());
        Rect rect = new Rect(i, i2, i5, i6);
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3, i4);
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        Bitmap.Config config3 = bitmap.getConfig();
        if (config3 != null) {
            int i7 = a.a[config3.ordinal()];
            if (i7 == 1) {
                config = Bitmap.Config.RGB_565;
            } else if (i7 == 2) {
                config = Bitmap.Config.ALPHA_8;
            }
            boolean hasAlpha = bitmap.hasAlpha();
            sex0.b("width must be > 0", i3 <= 0);
            sex0.b("height must be > 0", i4 > 0);
            uvf<Bitmap> c = c(i3, i4, config);
            r = c.r();
            r.setHasAlpha(hasAlpha);
            if (config == config2 && !hasAlpha) {
                r.eraseColor(-16777216);
            }
            Bitmap r2 = c.r();
            r2.setDensity(bitmap.getDensity());
            r2.setHasAlpha(bitmap.hasAlpha());
            r2.setPremultiplied(bitmap.isPremultiplied());
            Canvas canvas = new Canvas(c.r());
            canvas.drawBitmap(bitmap, rect, rectF, (Paint) null);
            canvas.setBitmap(null);
            return c;
        }
        config = config2;
        boolean hasAlpha2 = bitmap.hasAlpha();
        sex0.b("width must be > 0", i3 <= 0);
        sex0.b("height must be > 0", i4 > 0);
        uvf<Bitmap> c2 = c(i3, i4, config);
        r = c2.r();
        r.setHasAlpha(hasAlpha2);
        if (config == config2) {
            r.eraseColor(-16777216);
        }
        Bitmap r22 = c2.r();
        r22.setDensity(bitmap.getDensity());
        r22.setHasAlpha(bitmap.hasAlpha());
        r22.setPremultiplied(bitmap.isPremultiplied());
        Canvas canvas2 = new Canvas(c2.r());
        canvas2.drawBitmap(bitmap, rect, rectF, (Paint) null);
        canvas2.setBitmap(null);
        return c2;
    }

    public abstract uvf<Bitmap> c(int i, int i2, Bitmap.Config config);
}
