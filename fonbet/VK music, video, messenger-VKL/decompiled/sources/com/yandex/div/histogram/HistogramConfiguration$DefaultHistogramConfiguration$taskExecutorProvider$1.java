package com.yandex.div.histogram;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;

/* compiled from: HistogramConfiguration.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1 extends FunctionReferenceImpl implements gzs<DefaultTaskExecutor> {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1();

    public HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1() {
        super(0, DefaultTaskExecutor.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.gzs
    public final DefaultTaskExecutor invoke() {
        return new DefaultTaskExecutor();
    }
}
