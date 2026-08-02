package ru.ok.tensorflow.smoothing.filter;

import xsna.u11;

/* loaded from: classes9.dex */
public class EmaFilter implements IFilter {
    private final float alpha;
    private long tPrev;
    private float xPrev;

    public EmaFilter(long j, float f, float f2) {
        this.alpha = f2;
        this.xPrev = f;
        this.tPrev = j;
    }

    @Override // ru.ok.tensorflow.smoothing.filter.IFilter
    public float filter(long j, float f) {
        float f2 = this.xPrev;
        float f3 = this.alpha;
        float b = u11.b(1.0f, f3, f, f2 * f3);
        this.xPrev = b;
        return b;
    }
}
