package com.yandex.plus.home.benchmark;

import defpackage.ll5;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class PlusBenchmarker$createViewLoadingBenchmark$1 extends FunctionReferenceImpl implements wls {
    public PlusBenchmarker$createViewLoadingBenchmark$1(b bVar) {
        super(2, bVar, b.class, "trackBenchmark", "trackBenchmark(Lcom/yandex/plus/core/benchmark/Benchmark;Ljava/util/Map;)V", 0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((b) this.receiver).b((ll5) obj, (Map) obj2);
        return zy11.a;
    }
}
