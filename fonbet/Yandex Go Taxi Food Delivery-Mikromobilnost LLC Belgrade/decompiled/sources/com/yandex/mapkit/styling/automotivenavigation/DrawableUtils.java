package com.yandex.mapkit.styling.automotivenavigation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.yandex.runtime.image.ImageProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0016"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/DrawableUtils;", "", "<init>", "()V", "drawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "widthPx", "", "heightPx", "scale", "", "createImageProvider", "Lcom/yandex/runtime/image/ImageProvider;", "context", "Landroid/content/Context;", "imageId", "cacheable", "", "scaleFactor", "pixelsPerPoint", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DrawableUtils {
    public static final DrawableUtils INSTANCE = new DrawableUtils();

    private DrawableUtils() {
    }

    public static final ImageProvider createImageProvider(final Context context, final int imageId, final boolean cacheable, final float scale, final float scaleFactor) {
        return new ImageProvider(cacheable) { // from class: com.yandex.mapkit.styling.automotivenavigation.DrawableUtils$createImageProvider$1
            @Override // com.yandex.runtime.image.ImageProvider
            public String getId() {
                return "platform_image_" + imageId + "_" + scale;
            }

            @Override // com.yandex.runtime.image.ImageProvider
            public Bitmap getImage() {
                float f = scale;
                float f2 = scaleFactor;
                DrawableUtils drawableUtils = DrawableUtils.INSTANCE;
                return drawableUtils.drawableToBitmap(context.getDrawable(imageId), (f2 / drawableUtils.pixelsPerPoint(context)) * f);
            }
        };
    }

    public final Bitmap drawableToBitmap(Drawable drawable, int widthPx, int heightPx) {
        Bitmap createBitmap = Bitmap.createBitmap(widthPx, heightPx, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public final float pixelsPerPoint(Context context) {
        WindowMetrics currentWindowMetrics;
        float density;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 34) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            density = currentWindowMetrics.getDensity();
            return density;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    public final Bitmap drawableToBitmap(Drawable drawable, float scale) {
        return drawableToBitmap(drawable, (int) (drawable.getIntrinsicWidth() * scale), (int) (drawable.getIntrinsicHeight() * scale));
    }
}
