package com.yandex.div.histogram;

import xsna.gzs;

/* compiled from: HistogramCallTypeProvider.kt */
/* loaded from: classes7.dex */
public final class HistogramCallTypeProvider extends HistogramCallTypeChecker {
    private final gzs<HistogramColdTypeChecker> histogramColdTypeChecker;

    public HistogramCallTypeProvider(gzs<HistogramColdTypeChecker> gzsVar) {
        this.histogramColdTypeChecker = gzsVar;
    }

    public final String getHistogramCallType(String str) {
        if (!this.histogramColdTypeChecker.invoke().addReported(str)) {
            return addReported(str) ? "Cool" : "Warm";
        }
        addReported(str);
        return "Cold";
    }
}
