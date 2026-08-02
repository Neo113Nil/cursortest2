package com.yandex.div.core.dagger;

import com.yandex.div.histogram.reporter.HistogramReporter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e9e0;
import xsna.gzs;

/* compiled from: DivKitHistogramsModule.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class DivKitHistogramsModule$provideDivParsingHistogramReporter$1 extends FunctionReferenceImpl implements gzs<HistogramReporter> {
    public DivKitHistogramsModule$provideDivParsingHistogramReporter$1(Object obj) {
        super(0, obj, e9e0.class, "get", "get()Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.gzs
    public final HistogramReporter invoke() {
        return (HistogramReporter) ((e9e0) this.receiver).get();
    }
}
