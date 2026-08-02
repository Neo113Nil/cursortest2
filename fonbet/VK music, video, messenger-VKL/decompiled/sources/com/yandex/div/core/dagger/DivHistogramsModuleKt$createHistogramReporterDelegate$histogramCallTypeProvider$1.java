package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramColdTypeChecker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e9e0;
import xsna.gzs;

/* compiled from: DivHistogramsModule.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1 extends FunctionReferenceImpl implements gzs<HistogramColdTypeChecker> {
    public DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(Object obj) {
        super(0, obj, e9e0.class, "get", "get()Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.gzs
    public final HistogramColdTypeChecker invoke() {
        return (HistogramColdTypeChecker) ((e9e0) this.receiver).get();
    }
}
