package xsna;

import android.graphics.RectF;
import android.text.Layout;
import com.unity3d.services.UnityAdsConstants;
import java.text.Bidi;
import xsna.zny;

/* compiled from: TextLayoutGetRangeForRectExtensions.android.kt */
/* loaded from: classes11.dex */
public final class ijo0 {
    public static final float a(float[] fArr, int i, int i2) {
        return fArr[ir.b(i, i2, 2, 1)];
    }

    public static final int b(fjo0 fjo0Var, Layout layout, zny znyVar, int i, RectF rectF, f5i0 f5i0Var, xa2 xa2Var, boolean z) {
        zny.a[] aVarArr;
        int i2;
        zny.a[] aVarArr2;
        int i3;
        int i4;
        int e;
        int i5;
        int i6;
        int d;
        Bidi createLineBidi;
        boolean z2;
        float a;
        float a2;
        float f;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i7 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i7];
        Layout layout2 = fjo0Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int f2 = fjo0Var.f(i);
        if (i7 < (f2 - lineStart2) * 2) {
            vzw.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        gfv gfvVar = new gfv(fjo0Var);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i8 = 0;
        while (lineStart2 < f2) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !isRtlCharAt) {
                a = gfvVar.a(z3, lineStart2, z3, true);
                f = gfvVar.a(true, lineStart2 + 1, true, true);
                z2 = z4;
            } else if (z4 && isRtlCharAt) {
                z2 = z4;
                f = gfvVar.a(false, lineStart2, false, false);
                a = gfvVar.a(true, lineStart2 + 1, true, false);
            } else {
                z2 = z4;
                if (isRtlCharAt) {
                    a2 = gfvVar.a(false, lineStart2, false, true);
                    a = gfvVar.a(true, lineStart2 + 1, true, true);
                } else {
                    a = gfvVar.a(false, lineStart2, false, false);
                    a2 = gfvVar.a(true, lineStart2 + 1, true, false);
                }
                f = a2;
            }
            fArr[i8] = a;
            fArr[i8 + 1] = f;
            i8 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = znyVar.a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int d2 = znyVar.d(lineStart3, false);
        int e2 = znyVar.e(d2);
        int i9 = lineStart3 - e2;
        int i10 = lineEnd2 - e2;
        Bidi a3 = znyVar.a(d2);
        if (a3 == null || (createLineBidi = a3.createLineBidi(i9, i10)) == null) {
            aVarArr = new zny.a[]{new zny.a(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            aVarArr = new zny.a[runCount];
            int i11 = 0;
            while (i11 < runCount) {
                int i12 = runCount;
                aVarArr[i11] = new zny.a(createLineBidi.getRunStart(i11) + lineStart3, createLineBidi.getRunLimit(i11) + lineStart3, createLineBidi.getRunLevel(i11) % 2 == 1);
                i11++;
                runCount = i12;
            }
        }
        i9x k9xVar = z ? new k9x(0, aVarArr.length - 1, 1) : swe0.m(aVarArr.length - 1, 0);
        int i13 = k9xVar.b;
        int i14 = k9xVar.c;
        int i15 = k9xVar.d;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return -1;
        }
        while (true) {
            zny.a aVar = aVarArr[i13];
            boolean z5 = aVar.c;
            int i16 = aVar.a;
            int i17 = aVar.b;
            float f3 = z5 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
            float a4 = z5 ? a(fArr, i16, lineStart) : a(fArr, i17 - 1, lineStart);
            if (z) {
                float f4 = rectF.left;
                if (a4 >= f4) {
                    i2 = i15;
                    float f5 = rectF.right;
                    if (f3 <= f5) {
                        if ((z5 || f4 > f3) && (!z5 || f5 < a4)) {
                            int i18 = i17;
                            int i19 = i16;
                            while (true) {
                                i5 = i18;
                                if (i18 - i19 <= 1) {
                                    break;
                                }
                                int i20 = (i5 + i19) / 2;
                                float f6 = fArr[(i20 - lineStart) * 2];
                                if ((z5 || f6 <= rectF.left) && (!z5 || f6 >= rectF.right)) {
                                    i18 = i5;
                                    i19 = i20;
                                } else {
                                    i18 = i20;
                                }
                            }
                            i6 = z5 ? i5 : i19;
                        } else {
                            i6 = i16;
                        }
                        int e3 = f5i0Var.e(i6);
                        if (e3 != -1 && (d = f5i0Var.d(e3)) < i17) {
                            if (d >= i16) {
                                i16 = d;
                            }
                            if (e3 > i17) {
                                e3 = i17;
                            }
                            aVarArr2 = aVarArr;
                            RectF rectF2 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineTop, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineBottom);
                            int i21 = e3;
                            while (true) {
                                rectF2.left = z5 ? fArr[((i21 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
                                rectF2.right = z5 ? a(fArr, i16, lineStart) : a(fArr, i21 - 1, lineStart);
                                if (!((Boolean) xa2Var.invoke(rectF2, rectF)).booleanValue()) {
                                    i16 = f5i0Var.c(i16);
                                    if (i16 == -1 || i16 >= i17) {
                                        break;
                                    }
                                    i21 = f5i0Var.e(i16);
                                    if (i21 > i17) {
                                        i21 = i17;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i16 = -1;
                        }
                    }
                } else {
                    i2 = i15;
                }
                aVarArr2 = aVarArr;
                i16 = -1;
            } else {
                i2 = i15;
                aVarArr2 = aVarArr;
                float f7 = rectF.left;
                if (a4 >= f7) {
                    float f8 = rectF.right;
                    if (f3 <= f8) {
                        if ((z5 || f8 < a4) && (!z5 || f7 > f3)) {
                            int i22 = i17;
                            int i23 = i16;
                            while (i22 - i23 > 1) {
                                int i24 = (i22 + i23) / 2;
                                float f9 = fArr[(i24 - lineStart) * 2];
                                int i25 = i22;
                                if ((z5 || f9 <= rectF.right) && (!z5 || f9 >= rectF.left)) {
                                    i22 = i25;
                                    i23 = i24;
                                } else {
                                    i22 = i24;
                                }
                            }
                            i4 = z5 ? i22 : i23;
                        } else {
                            i4 = i17 - 1;
                        }
                        int d3 = f5i0Var.d(i4 + 1);
                        if (d3 != -1 && (e = f5i0Var.e(d3)) > i16) {
                            if (d3 < i16) {
                                d3 = i16;
                            }
                            if (e <= i17) {
                                i17 = e;
                            }
                            RectF rectF3 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineTop, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineBottom);
                            int i26 = d3;
                            while (true) {
                                rectF3.left = z5 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i26 - lineStart) * 2];
                                rectF3.right = z5 ? a(fArr, i26, lineStart) : a(fArr, i17 - 1, lineStart);
                                if (!((Boolean) xa2Var.invoke(rectF3, rectF)).booleanValue()) {
                                    i17 = f5i0Var.b(i17);
                                    if (i17 == -1 || i17 <= i16) {
                                        break;
                                    }
                                    i26 = f5i0Var.d(i17);
                                    if (i26 < i16) {
                                        i26 = i16;
                                    }
                                } else {
                                    i3 = i17;
                                    break;
                                }
                            }
                        }
                    }
                }
                i3 = -1;
                i16 = i3;
            }
            if (i16 >= 0) {
                return i16;
            }
            if (i13 == i14) {
                return -1;
            }
            i13 += i2;
            i15 = i2;
            aVarArr = aVarArr2;
        }
    }
}
