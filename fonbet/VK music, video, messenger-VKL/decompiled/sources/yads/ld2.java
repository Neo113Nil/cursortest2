package yads;

import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* loaded from: classes10.dex */
public final class ld2 extends j03 {
    public final kc2 m = new kc2();
    public final kc2 n = new kc2();
    public final kd2 o = new kd2();
    public Inflater p;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // yads.j03
    public final v53 a(byte[] bArr, int i, boolean z) {
        char c;
        o20 o20Var;
        int i2;
        kc2 kc2Var;
        int i3;
        int i4;
        int o;
        kc2 kc2Var2 = this.m;
        kc2Var2.a = bArr;
        kc2Var2.c = i;
        int i5 = 0;
        kc2Var2.b = 0;
        char c2 = 255;
        if (i > 0 && (bArr[0] & 255) == 120) {
            if (this.p == null) {
                this.p = new Inflater();
            }
            if (mc3.a(kc2Var2, this.n, this.p)) {
                kc2 kc2Var3 = this.n;
                byte[] bArr2 = kc2Var3.a;
                int i6 = kc2Var3.c;
                kc2Var2.a = bArr2;
                kc2Var2.c = i6;
                kc2Var2.b = 0;
            }
        }
        kd2 kd2Var = this.o;
        kd2Var.d = 0;
        kd2Var.e = 0;
        kd2Var.f = 0;
        kd2Var.g = 0;
        kd2Var.h = 0;
        kd2Var.i = 0;
        kd2Var.a.c(0);
        kd2Var.c = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            kc2 kc2Var4 = this.m;
            int i7 = kc2Var4.c;
            if (i7 - kc2Var4.b < 3) {
                return new md2(Collections.unmodifiableList(arrayList));
            }
            kd2 kd2Var2 = this.o;
            int m = kc2Var4.m();
            int r = kc2Var4.r();
            int i8 = kc2Var4.b + r;
            if (i8 > i7) {
                kc2Var4.e(i7);
                i2 = i5;
                c = c2;
                o20Var = null;
            } else {
                int i9 = 128;
                if (m != 128) {
                    switch (m) {
                        case 20:
                            kd2Var2.getClass();
                            if (r % 5 == 2) {
                                kc2Var4.e(kc2Var4.b + 2);
                                Arrays.fill(kd2Var2.b, i5);
                                int i10 = r / 5;
                                int i11 = i5;
                                while (i11 < i10) {
                                    int m2 = kc2Var4.m();
                                    int m3 = kc2Var4.m();
                                    int m4 = kc2Var4.m();
                                    int m5 = kc2Var4.m();
                                    int m6 = kc2Var4.m();
                                    double d = m3;
                                    double d2 = m4 - i9;
                                    int i12 = i9;
                                    int i13 = (int) ((1.402d * d2) + d);
                                    double d3 = m5 - 128;
                                    int i14 = (int) ((d - (0.34414d * d3)) - (d2 * 0.71414d));
                                    int i15 = (int) ((d3 * 1.772d) + d);
                                    kd2Var2 = kd2Var2;
                                    int[] iArr = kd2Var2.b;
                                    int i16 = mc3.a;
                                    iArr[m2] = (Math.max(0, Math.min(i13, 255)) << 16) | (m6 << 24) | (Math.max(0, Math.min(i14, 255)) << 8) | Math.max(0, Math.min(i15, 255));
                                    i11++;
                                    c2 = 255;
                                    i9 = i12;
                                }
                                c = c2;
                                kd2Var2.c = true;
                                break;
                            }
                            c = c2;
                            break;
                        case 21:
                            kd2Var2.getClass();
                            if (r >= 4) {
                                kc2Var4.e(kc2Var4.b + 3);
                                int i17 = r - 4;
                                if (((128 & kc2Var4.m()) != 0 ? 1 : i5) != 0) {
                                    if (i17 >= 7 && (o = kc2Var4.o()) >= 4) {
                                        kd2Var2.h = kc2Var4.r();
                                        kd2Var2.i = kc2Var4.r();
                                        kd2Var2.a.c(o - 4);
                                        i17 = r - 11;
                                    }
                                }
                                kc2 kc2Var5 = kd2Var2.a;
                                int i18 = kc2Var5.b;
                                int i19 = kc2Var5.c;
                                if (i18 < i19 && i17 > 0) {
                                    int min = Math.min(i17, i19 - i18);
                                    kc2Var4.a(kd2Var2.a.a, i18, min);
                                    kd2Var2.a.e(i18 + min);
                                }
                            }
                            c = c2;
                            break;
                        case 22:
                            kd2Var2.getClass();
                            if (r >= 19) {
                                kd2Var2.d = kc2Var4.r();
                                kd2Var2.e = kc2Var4.r();
                                kc2Var4.e(kc2Var4.b + 11);
                                kd2Var2.f = kc2Var4.r();
                                kd2Var2.g = kc2Var4.r();
                            }
                            c = c2;
                            break;
                        default:
                            c = c2;
                            break;
                    }
                    o20Var = null;
                    i2 = 0;
                } else {
                    c = c2;
                    if (kd2Var2.d == 0 || kd2Var2.e == 0 || kd2Var2.h == 0 || kd2Var2.i == 0 || (i3 = (kc2Var = kd2Var2.a).c) == 0 || kc2Var.b != i3 || !kd2Var2.c) {
                        o20Var = null;
                    } else {
                        kc2Var.e(0);
                        int i20 = kd2Var2.h * kd2Var2.i;
                        int[] iArr2 = new int[i20];
                        int i21 = 0;
                        while (i21 < i20) {
                            int m7 = kd2Var2.a.m();
                            if (m7 != 0) {
                                i4 = i21 + 1;
                                iArr2[i21] = kd2Var2.b[m7];
                            } else {
                                int m8 = kd2Var2.a.m();
                                if (m8 != 0) {
                                    i4 = ((m8 & 64) == 0 ? m8 & 63 : ((m8 & 63) << 8) | kd2Var2.a.m()) + i21;
                                    Arrays.fill(iArr2, i21, i4, (m8 & 128) == 0 ? 0 : kd2Var2.b[kd2Var2.a.m()]);
                                }
                            }
                            i21 = i4;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, kd2Var2.h, kd2Var2.i, Bitmap.Config.ARGB_8888);
                        float f = kd2Var2.f;
                        float f2 = kd2Var2.d;
                        float f3 = f / f2;
                        float f4 = kd2Var2.g;
                        float f5 = kd2Var2.e;
                        o20Var = new o20(null, null, null, createBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, kd2Var2.h / f2, kd2Var2.i / f5, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    i2 = 0;
                    kd2Var2.d = 0;
                    kd2Var2.e = 0;
                    kd2Var2.f = 0;
                    kd2Var2.g = 0;
                    kd2Var2.h = 0;
                    kd2Var2.i = 0;
                    kd2Var2.a.c(0);
                    kd2Var2.c = false;
                }
                kc2Var4.e(i8);
            }
            if (o20Var != null) {
                arrayList.add(o20Var);
            }
            c2 = c;
            i5 = i2;
        }
    }
}
