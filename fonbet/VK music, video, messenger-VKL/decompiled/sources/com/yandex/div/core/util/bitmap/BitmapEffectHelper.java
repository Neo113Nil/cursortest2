package com.yandex.div.core.util.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.yandex.div.core.util.bitmap.blur.BlurHelper;

/* compiled from: BitmapEffectHelper.kt */
/* loaded from: classes7.dex */
public abstract class BitmapEffectHelper implements BlurHelper {
    public final Bitmap mirrorBitmap(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        createBitmap.setDensity(160);
        return createBitmap;
    }
}
