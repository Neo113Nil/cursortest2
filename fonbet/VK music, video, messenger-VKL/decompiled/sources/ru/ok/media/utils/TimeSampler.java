package ru.ok.media.utils;

/* loaded from: classes9.dex */
public class TimeSampler implements TimeSamplerIface {
    private static final String TAG = "ru.ok.media.utils.TimeSampler";
    private long lastSignalTime;
    private final long logFrequency;
    private long maxDuration;
    private final String name;
    private long startTime;
    private long totalCalls;
    private long totalTime;

    public TimeSampler() {
        this(-1L, null);
    }

    private void addTime(long j) {
        if (j > this.maxDuration) {
            this.maxDuration = j;
        }
        long j2 = this.totalTime + j;
        this.totalTime = j2;
        long j3 = this.totalCalls + 1;
        this.totalCalls = j3;
        long j4 = this.logFrequency;
        if (j4 <= 0 || j3 % j4 != 0) {
            return;
        }
        long j5 = j2 / j3;
    }

    public long getTotalCalls() {
        return this.totalCalls;
    }

    public long getTotalTime() {
        return this.totalTime;
    }

    public void signal() {
        long nanoTime = System.nanoTime();
        long j = this.lastSignalTime;
        if (j > 0) {
            addTime(nanoTime - j);
        }
        this.lastSignalTime = nanoTime;
    }

    @Override // ru.ok.media.utils.TimeSamplerIface
    public void start() {
        this.startTime = System.nanoTime();
    }

    @Override // ru.ok.media.utils.TimeSamplerIface
    public void stop() {
        if (this.startTime > 0) {
            addTime(System.nanoTime() - this.startTime);
        }
    }

    public TimeSampler(long j, String str) {
        this.logFrequency = j;
        this.name = str;
    }
}
