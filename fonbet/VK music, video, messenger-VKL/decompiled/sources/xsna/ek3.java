package xsna;

import androidx.annotation.NonNull;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: Arrangement.java */
/* loaded from: classes13.dex */
public final class ek3 {
    public final int a;
    public final float b;
    public int c;
    public int d;
    public final float e;
    public final float f;
    public final int g;
    public final float h;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5 > r3.b) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        if (r3.f <= r3.b) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ek3(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, int i3, int i4) {
        float f7;
        this.a = i;
        float a = xwk.a(f, f2, f3);
        this.b = a;
        this.c = i2;
        this.e = f4;
        this.d = i3;
        this.f = f5;
        this.g = i4;
        float f8 = i4;
        float f9 = (f4 * i3) + (f5 * f8);
        float f10 = i2;
        float f11 = f6 - ((a * f10) + f9);
        if (i2 > 0 && f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.b = Math.min(f11 / f10, f3 - a) + a;
        } else if (i2 > 0 && f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.b = Math.max(f11 / f10, f2 - a) + a;
        }
        int i5 = this.c;
        float f12 = i5 > 0 ? this.b : 0.0f;
        this.b = f12;
        int i6 = this.d;
        float f13 = i6;
        float f14 = f13 / 2.0f;
        float f15 = (f6 - ((i5 + f14) * (i5 > 0 ? f12 : 0.0f))) / (f14 + f8);
        this.f = f15;
        float f16 = (f12 + f15) / 2.0f;
        this.e = f16;
        if (i6 > 0 && f15 != f5) {
            float f17 = (f5 - f15) * f8;
            float min = Math.min(Math.abs(f17), f16 * 0.1f * f13);
            if (f17 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.e -= min / this.d;
                this.f = (min / f8) + this.f;
            } else {
                this.e = (min / this.d) + this.e;
                this.f -= min / f8;
            }
        }
        if (i4 <= 0 || this.c <= 0 || this.d <= 0) {
            if (i4 > 0) {
                if (this.c > 0) {
                }
            }
            f7 = Math.abs(f5 - this.f) * i;
        } else {
            float f18 = this.f;
            float f19 = this.e;
            if (f18 > f19) {
            }
            f7 = Float.MAX_VALUE;
        }
        this.h = f7;
    }

    public static ek3 a(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        ek3 ek3Var = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = i;
                int i6 = 0;
                while (i6 < length2) {
                    int i7 = length;
                    int i8 = i3;
                    int i9 = length2;
                    ek3 ek3Var2 = new ek3(f2, f3, f4, f5, f6, f, i5, iArr[i6], i4, i2);
                    float f7 = ek3Var2.h;
                    if (ek3Var == null || f7 < ek3Var.h) {
                        if (f7 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            return ek3Var2;
                        }
                        ek3Var = ek3Var2;
                    }
                    i5++;
                    i6++;
                    length = i7;
                    i3 = i8;
                    length2 = i9;
                }
                i3++;
                i = i5;
            }
        }
        return ek3Var;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Arrangement [priority=");
        sb.append(this.a);
        sb.append(", smallCount=");
        sb.append(this.c);
        sb.append(", smallSize=");
        sb.append(this.b);
        sb.append(", mediumCount=");
        sb.append(this.d);
        sb.append(", mediumSize=");
        sb.append(this.e);
        sb.append(", largeCount=");
        sb.append(this.g);
        sb.append(", largeSize=");
        sb.append(this.f);
        sb.append(", cost=");
        return shy.c(this.h, X3.j.e, sb);
    }
}
