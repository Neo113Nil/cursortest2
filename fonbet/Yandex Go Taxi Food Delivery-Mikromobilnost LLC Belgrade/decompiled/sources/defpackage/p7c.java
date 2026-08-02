package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.util.DisplayMetrics;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivSizeUnit;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class p7c extends phl {
    public final Context b;
    public final rvo c;
    public final Path d = new Path();
    public final Paint e = new Paint();

    public p7c(Context context, rvo rvoVar) {
        this.b = context;
        this.c = rvoVar;
    }

    public static void c(int i, int[] iArr) {
        boolean z;
        int i2 = 0;
        do {
            b6w E = i2 % 2 == 0 ? j73.E(iArr) : y6i0.l(j73.E(iArr));
            int i3 = E.a;
            int i4 = E.b;
            int i5 = E.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                z = false;
                while (true) {
                    int i6 = i3 == 0 ? 0 : iArr[i3 - 1] - iArr[i3];
                    int i7 = i3 == iArr.length - 1 ? 0 : iArr[i3 + 1] - iArr[i3];
                    if ((i6 <= 0 || i6 >= i) && (i7 <= 0 || i7 >= i)) {
                        if (i3 != 0 && i6 < 0 && Math.abs(i6) < i) {
                            iArr[i3 - 1] = iArr[i3];
                            z = true;
                        }
                        if (i3 != iArr.length - 1 && i7 < 0 && Math.abs(i7) < i) {
                            iArr[i3 + 1] = iArr[i3];
                            z = true;
                        }
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3 += i5;
                    }
                }
            } else {
                z = false;
            }
            i2++;
        } while (z);
    }

    @Override // defpackage.phl
    public final void a(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, DivBackgroundSpan divBackgroundSpan) {
        DivSizeUnit divSizeUnit;
        Rect[] rectArr;
        int i5;
        int i6;
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5;
        agl background = divBackgroundSpan.getBackground();
        Object a = background != null ? background.a() : null;
        uik uikVar = a instanceof uik ? (uik) a : null;
        if (uikVar == null) {
            return;
        }
        DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
        Expression expression6 = uikVar.a;
        rvo rvoVar = this.c;
        int intValue = ((Number) expression6.a(rvoVar)).intValue();
        int o = a.o((Long) uikVar.b.a(rvoVar), displayMetrics);
        DivEdgeInsets divEdgeInsets = uikVar.c;
        if (divEdgeInsets == null || (expression5 = divEdgeInsets.g) == null || (divSizeUnit = (DivSizeUnit) expression5.a(rvoVar)) == null) {
            divSizeUnit = DivSizeUnit.DP;
        }
        Rect rect = new Rect((divEdgeInsets == null || (expression4 = divEdgeInsets.c) == null) ? 0 : a.N(Long.valueOf(((Number) expression4.a(rvoVar)).longValue()), displayMetrics, divSizeUnit), (divEdgeInsets == null || (expression3 = divEdgeInsets.f) == null) ? 0 : a.N(Long.valueOf(((Number) expression3.a(rvoVar)).longValue()), displayMetrics, divSizeUnit), (divEdgeInsets == null || (expression2 = divEdgeInsets.d) == null) ? 0 : a.N(Long.valueOf(((Number) expression2.a(rvoVar)).longValue()), displayMetrics, divSizeUnit), (divEdgeInsets == null || (expression = divEdgeInsets.a) == null) ? 0 : a.N(Long.valueOf(((Number) expression.a(rvoVar)).longValue()), displayMetrics, divSizeUnit));
        int i7 = i2 - i;
        int i8 = i7 + 1;
        if (i8 == 0) {
            rectArr = new Rect[0];
        } else {
            Rect[] rectArr2 = new Rect[i8];
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i + i9;
                rectArr2[i9] = new Rect((i9 == 0 ? i3 : m810.b(layout.getLineLeft(i + i9))) - rect.left, layout.getLineTop(i10) - rect.top, (i9 == i7 ? i4 : m810.b(layout.getLineRight(i10))) + rect.right, layout.getLineBottom(i10) + rect.bottom);
                i9++;
            }
            int i11 = ((Rect) j73.C(rectArr2)).left;
            int i12 = ((Rect) j73.C(rectArr2)).top;
            int i13 = 0;
            while (i13 < i8) {
                Rect rect2 = rectArr2[i13];
                int i14 = rect2.bottom - i12;
                i13++;
                for (int i15 = i13; i15 < i8; i15++) {
                    Rect rect3 = rectArr2[i15];
                    int i16 = rect3.top;
                    int i17 = rect2.bottom;
                    if (i16 >= i17) {
                        break;
                    }
                    i6 = rect3.left;
                    if (i6 <= rect2.left) {
                        i14 -= i17 - i16;
                        break;
                    }
                }
                i6 = Integer.MIN_VALUE;
                if (i14 <= 0) {
                    rect2.left = Math.max(i11, i6);
                    i14 = 0;
                } else {
                    i11 = rect2.left;
                }
                i12 += i14;
            }
            int i18 = ((Rect) j73.C(rectArr2)).right;
            int i19 = ((Rect) j73.C(rectArr2)).top;
            int i20 = 0;
            while (i20 < i8) {
                Rect rect4 = rectArr2[i20];
                int i21 = rect4.bottom - i19;
                i20++;
                for (int i22 = i20; i22 < i8; i22++) {
                    Rect rect5 = rectArr2[i22];
                    int i23 = rect5.top;
                    int i24 = rect4.bottom;
                    if (i23 >= i24) {
                        break;
                    }
                    i5 = rect5.right;
                    if (i5 >= rect4.right) {
                        i21 -= i24 - i23;
                        break;
                    }
                }
                i5 = Integer.MAX_VALUE;
                if (i21 <= 0) {
                    rect4.right = Math.min(i18, i5);
                    i21 = 0;
                } else {
                    i18 = rect4.right;
                }
                i19 += i21;
            }
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            for (int i25 = 0; i25 < i8; i25++) {
                Rect rect6 = rectArr2[i25];
                iArr[i25] = -rect6.left;
                iArr2[i25] = rect6.right;
            }
            int i26 = o * 2;
            c(i26, iArr);
            c(i26, iArr2);
            for (int i27 = 0; i27 < i8; i27++) {
                Rect rect7 = rectArr2[i27];
                rect7.left = -iArr[i27];
                rect7.right = iArr2[i27];
            }
            rectArr = rectArr2;
        }
        if (rectArr.length < 2) {
            d(canvas, rectArr, 0, rectArr.length, o, intValue);
            return;
        }
        int length = rectArr.length - 1;
        int i28 = 1;
        int i29 = 0;
        int i30 = 0;
        while (i29 < length) {
            int i31 = i29 + 1;
            if (rectArr[i29].left > rectArr[i31].right) {
                d(canvas, rectArr, i30, i28, o, intValue);
                i28 = 0;
                i30 = i31;
            }
            i28++;
            i29 = i31;
        }
        d(canvas, rectArr, i30, i28, o, intValue);
    }

    public final void d(Canvas canvas, Rect[] rectArr, int i, int i2, int i3, int i4) {
        int i5;
        Rect rect;
        int i6;
        int i7;
        int[] copyOf;
        char c;
        int[] copyOf2;
        int i8;
        float f;
        float f2;
        float f3;
        float f4;
        int i9 = i;
        int i10 = 1;
        if (i2 < 1) {
            return;
        }
        Rect rect2 = rectArr[i9];
        int i11 = (i9 + i2) - 1;
        Rect rect3 = rectArr[i11];
        if (i2 == 1) {
            copyOf = new int[]{rect3.width(), -rectArr[i11].height()};
            rect = rect3;
            i6 = 2;
        } else {
            int i12 = rect3.left;
            int i13 = rect3.bottom;
            int[] iArr = new int[i2 * 2];
            if (i9 <= i11) {
                int i14 = i11;
                i7 = 0;
                while (true) {
                    Rect rect4 = rectArr[i14];
                    int i15 = rect4.left;
                    if (i15 != i12) {
                        iArr[i7 * 2] = i15 - i12;
                        i7++;
                        i12 = i15;
                    }
                    int i16 = rect4.top - i13;
                    int i17 = i14 - 1;
                    i6 = 2;
                    while (true) {
                        if (i17 < i9) {
                            i5 = i10;
                            rect = rect3;
                            break;
                        }
                        Rect rect5 = rectArr[i17];
                        i5 = i10;
                        int i18 = rect5.bottom;
                        rect = rect3;
                        int i19 = rect4.top;
                        if (i18 <= i19) {
                            break;
                        }
                        if (rect5.left <= rect4.left) {
                            i16 -= i19 - i18;
                            break;
                        } else {
                            i17--;
                            i10 = i5;
                            rect3 = rect;
                        }
                    }
                    if (i16 > 0) {
                        i16 = 0;
                    }
                    int i20 = (i7 * 2) + 1;
                    iArr[i20] = iArr[i20] + i16;
                    i13 += i16;
                    if (i14 == i9) {
                        break;
                    }
                    i14--;
                    i10 = i5;
                    rect3 = rect;
                }
            } else {
                i5 = 1;
                rect = rect3;
                i6 = 2;
                i7 = 0;
            }
            iArr[i7 * 2] = rectArr[i9].width();
            copyOf = Arrays.copyOf(iArr, (i7 + 1) * 2);
            i10 = i5;
        }
        if (i2 == i10) {
            copyOf2 = new int[]{-rectArr[i9].width(), rectArr[i9].height()};
            c = 1;
        } else {
            Rect rect6 = rectArr[i9];
            int i21 = rect6.right;
            int i22 = rect6.top;
            int[] iArr2 = new int[i2 * 2];
            int i23 = 0;
            if (i9 <= i11) {
                while (true) {
                    Rect rect7 = rectArr[i9];
                    int i24 = rect7.right;
                    if (i24 != i21) {
                        iArr2[i23 * 2] = i24 - i21;
                        i23++;
                        i21 = i24;
                    }
                    int i25 = rect7.bottom - i22;
                    int i26 = i9 + 1;
                    int i27 = i26;
                    while (i27 <= i11) {
                        Rect rect8 = rectArr[i27];
                        int i28 = rect8.top;
                        int i29 = rect7.bottom;
                        if (i28 >= i29) {
                            break;
                        }
                        i8 = i22;
                        if (rect8.right >= rect7.right) {
                            i25 -= i29 - i28;
                            break;
                        } else {
                            i27++;
                            i22 = i8;
                        }
                    }
                    i8 = i22;
                    if (i25 < 0) {
                        i25 = 0;
                    }
                    int i30 = (i23 * 2) + 1;
                    iArr2[i30] = iArr2[i30] + i25;
                    i22 = i8 + i25;
                    if (i9 == i11) {
                        break;
                    } else {
                        i9 = i26;
                    }
                }
            }
            iArr2[i23 * 2] = -rectArr[i11].width();
            c = 1;
            copyOf2 = Arrays.copyOf(iArr2, (i23 + 1) * 2);
        }
        Path path = this.d;
        path.reset();
        float f5 = i3;
        float f6 = 2.0f;
        float min = Math.min(f5, Math.min(rect2.width() / 2.0f, copyOf2[c] / 2.0f));
        path.moveTo(rect2.right - min, rect2.top);
        float f7 = 0.9f;
        float f8 = 0.1f;
        path.rQuadTo(min * 0.9f, min * 0.1f, min, min);
        int i31 = i6;
        int v = jx81.v(0, copyOf2.length - 1, i31);
        if (v >= 0) {
            int i32 = 0;
            while (true) {
                boolean z = i32 >= copyOf2.length - i31;
                float f9 = copyOf2[i32];
                float f10 = copyOf2[i32 + 1];
                float f11 = z ? 0.0f : copyOf2[i32 + 3];
                f = f7;
                f2 = f6;
                f4 = Math.min(f5, Math.min(Math.abs(f9) / f6, f10 / f2));
                path.rLineTo(0.0f, (f10 - min) - f4);
                f3 = f8;
                path.rQuadTo(Math.signum(f9) * min * f8, f4 * f, Math.signum(f9) * f4, f4);
                if (!z) {
                    min = Math.min(f5, Math.min(Math.abs(f9) / f2, f11 / f2));
                    path.rLineTo(f9 - (Math.signum(f9) * (min + f4)), 0.0f);
                    path.rQuadTo(Math.signum(f9) * min * f, min * f3, Math.signum(f9) * min, min);
                }
                if (i32 == v) {
                    break;
                }
                i32 += 2;
                f7 = f;
                f6 = f2;
                f8 = f3;
                i31 = 2;
            }
        } else {
            f = 0.9f;
            f2 = 2.0f;
            f3 = 0.1f;
            f4 = 0.0f;
        }
        float min2 = Math.min(f5, Math.min(rect.width() / f2, (-copyOf[1]) / f2));
        path.rLineTo((-rect.width()) + f4 + min2, 0.0f);
        float f12 = -0.9f;
        float f13 = -0.1f;
        float f14 = -min2;
        path.rQuadTo(min2 * (-0.9f), min2 * (-0.1f), f14, f14);
        boolean z2 = false;
        int i33 = 2;
        int v2 = jx81.v(0, copyOf.length - 1, 2);
        if (v2 >= 0) {
            int i34 = 0;
            while (true) {
                boolean z3 = i34 >= copyOf.length - i33 ? true : z2;
                float f15 = copyOf[i34];
                float f16 = copyOf[i34 + 1];
                float f17 = z3 ? 0.0f : copyOf[i34 + 3];
                float f18 = f12;
                float f19 = f13;
                float min3 = Math.min(f5, Math.min(Math.abs(f15) / f2, (-f16) / f2));
                path.rLineTo(0.0f, f16 + min2 + min3);
                path.rQuadTo(Math.signum(f15) * min3 * f3, min3 * f18, Math.signum(f15) * min3, -min3);
                if (!z3) {
                    min2 = Math.min(f5, Math.min(Math.abs(f15) / f2, (-f17) / f2));
                    path.rLineTo(f15 - (Math.signum(f15) * (min3 + min2)), 0.0f);
                    path.rQuadTo(Math.signum(f15) * min2 * f, min2 * f19, Math.signum(f15) * min2, -min2);
                }
                if (i34 == v2) {
                    break;
                }
                i34 += 2;
                f12 = f18;
                f13 = f19;
                z2 = false;
                i33 = 2;
            }
        }
        path.close();
        Paint paint = this.e;
        paint.setColor(i4);
        canvas.drawPath(path, paint);
    }
}
