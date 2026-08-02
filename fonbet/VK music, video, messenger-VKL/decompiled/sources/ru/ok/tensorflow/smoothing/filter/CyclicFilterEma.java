package ru.ok.tensorflow.smoothing.filter;

import xsna.u11;

/* loaded from: classes9.dex */
public class CyclicFilterEma implements IFilter {
    private final float alpha;
    private final float cycleLength = 6.2831855f;
    private float maxDeltaPerSec;
    private long tPrev;
    private float xPrev;

    public CyclicFilterEma(long j, float f, float f2, float f3) {
        this.alpha = f2;
        this.xPrev = f;
        this.tPrev = j;
        this.maxDeltaPerSec = f3;
    }

    private float ema(float f) {
        float f2 = this.xPrev;
        float f3 = this.alpha;
        return u11.b(1.0f, f3, f, f2 * f3);
    }

    @Override // ru.ok.tensorflow.smoothing.filter.IFilter
    public float filter(long j, float f) {
        long j2 = j - this.tPrev;
        this.tPrev = j;
        float f2 = this.xPrev;
        float f3 = this.cycleLength;
        float f4 = (f - f2) % f3;
        if (f4 > f3 / 2.0f) {
            this.xPrev = f2 + f3;
        } else if (f4 < (-f3) / 2.0f) {
            this.xPrev = f2 - f3;
        }
        float f5 = f - this.xPrev;
        float f6 = (j2 / 1000.0f) * this.maxDeltaPerSec;
        if (Math.abs(f5) > f6) {
            f5 = Math.signum(f5) * f6;
        }
        float ema = ema(this.xPrev + f5);
        this.xPrev = ema;
        return ema;
    }
}
