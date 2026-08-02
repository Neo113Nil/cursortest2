package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;

/* compiled from: BlurHelper.kt */
/* loaded from: classes7.dex */
public interface BlurHelper {
    Bitmap blurBitmap(Bitmap bitmap, float f);

    Bitmap blurShadow(Bitmap bitmap, float f);

    float getBitmapScale(float f);

    float getCoercedBlurRadius(float f);

    void release();
}
