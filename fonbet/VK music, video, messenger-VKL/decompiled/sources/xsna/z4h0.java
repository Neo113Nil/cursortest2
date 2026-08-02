package xsna;

import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: ScaleState.kt */
/* loaded from: classes18.dex */
public final class z4h0 {
    public static final long[] f;
    public static final long g;
    public static final float h;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;

    /* compiled from: ScaleState.kt */
    public static final class a {
    }

    static {
        long[] jArr = {ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, 15000, 10000, 5000, 2000, 1000, 500, 250};
        f = jArr;
        long j = jArr[7];
        g = j;
        h = (igs.m / ((org0.n + org0.m) * 1.0f)) * j;
    }

    public final void a() {
        float f2 = (org0.n + org0.m) * this.b;
        this.e = f2;
        this.c = (igs.m / f2) * b();
        this.d = g / (b() / this.b);
    }

    public final long b() {
        return f[this.a];
    }

    public final long c(float f2) {
        return (long) ((this.c / igs.m) * f2);
    }

    public final float d(long j) {
        return (j / this.c) * igs.m;
    }
}
