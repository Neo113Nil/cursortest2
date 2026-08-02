package ru.ok.android.webrtc.utils.retry;

import kotlin.NoWhenBranchMatchedException;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class Backoff {
    public static final long ABORT = 0;
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_MAX_ELAPSED_TIME_MS = Long.MAX_VALUE;
    public static final int DEFAULT_MAX_RETRY_COUNT = Integer.MAX_VALUE;
    public final BackoffAlgorithm a;
    public final int b;
    public final long c;
    public int d;
    public long e;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public Backoff(BackoffAlgorithm backoffAlgorithm, int i, long j) {
        this.a = backoffAlgorithm;
        this.b = i;
        this.c = j;
    }

    public final long getElapsedTimeMs() {
        return this.e;
    }

    public final int getRetryCount() {
        return this.d;
    }

    public final long interval() {
        int i = this.d + 1;
        this.d = i;
        if (i > this.b) {
            return 0L;
        }
        long interval = this.a.interval(i, this.e);
        if (interval == 0) {
            return 0L;
        }
        if (interval < 0) {
            throw new IllegalStateException("Interval is invalid. Must be greater than 0.");
        }
        long j = this.e + interval;
        this.e = j;
        boolean z = j > this.c;
        if (z) {
            return 0L;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return interval;
    }
}
