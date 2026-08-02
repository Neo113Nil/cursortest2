package ru.ok.tensorflow.smoothing.filter;

import xsna.u11;

/* loaded from: classes9.dex */
public class OneEuroFilter implements IFilter {
    private float beta;
    private float dCutoff;
    private float dxPrev;
    private float minCutoff;
    private long tPrev;
    private float xPrev;

    public OneEuroFilter(long j, float f, float f2, float f3, float f4, float f5) {
        this.minCutoff = f3;
        this.beta = f4;
        this.dCutoff = f5;
        this.xPrev = f;
        this.dxPrev = f2;
        this.tPrev = j;
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
        float f2 = j - this.tPrev;
        float doExponentialSmoothing = doExponentialSmoothing(getSmoothingFactor(f2, this.dCutoff), (f - this.xPrev) / f2, this.dxPrev);
        float doExponentialSmoothing2 = doExponentialSmoothing(getSmoothingFactor(f2, (Math.abs(doExponentialSmoothing) * this.beta) + this.minCutoff), f, this.xPrev);
        this.tPrev = j;
        this.xPrev = doExponentialSmoothing2;
        this.dxPrev = doExponentialSmoothing;
        return doExponentialSmoothing2;
    }

    public void setBeta(float f) {
        this.beta = f;
    }
}
