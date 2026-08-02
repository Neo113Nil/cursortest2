package xsna;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: TextLineTextBackgroundDrawer.kt */
/* loaded from: classes14.dex */
public final class pjo0 implements gr9 {
    public static final float j = iah0.a(8);
    public final Path a = new Path();
    public float b = iah0.a(8);
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;

    /* compiled from: TextLineTextBackgroundDrawer.kt */
    public static final class a {
        public final Rect a;
        public a b;

        public a(Rect rect) {
            this.a = rect;
        }
    }

    public pjo0() {
        Paint b = rqi.b(1, -65536);
        b.setStyle(Paint.Style.FILL);
        b.setPathEffect(new CornerPathEffect(this.b));
        this.c = b;
        this.d = 255;
        this.i = true;
    }

    public final boolean a(Rect rect, Rect rect2) {
        int abs = Math.abs(rect.width() - rect2.width());
        float f = this.b;
        float f2 = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? j : f * 3.0f;
        if (abs == 0 || abs >= f2) {
            return false;
        }
        if (rect.width() > rect2.width()) {
            rect2.left = rect.left;
            rect2.right = rect.right;
            return true;
        }
        rect.left = rect2.left;
        rect.right = rect2.right;
        return true;
    }

    public final void b(hko0 hko0Var) {
        int i;
        float f;
        int i2;
        int i3;
        float f2;
        int i4;
        int i5;
        a aVar;
        Path path = this.a;
        path.reset();
        int lineCount = hko0Var.getLineCount();
        ArrayList arrayList = new ArrayList();
        int lineSpacing = (int) hko0Var.getLineSpacing();
        float multiplier = hko0Var.getMultiplier();
        int i6 = lineCount - 1;
        boolean z = false;
        boolean z2 = hko0Var.j(i6).length() == 0;
        if (lineCount > 0) {
            Rect rect = new Rect();
            hko0Var.h(0, rect);
            i = rect.height();
        } else {
            i = 0;
        }
        float f3 = i;
        int i7 = (int) (f3 - (multiplier * f3));
        j9x it = swe0.q(0, lineCount).iterator();
        while (it.d) {
            int nextInt = it.nextInt();
            String j2 = hko0Var.j(nextInt);
            if (epx.f(j2, "\n") || TextUtils.isEmpty(j2)) {
                aVar = null;
            } else {
                Rect rect2 = new Rect();
                hko0Var.h(nextInt, rect2);
                boolean z3 = nextInt == i6 ? true : z;
                boolean z4 = (nextInt == lineCount + (-2) && z2) ? true : z;
                boolean z5 = this.i;
                if (!z5 && !z3 && !z4) {
                    rect2.bottom -= lineSpacing;
                }
                if (z5) {
                    rect2.top += nextInt != 0 ? i7 : 0;
                }
                rect2.bottom += (z3 || z4) ? 0 : i7;
                aVar = new a(rect2);
                if (nextInt > 0) {
                    int i8 = nextInt - 1;
                    if (arrayList.get(i8) != null) {
                        a aVar2 = (a) arrayList.get(i8);
                        if (a(aVar2.a, rect2)) {
                            aVar.b = aVar2;
                            for (a aVar3 = aVar2.b; aVar3 != null; aVar3 = aVar3.b) {
                                a(aVar3.a, aVar.a);
                            }
                        }
                    }
                }
            }
            arrayList.add(aVar);
            z = false;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            a aVar4 = (a) arrayList.get(i9);
            if (aVar4 != null) {
                Rect rect3 = aVar4.a;
                arrayList2.add(new PointF(rect3.left, rect3.top));
                arrayList2.add(new PointF(rect3.left, rect3.bottom));
                arrayList3.add(new PointF(rect3.right, rect3.top));
                arrayList3.add(new PointF(rect3.right, rect3.bottom));
                int i10 = i9 + 1;
                if (i10 == arrayList.size() || arrayList.get(i10) == null || !this.i) {
                    if (arrayList3.size() != arrayList2.size()) {
                        throw new IllegalArgumentException("Something went wrong! Left points and Right points must have equal sizes.");
                    }
                    int size2 = arrayList3.size();
                    if (size2 != 0) {
                        path.moveTo(((PointF) arrayList2.get(0)).x - this.e, ((PointF) arrayList2.get(0)).y - this.f);
                        int size3 = arrayList3.size();
                        for (int i11 = 0; i11 < size3; i11++) {
                            PointF pointF = (PointF) arrayList3.get(i11);
                            if (i11 == 0) {
                                f2 = pointF.y - this.f;
                            } else if (i11 == size2 - 1) {
                                f2 = pointF.y + this.h;
                            } else {
                                f2 = pointF.y;
                                PointF pointF2 = (PointF) arrayList3.get(i11 - 1);
                                PointF pointF3 = (PointF) arrayList3.get(i11 + 1);
                                float f4 = pointF2.x;
                                float f5 = pointF.x;
                                if (f4 != f5 || pointF3.x >= f5) {
                                    float f6 = pointF3.x;
                                    if (f6 != f5 || f4 <= f5) {
                                        if (f4 == f5 && f6 > f5) {
                                            i4 = this.f;
                                        } else if (f6 == f5 && f4 < f5) {
                                            i4 = this.f;
                                        }
                                        f2 -= i4;
                                    } else {
                                        i5 = this.h;
                                    }
                                } else {
                                    i5 = this.h;
                                }
                                f2 += i5;
                            }
                            path.lineTo(pointF.x + this.g, f2);
                        }
                        int i12 = size2 - 1;
                        for (int i13 = i12; -1 < i13; i13--) {
                            PointF pointF4 = (PointF) arrayList2.get(i13);
                            if (i13 == i12) {
                                f = pointF4.y;
                                i3 = this.h;
                            } else {
                                if (i13 == 0) {
                                    f = pointF4.y;
                                    i2 = this.f;
                                } else {
                                    f = pointF4.y;
                                    PointF pointF5 = (PointF) arrayList2.get(i13 - 1);
                                    PointF pointF6 = (PointF) arrayList2.get(i13 + 1);
                                    float f7 = pointF5.x;
                                    float f8 = pointF4.x;
                                    if (f7 != f8 || pointF6.x <= f8) {
                                        float f9 = pointF6.x;
                                        if (f9 == f8 && f7 < f8) {
                                            i3 = this.h;
                                        } else if (f7 != f8 || f9 >= f8) {
                                            if (f9 == f8 && f7 > f8) {
                                                i2 = this.f;
                                            }
                                            path.lineTo(pointF4.x - this.e, f);
                                        } else {
                                            i2 = this.f;
                                        }
                                    } else {
                                        i3 = this.h;
                                    }
                                }
                                f -= i2;
                                path.lineTo(pointF4.x - this.e, f);
                            }
                            f += i3;
                            path.lineTo(pointF4.x - this.e, f);
                        }
                        path.close();
                    }
                    arrayList2.clear();
                    arrayList3.clear();
                }
            }
        }
    }

    @Override // xsna.gr9
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.a, this.c);
    }
}
