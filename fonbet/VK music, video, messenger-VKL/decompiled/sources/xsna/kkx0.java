package xsna;

/* compiled from: WeightedAverage.java */
/* loaded from: classes8.dex */
public final class kkx0 {
    public final float a;
    public volatile float b = Float.NaN;

    public kkx0(float f) {
        this.a = f;
    }

    public final float a(float f) {
        if (Float.isNaN(this.b)) {
            return f;
        }
        float f2 = this.b;
        float f3 = this.a;
        return (f * f3) + ((1.0f - f3) * f2);
    }
}
