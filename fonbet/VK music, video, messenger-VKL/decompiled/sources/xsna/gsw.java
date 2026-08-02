package xsna;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import xsna.cmx0;

/* compiled from: InMemoryTrackerStore.kt */
/* loaded from: classes3.dex */
public final class gsw implements shp0 {
    public final long a;
    public volatile cmx0 b;
    public final AtomicLong c;

    public gsw() {
        this(0L);
    }

    public final cmx0 a() {
        if (this.a <= 0) {
            return this.b;
        }
        if (this.c.get() <= 0) {
            return this.b;
        }
        if (this.c.get() >= SystemClock.elapsedRealtime()) {
            return this.b;
        }
        this.c.set(0L);
        cmx0.d dVar = cmx0.d.a;
        this.b = dVar;
        return dVar;
    }

    public final boolean b(cmx0 cmx0Var) {
        boolean z = !epx.f(this.b, cmx0Var);
        this.c.set(SystemClock.elapsedRealtime() + this.a);
        this.b = cmx0Var;
        return z;
    }

    public gsw(long j) {
        this.a = j;
        this.b = cmx0.d.a;
        this.c = new AtomicLong(0L);
    }
}
