package xsna;

import android.os.SystemClock;

/* compiled from: ClientHostAvailabilityInWindowChecker.kt */
/* loaded from: classes3.dex */
public final class llc {
    public final int a;
    public final long b;
    public final sk3<Long> c = new sk3<>();

    public llc(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final synchronized void a() {
        try {
            if (this.c.size() < this.a) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                while (!this.c.isEmpty() && elapsedRealtime - this.c.first().longValue() > this.b) {
                    this.c.removeFirst();
                }
                this.c.addLast(Long.valueOf(elapsedRealtime));
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b() {
        return this.c.size() >= this.a;
    }

    public final synchronized void c() {
        this.c.clear();
    }
}
