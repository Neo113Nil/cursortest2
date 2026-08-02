package com.yandex.div.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import defpackage.e3i0;
import defpackage.gpl;
import defpackage.ny61;
import defpackage.tig0;
import defpackage.u0u;
import defpackage.v0u;
import defpackage.wfx;
import defpackage.x0u;
import defpackage.x4e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0011\u0018\u0000 U2\u00020\u0001:\b;VWXCYZ[B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0015J7\u0010%\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0015J\u001f\u0010(\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0015JG\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010.J/\u00102\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u00103J/\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u00103J\u000f\u00106\u001a\u00020\fH\u0002¢\u0006\u0004\b6\u0010\u0011J\u000f\u00107\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u0010\u0011J\u000f\u00108\u001a\u00020\fH\u0002¢\u0006\u0004\b8\u0010\u0011J\u000f\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010.J\u000f\u0010:\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010\u0011J!\u0010\u0018\u001a\u00020\u0006*\u00020;2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002¢\u0006\u0004\b\u0018\u0010?J!\u0010\u001a\u001a\u00020\u0006*\u00020;2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002¢\u0006\u0004\b\u001a\u0010?J!\u0010\u0019\u001a\u00020\u0006*\u00020;2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002¢\u0006\u0004\b\u0019\u0010?J!\u0010\u001b\u001a\u00020\u0006*\u00020;2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002¢\u0006\u0004\b\u001b\u0010?J!\u0010A\u001a\u00020\u0006*\u00020;2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002¢\u0006\u0004\bA\u0010?J!\u0010B\u001a\u00020\u0006*\u00020;2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002¢\u0006\u0004\bB\u0010?R\u0018\u0010D\u001a\u00060CR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010N\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010.\"\u0004\bL\u0010MR\u0011\u0010P\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bO\u0010.R\u0014\u0010R\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010.R\u0014\u0010T\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010.¨\u0006\\"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "child", "Lzy11;", "onViewAdded", "(Landroid/view/View;)V", "onViewRemoved", "requestLayout", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "widthSpec", "heightSpec", "measureChildrenInitial", "parentWidthSpec", "parentHeightSpec", "childWidth", "childHeight", "measureChild", "(Landroid/view/View;IIII)V", "remeasureChildrenWidth", "remeasureChildrenHeight", "cellWidth", "cellHeight", "measureMatchParentChild", "(Landroid/view/View;IIIIII)V", "calculateGridHorizontalPosition", "()I", "calculateGridVerticalPosition", "cellLeft", "gravity", "calculateChildHorizontalPosition", "(IIII)I", "cellTop", "calculateChildVerticalPosition", "invalidateStructure", "invalidateMeasurement", "checkConsistency", "computeLayoutHashCode", "validateLayoutParams", "Lu0u;", "", "Lcom/yandex/div/core/widget/GridContainer$a;", "columns", "(Lu0u;Ljava/util/List;)I", "rows", "width", "height", "Lcom/yandex/div/core/widget/c;", "grid", "Lcom/yandex/div/core/widget/c;", "lastLayoutHashCode", CA20Status.STATUS_USER_I, "initialized", "Z", "value", "getColumnCount", "setColumnCount", "(I)V", "columnCount", "getRowCount", "rowCount", "getPaddingHorizontal", "paddingHorizontal", "getPaddingVertical", "paddingVertical", "Companion", "v0u", "w0u", "x0u", "a", "b", "y0u", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class GridContainer extends DivViewGroup {
    public static final x0u Companion = new x0u();
    private static final int DEFAULT_COLUMN_COUNT = 1;
    private static final int MAX_SIZE = 32768;
    private static final String TAG = "GridContainer";
    private static final int UNINITIALIZED_HASH = 0;
    private final c grid;
    private boolean initialized;
    private int lastLayoutHashCode;

    public static final class a {
        public int a;
        public int b;
        public int c;
        public float d;

        public static void a(a aVar, int i, int i2, float f, int i3) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            aVar.b = Math.max(aVar.b, i);
            aVar.c = Math.max(aVar.c, i2);
            aVar.d = Math.max(aVar.d, f);
        }

        public final boolean b() {
            return this.d > 0.0f;
        }
    }

    public GridContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.grid = new c(this);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e3i0.GridContainer, i, 0);
            try {
                setColumnCount(obtainStyledAttributes.getInt(e3i0.GridContainer_android_columnCount, 1));
                setGravity(obtainStyledAttributes.getInt(e3i0.GridContainer_android_gravity, 8388659));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.initialized = true;
    }

    private final int bottom(u0u u0uVar, List<a> list) {
        a aVar = list.get((u0uVar.c + u0uVar.e) - 1);
        return aVar.a + aVar.c;
    }

    private final int calculateChildHorizontalPosition(int cellLeft, int cellWidth, int childWidth, int gravity) {
        int i = gravity & 7;
        return i != 1 ? i != 5 ? cellLeft : (cellLeft + cellWidth) - childWidth : x4e.c(cellWidth, childWidth, 2, cellLeft);
    }

    private final int calculateChildVerticalPosition(int cellTop, int cellHeight, int childHeight, int gravity) {
        int i = gravity & 112;
        return i != 16 ? i != 80 ? cellTop : (cellTop + cellHeight) - childHeight : x4e.c(cellHeight, childHeight, 2, cellTop);
    }

    private final int calculateGridHorizontalPosition() {
        int gravity = getGravity() & 7;
        tig0 tig0Var = this.grid.c;
        int a2 = tig0Var.b != null ? c.a((List) tig0Var.f()) : 0;
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        return gravity != 1 ? gravity != 5 ? getPaddingLeft() : (getPaddingLeft() + measuredWidth) - a2 : x4e.c(measuredWidth, a2, 2, getPaddingLeft());
    }

    private final int calculateGridVerticalPosition() {
        int gravity = getGravity() & 112;
        tig0 tig0Var = this.grid.d;
        int a2 = tig0Var.b != null ? c.a((List) tig0Var.f()) : 0;
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        return gravity != 16 ? gravity != 80 ? getPaddingTop() : (getPaddingTop() + measuredHeight) - a2 : x4e.c(measuredHeight, a2, 2, getPaddingTop());
    }

    private final void checkConsistency() {
        int i = this.lastLayoutHashCode;
        if (i == 0) {
            validateLayoutParams();
            this.lastLayoutHashCode = computeLayoutHashCode();
        } else if (i != computeLayoutHashCode()) {
            invalidateStructure();
            checkConsistency();
        }
    }

    private final int computeLayoutHashCode() {
        int childCount = getChildCount();
        int i = 223;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = ((DivLayoutParams) childAt.getLayoutParams()).hashCode() + (i * 31);
            }
        }
        return i;
    }

    private final int getPaddingHorizontal() {
        return getPaddingRight() + getPaddingLeft();
    }

    private final int getPaddingVertical() {
        return getPaddingBottom() + getPaddingTop();
    }

    private final int height(u0u u0uVar, List<a> list) {
        return bottom(u0uVar, list) - top(u0uVar, list);
    }

    private final void invalidateMeasurement() {
        c cVar = this.grid;
        cVar.c.b = null;
        cVar.d.b = null;
    }

    private final void invalidateStructure() {
        this.lastLayoutHashCode = 0;
        c cVar = this.grid;
        cVar.b.b = null;
        cVar.c.b = null;
        cVar.d.b = null;
    }

    private final int left(u0u u0uVar, List<a> list) {
        return list.get(u0uVar.b).a;
    }

    private final void measureChild(View child, int parentWidthSpec, int parentHeightSpec, int childWidth, int childHeight) {
        gpl gplVar = DivViewGroup.Companion;
        int minimumWidth = child.getMinimumWidth();
        int maxWidth = ((DivLayoutParams) child.getLayoutParams()).getMaxWidth();
        gplVar.getClass();
        child.measure(gpl.a(parentWidthSpec, 0, childWidth, minimumWidth, maxWidth), gpl.a(parentHeightSpec, 0, childHeight, child.getMinimumHeight(), ((DivLayoutParams) child.getLayoutParams()).getMaxHeight()));
    }

    private final void measureChildrenInitial(int widthSpec, int heightSpec) {
        GridContainer gridContainer;
        int i;
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = this.getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                int i5 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
                int i6 = i5 == -1 ? 0 : i5;
                int i7 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
                if (i7 == -1) {
                    i3 = 0;
                    gridContainer = this;
                    i = widthSpec;
                    i2 = heightSpec;
                } else {
                    i3 = i7;
                    i = widthSpec;
                    i2 = heightSpec;
                    gridContainer = this;
                }
                gridContainer.measureChild(childAt, i, i2, i6, i3);
            } else {
                gridContainer = this;
                i = widthSpec;
                i2 = heightSpec;
            }
            i4++;
            this = gridContainer;
            widthSpec = i;
            heightSpec = i2;
        }
    }

    private final void measureMatchParentChild(View child, int parentWidthSpec, int parentHeightSpec, int childWidth, int childHeight, int cellWidth, int cellHeight) {
        int a2;
        int a3;
        if (childWidth == -1) {
            a2 = View.MeasureSpec.makeMeasureSpec(cellWidth, 1073741824);
        } else {
            gpl gplVar = DivViewGroup.Companion;
            int minimumWidth = child.getMinimumWidth();
            int maxWidth = ((DivLayoutParams) child.getLayoutParams()).getMaxWidth();
            gplVar.getClass();
            a2 = gpl.a(parentWidthSpec, 0, childWidth, minimumWidth, maxWidth);
        }
        if (childHeight == -1) {
            a3 = View.MeasureSpec.makeMeasureSpec(cellHeight, 1073741824);
        } else {
            gpl gplVar2 = DivViewGroup.Companion;
            int minimumHeight = child.getMinimumHeight();
            int maxHeight = ((DivLayoutParams) child.getLayoutParams()).getMaxHeight();
            gplVar2.getClass();
            a3 = gpl.a(parentHeightSpec, 0, childHeight, minimumHeight, maxHeight);
        }
        child.measure(a2, a3);
    }

    private final void remeasureChildrenHeight(int widthSpec, int heightSpec) {
        List list = (List) this.grid.b.f();
        List<a> list2 = (List) this.grid.c.f();
        List<a> list3 = (List) this.grid.d.f();
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
                    u0u u0uVar = (u0u) list.get(i);
                    measureMatchParentChild(childAt, widthSpec, heightSpec, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, width(u0uVar, list2) - divLayoutParams.getHorizontalMargins$div_release(), height(u0uVar, list3) - divLayoutParams.getVerticalMargins$div_release());
                }
                i++;
            }
        }
    }

    private final void remeasureChildrenWidth(int widthSpec, int heightSpec) {
        GridContainer gridContainer;
        int i;
        int i2;
        List list = (List) this.grid.b.f();
        List<a> list2 = (List) this.grid.c.f();
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (i3 < childCount) {
            View childAt = this.getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).width != -1) {
                    i4++;
                } else {
                    int width = this.width((u0u) list.get(i4), list2) - divLayoutParams.getHorizontalMargins$div_release();
                    int i5 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
                    int i6 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
                    gridContainer = this;
                    i = widthSpec;
                    i2 = heightSpec;
                    gridContainer.measureMatchParentChild(childAt, i, i2, i5, i6, width, 0);
                    i4++;
                    i3++;
                    this = gridContainer;
                    widthSpec = i;
                    heightSpec = i2;
                }
            }
            gridContainer = this;
            i = widthSpec;
            i2 = heightSpec;
            i3++;
            this = gridContainer;
            widthSpec = i;
            heightSpec = i2;
        }
    }

    private final int right(u0u u0uVar, List<a> list) {
        a aVar = list.get((u0uVar.b + u0uVar.d) - 1);
        return aVar.a + aVar.c;
    }

    private final int top(u0u u0uVar, List<a> list) {
        return list.get(u0uVar.c).a;
    }

    private final void validateLayoutParams() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) getChildAt(i).getLayoutParams();
            if (divLayoutParams.getColumnSpan() < 0 || divLayoutParams.getRowSpan() < 0) {
                ny61.r("Negative spans are not supported.");
                return;
            } else {
                if (divLayoutParams.getHorizontalWeight() < 0.0f || divLayoutParams.getVerticalWeight() < 0.0f) {
                    ny61.r("Negative weights are not supported.");
                    return;
                }
            }
        }
    }

    private final int width(u0u u0uVar, List<a> list) {
        return right(u0uVar, list) - left(u0uVar, list);
    }

    public final int getColumnCount() {
        return this.grid.a;
    }

    public final int getRowCount() {
        return ((v0u) this.grid.b.f()).b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        List<a> list;
        SystemClock.elapsedRealtime();
        checkConsistency();
        List<a> list2 = (List) this.grid.c.f();
        List<a> list3 = (List) this.grid.d.f();
        List list4 = (List) this.grid.b.f();
        int calculateGridHorizontalPosition = calculateGridHorizontalPosition();
        int calculateGridVerticalPosition = calculateGridVerticalPosition();
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                u0u u0uVar = (u0u) list4.get(i2);
                int left2 = left(u0uVar, list2) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                int pVar = top(u0uVar, list3) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                int right2 = (right(u0uVar, list2) - left2) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                int bottom2 = (bottom(u0uVar, list3) - pVar) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                list = list2;
                int calculateChildHorizontalPosition = calculateChildHorizontalPosition(left2, right2, childAt.getMeasuredWidth(), divLayoutParams.getGravity()) + calculateGridHorizontalPosition;
                int calculateChildVerticalPosition = calculateChildVerticalPosition(pVar, bottom2, childAt.getMeasuredHeight(), divLayoutParams.getGravity()) + calculateGridVerticalPosition;
                childAt.layout(calculateChildHorizontalPosition, calculateChildVerticalPosition, childAt.getMeasuredWidth() + calculateChildHorizontalPosition, childAt.getMeasuredHeight() + calculateChildVerticalPosition);
                i2++;
            } else {
                list = list2;
            }
            i++;
            list2 = list;
        }
        SystemClock.elapsedRealtime();
        int i3 = wfx.a;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        SystemClock.elapsedRealtime();
        checkConsistency();
        invalidateMeasurement();
        int paddingHorizontal = getPaddingHorizontal();
        int paddingVertical = getPaddingVertical();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthMeasureSpec - paddingHorizontal), View.MeasureSpec.getMode(widthMeasureSpec));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(heightMeasureSpec - paddingVertical), View.MeasureSpec.getMode(heightMeasureSpec));
        measureChildrenInitial(makeMeasureSpec, makeMeasureSpec2);
        c cVar = this.grid;
        b bVar = cVar.e;
        bVar.a(makeMeasureSpec);
        int max = Math.max(bVar.a, Math.min(c.a((List) cVar.c.f()), bVar.b));
        remeasureChildrenWidth(makeMeasureSpec, makeMeasureSpec2);
        c cVar2 = this.grid;
        b bVar2 = cVar2.f;
        bVar2.a(makeMeasureSpec2);
        int max2 = Math.max(bVar2.a, Math.min(c.a((List) cVar2.d.f()), bVar2.b));
        remeasureChildrenHeight(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max + paddingHorizontal, getSuggestedMinimumWidth()), widthMeasureSpec, 0), View.resolveSizeAndState(Math.max(max2 + paddingVertical, getSuggestedMinimumHeight()), heightMeasureSpec, 0));
        SystemClock.elapsedRealtime();
        int i = wfx.a;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        super.onViewAdded(child);
        invalidateStructure();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View child) {
        super.onViewRemoved(child);
        invalidateStructure();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.initialized) {
            invalidateMeasurement();
        }
    }

    public final void setColumnCount(int i) {
        c cVar = this.grid;
        if (i <= 0) {
            cVar.getClass();
        } else if (cVar.a != i) {
            cVar.a = i;
            cVar.b.b = null;
            cVar.c.b = null;
            cVar.d.b = null;
        }
        invalidateStructure();
        requestLayout();
    }

    public static final class b {
        public int a;
        public int b;

        public b(int i) {
            this.a = 0;
            this.b = 32768;
        }

        public final void a(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                this.a = 0;
                this.b = size;
            } else if (mode == 0) {
                this.a = 0;
                this.b = 32768;
            } else {
                if (mode != 1073741824) {
                    return;
                }
                this.a = size;
                this.b = size;
            }
        }

        public b() {
            this(0);
        }
    }

    public GridContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ GridContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public GridContainer(Context context) {
        this(context, null, 0, 6, null);
    }
}
