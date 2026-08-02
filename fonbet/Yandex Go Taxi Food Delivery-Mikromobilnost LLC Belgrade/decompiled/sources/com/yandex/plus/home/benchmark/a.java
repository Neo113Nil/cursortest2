package com.yandex.plus.home.benchmark;

import defpackage.tls;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class a {
    public final com.yandex.plus.core.benchmark.b a;
    public final com.yandex.plus.core.benchmark.b b;
    public final tls c;
    public final AtomicReference d;
    public final AtomicReference e;

    public a(com.yandex.plus.core.benchmark.b bVar, com.yandex.plus.core.benchmark.b bVar2, tls tlsVar) {
        this.a = bVar;
        this.b = bVar2;
        this.c = tlsVar;
        BenchmarkState benchmarkState = BenchmarkState.NOT_STARTED;
        this.d = new AtomicReference(benchmarkState);
        this.e = new AtomicReference(benchmarkState);
    }

    public final void a() {
        AtomicReference atomicReference;
        BenchmarkState benchmarkState = BenchmarkState.STARTED;
        BenchmarkState benchmarkState2 = BenchmarkState.COMPLETED;
        do {
            atomicReference = this.d;
            if (atomicReference.compareAndSet(benchmarkState, benchmarkState2)) {
                com.yandex.plus.core.benchmark.b bVar = this.a;
                bVar.c();
                ((PlusBenchmarker$createDataFetchingBenchmark$1) this.c).invoke(bVar);
                return;
            }
        } while (atomicReference.get() == benchmarkState);
    }

    public final void b() {
        AtomicReference atomicReference;
        BenchmarkState benchmarkState = BenchmarkState.STARTED;
        BenchmarkState benchmarkState2 = BenchmarkState.ERROR;
        do {
            atomicReference = this.d;
            if (atomicReference.compareAndSet(benchmarkState, benchmarkState2)) {
                this.a.c();
                return;
            }
        } while (atomicReference.get() == benchmarkState);
    }

    public final void c() {
        AtomicReference atomicReference;
        BenchmarkState benchmarkState = BenchmarkState.NOT_STARTED;
        BenchmarkState benchmarkState2 = BenchmarkState.STARTED;
        do {
            atomicReference = this.d;
            if (atomicReference.compareAndSet(benchmarkState, benchmarkState2)) {
                this.a.b();
                return;
            }
        } while (atomicReference.get() == benchmarkState);
    }

    public final void d() {
        AtomicReference atomicReference;
        BenchmarkState benchmarkState = BenchmarkState.STARTED;
        BenchmarkState benchmarkState2 = BenchmarkState.COMPLETED;
        do {
            atomicReference = this.e;
            if (atomicReference.compareAndSet(benchmarkState, benchmarkState2)) {
                com.yandex.plus.core.benchmark.b bVar = this.b;
                bVar.c();
                ((PlusBenchmarker$createDataFetchingBenchmark$1) this.c).invoke(bVar);
                return;
            }
        } while (atomicReference.get() == benchmarkState);
    }

    public final void e() {
        AtomicReference atomicReference;
        if (this.d.get() == BenchmarkState.COMPLETED) {
            BenchmarkState benchmarkState = BenchmarkState.NOT_STARTED;
            BenchmarkState benchmarkState2 = BenchmarkState.STARTED;
            do {
                atomicReference = this.e;
                if (atomicReference.compareAndSet(benchmarkState, benchmarkState2)) {
                    this.b.b();
                    return;
                }
            } while (atomicReference.get() == benchmarkState);
        }
    }
}
