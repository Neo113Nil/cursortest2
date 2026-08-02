package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.ae5;
import defpackage.b7e;
import defpackage.f7e;
import defpackage.oc20;
import defpackage.zd5;

/* loaded from: classes.dex */
public final class b implements ae5 {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public b(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(ConstraintWidget constraintWidget, zd5 zd5Var) {
        oc20 oc20Var;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        boolean z;
        int measuredWidth;
        int baseline;
        int i2;
        oc20 oc20Var2;
        oc20 oc20Var3;
        int i3;
        int childMeasureSpec;
        oc20 oc20Var4;
        if (constraintWidget == null) {
            return;
        }
        b7e b7eVar = constraintWidget.L;
        b7e b7eVar2 = constraintWidget.J;
        if (constraintWidget.i0 == 8 && !constraintWidget.F) {
            zd5Var.e = 0;
            zd5Var.f = 0;
            zd5Var.g = 0;
            return;
        }
        if (constraintWidget.V == null) {
            return;
        }
        ConstraintLayout constraintLayout = this.h;
        oc20Var = constraintLayout.mMetrics;
        if (oc20Var != null) {
            oc20Var4 = constraintLayout.mMetrics;
            oc20Var4.getClass();
            System.nanoTime();
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = zd5Var.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = zd5Var.b;
        int i4 = zd5Var.c;
        int i5 = zd5Var.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = constraintWidget.h0;
        int[] iArr = f7e.a;
        int i8 = iArr[dimensionBehaviour.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            } else if (i8 == 3) {
                int i9 = this.f;
                int i10 = b7eVar2 != null ? b7eVar2.g : 0;
                if (b7eVar != null) {
                    i10 += b7eVar.g;
                }
                childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
            } else if (i8 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
                boolean z2 = constraintWidget.r == 1;
                int i11 = zd5Var.j;
                if (i11 == 1 || i11 == 2) {
                    boolean z3 = view.getMeasuredHeight() == constraintWidget.m();
                    if (zd5Var.j == 2 || !z2 || ((z2 && z3) || (view instanceof Placeholder) || constraintWidget.C())) {
                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.s(), 1073741824);
                    }
                }
            }
            makeMeasureSpec = childMeasureSpec;
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        int i12 = iArr[dimensionBehaviour2.ordinal()];
        if (i12 == 1) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (i12 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (i12 == 3) {
            int i13 = this.g;
            int i14 = b7eVar2 != null ? constraintWidget.K.g : 0;
            if (b7eVar != null) {
                i14 += constraintWidget.M.g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i13, i6 + i14, -1);
        } else if (i12 != 4) {
            makeMeasureSpec2 = 0;
        } else {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z4 = constraintWidget.s == 1;
            int i15 = zd5Var.j;
            if (i15 == 1 || i15 == 2) {
                boolean z5 = view.getMeasuredWidth() == constraintWidget.s();
                if (zd5Var.j == 2 || !z4 || ((z4 && z5) || (view instanceof Placeholder) || constraintWidget.D())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.m(), 1073741824);
                }
            }
        }
        androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.V;
        if (dVar != null) {
            i3 = constraintLayout.mOptimizationLevel;
            if (h.b(i3, 256) && view.getMeasuredWidth() == constraintWidget.s() && view.getMeasuredWidth() < dVar.s() && view.getMeasuredHeight() == constraintWidget.m() && view.getMeasuredHeight() < dVar.m() && view.getBaseline() == constraintWidget.c0 && !constraintWidget.B() && a(constraintWidget.H, makeMeasureSpec, constraintWidget.s()) && a(constraintWidget.I, makeMeasureSpec2, constraintWidget.m())) {
                zd5Var.e = constraintWidget.s();
                zd5Var.f = constraintWidget.m();
                zd5Var.g = constraintWidget.c0;
                return;
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z6 = dimensionBehaviour == dimensionBehaviour3;
        boolean z7 = dimensionBehaviour2 == dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        boolean z8 = dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z9 = dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z10 = z6 && constraintWidget.Y > 0.0f;
        boolean z11 = z7 && constraintWidget.Y > 0.0f;
        if (view == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        int i16 = zd5Var.j;
        if (i16 != 1 && i16 != 2 && z6 && constraintWidget.r == 0 && z7 && constraintWidget.s == 0) {
            measuredWidth = 0;
            z = false;
            baseline = 0;
            i2 = -1;
            max = 0;
        } else {
            if ((view instanceof VirtualLayout) && (constraintWidget instanceof i)) {
                ((VirtualLayout) view).onMeasure((i) constraintWidget, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            constraintWidget.H = makeMeasureSpec;
            constraintWidget.I = makeMeasureSpec2;
            constraintWidget.g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = constraintWidget.u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = constraintWidget.v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = constraintWidget.x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = constraintWidget.y;
            if (i20 > 0) {
                max = Math.min(i20, max);
            }
            i = constraintLayout.mOptimizationLevel;
            int i21 = makeMeasureSpec2;
            if (!h.b(i, 1)) {
                if (z10 && z8) {
                    max2 = (int) ((max * constraintWidget.Y) + 0.5f);
                } else if (z11 && z9) {
                    max = (int) ((max2 / constraintWidget.Y) + 0.5f);
                }
            }
            if (measuredWidth2 == max2 && measuredHeight == max) {
                baseline = baseline2;
                measuredWidth = max2;
                z = false;
            } else {
                if (measuredWidth2 != max2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                }
                int makeMeasureSpec3 = measuredHeight != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i21;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                constraintWidget.H = makeMeasureSpec;
                constraintWidget.I = makeMeasureSpec3;
                z = false;
                constraintWidget.g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i2 = -1;
        }
        boolean z12 = baseline != i2 ? true : z;
        zd5Var.i = (measuredWidth == zd5Var.c && max == zd5Var.d) ? z : true;
        if (layoutParams.mNeedsBaseline) {
            z12 = true;
        }
        if (z12 && baseline != -1 && constraintWidget.c0 != baseline) {
            zd5Var.i = true;
        }
        zd5Var.e = measuredWidth;
        zd5Var.f = max;
        zd5Var.h = z12;
        zd5Var.g = baseline;
        oc20Var2 = constraintLayout.mMetrics;
        if (oc20Var2 != null) {
            System.nanoTime();
            oc20Var3 = constraintLayout.mMetrics;
            oc20Var3.getClass();
        }
    }
}
