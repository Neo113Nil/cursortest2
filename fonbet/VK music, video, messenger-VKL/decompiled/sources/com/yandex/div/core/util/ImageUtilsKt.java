package com.yandex.div.core.util;

import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import xsna.xjo;

/* compiled from: ImageUtils.kt */
/* loaded from: classes7.dex */
public final class ImageUtilsKt {
    public static final CachedBitmap toCachedBitmap(PictureDrawable pictureDrawable, Uri uri, byte[] bArr) {
        return new CachedBitmap(xjo.b(pictureDrawable, 0, 0, 7), bArr, uri, BitmapSource.MEMORY);
    }

    public static /* synthetic */ CachedBitmap toCachedBitmap$default(PictureDrawable pictureDrawable, Uri uri, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return toCachedBitmap(pictureDrawable, uri, bArr);
    }
}
