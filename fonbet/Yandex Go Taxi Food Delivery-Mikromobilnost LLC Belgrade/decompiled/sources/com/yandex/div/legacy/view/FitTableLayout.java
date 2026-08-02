package com.yandex.div.legacy.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.f3i0;
import defpackage.i6z0;
import defpackage.ny61;
import defpackage.udr;
import defpackage.unr0;
import defpackage.vdr;
import defpackage.x4e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class FitTableLayout extends ViewGroup {
    private static final int DEFAULT_COLUMN_COUNT = 1;
    private static final int MAX_SIZE = 32768;
    private static final int UNINITIALIZED_HASH = 0;
    private final b mGrid;
    private boolean mInitialized;
    private int mLastLayoutParamsHashCode;

    public FitTableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGrid = new b(this);
        this.mLastLayoutParamsHashCode = 0;
        this.mInitialized = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3i0.FitTableLayout, i, 0);
        try {
            setColumnCount(obtainStyledAttributes.getInt(f3i0.FitTableLayout_android_columnCount, 1));
            obtainStyledAttributes.recycle();
            this.mInitialized = true;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private static int calcChildHorizontalPosition(int i, int i2, int i3, int i4) {
        int i5 = i4 & 7;
        return i5 != 1 ? i5 != 5 ? i : (i + i2) - i3 : x4e.c(i2, i3, 2, i);
    }

    private static int calcChildVerticalPosition(int i, int i2, int i3, int i4) {
        int i5 = i4 & 112;
        return i5 != 16 ? i5 != 80 ? i : (i + i2) - i3 : x4e.c(i2, i3, 2, i);
    }

    private void checkConsistency() {
        int i = this.mLastLayoutParamsHashCode;
        if (i == 0) {
            validateLayoutParams();
            this.mLastLayoutParamsHashCode = computeLayoutParamsHashCode();
        } else if (i != computeLayoutParamsHashCode()) {
            invalidateStructure();
            checkConsistency();
        }
    }

    private int computeLayoutParamsHashCode() {
        int childCount = getChildCount();
        int i = 223;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = getLayoutParams(childAt).hashCode() + (i * 31);
            }
        }
        return i;
    }

    private int downscale(int i, float f) {
        return (int) Math.ceil(i * f);
    }

    private static int getCellBottom(List<? extends udr> list, vdr vdrVar) {
        udr udrVar = list.get(vdrVar.c);
        return (udrVar.b + udrVar.a) - udrVar.d;
    }

    private static int getCellHeight(List<? extends udr> list, vdr vdrVar) {
        return getCellBottom(list, vdrVar) - getCellTop(list, vdrVar);
    }

    private static int getCellLeft(List<? extends udr> list, vdr vdrVar) {
        udr udrVar = list.get(vdrVar.b);
        return udrVar.b + udrVar.c;
    }

    private static int getCellRight(List<? extends udr> list, vdr vdrVar) {
        udr udrVar = list.get((vdrVar.b + vdrVar.d) - 1);
        return (udrVar.b + udrVar.a) - udrVar.d;
    }

    private static int getCellTop(List<? extends udr> list, vdr vdrVar) {
        udr udrVar = list.get(vdrVar.c);
        return udrVar.b + udrVar.c;
    }

    private static int getCellWidth(List<? extends udr> list, vdr vdrVar) {
        return getCellRight(list, vdrVar) - getCellLeft(list, vdrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LayoutParams getLayoutParams(View view) {
        return (LayoutParams) view.getLayoutParams();
    }

    private void invalidateMeasurement() {
        b bVar = this.mGrid;
        bVar.a.clear();
        bVar.b.clear();
        bVar.j = false;
        bVar.k = false;
    }

    private void invalidateStructure() {
        this.mLastLayoutParamsHashCode = 0;
        b bVar = this.mGrid;
        bVar.c.clear();
        bVar.i = false;
        bVar.a.clear();
        bVar.b.clear();
        bVar.j = false;
        bVar.k = false;
    }

    private static void measureChildInitial(View view, int i, int i2, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i, 0, i3), ViewGroup.getChildMeasureSpec(i2, 0, i4));
    }

    private void measureChildrenInitial(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = getLayoutParams(childAt);
                int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                if (i4 == -1) {
                    i4 = 0;
                }
                int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                if (i5 == -1) {
                    i5 = 0;
                }
                measureChildInitial(childAt, i, i2, i4, i5);
            }
        }
    }

    private static void measureMatchParentChild(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        view.measure(i3 == -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : ViewGroup.getChildMeasureSpec(i, 0, i3), i4 == -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : ViewGroup.getChildMeasureSpec(i2, 0, i4));
    }

    private void remeasureMatchParentChildren(int i, int i2) {
        int i3;
        int i4;
        b bVar = this.mGrid;
        if (!bVar.i) {
            bVar.a();
        }
        ArrayList arrayList = bVar.c;
        ArrayList b = this.mGrid.b();
        ArrayList d = this.mGrid.d();
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = getLayoutParams(childAt);
                if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                    vdr vdrVar = (vdr) arrayList.get(i5);
                    int cellWidth = getCellWidth(b, vdrVar);
                    int cellHeight = getCellHeight(d, vdrVar);
                    int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    i3 = i;
                    i4 = i2;
                    measureMatchParentChild(childAt, i3, i4, i6, i7, cellWidth, cellHeight);
                    i5++;
                    i = i3;
                    i2 = i4;
                }
            }
            i3 = i;
            i4 = i2;
            i5++;
            i = i3;
            i2 = i4;
        }
    }

    private void resetChildrenScale() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.setScaleX(1.0f);
            childAt.setScaleY(1.0f);
        }
    }

    private void validateLayoutParams() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = getLayoutParams(getChildAt(i));
            if (layoutParams.weight < 0.0f) {
                ny61.r("Negative weights are not supported.");
                return;
            } else {
                if (layoutParams.span < 0) {
                    ny61.r("Negative spans are not supported.");
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getColumnCount() {
        return this.mGrid.g;
    }

    public int getRowCount() {
        b bVar = this.mGrid;
        if (!bVar.i) {
            bVar.a();
        }
        return bVar.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        checkConsistency();
        int childCount = getChildCount();
        ArrayList b = this.mGrid.b();
        ArrayList d = this.mGrid.d();
        b bVar = this.mGrid;
        if (!bVar.i) {
            bVar.a();
        }
        ArrayList arrayList = bVar.c;
        b bVar2 = this.mGrid;
        int c = bVar2.c();
        int i6 = bVar2.d.c;
        float f = c <= i6 ? 1.0f : i6 / c;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                i5 = childCount;
            } else {
                LayoutParams layoutParams = getLayoutParams(childAt);
                vdr vdrVar = (vdr) arrayList.get(i7);
                int cellLeft = getCellLeft(b, vdrVar);
                int cellTop = getCellTop(d, vdrVar);
                int cellRight = getCellRight(b, vdrVar) - cellLeft;
                int cellBottom = getCellBottom(d, vdrVar) - cellTop;
                i5 = childCount;
                int calcChildHorizontalPosition = calcChildHorizontalPosition(cellLeft, cellRight, childAt.getMeasuredWidth(), layoutParams.gravity);
                int calcChildVerticalPosition = calcChildVerticalPosition(cellTop, cellBottom, childAt.getMeasuredHeight(), layoutParams.gravity);
                if (f < 1.0f) {
                    childAt.setScaleX(f);
                    childAt.setScaleY(f);
                    calcChildHorizontalPosition = downscale(calcChildHorizontalPosition, f);
                    calcChildVerticalPosition = downscale(calcChildVerticalPosition, f);
                }
                int i8 = calcChildHorizontalPosition + paddingLeft;
                int i9 = calcChildVerticalPosition + paddingTop;
                childAt.layout(i8, i9, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + i9);
            }
            i7++;
            childCount = i5;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        checkConsistency();
        invalidateMeasurement();
        resetChildrenScale();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        measureChildrenInitial(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(32768 - paddingRight), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(32768 - paddingBottom), View.MeasureSpec.getMode(i2)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i - paddingRight), View.MeasureSpec.getMode(i));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2 - paddingBottom), View.MeasureSpec.getMode(i2));
        b bVar = this.mGrid;
        i6z0 i6z0Var = bVar.d;
        b.e(i6z0Var, makeMeasureSpec);
        int max = Math.max(i6z0Var.b, Math.min(bVar.c(), i6z0Var.c));
        b bVar2 = this.mGrid;
        i6z0 i6z0Var2 = bVar2.e;
        b.e(i6z0Var2, makeMeasureSpec2);
        ArrayList d = bVar2.d();
        if (d.isEmpty()) {
            i3 = 0;
        } else {
            udr udrVar = (udr) unr0.k(1, d);
            i3 = udrVar.b + udrVar.a;
        }
        int max2 = Math.max(i6z0Var2.b, Math.min(i3, i6z0Var2.c));
        remeasureMatchParentChildren(makeMeasureSpec, makeMeasureSpec2);
        b bVar3 = this.mGrid;
        int c = bVar3.c();
        int i4 = bVar3.d.c;
        float f = c <= i4 ? 1.0f : i4 / c;
        if (f < 1.0f) {
            max2 = downscale(max2, f);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max + paddingRight, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(max2 + paddingBottom, getSuggestedMinimumHeight()), i2, 0));
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        invalidateStructure();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        invalidateStructure();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.mInitialized) {
            invalidateMeasurement();
        }
    }

    public void setColumnCount(int i) {
        this.mGrid.g = i;
        invalidateStructure();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public FitTableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FitTableLayout(Context context) {
        this(context, null);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int DEFAULT_GRAVITY = 51;
        private static final int DEFAULT_HEIGHT = -2;
        private static final int DEFAULT_SPAN = 1;
        private static final int DEFAULT_WIDTH = -2;
        static final float UNDEFINED_WEIGHT = 0.0f;
        public int gravity;
        public int span;
        public float weight;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3i0.FitTableLayout_Layout);
            try {
                this.gravity = obtainStyledAttributes.getInt(f3i0.FitTableLayout_Layout_android_layout_gravity, 51);
                this.span = obtainStyledAttributes.getInt(f3i0.FitTableLayout_Layout_android_layout_span, 1);
                this.weight = obtainStyledAttributes.getFloat(f3i0.FitTableLayout_Layout_android_layout_weight, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                LayoutParams layoutParams = (LayoutParams) obj;
                if (((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) layoutParams).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) layoutParams).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) layoutParams).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin && this.gravity == layoutParams.gravity && this.span == layoutParams.span && this.weight == layoutParams.weight) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.weight) + (((((super.hashCode() * 31) + this.gravity) * 31) + this.span) * 31);
        }

        @Override // android.view.ViewGroup.LayoutParams
        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i, -2);
            ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i2, -2);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 51;
            this.span = 1;
            this.weight = 0.0f;
        }

        public LayoutParams() {
            this(-2, -2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = layoutParams.gravity;
            this.span = layoutParams.span;
            this.weight = layoutParams.weight;
        }
    }
}
