package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: StoryBitmapUtils.kt */
/* loaded from: classes15.dex */
public final class bzl0 {
    public final Context a;
    public final Paint b;

    public bzl0(Context context) {
        this.a = context;
        new Path();
        this.b = new Paint();
    }

    public static Bitmap a(bzl0 bzl0Var, Bitmap bitmap) {
        bzl0Var.getClass();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap copy = bitmap.copy(config, bitmap.isMutable());
        copy.setHasAlpha(true);
        int width = copy.getWidth();
        int height = copy.getHeight();
        Bitmap.Config config2 = copy.getConfig();
        if (config2 == null) {
            config2 = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config2);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
        Paint paint = bzl0Var.b;
        paint.reset();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(mode));
        new Canvas(createBitmap).drawColor(bzl0Var.a.getColor(R.color.vk_black_alpha24));
        new Canvas(copy).drawBitmap(createBitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        createBitmap.recycle();
        return copy;
    }

    public final Bitmap b() {
        int color = this.a.getColor(R.color.vk_gray_800);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC;
        Paint paint = this.b;
        paint.reset();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint.setColor(color);
        new Canvas(createBitmap).drawPaint(paint);
        return createBitmap;
    }
}
