package com.yandex.div.histogram;

import xsna.zcl;

/* compiled from: RenderConfiguration.kt */
/* loaded from: classes7.dex */
public final class RenderConfiguration {
    private final HistogramFilter drawFilter;
    private final HistogramFilter layoutFilter;
    private final HistogramFilter measureFilter;
    private final HistogramFilter totalFilter;

    public RenderConfiguration() {
        this(null, null, null, null, 15, null);
    }

    public final HistogramFilter getDrawFilter() {
        return this.drawFilter;
    }

    public final HistogramFilter getLayoutFilter() {
        return this.layoutFilter;
    }

    public final HistogramFilter getMeasureFilter() {
        return this.measureFilter;
    }

    public final HistogramFilter getTotalFilter() {
        return this.totalFilter;
    }

    public RenderConfiguration(HistogramFilter histogramFilter, HistogramFilter histogramFilter2, HistogramFilter histogramFilter3, HistogramFilter histogramFilter4) {
        this.measureFilter = histogramFilter;
        this.layoutFilter = histogramFilter2;
        this.drawFilter = histogramFilter3;
        this.totalFilter = histogramFilter4;
    }

    public /* synthetic */ RenderConfiguration(HistogramFilter histogramFilter, HistogramFilter histogramFilter2, HistogramFilter histogramFilter3, HistogramFilter histogramFilter4, int i, zcl zclVar) {
        this((i & 1) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter, (i & 2) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter2, (i & 4) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter3, (i & 8) != 0 ? HistogramFilter.Companion.getON() : histogramFilter4);
    }
}
