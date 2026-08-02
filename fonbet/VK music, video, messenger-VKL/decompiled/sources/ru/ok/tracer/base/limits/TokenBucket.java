package ru.ok.tracer.base.limits;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import xsna.zcl;

/* compiled from: TokenBucket.kt */
/* loaded from: classes11.dex */
public final class TokenBucket {
    public static final Companion Companion = new Companion(null);
    private final int capacity;
    private final AtomicLong lastRefillTime;
    private final long refillIntervalNs;
    private final AtomicInteger tokens;

    /* compiled from: TokenBucket.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final TokenBucket oneShot(int i) {
            return new TokenBucket(i, Long.MAX_VALUE, (zcl) null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TokenBucket(int i, long j, zcl zclVar) {
        this(i, j);
    }

    private final void addTokens(int i) {
        int i2;
        do {
            i2 = this.tokens.get();
        } while (!this.tokens.compareAndSet(i2, Math.min(this.capacity, i2 + i)));
    }

    public static /* synthetic */ boolean allow$default(TokenBucket tokenBucket, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return tokenBucket.allow(i);
    }

    private final void refill() {
        long j;
        long j2;
        long j3;
        if (this.refillIntervalNs >= Long.MAX_VALUE) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            j = this.lastRefillTime.get();
            long j4 = nanoTime - j;
            j2 = this.refillIntervalNs;
            if (j4 < j2) {
                return;
            }
            j3 = j4 / j2;
        } while (!this.lastRefillTime.compareAndSet(j, (j2 * j3) + j));
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        addTokens((int) j3);
    }

    public final boolean allow(int i) {
        int i2;
        if (i <= 0) {
            throw new IllegalArgumentException("requested tokens must be positive");
        }
        refill();
        do {
            i2 = this.tokens.get();
            if (i2 < i) {
                return false;
            }
        } while (!this.tokens.compareAndSet(i2, i2 - i));
        return true;
    }

    private TokenBucket(int i, long j) {
        this.capacity = i;
        this.refillIntervalNs = j;
        this.tokens = new AtomicInteger(i);
        this.lastRefillTime = new AtomicLong(System.nanoTime());
        if (i <= 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
    }

    public TokenBucket(int i, long j, TimeUnit timeUnit) {
        this(i, timeUnit.toNanos(j) / i);
        if (this.refillIntervalNs <= 0) {
            throw new IllegalStateException("period must be >= capacity to avoid zero refill interval");
        }
    }
}
