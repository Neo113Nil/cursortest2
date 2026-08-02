package com.pdfview.subsamplincscaleimageview;

import android.graphics.PointF;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class ImageViewState implements Serializable {
    private final float centerX;
    private final float centerY;
    private final int orientation;
    private final float scale;

    public ImageViewState(float f, PointF pointF, int i) {
        this.scale = f;
        this.centerX = pointF.x;
        this.centerY = pointF.y;
        this.orientation = i;
    }

    public final PointF a() {
        return new PointF(this.centerX, this.centerY);
    }

    public final int b() {
        return this.orientation;
    }

    public final float c() {
        return this.scale;
    }
}
