package com.yandex.plus.home.benchmark;

import defpackage.jb7;
import defpackage.n270;
import defpackage.p270;

/* loaded from: classes8.dex */
public final class b extends com.yandex.plus.core.benchmark.a {
    public final n270 d(String str) {
        return new n270(c(str), new PlusBenchmarker$createApiRequestBenchmark$1(this));
    }

    public final a e(String str, String str2) {
        return new a(c(str), c(str2), new PlusBenchmarker$createDataFetchingBenchmark$1(1, this, b.class, "trackBenchmark", "trackBenchmark(Lcom/yandex/plus/core/benchmark/Benchmark;Ljava/util/Map;)V", 0));
    }

    public final jb7 f() {
        return new jb7(c("Plaque.Shown"), new PlusBenchmarker$createViewDisplayBenchmark$1(2, this, b.class, "trackBenchmark", "trackBenchmark(Lcom/yandex/plus/core/benchmark/Benchmark;Ljava/util/Map;)V", 0));
    }

    public final p270 g(String str) {
        return new p270(c(str), new PlusBenchmarker$createViewLoadingBenchmark$1(this));
    }
}
