package ru.ok.android.webrtc.utils;

/* loaded from: classes9.dex */
public class Ema {
    public final double a;
    public volatile double b;

    public Ema(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public double get() {
        return this.b;
    }

    public void set(double d) {
        this.b = d;
    }

    public void submit(double d) {
        double d2 = this.b;
        double d3 = this.a;
        this.b = ((1.0d - d3) * d2) + (d * d3);
    }

    public Ema(double d) {
        this.a = d;
    }
}
