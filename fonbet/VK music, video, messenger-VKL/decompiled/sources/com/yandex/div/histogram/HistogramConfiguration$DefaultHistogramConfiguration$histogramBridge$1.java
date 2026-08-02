package com.yandex.div.histogram;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;

/* compiled from: HistogramConfiguration.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1 extends FunctionReferenceImpl implements gzs<NoOpHistogramBridge> {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1();

    public HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1() {
        super(0, NoOpHistogramBridge.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.gzs
    public final NoOpHistogramBridge invoke() {
        return new NoOpHistogramBridge();
    }
}
