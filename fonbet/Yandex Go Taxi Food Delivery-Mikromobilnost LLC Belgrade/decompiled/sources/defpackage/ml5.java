package defpackage;

import com.yandex.plus.core.benchmark.Benchmark$State;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class ml5 {
    public final AtomicReference a;
    public volatile long b = 0;
    public volatile long c = 0;

    public ml5(Benchmark$State benchmark$State) {
        this.a = new AtomicReference(benchmark$State);
    }
}
