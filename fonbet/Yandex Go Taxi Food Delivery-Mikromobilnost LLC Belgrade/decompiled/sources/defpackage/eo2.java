package defpackage;

import com.yandex.plus.core.benchmark.b;
import com.yandex.plus.home.benchmark.BenchmarkState;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public interface eo2 {
    static void a(eo2 eo2Var) {
        n270 n270Var = (n270) eo2Var;
        b bVar = n270Var.a;
        AtomicReference atomicReference = n270Var.c;
        BenchmarkState benchmarkState = BenchmarkState.STARTED;
        BenchmarkState benchmarkState2 = BenchmarkState.COMPLETED;
        while (!atomicReference.compareAndSet(benchmarkState, benchmarkState2)) {
            if (atomicReference.get() != benchmarkState) {
                return;
            }
        }
        bVar.c();
        n270Var.b.invoke(bVar, null);
    }
}
