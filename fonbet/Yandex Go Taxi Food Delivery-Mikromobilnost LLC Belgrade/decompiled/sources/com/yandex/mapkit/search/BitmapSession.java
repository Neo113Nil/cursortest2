package com.yandex.mapkit.search;

import android.graphics.Bitmap;
import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface BitmapSession {

    /* loaded from: classes7.dex */
    public interface BitmapListener {
        void onBitmapError(Error error);

        void onBitmapReceived(Bitmap bitmap);
    }

    void cancel();

    void retry(BitmapListener bitmapListener);
}
