package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.yandex.runtime.image.ImageProvider;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.unr0;
import defpackage.wuj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ*\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0007J4\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J6\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016¨\u0006 "}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/DrawableUtils;", "", "<init>", "()V", "drawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "widthPx", "", "heightPx", "scale", "", "createImageProvider", "Lcom/yandex/runtime/image/ImageProvider;", "context", "Landroid/content/Context;", "imageId", "cacheable", "", "image", "labelId", "", "pixelsPerPoint", "generateImageWithLabel", "Lcom/yandex/mapkit/styling/transportnavigation/DrawableUtils$ImageWithAnchor;", "imageName", "label", "scaleFactor", "isNightMode", "cacheSuffix", "ImageWithAnchor", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DrawableUtils {
    public static final DrawableUtils INSTANCE = new DrawableUtils();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/DrawableUtils$ImageWithAnchor;", "", "imageProvider", "Lcom/yandex/runtime/image/ImageProvider;", "anchor", "Landroid/graphics/PointF;", "<init>", "(Lcom/yandex/runtime/image/ImageProvider;Landroid/graphics/PointF;)V", "getImageProvider", "()Lcom/yandex/runtime/image/ImageProvider;", "getAnchor", "()Landroid/graphics/PointF;", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImageWithAnchor {
        private final PointF anchor;
        private final ImageProvider imageProvider;

        public ImageWithAnchor(ImageProvider imageProvider, PointF pointF) {
            this.imageProvider = imageProvider;
            this.anchor = pointF;
        }

        public final PointF getAnchor() {
            return this.anchor;
        }

        public final ImageProvider getImageProvider() {
            return this.imageProvider;
        }
    }

    private DrawableUtils() {
    }

    public static final ImageProvider createImageProvider(final int imageId, final Bitmap image, final boolean cacheable, final float scale, final String labelId) {
        return new ImageProvider(cacheable) { // from class: com.yandex.mapkit.styling.transportnavigation.DrawableUtils$createImageProvider$2
            @Override // com.yandex.runtime.image.ImageProvider
            public String getId() {
                return "platform_image_" + imageId + "_" + scale + "_" + labelId;
            }

            @Override // com.yandex.runtime.image.ImageProvider
            /* renamed from: getImage, reason: from getter */
            public Bitmap get$image() {
                return image;
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

    public final ImageWithAnchor generateImageWithLabel(Context context, int imageName, String label, float scaleFactor, boolean isNightMode, String cacheSuffix) {
        List W;
        PointF resolveIconAnchor;
        Size measureText;
        Bitmap bitmap = createImageProvider(context, imageName, true, scaleFactor).get$image();
        Size size = new Size(bitmap.getWidth(), bitmap.getHeight());
        float f = 30.0f * scaleFactor;
        int i = isNightMode ? -16777216 : -1;
        int i2 = isNightMode ? -1 : -16777216;
        Paint f2 = unr0.f(true);
        f2.setTypeface(wuj0.b(R.font.ya_medium, context));
        f2.setTextSize(f);
        f2.setColor(i2);
        f2.setStyle(Paint.Style.FILL);
        Paint paint = new Paint(f2);
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f * scaleFactor);
        W = evu0.W(label, new String[]{"\n"}, (r2 & 4) != 0 ? 0 : 2);
        List<String> list = W;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        float f3 = 0.0f;
        while (it.hasNext()) {
            measureText = DrawableUtilsKt.measureText(paint, (String) it.next());
            f3 += measureText.getHeight();
            arrayList.add(measureText);
        }
        int height = size.getHeight() + ((int) f3) + ((int) (f * 0.5f));
        int width = size.getWidth();
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            ny61.p();
            return null;
        }
        int width2 = ((Size) it2.next()).getWidth();
        while (it2.hasNext()) {
            int width3 = ((Size) it2.next()).getWidth();
            if (width2 < width3) {
                width2 = width3;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(width, width2), height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap, size.getWidth(), size.getHeight(), true), (r6 - size.getWidth()) / 2.0f, 0.0f, (Paint) null);
        float height2 = size.getHeight();
        int i3 = 0;
        for (String str : list) {
            int i4 = i3 + 1;
            Size size2 = (Size) arrayList.get(i3);
            float width4 = (r6 - size2.getWidth()) / 2.0f;
            float f4 = height2;
            float height3 = f4 + size2.getHeight();
            canvas.drawText(str, width4, height3, paint);
            canvas.drawText(str, width4, height3, f2);
            height2 = f4 + size2.getHeight();
            i3 = i4;
        }
        ImageProvider createImageProvider = createImageProvider(imageName, createBitmap, true, scaleFactor, cacheSuffix);
        resolveIconAnchor = DrawableUtilsKt.resolveIconAnchor(bitmap.getHeight(), f3);
        return new ImageWithAnchor(createImageProvider, resolveIconAnchor);
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

    public static final ImageProvider createImageProvider(final Context context, final int imageId, final boolean cacheable, final float scale) {
        return new ImageProvider(cacheable) { // from class: com.yandex.mapkit.styling.transportnavigation.DrawableUtils$createImageProvider$1
            @Override // com.yandex.runtime.image.ImageProvider
            public String getId() {
                return "platform_image_" + imageId + "_" + scale;
            }

            @Override // com.yandex.runtime.image.ImageProvider
            /* renamed from: getImage */
            public Bitmap get$image() {
                return DrawableUtils.INSTANCE.drawableToBitmap(context.getDrawable(imageId), scale);
            }
        };
    }

    public final Bitmap drawableToBitmap(Drawable drawable, float scale) {
        return drawableToBitmap(drawable, (int) (drawable.getIntrinsicWidth() * scale), (int) (drawable.getIntrinsicHeight() * scale));
    }
}
