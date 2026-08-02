package xsna;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.g8i;

/* compiled from: CompletionMarkerUtils.kt */
/* loaded from: classes2.dex */
public final class wwj implements g8i {
    public final String a;
    public final CountDownLatch b;

    public wwj(String str, CountDownLatch countDownLatch) {
        this.a = str;
        this.b = countDownLatch;
    }

    @Override // xsna.g8i
    public final g8i.a a(long j, TimeUnit timeUnit) {
        long max = Math.max(0L, timeUnit.toMillis(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean await = this.b.await(j, timeUnit);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (!await) {
            return new g8i.a(false, max, max, this, jgp.b, EmptyList.b);
        }
        long j2 = elapsedRealtime2 - elapsedRealtime;
        return new g8i.a(true, max, j2, null, on00.f(new Pair(this, Long.valueOf(j2))), EmptyList.b);
    }

    @Override // xsna.g8i
    public final void await() {
        if (!this.b.await(300L, TimeUnit.SECONDS)) {
            throw new IllegalStateException(i5s.a(new StringBuilder("CompletionMarker "), this.a, " await timed out after 300 seconds"));
        }
    }

    @Override // xsna.g8i
    public final boolean b(long j) {
        return this.b.await(j, TimeUnit.MILLISECONDS);
    }

    @Override // xsna.g8i
    public final String id() {
        return this.a;
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CountDownLatchMarker("), this.a, ')');
    }
}
