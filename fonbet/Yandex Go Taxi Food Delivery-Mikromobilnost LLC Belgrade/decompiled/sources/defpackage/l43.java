package defpackage;

/* loaded from: classes11.dex */
public final class l43 {
    public final int a;
    public final float b;
    public int c;
    public int d;
    public final float e;
    public final float f;
    public final int g;
    public final float h;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r6 > r3.b) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bf, code lost:
    
        if (r3.f <= r3.b) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l43(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
        float f7;
        this.a = i;
        float j = sb2.j(f, f2, f3);
        this.b = j;
        this.c = i2;
        this.e = f4;
        this.d = i3;
        this.f = f5;
        this.g = i4;
        float f8 = i4;
        float f9 = (f4 * i3) + (f5 * f8);
        float f10 = i2;
        float f11 = f6 - ((j * f10) + f9);
        if (i2 > 0 && f11 > 0.0f) {
            this.b = Math.min(f11 / f10, f3 - j) + j;
        } else if (i2 > 0 && f11 < 0.0f) {
            this.b = Math.max(f11 / f10, f2 - j) + j;
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
            float f18 = this.e;
            int i7 = this.d;
            if (f17 > 0.0f) {
                this.e = f18 - (min / i7);
                this.f = (min / f8) + this.f;
            } else {
                this.e = (min / i7) + f18;
                this.f -= min / f8;
            }
        }
        if (i4 <= 0 || this.c <= 0 || this.d <= 0) {
            if (i4 > 0) {
                if (this.c > 0) {
                }
            }
            f7 = i * Math.abs(f5 - this.f);
        } else {
            float f19 = this.f;
            float f20 = this.e;
            if (f19 > f20) {
            }
            f7 = Float.MAX_VALUE;
        }
        this.h = f7;
    }

    public static l43 a(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        l43 l43Var = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = length;
                    int i7 = i3;
                    int i8 = i;
                    int i9 = length2;
                    int i10 = i5;
                    l43 l43Var2 = new l43(i8, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    float f7 = l43Var2.h;
                    if (l43Var == null || f7 < l43Var.h) {
                        if (f7 == 0.0f) {
                            return l43Var2;
                        }
                        l43Var = l43Var2;
                    }
                    int i11 = i8 + 1;
                    i5 = i10 + 1;
                    i3 = i7;
                    i = i11;
                    length = i6;
                    length2 = i9;
                }
                i3++;
                i = i;
                length = length;
            }
        }
        return l43Var;
    }

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
        return uw51.i(sb, this.h, "]");
    }
}
