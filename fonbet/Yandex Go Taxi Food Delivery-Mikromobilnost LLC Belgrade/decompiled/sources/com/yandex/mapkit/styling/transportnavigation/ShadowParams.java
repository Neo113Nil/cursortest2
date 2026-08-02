package com.yandex.mapkit.styling.transportnavigation;

import android.graphics.PointF;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/ShadowParams;", "", "color", "", "radius", "", "offset", "Landroid/graphics/PointF;", "<init>", "(IFLandroid/graphics/PointF;)V", "getColor", "()I", "getRadius", "()F", "getOffset", "()Landroid/graphics/PointF;", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShadowParams {
    private final int color;
    private final PointF offset;
    private final float radius;

    public ShadowParams(int i, float f, PointF pointF) {
        this.color = i;
        this.radius = f;
        this.offset = pointF;
    }

    public final int getColor() {
        return this.color;
    }

    public final PointF getOffset() {
        return this.offset;
    }

    public final float getRadius() {
        return this.radius;
    }
}
