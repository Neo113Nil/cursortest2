package org.chromium.base.metrics;

/* loaded from: classes8.dex */
public class HistogramBucket {
    public final int mCount;
    public final long mMax;
    public final int mMin;

    public HistogramBucket(int i, long j, int i2) {
        this.mMin = i;
        this.mMax = j;
        this.mCount = i2;
    }

    public boolean contains(int i) {
        return i >= this.mMin && ((long) i) < this.mMax;
    }
}
