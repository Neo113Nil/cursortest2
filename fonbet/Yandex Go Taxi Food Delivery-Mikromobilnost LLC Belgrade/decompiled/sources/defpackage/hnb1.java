package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import com.yandex.xplat.payment.sdk.MobileBackendInvalidAuthorizationError;
import java.text.Bidi;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public abstract class hnb1 {
    public static final boolean a(int i) {
        return i == 0;
    }

    public static tyj0 b(String str, String str2) {
        boolean f = thb1.f(str);
        boolean f2 = thb1.f(str2);
        if (f && f2) {
            return coa1.i(null);
        }
        if (f && !f2) {
            MobileBackendInvalidAuthorizationError mobileBackendInvalidAuthorizationError = new MobileBackendInvalidAuthorizationError("Mobile backend invalid authorization error: \"Oauth\" field is missing. Please, make sure that both \"Oauth\" & \"Uid\" values are provided.");
            LinkedHashMap linkedHashMap = zdz.a;
            ogb1.b(mobileBackendInvalidAuthorizationError.getMessage());
            return coa1.h(mobileBackendInvalidAuthorizationError);
        }
        if (f || !f2) {
            return coa1.i(new rs20(str, str2));
        }
        MobileBackendInvalidAuthorizationError mobileBackendInvalidAuthorizationError2 = new MobileBackendInvalidAuthorizationError("Mobile backend invalid authorization error: \"Uid\" field is missing. Please, make sure that both \"Oauth\" & \"Uid\" values are provided.");
        LinkedHashMap linkedHashMap2 = zdz.a;
        ogb1.b(mobileBackendInvalidAuthorizationError2.getMessage());
        return coa1.h(mobileBackendInvalidAuthorizationError2);
    }

    public static final float c(int i, int i2, float[] fArr) {
        return fArr[g8e.d(i, i2, 2, 1)];
    }

    public static final int d(zqy0 zqy0Var, Layout layout, q4g q4gVar, int i, RectF rectF, l8q0 l8q0Var, tn1 tn1Var, boolean z) {
        h0y[] h0yVarArr;
        h0y[] h0yVarArr2;
        int i2;
        int i3;
        int g;
        int i4;
        int i5;
        int f;
        Bidi createLineBidi;
        boolean z2;
        float a;
        float a2;
        float f2;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i6 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i6];
        Layout layout2 = zqy0Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int f3 = zqy0Var.f(i);
        if (i6 < (f3 - lineStart2) * 2) {
            jxv.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        xqu xquVar = new xqu(zqy0Var);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i7 = 0;
        while (lineStart2 < f3) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !isRtlCharAt) {
                a = xquVar.a(lineStart2, z3, z3, true);
                f2 = xquVar.a(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && isRtlCharAt) {
                z2 = z4;
                f2 = xquVar.a(lineStart2, false, false, false);
                a = xquVar.a(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (isRtlCharAt) {
                    a2 = xquVar.a(lineStart2, false, false, true);
                    a = xquVar.a(lineStart2 + 1, true, true, true);
                } else {
                    a = xquVar.a(lineStart2, false, false, false);
                    a2 = xquVar.a(lineStart2 + 1, true, true, false);
                }
                f2 = a2;
            }
            fArr[i7] = a;
            fArr[i7 + 1] = f2;
            i7 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) q4gVar.b;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int i8 = q4gVar.i(lineStart3, false);
        int j = q4gVar.j(i8);
        int i9 = lineStart3 - j;
        int i10 = lineEnd2 - j;
        Bidi a3 = q4gVar.a(i8);
        if (a3 == null || (createLineBidi = a3.createLineBidi(i9, i10)) == null) {
            h0yVarArr = new h0y[]{new h0y(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            h0yVarArr = new h0y[runCount];
            int i11 = 0;
            while (i11 < runCount) {
                int i12 = runCount;
                h0yVarArr[i11] = new h0y(createLineBidi.getRunStart(i11) + lineStart3, createLineBidi.getRunLimit(i11) + lineStart3, createLineBidi.getRunLevel(i11) % 2 == 1);
                i11++;
                runCount = i12;
            }
        }
        b6w F = z ? j73.F(h0yVarArr) : y6i0.i(h0yVarArr.length - 1, 0);
        int i13 = F.a;
        int i14 = F.b;
        int i15 = F.c;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return -1;
        }
        while (true) {
            h0y h0yVar = h0yVarArr[i13];
            boolean z5 = h0yVar.c;
            int i16 = h0yVar.a;
            int i17 = h0yVar.b;
            float f4 = z5 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
            float c = z5 ? c(i16, lineStart, fArr) : c(i17 - 1, lineStart, fArr);
            float f5 = rectF.left;
            int i18 = i15;
            if (z) {
                if (c >= f5) {
                    float f6 = rectF.right;
                    if (f4 <= f6) {
                        if ((z5 || f5 > f4) && (!z5 || f6 < c)) {
                            int i19 = i17;
                            int i20 = i16;
                            while (true) {
                                i4 = i19;
                                if (i19 - i20 <= 1) {
                                    break;
                                }
                                int i21 = (i4 + i20) / 2;
                                float f7 = fArr[(i21 - lineStart) * 2];
                                if ((z5 || f7 <= rectF.left) && (!z5 || f7 >= rectF.right)) {
                                    i19 = i4;
                                    i20 = i21;
                                } else {
                                    i19 = i21;
                                }
                            }
                            i5 = z5 ? i4 : i20;
                        } else {
                            i5 = i16;
                        }
                        int g2 = l8q0Var.g(i5);
                        if (g2 != -1 && (f = l8q0Var.f(g2)) < i17) {
                            if (f >= i16) {
                                i16 = f;
                            }
                            if (g2 > i17) {
                                g2 = i17;
                            }
                            h0yVarArr2 = h0yVarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i22 = g2;
                            while (true) {
                                rectF2.left = z5 ? fArr[((i22 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
                                rectF2.right = z5 ? c(i16, lineStart, fArr) : c(i22 - 1, lineStart, fArr);
                                if (!((Boolean) tn1Var.invoke(rectF2, rectF)).booleanValue()) {
                                    i16 = l8q0Var.e(i16);
                                    if (i16 == -1 || i16 >= i17) {
                                        break;
                                    }
                                    i22 = l8q0Var.g(i16);
                                    if (i22 > i17) {
                                        i22 = i17;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i16 = -1;
                        }
                    }
                }
                h0yVarArr2 = h0yVarArr;
                i16 = -1;
            } else {
                h0yVarArr2 = h0yVarArr;
                if (c >= f5) {
                    float f8 = rectF.right;
                    if (f4 <= f8) {
                        if ((z5 || f8 < c) && (!z5 || f5 > f4)) {
                            int i23 = i17;
                            int i24 = i16;
                            while (i23 - i24 > 1) {
                                int i25 = (i23 + i24) / 2;
                                float f9 = fArr[(i25 - lineStart) * 2];
                                int i26 = i23;
                                if ((z5 || f9 <= rectF.right) && (!z5 || f9 >= rectF.left)) {
                                    i23 = i26;
                                    i24 = i25;
                                } else {
                                    i23 = i25;
                                }
                            }
                            i3 = z5 ? i23 : i24;
                        } else {
                            i3 = i17 - 1;
                        }
                        int f10 = l8q0Var.f(i3 + 1);
                        if (f10 != -1 && (g = l8q0Var.g(f10)) > i16) {
                            if (f10 < i16) {
                                f10 = i16;
                            }
                            if (g <= i17) {
                                i17 = g;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i27 = f10;
                            while (true) {
                                rectF3.left = z5 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i27 - lineStart) * 2];
                                rectF3.right = z5 ? c(i27, lineStart, fArr) : c(i17 - 1, lineStart, fArr);
                                if (!((Boolean) tn1Var.invoke(rectF3, rectF)).booleanValue()) {
                                    i17 = l8q0Var.c(i17);
                                    if (i17 == -1 || i17 <= i16) {
                                        break;
                                    }
                                    i27 = l8q0Var.f(i17);
                                    if (i27 < i16) {
                                        i27 = i16;
                                    }
                                } else {
                                    i2 = i17;
                                    break;
                                }
                            }
                            i16 = i2;
                        }
                    }
                }
                i2 = -1;
                i16 = i2;
            }
            if (i16 >= 0) {
                return i16;
            }
            if (i13 == i14) {
                return -1;
            }
            i13 += i18;
            i15 = i18;
            h0yVarArr = h0yVarArr2;
        }
    }
}
