package ru.ok.tensorflow.smoothing.filter;

import xsna.u11;

/* loaded from: classes9.dex */
public class OneEuroFilterCyclic implements IFilter {
    private float beta;
    private float cycleLength;
    private float dCutoff;
    private float dxPrev;
    private float minCutoff;
    private long tPrev;
    private float xPrev;

    public OneEuroFilterCyclic(long j, float f, float f2, float f3, float f4, float f5, float f6) {
        this.minCutoff = f3;
        this.beta = f4;
        this.dCutoff = f5;
        this.xPrev = f;
        this.dxPrev = f2;
        this.tPrev = j;
        this.cycleLength = f6;
    }

    private float doExponentialSmoothing(float f, float f2, float f3) {
        return u11.b(1.0f, f, f3, f2 * f);
    }

    private float getSmoothingFactor(float f, float f2) {
        double d = f * 6.283185307179586d * f2;
        return (float) (d / (1.0d + d));
    }

    @Override // ru.ok.tensorflow.smoothing.filter.IFilter
    public float filter(long j, float f) {
        float f2 = this.xPrev;
        float f3 = this.cycleLength;
        float f4 = (f - f2) % f3;
        if (f4 > f3 / 2.0f) {
            this.xPrev = f2 + f3;
        } else if (f4 < (-f3) / 2.0f) {
            this.xPrev = f2 - f3;
        }
        float f5 = j - this.tPrev;
        float doExponentialSmoothing = doExponentialSmoothing(getSmoothingFactor(f5, this.dCutoff), f4, this.dxPrev);
        float doExponentialSmoothing2 = doExponentialSmoothing(getSmoothingFactor(f5, (Math.abs(doExponentialSmoothing) * this.beta) + this.minCutoff), f, this.xPrev);
        this.tPrev = j;
        this.xPrev = doExponentialSmoothing2;
        this.dxPrev = doExponentialSmoothing;
        return doExponentialSmoothing2;
    }
}
