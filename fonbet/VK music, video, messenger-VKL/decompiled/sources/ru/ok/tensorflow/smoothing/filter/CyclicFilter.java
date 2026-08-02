package ru.ok.tensorflow.smoothing.filter;

/* loaded from: classes9.dex */
public class CyclicFilter implements IFilter {
    private final float maxDxPerMs;
    private long tPrev;
    private float xPrev;

    public CyclicFilter(long j, float f, float f2) {
        this.maxDxPerMs = f2;
        this.xPrev = f;
        this.tPrev = j;
    }

    @Override // ru.ok.tensorflow.smoothing.filter.IFilter
    public float filter(long j, float f) {
        long j2 = j - this.tPrev;
        this.tPrev = j;
        float f2 = this.xPrev;
        float f3 = (f - f2) % 360.0f;
        if (f3 > 180.0f) {
            this.xPrev = f2 + 360.0f;
        } else if (f3 < -180.0f) {
            this.xPrev = f2 - 360.0f;
        }
        float f4 = f - this.xPrev;
        float f5 = this.maxDxPerMs * j2;
        float max = this.xPrev + Math.max(-f5, Math.min(f4, f5));
        this.xPrev = max;
        return max;
    }
}
