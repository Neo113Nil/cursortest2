package com.yandex.div.core.dagger;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e9e0;
import xsna.gzs;

/* compiled from: DivKitHistogramsModule.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class DivKitHistogramsModule$provideDivParsingHistogramReporter$2 extends FunctionReferenceImpl implements gzs<Executor> {
    public DivKitHistogramsModule$provideDivParsingHistogramReporter$2(Object obj) {
        super(0, obj, e9e0.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // xsna.gzs
    public final Executor invoke() {
        return (Executor) ((e9e0) this.receiver).get();
    }
}
