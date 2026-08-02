package com.yandex.div.core.util.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.util.DisplayMetrics;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.ec;
import com.yandex.div2.l2;
import com.yandex.div2.y3;
import com.yandex.div2.zb;
import java.util.Arrays;
import xsna.an10;
import xsna.i9x;
import xsna.rl3;
import xsna.swe0;
import xsna.tyx;
import xsna.zcl;

/* compiled from: CloudTextRangeBackgroundRenderer.kt */
/* loaded from: classes7.dex */
public final class CloudTextRangeBackgroundRenderer extends DivTextRangesBackgroundRenderer {
    private static final Companion Companion = new Companion(null);
    private final Context context;
    private final ExpressionResolver expressionResolver;
    private final Path path = new Path();
    private final Paint paint = new Paint();

    /* compiled from: CloudTextRangeBackgroundRenderer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public CloudTextRangeBackgroundRenderer(Context context, ExpressionResolver expressionResolver) {
        this.context = context;
        this.expressionResolver = expressionResolver;
    }

    private final int[] buildLeftSegments(Rect[] rectArr, int i, int i2) {
        int i3 = (i + i2) - 1;
        if (i2 == 1) {
            return new int[]{rectArr[i3].width(), -rectArr[i3].height()};
        }
        Rect rect = rectArr[i3];
        int i4 = rect.left;
        int i5 = rect.bottom;
        int[] iArr = new int[i2 * 2];
        int i6 = 0;
        if (i <= i3) {
            int i7 = 0;
            while (true) {
                Rect rect2 = rectArr[i3];
                int i8 = rect2.left;
                if (i8 != i4) {
                    iArr[i7 * 2] = i8 - i4;
                    i7++;
                    i4 = i8;
                }
                int i9 = rect2.top - i5;
                int i10 = i3 - 1;
                while (true) {
                    if (i10 < i) {
                        break;
                    }
                    Rect rect3 = rectArr[i10];
                    int i11 = rect3.bottom;
                    int i12 = rect2.top;
                    if (i11 <= i12) {
                        break;
                    }
                    if (rect3.left <= rect2.left) {
                        i9 -= i12 - i11;
                        break;
                    }
                    i10--;
                }
                if (i9 > 0) {
                    i9 = 0;
                }
                int i13 = (i7 * 2) + 1;
                iArr[i13] = iArr[i13] + i9;
                i5 += i9;
                if (i3 == i) {
                    break;
                }
                i3--;
            }
            i6 = i7;
        }
        iArr[i6 * 2] = rectArr[i].width();
        return Arrays.copyOf(iArr, (i6 + 1) * 2);
    }

    private final Rect[] buildLines(Layout layout, int i, int i2, int i3, int i4, int i5, Rect rect) {
        int i6 = i2 - i;
        int i7 = i6 + 1;
        if (i7 == 0) {
            return new Rect[0];
        }
        Rect[] rectArr = new Rect[i7];
        int i8 = 0;
        while (i8 < i7) {
            int i9 = i + i8;
            rectArr[i8] = new Rect((i8 == 0 ? i3 : an10.b(layout.getLineLeft(i + i8))) - rect.left, layout.getLineTop(i9) - rect.top, (i8 == i6 ? i4 : an10.b(layout.getLineRight(i9))) + rect.right, layout.getLineBottom(i9) + rect.bottom);
            i8++;
        }
        coalesceInvisibleLeftBounds(rectArr);
        coalesceInvisibleRightBounds(rectArr);
        int[] iArr = new int[i7];
        int[] iArr2 = new int[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            Rect rect2 = rectArr[i10];
            iArr[i10] = -rect2.left;
            iArr2[i10] = rect2.right;
        }
        int i11 = i5 * 2;
        coalesceCloseBounds(iArr, i11);
        coalesceCloseBounds(iArr2, i11);
        for (int i12 = 0; i12 < i7; i12++) {
            Rect rect3 = rectArr[i12];
            rect3.left = -iArr[i12];
            rect3.right = iArr2[i12];
        }
        return rectArr;
    }

    private final int[] buildRightSegments(Rect[] rectArr, int i, int i2) {
        int i3 = i;
        int i4 = (i3 + i2) - 1;
        if (i2 == 1) {
            return new int[]{-rectArr[i3].width(), rectArr[i3].height()};
        }
        Rect rect = rectArr[i3];
        int i5 = rect.right;
        int i6 = rect.top;
        int[] iArr = new int[i2 * 2];
        int i7 = 0;
        if (i3 <= i4) {
            int i8 = 0;
            while (true) {
                Rect rect2 = rectArr[i3];
                int i9 = rect2.right;
                if (i9 != i5) {
                    iArr[i8 * 2] = i9 - i5;
                    i8++;
                    i5 = i9;
                }
                int i10 = rect2.bottom - i6;
                int i11 = i3 + 1;
                int i12 = i11;
                while (true) {
                    if (i12 > i4) {
                        break;
                    }
                    Rect rect3 = rectArr[i12];
                    int i13 = rect3.top;
                    int i14 = rect2.bottom;
                    if (i13 >= i14) {
                        break;
                    }
                    if (rect3.right >= rect2.right) {
                        i10 -= i14 - i13;
                        break;
                    }
                    i12++;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                int i15 = (i8 * 2) + 1;
                iArr[i15] = iArr[i15] + i10;
                i6 += i10;
                if (i3 == i4) {
                    break;
                }
                i3 = i11;
            }
            i7 = i8;
        }
        iArr[i7 * 2] = -rectArr[i4].width();
        return Arrays.copyOf(iArr, (i7 + 1) * 2);
    }

    private final void coalesceCloseBounds(int[] iArr, int i) {
        boolean z;
        int i2 = 0;
        do {
            i9x P = i2 % 2 == 0 ? rl3.P(iArr) : swe0.o(rl3.P(iArr));
            int i3 = P.b;
            int i4 = P.c;
            int i5 = P.d;
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

    private final void coalesceInvisibleLeftBounds(Rect[] rectArr) {
        int i;
        int length = rectArr.length;
        int i2 = ((Rect) rl3.L(rectArr)).left;
        int i3 = ((Rect) rl3.L(rectArr)).top;
        int length2 = rectArr.length;
        int i4 = 0;
        while (i4 < length2) {
            Rect rect = rectArr[i4];
            int i5 = rect.bottom - i3;
            i4++;
            for (int i6 = i4; i6 < length; i6++) {
                Rect rect2 = rectArr[i6];
                int i7 = rect2.top;
                int i8 = rect.bottom;
                if (i7 >= i8) {
                    break;
                }
                i = rect2.left;
                if (i <= rect.left) {
                    i5 -= i8 - i7;
                    break;
                }
            }
            i = Integer.MIN_VALUE;
            if (i5 <= 0) {
                rect.left = Math.max(i2, i);
                i5 = 0;
            } else {
                i2 = rect.left;
            }
            i3 += i5;
        }
    }

    private final void coalesceInvisibleRightBounds(Rect[] rectArr) {
        int i;
        int length = rectArr.length;
        int i2 = ((Rect) rl3.L(rectArr)).right;
        int i3 = ((Rect) rl3.L(rectArr)).top;
        int length2 = rectArr.length;
        int i4 = 0;
        while (i4 < length2) {
            Rect rect = rectArr[i4];
            int i5 = rect.bottom - i3;
            i4++;
            for (int i6 = i4; i6 < length; i6++) {
                Rect rect2 = rectArr[i6];
                int i7 = rect2.top;
                int i8 = rect.bottom;
                if (i7 >= i8) {
                    break;
                }
                i = rect2.right;
                if (i >= rect.right) {
                    i5 -= i8 - i7;
                    break;
                }
            }
            i = Integer.MAX_VALUE;
            if (i5 <= 0) {
                rect.right = Math.min(i2, i);
                i5 = 0;
            } else {
                i2 = rect.right;
            }
            i3 += i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    private final void drawLines(Canvas canvas, Rect[] rectArr, int i, int i2, int i3, int i4) {
        ?? r16;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z;
        float f5;
        boolean z2 = true;
        if (i2 < 1) {
            return;
        }
        Rect rect = rectArr[i];
        Rect rect2 = rectArr[(i + i2) - 1];
        int[] buildLeftSegments = buildLeftSegments(rectArr, i, i2);
        int[] buildRightSegments = buildRightSegments(rectArr, i, i2);
        this.path.reset();
        float f6 = i3;
        float f7 = 2.0f;
        float min = Math.min(f6, Math.min(rect.width() / 2.0f, buildRightSegments[1] / 2.0f));
        this.path.moveTo(rect.right - min, rect.top);
        float f8 = 0.9f;
        float f9 = 0.1f;
        this.path.rQuadTo(min * 0.9f, min * 0.1f, min, min);
        boolean z3 = false;
        int i5 = 2;
        int b = tyx.b(0, buildRightSegments.length - 1, 2);
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (b >= 0) {
            int i6 = 0;
            while (true) {
                if (i6 >= buildRightSegments.length - i5) {
                    z = z2;
                    r16 = z;
                } else {
                    r16 = z2;
                    z = z3;
                }
                float f11 = buildRightSegments[i6];
                f = f7;
                float f12 = buildRightSegments[i6 + 1];
                if (z) {
                    f2 = f8;
                    f5 = f10;
                } else {
                    f2 = f8;
                    f5 = buildRightSegments[i6 + 3];
                }
                f3 = f9;
                f4 = Math.min(f6, Math.min(Math.abs(f11) / f, f12 / f));
                this.path.rLineTo(f10, (f12 - min) - f4);
                this.path.rQuadTo(min * f3 * Math.signum(f11), f4 * f2, Math.signum(f11) * f4, f4);
                if (!z) {
                    min = Math.min(f6, Math.min(Math.abs(f11) / f, f5 / f));
                    this.path.rLineTo(f11 - (Math.signum(f11) * (min + f4)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.path.rQuadTo(Math.signum(f11) * min * f2, min * f3, Math.signum(f11) * min, min);
                }
                if (i6 == b) {
                    break;
                }
                i6 += 2;
                f7 = f;
                f8 = f2;
                f9 = f3;
                z2 = r16 == true ? 1 : 0;
                z3 = false;
                i5 = 2;
                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        } else {
            r16 = 1;
            f = 2.0f;
            f2 = 0.9f;
            f3 = 0.1f;
            f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float min2 = Math.min(f6, Math.min(rect2.width() / f, (-buildLeftSegments[r16]) / f));
        this.path.rLineTo((-rect2.width()) + f4 + min2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f13 = -0.9f;
        float f14 = -0.1f;
        float f15 = -min2;
        this.path.rQuadTo(min2 * (-0.9f), min2 * (-0.1f), f15, f15);
        int i7 = 2;
        int b2 = tyx.b(0, buildLeftSegments.length - 1, 2);
        if (b2 >= 0) {
            int i8 = 0;
            while (true) {
                ?? r10 = i8 >= buildLeftSegments.length - i7 ? r16 : false;
                float f16 = buildLeftSegments[i8];
                float f17 = buildLeftSegments[i8 + 1];
                float f18 = r10 != false ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : buildLeftSegments[i8 + 3];
                float min3 = Math.min(f6, Math.min(Math.abs(f16) / f, (-f17) / f));
                float f19 = f13;
                this.path.rLineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f17 + min2 + min3);
                float f20 = f14;
                this.path.rQuadTo(Math.signum(f16) * min3 * f3, min3 * f19, Math.signum(f16) * min3, -min3);
                if (r10 == false) {
                    min2 = Math.min(f6, Math.min(Math.abs(f16) / f, (-f18) / f));
                    this.path.rLineTo(f16 - (Math.signum(f16) * (min3 + min2)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.path.rQuadTo(Math.signum(f16) * min2 * f2, min2 * f20, Math.signum(f16) * min2, -min2);
                }
                if (i8 == b2) {
                    break;
                }
                i8 += 2;
                f13 = f19;
                f14 = f20;
                i7 = 2;
            }
        }
        this.path.close();
        this.paint.setColor(i4);
        canvas.drawPath(this.path, this.paint);
    }

    private final DisplayMetrics getDisplayMetrics() {
        return this.context.getResources().getDisplayMetrics();
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, ec ecVar, zb zbVar) {
        Object a = zbVar != null ? zbVar.a() : null;
        l2 l2Var = a instanceof l2 ? (l2) a : null;
        if (l2Var == null) {
            return;
        }
        draw(canvas, layout, i, i2, i3, i4, l2Var);
    }

    private final void draw(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, l2 l2Var) {
        DivSizeUnit divSizeUnit;
        Expression<Long> expression;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        Expression<DivSizeUnit> expression5;
        DisplayMetrics displayMetrics = getDisplayMetrics();
        int intValue = l2Var.a.evaluate(this.expressionResolver).intValue();
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(l2Var.b.evaluate(this.expressionResolver), displayMetrics);
        y3 y3Var = l2Var.c;
        if (y3Var == null || (expression5 = y3Var.g) == null || (divSizeUnit = expression5.evaluate(this.expressionResolver)) == null) {
            divSizeUnit = DivSizeUnit.DP;
        }
        Rect[] buildLines = buildLines(layout, i, i2, i3, i4, dpToPx, new Rect((y3Var == null || (expression4 = y3Var.c) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression4.evaluate(this.expressionResolver).longValue()), displayMetrics, divSizeUnit), (y3Var == null || (expression3 = y3Var.f) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression3.evaluate(this.expressionResolver).longValue()), displayMetrics, divSizeUnit), (y3Var == null || (expression2 = y3Var.d) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression2.evaluate(this.expressionResolver).longValue()), displayMetrics, divSizeUnit), (y3Var == null || (expression = y3Var.a) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression.evaluate(this.expressionResolver).longValue()), displayMetrics, divSizeUnit)));
        if (buildLines.length < 2) {
            drawLines(canvas, buildLines, 0, buildLines.length, dpToPx, intValue);
            return;
        }
        int length = buildLines.length - 1;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int i8 = i6 + 1;
            if (buildLines[i6].left > buildLines[i8].right) {
                drawLines(canvas, buildLines, i7, i5, dpToPx, intValue);
                i5 = 0;
                i7 = i8;
            }
            i5++;
            i6 = i8;
        }
        drawLines(canvas, buildLines, i7, i5, dpToPx, intValue);
    }
}
