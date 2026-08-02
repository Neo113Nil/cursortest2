package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: StopLogicEngine.java */
/* loaded from: classes11.dex */
public final class cgl0 implements zfl0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public boolean k;
    public float l;
    public float m;
    public float n;

    @Override // xsna.zfl0
    public final float a() {
        return this.k ? -c(this.n) : c(this.n);
    }

    @Override // xsna.zfl0
    public final boolean b() {
        return a() < 1.0E-5f && Math.abs(this.i - this.m) < 1.0E-5f;
    }

    public final float c(float f) {
        float f2;
        float f3;
        float f4 = this.d;
        if (f <= f4) {
            f2 = this.a;
            f3 = this.b;
        } else {
            int i = this.j;
            if (i == 1) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            f -= f4;
            f4 = this.e;
            if (f >= f4) {
                if (i == 2) {
                    return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                float f5 = f - f4;
                float f6 = this.f;
                if (f5 >= f6) {
                    return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                float f7 = this.c;
                return f7 - ((f5 * f7) / f6);
            }
            f2 = this.b;
            f3 = this.c;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    public final void d(float f, float f2, float f3, float f4, float f5) {
        this.i = f2;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 1.0E-4f;
        }
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float sqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (sqrt < f4) {
                this.j = 2;
                this.a = f;
                this.b = sqrt;
                this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f8 = (sqrt - f) / f3;
                this.d = f8;
                this.e = sqrt / f3;
                this.g = ((f + sqrt) * f8) / 2.0f;
                this.h = f2;
                this.i = f2;
                return;
            }
            this.j = 3;
            this.a = f;
            this.b = f4;
            this.c = f4;
            float f9 = (f4 - f) / f3;
            this.d = f9;
            float f10 = f4 / f3;
            this.f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.e = ((f2 - f11) - f12) / f4;
            this.g = f11;
            this.h = f2 - f12;
            this.i = f2;
            return;
        }
        if (f7 >= f2) {
            this.j = 1;
            this.a = f;
            this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.g = f2;
            this.d = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.j = 2;
            this.a = f;
            this.b = f;
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.g = f13;
            this.h = f2;
            this.d = f14;
            this.e = f6;
            return;
        }
        float sqrt2 = (float) Math.sqrt(uq.a(f, f, 2.0f, f3 * f2));
        float f15 = (sqrt2 - f) / f3;
        this.d = f15;
        float f16 = sqrt2 / f3;
        this.e = f16;
        if (sqrt2 < f4) {
            this.j = 2;
            this.a = f;
            this.b = sqrt2;
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = f15;
            this.e = f16;
            this.g = ((f + sqrt2) * f15) / 2.0f;
            this.h = f2;
            return;
        }
        this.j = 3;
        this.a = f;
        this.b = f4;
        this.c = f4;
        float f17 = (f4 - f) / f3;
        this.d = f17;
        float f18 = f4 / f3;
        this.f = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.e = ((f2 - f19) - f20) / f4;
        this.g = f19;
        this.h = f2 - f20;
        this.i = f2;
    }

    @Override // xsna.zfl0
    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.d;
        if (f <= f3) {
            float f4 = this.a;
            f2 = ((((this.b - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.j;
            if (i == 1) {
                f2 = this.g;
            } else {
                float f5 = f - f3;
                float f6 = this.e;
                if (f5 < f6) {
                    float f7 = this.g;
                    float f8 = this.b;
                    f2 = ((((this.c - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.h;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.f;
                    if (f9 <= f10) {
                        float f11 = this.h;
                        float f12 = this.c * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.i;
                    }
                }
            }
        }
        this.m = f2;
        this.n = f;
        return this.k ? this.l - f2 : this.l + f2;
    }
}
