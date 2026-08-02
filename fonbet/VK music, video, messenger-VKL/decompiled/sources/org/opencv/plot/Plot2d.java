package org.opencv.plot;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class Plot2d extends Algorithm {
    private static native long create_0(long j);

    private static native long create_1(long j, long j2);

    private static native void delete(long j);

    private static native void render_0(long j, long j2);

    private static native void setGridLinesNumber_0(long j, int i);

    private static native void setInvertOrientation_0(long j, boolean z);

    private static native void setMaxX_0(long j, double d);

    private static native void setMaxY_0(long j, double d);

    private static native void setMinX_0(long j, double d);

    private static native void setMinY_0(long j, double d);

    private static native void setNeedPlotLine_0(long j, boolean z);

    private static native void setPlotAxisColor_0(long j, double d, double d2, double d3, double d4);

    private static native void setPlotBackgroundColor_0(long j, double d, double d2, double d3, double d4);

    private static native void setPlotGridColor_0(long j, double d, double d2, double d3, double d4);

    private static native void setPlotLineColor_0(long j, double d, double d2, double d3, double d4);

    private static native void setPlotLineWidth_0(long j, int i);

    private static native void setPlotSize_0(long j, int i, int i2);

    private static native void setPlotTextColor_0(long j, double d, double d2, double d3, double d4);

    private static native void setPointIdxToPrint_0(long j, int i);

    private static native void setShowGrid_0(long j, boolean z);

    private static native void setShowText_0(long j, boolean z);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
