package ru.ok.android.webrtc.utils.retry;

import xsna.zcl;

/* loaded from: classes9.dex */
public final class FixedIntervalAlgorithm implements BackoffAlgorithm {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_INTERVAL_MS = 500;
    public final long a;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public FixedIntervalAlgorithm() {
        this(0L, 1, null);
    }

    @Override // ru.ok.android.webrtc.utils.retry.BackoffAlgorithm
    public long interval(int i, long j) {
        return this.a;
    }

    public FixedIntervalAlgorithm(long j) {
        this.a = j;
    }

    public /* synthetic */ FixedIntervalAlgorithm(long j, int i, zcl zclVar) {
        this((i & 1) != 0 ? 500L : j);
    }
}
