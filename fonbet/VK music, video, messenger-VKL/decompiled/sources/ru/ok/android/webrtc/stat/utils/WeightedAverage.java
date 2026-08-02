package ru.ok.android.webrtc.stat.utils;

/* loaded from: classes9.dex */
public class WeightedAverage {
    private volatile float value = Float.NaN;
    private final float weight;

    public WeightedAverage(float f) {
        this.weight = f;
    }

    public float getNext(float f) {
        if (Float.isNaN(this.value)) {
            return f;
        }
        float f2 = this.value;
        float f3 = this.weight;
        return (f * f3) + ((1.0f - f3) * f2);
    }

    public float getValue() {
        return this.value;
    }

    public void reset() {
        this.value = Float.NaN;
    }

    public float update(float f) {
        float next = getNext(f);
        this.value = next;
        return next;
    }
}
