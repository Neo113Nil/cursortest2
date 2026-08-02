package com.yandex.runtime.ui_view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.runtime.image.ImageProvider;
import java.util.UUID;

/* loaded from: classes8.dex */
public class ViewProvider {
    private final boolean cacheable;
    private final String id;
    private Bitmap image;
    private int version;
    private final View view;

    public ViewProvider(View view, boolean z) {
        this.view = view;
        this.id = "view: " + UUID.randomUUID().toString();
        this.version = 0;
        this.cacheable = z;
        snapshot();
    }

    private ImageProvider getImageProvider() {
        return ImageProvider.fromBitmap(this.image, this.cacheable, this.id + ShimmerDivHandler.NUMBER_SING + String.valueOf(this.version));
    }

    public String getId() {
        return this.id;
    }

    public boolean isCacheable() {
        return this.cacheable;
    }

    public void snapshot() {
        this.view.measure(0, 0);
        this.image = Bitmap.createBitmap(this.view.getMeasuredWidth(), this.view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.image);
        View view = this.view;
        view.layout(0, 0, view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.view.draw(canvas);
        this.version++;
    }

    public ViewProvider(View view) {
        this(view, true);
    }
}
