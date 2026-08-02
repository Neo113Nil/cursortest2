package ru.ok.tracer.lite.performance.metrics;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: TracerPerformanceMetricsLite.kt */
/* loaded from: classes9.dex */
public /* synthetic */ class TracerPerformanceMetricsLite$work$1 extends FunctionReferenceImpl implements gzs<s3q0> {
    public TracerPerformanceMetricsLite$work$1(Object obj) {
        super(0, obj, TracerPerformanceMetricsLite.class, "prepareUpload", "prepareUpload()V", 0);
    }

    @Override // xsna.gzs
    public /* bridge */ /* synthetic */ s3q0 invoke() {
        invoke2();
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((TracerPerformanceMetricsLite) this.receiver).prepareUpload();
    }
}
