package com.yandex.mapkit.search;

import android.graphics.Bitmap;
import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface ImageListener {
    void onImageError(Error error);

    void onImageReceived(Bitmap bitmap);
}
