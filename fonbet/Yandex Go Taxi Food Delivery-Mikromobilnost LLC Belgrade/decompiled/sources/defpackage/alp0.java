package defpackage;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* loaded from: classes6.dex */
public final class alp0 {
    public static final float r = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float s = 800.0f;
    public static final float t = 0.4f;
    public static final float u = 1.0f - 0.4f;
    public static final float[] v = new float[101];
    public static final float w;
    public static final float x;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public int i;
    public float j;
    public float k;
    public float l;
    public final Interpolator n;
    public float p;
    public final float q;
    public boolean m = true;
    public final boolean o = true;

    static {
        float f;
        float f2;
        float f3 = 0.0f;
        for (int i = 0; i <= 100; i++) {
            float f4 = i / 100.0f;
            float f5 = 1.0f;
            while (true) {
                float a = n.a(f5, f3, 2.0f, f3);
                float f6 = 1.0f - a;
                f = 3.0f * a * f6;
                f2 = a * a * a;
                float b = x4e.b(a, u, f6 * t, f) + f2;
                if (Math.abs(b - f4) < 1.0E-5d) {
                    break;
                } else if (b > f4) {
                    f5 = a;
                } else {
                    f3 = a;
                }
            }
            v[i] = f + f2;
        }
        v[100] = 1.0f;
        w = 8.0f;
        x = 1.0f;
        x = 1.0f / c(1.0f);
    }

    public alp0(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.n = decelerateInterpolator;
        this.q = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float c(float f) {
        float f2 = f * w;
        return (f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : g8e.b(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f)) * x;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, int i2) {
        int i3;
        int i4;
        if (this.o && !this.m) {
            float currentAnimationTimeMillis = this.p - ((this.q * ((int) (AnimationUtils.currentAnimationTimeMillis() - this.h))) / 2000.0f);
            float f = this.c;
            float f2 = this.d - this.b;
            float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            float f3 = (f / sqrt) * currentAnimationTimeMillis;
            float f4 = (f2 / sqrt) * currentAnimationTimeMillis;
            if (Math.signum(0.0f) == Math.signum(f3)) {
                i3 = i2;
                float f5 = i3;
                if (Math.signum(f5) == Math.signum(f4)) {
                    i4 = (int) (f3 + 0.0f);
                    i3 = (int) (f5 + f4);
                    this.a = 1;
                    this.m = false;
                    float sqrt2 = (float) Math.sqrt((i3 * i3) + (i4 * i4));
                    this.p = sqrt2;
                    float f6 = t * sqrt2;
                    float f7 = s;
                    double log = Math.log(f6 / f7);
                    double d = r;
                    double d2 = d - 1.0d;
                    this.i = (int) (Math.exp(log / d2) * 1000.0d);
                    this.h = AnimationUtils.currentAnimationTimeMillis();
                    this.b = i;
                    float f8 = sqrt2 == 0.0f ? 1.0f : i4 / sqrt2;
                    float f9 = sqrt2 != 0.0f ? i3 / sqrt2 : 1.0f;
                    double exp = Math.exp((d / d2) * log);
                    this.e = Integer.MAX_VALUE;
                    float f10 = (int) (exp * f7);
                    int round = Math.round(f8 * f10);
                    this.c = round;
                    int min = Math.min(round, 0);
                    this.c = min;
                    this.c = Math.max(min, 0);
                    int round2 = Math.round(f10 * f9) + i;
                    this.d = round2;
                    int min2 = Math.min(round2, this.e);
                    this.d = min2;
                    this.d = Math.max(min2, 0);
                }
                i4 = 0;
                this.a = 1;
                this.m = false;
                float sqrt22 = (float) Math.sqrt((i3 * i3) + (i4 * i4));
                this.p = sqrt22;
                float f62 = t * sqrt22;
                float f72 = s;
                double log2 = Math.log(f62 / f72);
                double d3 = r;
                double d22 = d3 - 1.0d;
                this.i = (int) (Math.exp(log2 / d22) * 1000.0d);
                this.h = AnimationUtils.currentAnimationTimeMillis();
                this.b = i;
                if (sqrt22 == 0.0f) {
                }
                if (sqrt22 != 0.0f) {
                }
                double exp2 = Math.exp((d3 / d22) * log2);
                this.e = Integer.MAX_VALUE;
                float f102 = (int) (exp2 * f72);
                int round3 = Math.round(f8 * f102);
                this.c = round3;
                int min3 = Math.min(round3, 0);
                this.c = min3;
                this.c = Math.max(min3, 0);
                int round22 = Math.round(f102 * f9) + i;
                this.d = round22;
                int min22 = Math.min(round22, this.e);
                this.d = min22;
                this.d = Math.max(min22, 0);
            }
        }
        i3 = i2;
        i4 = 0;
        this.a = 1;
        this.m = false;
        float sqrt222 = (float) Math.sqrt((i3 * i3) + (i4 * i4));
        this.p = sqrt222;
        float f622 = t * sqrt222;
        float f722 = s;
        double log22 = Math.log(f622 / f722);
        double d32 = r;
        double d222 = d32 - 1.0d;
        this.i = (int) (Math.exp(log22 / d222) * 1000.0d);
        this.h = AnimationUtils.currentAnimationTimeMillis();
        this.b = i;
        if (sqrt222 == 0.0f) {
        }
        if (sqrt222 != 0.0f) {
        }
        double exp22 = Math.exp((d32 / d222) * log22);
        this.e = Integer.MAX_VALUE;
        float f1022 = (int) (exp22 * f722);
        int round32 = Math.round(f8 * f1022);
        this.c = round32;
        int min32 = Math.min(round32, 0);
        this.c = min32;
        this.c = Math.max(min32, 0);
        int round222 = Math.round(f1022 * f9) + i;
        this.d = round222;
        int min222 = Math.min(round222, this.e);
        this.d = min222;
        this.d = Math.max(min222, 0);
    }

    public final void b(int i, int i2) {
        this.a = 0;
        this.m = false;
        this.i = i2;
        this.h = AnimationUtils.currentAnimationTimeMillis();
        this.b = 0;
        this.c = 0;
        this.d = i;
        this.k = 0.0f;
        this.l = i;
        this.j = 1.0f / this.i;
    }
}
