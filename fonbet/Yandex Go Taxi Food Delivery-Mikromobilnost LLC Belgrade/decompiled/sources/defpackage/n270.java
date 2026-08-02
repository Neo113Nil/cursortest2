package defpackage;

import com.yandex.plus.core.benchmark.b;
import com.yandex.plus.home.benchmark.BenchmarkState;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class n270 implements eo2 {
    public final b a;
    public final wls b;
    public final AtomicReference c = new AtomicReference(BenchmarkState.NOT_STARTED);

    public n270(b bVar, wls wlsVar) {
        this.a = bVar;
        this.b = wlsVar;
    }

    public final void b() {
        AtomicReference atomicReference;
        BenchmarkState benchmarkState = BenchmarkState.STARTED;
        BenchmarkState benchmarkState2 = BenchmarkState.ERROR;
        do {
            atomicReference = this.c;
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
            atomicReference = this.c;
            if (atomicReference.compareAndSet(benchmarkState, benchmarkState2)) {
                this.a.b();
                return;
            }
        } while (atomicReference.get() == benchmarkState);
    }
}
