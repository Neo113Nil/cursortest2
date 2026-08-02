package com.yandex.div.storage.templates;

import com.yandex.div.histogram.DivParsingHistogramReporter;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.gzs;

/* compiled from: DivParsingHistogramProxy.kt */
/* loaded from: classes7.dex */
public class DivParsingHistogramProxy {
    private final Lazy reporter$delegate;

    public DivParsingHistogramProxy(gzs<? extends DivParsingHistogramReporter> gzsVar) {
        this.reporter$delegate = new bpn0(gzsVar);
    }
}
