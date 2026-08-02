package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.e;
import defpackage.ae5;
import defpackage.cv31;
import defpackage.g151;
import defpackage.ha30;
import defpackage.ia30;
import defpackage.lfu;
import defpackage.nfu;
import defpackage.p3c0;
import defpackage.qbn;
import defpackage.rug;
import defpackage.ta30;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class a {
    public androidx.constraintlayout.core.widgets.d a = new androidx.constraintlayout.core.widgets.d();
    public androidx.constraintlayout.core.widgets.d b = new androidx.constraintlayout.core.widgets.d();
    public androidx.constraintlayout.widget.e c = null;
    public androidx.constraintlayout.widget.e d = null;
    public int e;
    public int f;
    public final /* synthetic */ MotionLayout g;

    public a(MotionLayout motionLayout) {
        this.g = motionLayout;
    }

    public static void c(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.d dVar2) {
        ArrayList arrayList = dVar.u0;
        HashMap hashMap = new HashMap();
        hashMap.put(dVar, dVar2);
        dVar2.u0.clear();
        dVar2.h(dVar, hashMap);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            ConstraintWidget aVar = constraintWidget instanceof androidx.constraintlayout.core.widgets.a ? new androidx.constraintlayout.core.widgets.a() : constraintWidget instanceof g ? new g() : constraintWidget instanceof f ? new f() : constraintWidget instanceof p3c0 ? new p3c0() : constraintWidget instanceof lfu ? new nfu() : new ConstraintWidget();
            dVar2.u0.add(aVar);
            ConstraintWidget constraintWidget2 = aVar.V;
            if (constraintWidget2 != null) {
                ((g151) constraintWidget2).u0.remove(aVar);
                aVar.E();
            }
            aVar.V = dVar2;
            hashMap.put(constraintWidget, aVar);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ConstraintWidget constraintWidget3 = (ConstraintWidget) it2.next();
            ((ConstraintWidget) hashMap.get(constraintWidget3)).h(constraintWidget3, hashMap);
        }
    }

    public static ConstraintWidget d(androidx.constraintlayout.core.widgets.d dVar, View view) {
        if (dVar.h0 == view) {
            return dVar;
        }
        ArrayList arrayList = dVar.u0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i);
            if (constraintWidget.h0 == view) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final void a() {
        int[] iArr;
        int i;
        SparseArray sparseArray;
        int i2;
        Rect rect;
        boolean z;
        int i3;
        int i4;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Interpolator loadInterpolator;
        a aVar = this;
        MotionLayout motionLayout = aVar.g;
        int childCount = motionLayout.getChildCount();
        motionLayout.mFrameArrayList.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = motionLayout.getChildAt(i5);
            ia30 ia30Var = new ia30(childAt);
            int id = childAt.getId();
            iArr2[i5] = id;
            sparseArray2.put(id, ia30Var);
            motionLayout.mFrameArrayList.put(childAt, ia30Var);
        }
        int i6 = 0;
        while (i6 < childCount) {
            View childAt2 = motionLayout.getChildAt(i6);
            ia30 ia30Var2 = motionLayout.mFrameArrayList.get(childAt2);
            if (ia30Var2 == null) {
                i = childCount;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i2 = i6;
            } else {
                Rect rect5 = ia30Var2.a;
                ha30 ha30Var = ia30Var2.h;
                ta30 ta30Var = ia30Var2.f;
                iArr = iArr2;
                if (aVar.c != null) {
                    ConstraintWidget d = d(aVar.a, childAt2);
                    if (d != null) {
                        rect4 = motionLayout.toRect(d);
                        androidx.constraintlayout.widget.e eVar = aVar.c;
                        i2 = i6;
                        int width = motionLayout.getWidth();
                        sparseArray = sparseArray2;
                        int height = motionLayout.getHeight();
                        i = childCount;
                        int i7 = eVar.d;
                        if (i7 != 0) {
                            ia30.h(i7, width, height, rect4, rect5);
                        }
                        ta30Var.c = 0.0f;
                        ta30Var.w = 0.0f;
                        ia30Var2.g(ta30Var);
                        rect = rect5;
                        ta30Var.d(rect4.left, rect4.top, rect4.width(), rect4.height());
                        e.a o = eVar.o(ia30Var2.c);
                        ta30Var.a(o);
                        e.c cVar = o.d;
                        ia30Var2.l = cVar.g;
                        ha30Var.d(rect4, eVar, i7, ia30Var2.c);
                        ia30Var2.C = o.f.i;
                        ia30Var2.E = cVar.j;
                        ia30Var2.F = cVar.i;
                        Context context = ia30Var2.b.getContext();
                        int i8 = cVar.l;
                        String str = cVar.k;
                        int i9 = cVar.m;
                        if (i8 == -2) {
                            loadInterpolator = AnimationUtils.loadInterpolator(context, i9);
                        } else if (i8 != -1) {
                            loadInterpolator = i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 4 ? i8 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator();
                        } else {
                            final qbn c = qbn.c(str);
                            loadInterpolator = new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController$1
                                @Override // android.animation.TimeInterpolator
                                public float getInterpolation(float f) {
                                    return (float) qbn.this.a(f);
                                }
                            };
                        }
                        ia30Var2.G = loadInterpolator;
                    } else {
                        i = childCount;
                        sparseArray = sparseArray2;
                        i2 = i6;
                        rect = rect5;
                        if (motionLayout.mDebugPath != 0) {
                            Log.e("MotionLayout", rug.b() + "no widget for  " + rug.d(childAt2) + Extension.O_BRAKE_SPACE + childAt2.getClass().getName() + Extension.C_BRAKE);
                        }
                    }
                } else {
                    i = childCount;
                    sparseArray = sparseArray2;
                    i2 = i6;
                    rect = rect5;
                    z = motionLayout.mInRotation;
                    if (z) {
                        cv31 cv31Var = motionLayout.mPreRotate.get(childAt2);
                        int i10 = motionLayout.mRotatMode;
                        i3 = motionLayout.mPreRotateWidth;
                        i4 = motionLayout.mPreRotateHeight;
                        ta30Var.c = 0.0f;
                        ta30Var.w = 0.0f;
                        Rect rect6 = new Rect();
                        if (i10 == 1) {
                            int i11 = cv31Var.b;
                            int i12 = cv31Var.d;
                            int i13 = cv31Var.c;
                            int i14 = cv31Var.e;
                            int i15 = ((i13 + i14) - (i12 - i11)) / 2;
                            rect6.left = i15;
                            int i16 = i3 - (((i14 - i13) + (i11 + i12)) / 2);
                            rect6.top = i16;
                            rect6.right = (i12 - i11) + i15;
                            rect6.bottom = (i14 - i13) + i16;
                        } else if (i10 == 2) {
                            int i17 = cv31Var.b;
                            int i18 = cv31Var.d;
                            int i19 = i17 + i18;
                            int i20 = cv31Var.c;
                            int i21 = cv31Var.e;
                            int i22 = i4 - (((i18 - i17) + (i20 + i21)) / 2);
                            rect6.left = i22;
                            int i23 = (i19 - (i21 - i20)) / 2;
                            rect6.top = i23;
                            rect6.right = (i18 - i17) + i22;
                            rect6.bottom = (i21 - i20) + i23;
                        }
                        ta30Var.d(rect6.left, rect6.top, rect6.width(), rect6.height());
                        float f = cv31Var.a;
                        ha30Var.getClass();
                        rect6.width();
                        rect6.height();
                        ha30Var.b(childAt2);
                        ha30Var.D = Float.NaN;
                        ha30Var.E = Float.NaN;
                        if (i10 == 1) {
                            ha30Var.z = f - 90.0f;
                        } else if (i10 == 2) {
                            ha30Var.z = f + 90.0f;
                        }
                    }
                }
                aVar = this;
                if (aVar.d != null) {
                    ConstraintWidget d2 = d(aVar.b, childAt2);
                    if (d2 != null) {
                        rect2 = motionLayout.toRect(d2);
                        androidx.constraintlayout.widget.e eVar2 = aVar.d;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        ta30 ta30Var2 = ia30Var2.g;
                        int i24 = eVar2.d;
                        if (i24 != 0) {
                            Rect rect7 = rect;
                            ia30.h(i24, width2, height2, rect2, rect7);
                            rect3 = rect7;
                        } else {
                            rect3 = rect2;
                        }
                        ta30Var2.c = 1.0f;
                        ta30Var2.w = 1.0f;
                        ia30Var2.g(ta30Var2);
                        ta30Var2.d(rect3.left, rect3.top, rect3.width(), rect3.height());
                        ta30Var2.a(eVar2.o(ia30Var2.c));
                        ia30Var2.i.d(rect3, eVar2, i24, ia30Var2.c);
                    } else if (motionLayout.mDebugPath != 0) {
                        Log.e("MotionLayout", rug.b() + "no widget for  " + rug.d(childAt2) + Extension.O_BRAKE_SPACE + childAt2.getClass().getName() + Extension.C_BRAKE);
                    }
                }
            }
            i6 = i2 + 1;
            iArr2 = iArr;
            sparseArray2 = sparseArray;
            childCount = i;
        }
        SparseArray sparseArray3 = sparseArray2;
        int[] iArr3 = iArr2;
        int i25 = childCount;
        int i26 = 0;
        while (i26 < i25) {
            SparseArray sparseArray4 = sparseArray3;
            ia30 ia30Var3 = (ia30) sparseArray4.get(iArr3[i26]);
            int i27 = ia30Var3.f.D;
            if (i27 != -1) {
                ia30 ia30Var4 = (ia30) sparseArray4.get(i27);
                ia30Var3.f.f(ia30Var4, ia30Var4.f);
                ia30Var3.g.f(ia30Var4, ia30Var4.g);
            }
            i26++;
            sparseArray3 = sparseArray4;
        }
    }

    public final void b(int i, int i2) {
        MotionLayout motionLayout = this.g;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.mCurrentState == motionLayout.getStartState()) {
            androidx.constraintlayout.core.widgets.d dVar = this.b;
            androidx.constraintlayout.widget.e eVar = this.d;
            motionLayout.resolveSystem(dVar, optimizationLevel, (eVar == null || eVar.d == 0) ? i : i2, (eVar == null || eVar.d == 0) ? i2 : i);
            androidx.constraintlayout.widget.e eVar2 = this.c;
            if (eVar2 != null) {
                androidx.constraintlayout.core.widgets.d dVar2 = this.a;
                int i3 = eVar2.d;
                int i4 = i3 == 0 ? i : i2;
                if (i3 == 0) {
                    i = i2;
                }
                motionLayout.resolveSystem(dVar2, optimizationLevel, i4, i);
                return;
            }
            return;
        }
        androidx.constraintlayout.widget.e eVar3 = this.c;
        if (eVar3 != null) {
            androidx.constraintlayout.core.widgets.d dVar3 = this.a;
            int i5 = eVar3.d;
            motionLayout.resolveSystem(dVar3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
        }
        androidx.constraintlayout.core.widgets.d dVar4 = this.b;
        androidx.constraintlayout.widget.e eVar4 = this.d;
        int i6 = (eVar4 == null || eVar4.d == 0) ? i : i2;
        if (eVar4 == null || eVar4.d == 0) {
            i = i2;
        }
        motionLayout.resolveSystem(dVar4, optimizationLevel, i6, i);
    }

    public final void e(androidx.constraintlayout.widget.e eVar, androidx.constraintlayout.widget.e eVar2) {
        androidx.constraintlayout.core.widgets.d dVar;
        androidx.constraintlayout.core.widgets.d dVar2;
        androidx.constraintlayout.core.widgets.d dVar3;
        androidx.constraintlayout.core.widgets.d dVar4;
        boolean isRtl;
        boolean isRtl2;
        this.c = eVar;
        this.d = eVar2;
        this.a = new androidx.constraintlayout.core.widgets.d();
        this.b = new androidx.constraintlayout.core.widgets.d();
        androidx.constraintlayout.core.widgets.d dVar5 = this.a;
        MotionLayout motionLayout = this.g;
        dVar = ((ConstraintLayout) motionLayout).mLayoutWidget;
        ae5 ae5Var = dVar.y0;
        dVar5.y0 = ae5Var;
        dVar5.w0.f = ae5Var;
        androidx.constraintlayout.core.widgets.d dVar6 = this.b;
        dVar2 = ((ConstraintLayout) motionLayout).mLayoutWidget;
        ae5 ae5Var2 = dVar2.y0;
        dVar6.y0 = ae5Var2;
        dVar6.w0.f = ae5Var2;
        this.a.u0.clear();
        this.b.u0.clear();
        dVar3 = ((ConstraintLayout) motionLayout).mLayoutWidget;
        c(dVar3, this.a);
        dVar4 = ((ConstraintLayout) motionLayout).mLayoutWidget;
        c(dVar4, this.b);
        if (motionLayout.mTransitionLastPosition > 0.5d) {
            if (eVar != null) {
                g(this.a, eVar);
            }
            g(this.b, eVar2);
        } else {
            g(this.b, eVar2);
            if (eVar != null) {
                g(this.a, eVar);
            }
        }
        androidx.constraintlayout.core.widgets.d dVar7 = this.a;
        isRtl = motionLayout.isRtl();
        dVar7.z0 = isRtl;
        androidx.constraintlayout.core.widgets.d dVar8 = this.a;
        dVar8.v0.c(dVar8);
        androidx.constraintlayout.core.widgets.d dVar9 = this.b;
        isRtl2 = motionLayout.isRtl();
        dVar9.z0 = isRtl2;
        androidx.constraintlayout.core.widgets.d dVar10 = this.b;
        dVar10.v0.c(dVar10);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                androidx.constraintlayout.core.widgets.d dVar11 = this.a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                dVar11.O(dimensionBehaviour);
                this.b.O(dimensionBehaviour);
            }
            if (layoutParams.height == -2) {
                androidx.constraintlayout.core.widgets.d dVar12 = this.a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                dVar12.P(dimensionBehaviour2);
                this.b.P(dimensionBehaviour2);
            }
        }
    }

    public final void f() {
        int i;
        int i2;
        androidx.constraintlayout.core.widgets.d dVar;
        boolean z;
        MotionLayout motionLayout = this.g;
        i = motionLayout.mLastWidthMeasureSpec;
        i2 = motionLayout.mLastHeightMeasureSpec;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        motionLayout.mWidthMeasureMode = mode;
        motionLayout.mHeightMeasureMode = mode2;
        b(i, i2);
        boolean z2 = true;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            b(i, i2);
            motionLayout.mStartWrapWidth = this.a.s();
            motionLayout.mStartWrapHeight = this.a.m();
            motionLayout.mEndWrapWidth = this.b.s();
            int m = this.b.m();
            motionLayout.mEndWrapHeight = m;
            motionLayout.mMeasureDuringTransition = (motionLayout.mStartWrapWidth == motionLayout.mEndWrapWidth && motionLayout.mStartWrapHeight == m) ? false : true;
        }
        int i3 = motionLayout.mStartWrapWidth;
        int i4 = motionLayout.mStartWrapHeight;
        int i5 = motionLayout.mWidthMeasureMode;
        if (i5 == Integer.MIN_VALUE || i5 == 0) {
            i3 = (int) ((motionLayout.mPostInterpolationPosition * (motionLayout.mEndWrapWidth - i3)) + i3);
        }
        int i6 = motionLayout.mHeightMeasureMode;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((motionLayout.mPostInterpolationPosition * (motionLayout.mEndWrapHeight - i4)) + i4);
        }
        androidx.constraintlayout.core.widgets.d dVar2 = this.a;
        if (dVar2.J0 || this.b.J0) {
            dVar = dVar2;
            z = true;
        } else {
            dVar = dVar2;
            z = false;
        }
        if (!dVar.K0 && !this.b.K0) {
            z2 = false;
        }
        motionLayout.resolveMeasuredDimension(i, i2, i3, i4, z, z2);
        motionLayout.setupMotionViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.e eVar) {
        e.a aVar;
        e.a aVar2;
        SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
        Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
        sparseArray.clear();
        sparseArray.put(0, dVar);
        MotionLayout motionLayout = this.g;
        sparseArray.put(motionLayout.getId(), dVar);
        if (eVar != null && eVar.d != 0) {
            motionLayout.resolveSystem(this.b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824));
        }
        Iterator it = dVar.u0.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            constraintWidget.j0 = true;
            sparseArray.put(constraintWidget.h0.getId(), constraintWidget);
        }
        Iterator it2 = dVar.u0.iterator();
        while (it2.hasNext()) {
            ConstraintWidget constraintWidget2 = (ConstraintWidget) it2.next();
            View view = constraintWidget2.h0;
            int id = view.getId();
            HashMap hashMap = eVar.g;
            if (hashMap.containsKey(Integer.valueOf(id)) && (aVar2 = (e.a) hashMap.get(Integer.valueOf(id))) != null) {
                aVar2.b(layoutParams);
            }
            constraintWidget2.Q(eVar.o(view.getId()).e.c);
            constraintWidget2.N(eVar.o(view.getId()).e.d);
            if (view instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) view;
                int id2 = constraintHelper.getId();
                HashMap hashMap2 = eVar.g;
                if (hashMap2.containsKey(Integer.valueOf(id2)) && (aVar = (e.a) hashMap2.get(Integer.valueOf(id2))) != null && (constraintWidget2 instanceof nfu)) {
                    constraintHelper.loadParameters(aVar, (nfu) constraintWidget2, layoutParams, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).validateParams();
                }
            }
            layoutParams.resolveLayoutDirection(motionLayout.getLayoutDirection());
            motionLayout.applyConstraintsFromLayoutParams(false, view, constraintWidget2, layoutParams, sparseArray);
            if (eVar.o(view.getId()).c.c == 1) {
                constraintWidget2.i0 = view.getVisibility();
            } else {
                constraintWidget2.i0 = eVar.o(view.getId()).c.b;
            }
        }
        Iterator it3 = dVar.u0.iterator();
        while (it3.hasNext()) {
            ConstraintWidget constraintWidget3 = (ConstraintWidget) it3.next();
            if (constraintWidget3 instanceof i) {
                ConstraintHelper constraintHelper2 = (ConstraintHelper) constraintWidget3.h0;
                lfu lfuVar = (lfu) constraintWidget3;
                constraintHelper2.updatePreLayout(dVar, lfuVar, sparseArray);
                i iVar = (i) lfuVar;
                for (int i = 0; i < iVar.v0; i++) {
                    ConstraintWidget constraintWidget4 = iVar.u0[i];
                    if (constraintWidget4 != null) {
                        constraintWidget4.G = true;
                    }
                }
            }
        }
    }
}
