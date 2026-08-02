package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: ArcSpline.kt */
/* loaded from: classes11.dex */
public final class eg3 {
    public final a[][] a;

    /* compiled from: ArcSpline.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public float h;
        public float i;
        public final float[] j;
        public final float k;
        public final float l;
        public final float m;
        public final float n;
        public final float o;
        public final boolean p;
        public final float q;
        public final float r;

        public a(float f, float f2, float f3, float f4, int i, float f5, float f6) {
            boolean z;
            int i2;
            float f7;
            float f8;
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            float f9 = f5 - f3;
            float f10 = f6 - f4;
            float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            int i3 = 1;
            boolean z2 = i == 1 || (i == 4 ? f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : !(i != 5 || f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            float f12 = z2 ? -1.0f : 1.0f;
            this.m = f12;
            float f13 = 1 / (f2 - f);
            this.k = f13;
            float[] fArr = new float[101];
            this.j = fArr;
            boolean z3 = i == 3;
            if (z3 || Math.abs(f9) < 0.001f || Math.abs(f10) < 0.001f) {
                float hypot = (float) Math.hypot(f10, f9);
                this.g = hypot;
                this.l = hypot * f13;
                this.q = f9 * f13;
                this.r = f10 * f13;
                this.n = Float.NaN;
                this.o = Float.NaN;
                z = true;
            } else {
                this.n = f9 * f12;
                this.o = f10 * (-f12);
                this.q = z2 ? f5 : f3;
                this.r = z2 ? f4 : f6;
                float f14 = f5 - f3;
                float f15 = f4 - f6;
                float[] fArr2 = zq70.b;
                int i4 = 90;
                float f16 = 90;
                float f17 = f15;
                float f18 = 0.0f;
                float f19 = 0.0f;
                int i5 = 1;
                while (true) {
                    i2 = i3;
                    f7 = f11;
                    double d = (float) (((i5 * 90.0d) / i4) * 0.017453292519943295d);
                    float sin = ((float) Math.sin(d)) * f14;
                    float cos = ((float) Math.cos(d)) * f15;
                    float f20 = sin - f19;
                    f8 = f16;
                    f18 += (float) Math.hypot(f20, cos - f17);
                    fArr2[i5] = f18;
                    i4 = 90;
                    if (i5 == 90) {
                        break;
                    }
                    i5++;
                    f17 = cos;
                    f16 = f8;
                    f11 = f7;
                    f19 = sin;
                    i3 = i2;
                }
                this.g = f18;
                int i6 = i2;
                while (true) {
                    fArr2[i6] = fArr2[i6] / f18;
                    if (i6 == 90) {
                        break;
                    } else {
                        i6++;
                    }
                }
                int length = fArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    float f21 = i7 / 100.0f;
                    int binarySearch = Arrays.binarySearch(fArr2, 0, 91, f21);
                    if (binarySearch >= 0) {
                        fArr[i7] = binarySearch / f8;
                    } else if (binarySearch == -1) {
                        fArr[i7] = f7;
                    } else {
                        int i8 = -binarySearch;
                        int i9 = i8 - 2;
                        float f22 = i9;
                        float f23 = fArr2[i9];
                        fArr[i7] = (((f21 - f23) / (fArr2[i8 - 1] - f23)) + f22) / f8;
                    }
                }
                this.l = this.g * this.k;
                z = z3;
            }
            this.p = z;
        }

        public final float a() {
            float f = this.n * this.i;
            return f * this.m * (this.l / ((float) Math.hypot(f, (-this.o) * this.h)));
        }

        public final float b() {
            float f = this.n * this.i;
            float f2 = (-this.o) * this.h;
            return f2 * this.m * (this.l / ((float) Math.hypot(f, f2)));
        }

        public final void c(float f) {
            float f2 = (this.m == -1.0f ? this.b - f : f - this.a) * this.k;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f3 = 1.0f;
                if (f2 < 1.0f) {
                    float f4 = f2 * 100;
                    int i = (int) f4;
                    float[] fArr = this.j;
                    float f5 = fArr[i];
                    f3 = u11.b(fArr[i + 1], f5, f4 - i, f5);
                }
            }
            double d = f3 * 1.5707964f;
            this.h = (float) Math.sin(d);
            this.i = (float) Math.cos(d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r6 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[LOOP:1: B:14:0x0045->B:15:0x0047, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eg3(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length;
        int i2;
        int length2 = fArr.length - 1;
        a[][] aVarArr = new a[length2][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length2) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            i7 = 4;
                            if (i6 != 4) {
                                i7 = 5;
                                if (i6 != 5) {
                                    i = i4;
                                    float[] fArr3 = fArr2[i5];
                                    int i8 = i5 + 1;
                                    float[] fArr4 = fArr2[i8];
                                    float f = fArr[i5];
                                    float f2 = fArr[i8];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    a[] aVarArr2 = new a[length];
                                    i2 = 0;
                                    while (i2 < length) {
                                        int i9 = i2 * 2;
                                        a[] aVarArr3 = aVarArr2;
                                        int i10 = i2;
                                        int i11 = i9 + 1;
                                        aVarArr3[i10] = new a(f, f2, fArr3[i9], fArr3[i11], i, fArr4[i9], fArr4[i11]);
                                        i2 = i10 + 1;
                                        aVarArr2 = aVarArr3;
                                    }
                                    aVarArr[i5] = aVarArr2;
                                    i5 = i8;
                                    i4 = i;
                                }
                            }
                        }
                    }
                    i3 = 2;
                    i = i3;
                    float[] fArr32 = fArr2[i5];
                    int i82 = i5 + 1;
                    float[] fArr42 = fArr2[i82];
                    float f3 = fArr[i5];
                    float f22 = fArr[i82];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    a[] aVarArr22 = new a[length];
                    i2 = 0;
                    while (i2 < length) {
                    }
                    aVarArr[i5] = aVarArr22;
                    i5 = i82;
                    i4 = i;
                }
                i3 = 1;
                i = i3;
                float[] fArr322 = fArr2[i5];
                int i822 = i5 + 1;
                float[] fArr422 = fArr2[i822];
                float f32 = fArr[i5];
                float f222 = fArr[i822];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                a[] aVarArr222 = new a[length];
                i2 = 0;
                while (i2 < length) {
                }
                aVarArr[i5] = aVarArr222;
                i5 = i822;
                i4 = i;
            }
            i = i7;
            float[] fArr3222 = fArr2[i5];
            int i8222 = i5 + 1;
            float[] fArr4222 = fArr2[i8222];
            float f322 = fArr[i5];
            float f2222 = fArr[i8222];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            a[] aVarArr2222 = new a[length];
            i2 = 0;
            while (i2 < length) {
            }
            aVarArr[i5] = aVarArr2222;
            i5 = i8222;
            i4 = i;
        }
        this.a = aVarArr;
    }
}
