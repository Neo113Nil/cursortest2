package ru.ok.media.utils;

/* loaded from: classes9.dex */
public class JitterEstimator {
    private static final double INV_WEIGHT = 0.99d;
    private static final double WEIGHT = 0.01d;
    private double jitter;
    private long lastSystemTime = -1;
    private int lastTimestamp;

    public double getJitter() {
        return this.jitter;
    }

    public void update(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.lastSystemTime;
        if (j < 0) {
            this.lastSystemTime = currentTimeMillis;
            this.lastTimestamp = i;
            return;
        }
        long abs = Math.abs((currentTimeMillis - j) - (i - this.lastTimestamp));
        this.lastTimestamp = i;
        this.lastSystemTime = currentTimeMillis;
        double d = this.jitter;
        if (d > 30000.0d) {
            return;
        }
        this.jitter = (abs * 0.01d) + (d * INV_WEIGHT);
    }
}
