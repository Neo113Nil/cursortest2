package xsna;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.g8i;

/* compiled from: CompletionMarkerUtils.kt */
/* loaded from: classes2.dex */
public final class tmy implements g8i {
    public final String a;
    public final gzs<s3q0> b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public tmy(String str, gzs<s3q0> gzsVar) {
        this.a = str;
        this.b = gzsVar;
    }

    @Override // xsna.g8i
    public final g8i.a a(long j, TimeUnit timeUnit) {
        long max = Math.max(0L, timeUnit.toMillis(j));
        Pair<Boolean, Long> c = c(j, timeUnit);
        boolean booleanValue = c.d().booleanValue();
        long longValue = c.g().longValue();
        return booleanValue ? new g8i.a(true, max, longValue, null, on00.f(new Pair(this, Long.valueOf(longValue))), EmptyList.b) : new g8i.a(true, max, longValue, this, jgp.b, EmptyList.b);
    }

    @Override // xsna.g8i
    public final void await() {
        if (this.c.compareAndSet(false, true)) {
            this.b.invoke();
        }
    }

    @Override // xsna.g8i
    public final boolean b(long j) {
        return c(j, TimeUnit.MILLISECONDS).i().booleanValue();
    }

    public final Pair<Boolean, Long> c(long j, TimeUnit timeUnit) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.c.compareAndSet(false, true)) {
            this.b.invoke();
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        return new Pair<>(Boolean.valueOf(!(elapsedRealtime2 > Math.max(0L, timeUnit.toMillis(j)))), Long.valueOf(elapsedRealtime2));
    }

    @Override // xsna.g8i
    public final String id() {
        return this.a;
    }

    public final String toString() {
        return ho8.a(new StringBuilder("LaunchedTaskMarker("), this.a, ')');
    }
}
