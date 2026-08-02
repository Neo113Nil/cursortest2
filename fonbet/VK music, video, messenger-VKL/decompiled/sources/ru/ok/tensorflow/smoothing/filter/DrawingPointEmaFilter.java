package ru.ok.tensorflow.smoothing.filter;

import android.graphics.PointF;

/* loaded from: classes9.dex */
public class DrawingPointEmaFilter {
    private final EmaFilter filterX;
    private final EmaFilter filterY;

    public DrawingPointEmaFilter(long j, PointF pointF, float f) {
        this.filterX = new EmaFilter(j, pointF.x, f);
        this.filterY = new EmaFilter(j, pointF.y, f);
    }

    public PointF filter(long j, PointF pointF) {
        return new PointF(this.filterX.filter(j, pointF.x), this.filterY.filter(j, pointF.y));
    }
}
