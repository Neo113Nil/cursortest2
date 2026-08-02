package ru.ok.media.utils;

/* loaded from: classes9.dex */
public class WeightedAverage {
    private volatile float value = Float.NaN;
    private final float weight;

    public WeightedAverage(float f) {
        this.weight = f;
    }

    public float getValue() {
        return this.value;
    }

    public void reset() {
        this.value = Float.NaN;
    }

    public void update(float f) {
        if (Float.isNaN(this.value)) {
            this.value = f;
            return;
        }
        float f2 = this.value;
        float f3 = this.weight;
        this.value = (f * f3) + ((1.0f - f3) * f2);
    }
}
