package xsna;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PeriodicalPerfStorageWriter.kt */
/* loaded from: classes3.dex */
public final class qx90 {
    public final dx90 a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    public final AtomicLong d;
    public final io.reactivex.rxjava3.disposables.c e;

    public qx90(dx90 dx90Var) {
        long millis = TimeUnit.SECONDS.toMillis(30L);
        this.a = dx90Var;
        this.b = new AtomicInteger();
        this.c = new AtomicInteger();
        this.d = new AtomicLong();
        this.e = io.reactivex.rxjava3.core.q.R(millis, TimeUnit.MILLISECONDS).subscribe(new fs00(new h2s(this, 29), 11));
    }

    public final AtomicInteger a() {
        return this.c;
    }

    public final AtomicInteger b() {
        return this.b;
    }

    public final AtomicLong c() {
        return this.d;
    }
}
