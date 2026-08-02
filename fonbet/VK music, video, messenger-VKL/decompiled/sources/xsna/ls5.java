package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;

/* compiled from: AvatarThumbGenerator.kt */
/* loaded from: classes5.dex */
public final class ls5 {
    public static Bitmap a(Bitmap bitmap, RectF rectF) {
        int width = (int) (rectF.left * bitmap.getWidth());
        int height = (int) (rectF.top * bitmap.getHeight());
        int width2 = (int) (rectF.width() * bitmap.getWidth());
        int height2 = (int) (rectF.height() * bitmap.getHeight());
        if (width2 != height2) {
            width2 = Math.min(width2, height2);
            height2 = width2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, width, height, width2, height2);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return kd7.h(context, createBitmap, height2 * 0.5f);
    }
}
