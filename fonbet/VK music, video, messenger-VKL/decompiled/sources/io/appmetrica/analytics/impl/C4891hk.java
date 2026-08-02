package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.hk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4891hk {
    public volatile long a;
    public C4937jf b;
    public TimeProvider c;

    public static C4891hk c() {
        return AbstractC4865gk.a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.a;
    }

    public final synchronized void b() {
        this.b.d(false);
        this.b.b();
    }

    public final synchronized long d() {
        return this.a;
    }

    public final synchronized void e() {
        a(C5342za.I.y(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.b.b(true);
    }

    public final synchronized void a(long j, @Nullable Long l) {
        try {
            this.a = (j - this.c.currentTimeMillis()) / 1000;
            boolean z = true;
            if (this.b.b(true)) {
                if (l != null) {
                    long abs = Math.abs(j - this.c.currentTimeMillis());
                    C4937jf c4937jf = this.b;
                    if (abs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                        z = false;
                    }
                    c4937jf.d(z);
                } else {
                    this.b.d(false);
                }
            }
            this.b.d(this.a);
            this.b.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(C4937jf c4937jf, TimeProvider timeProvider) {
        this.b = c4937jf;
        this.a = c4937jf.a(0);
        this.c = timeProvider;
    }
}
