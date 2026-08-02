package xsna;

import one.video.streaming.tools.TimeMachine;

/* compiled from: TokenBucket.java */
/* loaded from: classes8.dex */
public abstract class s1p0 {
    TimeMachine _timeMachine;
    private final long accumulatorSizeMS;
    private long lastTime;
    private long tokens;

    public s1p0(TimeMachine timeMachine) {
        this(timeMachine, 0L, 1000L);
    }

    public void addTokens() {
        long currentTimeMillis = this._timeMachine.currentTimeMillis();
        long bWLimit = getBWLimit() / 8;
        this.tokens = Math.min((((currentTimeMillis - this.lastTime) * bWLimit) / 1000) + this.tokens, (bWLimit * this.accumulatorSizeMS) / 1000);
        this.lastTime = currentTimeMillis;
    }

    public abstract long getBWLimit();

    public long getTokens() {
        return this.tokens;
    }

    public long requestTokens(long j) {
        long j2 = this.tokens;
        long max = Math.max(0L, j2 - j);
        this.tokens = max;
        return j2 - max;
    }

    public boolean tryRequestTokens(long j) {
        long j2 = this.tokens;
        if (j2 < j) {
            return false;
        }
        this.tokens = Math.max(0L, j2 - j);
        return true;
    }

    public s1p0(TimeMachine timeMachine, long j, long j2) {
        this._timeMachine = timeMachine;
        this.lastTime = timeMachine.currentTimeMillis() - j;
        this.accumulatorSizeMS = j2;
    }
}
