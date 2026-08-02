package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.LinearLayoutCompat;
import defpackage.omy0;
import defpackage.qw;
import defpackage.sj10;
import defpackage.sw;
import defpackage.tj10;
import defpackage.tw;
import defpackage.wm10;
import defpackage.x4e;
import defpackage.xn10;

/* loaded from: classes10.dex */
public class ActionMenuView extends LinearLayoutCompat implements tj10, xn10 {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private wm10 mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    sj10 mMenuBuilderCallback;
    private int mMinCellSize;
    tw mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private d mPresenter;
    private boolean mReserveOverflow;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f);
        this.mGeneratedItemPadding = (int) (f * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    public static int measureChildForCells(View view, int i, int i2, int i3, int i4) {
        int i5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.hasText();
        if (i2 > 0) {
            i5 = 2;
            if (!z2 || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z2 || i6 >= 2) {
                    i5 = i6;
                }
                if (!layoutParams.isOverflowButton && z2) {
                    z = true;
                }
                layoutParams.expandable = z;
                layoutParams.cellsUsed = i5;
                view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
                return i5;
            }
        }
        i5 = 0;
        if (!layoutParams.isOverflowButton) {
            z = true;
        }
        layoutParams.expandable = z;
        layoutParams.cellsUsed = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    private void onMeasureExactFormat(int i, int i2) {
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        ?? r3;
        int i7;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size - paddingRight;
        int i9 = this.mMinCellSize;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        long j2 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i18 = size2;
            if (childAt.getVisibility() == 8) {
                i7 = paddingBottom;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i15++;
                if (z4) {
                    int i19 = this.mGeneratedItemPadding;
                    z2 = z4;
                    r3 = 0;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    z2 = z4;
                    r3 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = r3;
                layoutParams.extraPixels = r3;
                layoutParams.cellsUsed = r3;
                layoutParams.expandable = r3;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r3;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r3;
                layoutParams.preventEdgeOffset = z2 && ((ActionMenuItemView) childAt).hasText();
                int measureChildForCells = measureChildForCells(childAt, i12, layoutParams.isOverflowButton ? 1 : i10, childMeasureSpec, paddingBottom);
                i16 = Math.max(i16, measureChildForCells);
                i7 = paddingBottom;
                if (layoutParams.expandable) {
                    i17++;
                }
                if (layoutParams.isOverflowButton) {
                    z3 = true;
                }
                i10 -= measureChildForCells;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (measureChildForCells == 1) {
                    j2 |= 1 << i14;
                    i10 = i10;
                }
            }
            i14++;
            size2 = i18;
            paddingBottom = i7;
        }
        int i20 = size2;
        char c = 2;
        boolean z5 = z3 && i15 == 2;
        boolean z6 = false;
        while (i17 > 0 && i10 > 0) {
            long j3 = 0;
            char c2 = c;
            int i21 = Integer.MAX_VALUE;
            int i22 = 0;
            int i23 = 0;
            j = 1;
            while (i23 < childCount) {
                boolean z7 = z5;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i23).getLayoutParams();
                int i24 = i12;
                if (layoutParams2.expandable) {
                    int i25 = layoutParams2.cellsUsed;
                    if (i25 < i21) {
                        j3 = 1 << i23;
                        i21 = i25;
                        i22 = 1;
                    } else if (i25 == i21) {
                        j3 |= 1 << i23;
                        i22++;
                    }
                }
                i23++;
                i12 = i24;
                z5 = z7;
            }
            boolean z8 = z5;
            i3 = i12;
            j2 |= j3;
            if (i22 > i10) {
                i4 = i13;
                break;
            }
            int i26 = i21 + 1;
            int i27 = 0;
            while (i27 < childCount) {
                View childAt2 = getChildAt(i27);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i28 = i13;
                long j4 = 1 << i27;
                if ((j3 & j4) == 0) {
                    if (layoutParams3.cellsUsed == i26) {
                        j2 |= j4;
                    }
                    i6 = i27;
                } else {
                    if (!z8 || !layoutParams3.preventEdgeOffset) {
                        i6 = i27;
                        z = true;
                    } else if (i10 == 1) {
                        int i29 = this.mGeneratedItemPadding;
                        z = true;
                        i6 = i27;
                        childAt2.setPadding(i29 + i3, 0, i29, 0);
                    } else {
                        i6 = i27;
                        z = true;
                    }
                    layoutParams3.cellsUsed++;
                    layoutParams3.expanded = z;
                    i10--;
                }
                i27 = i6 + 1;
                i13 = i28;
            }
            i12 = i3;
            c = c2;
            z5 = z8;
            z6 = true;
        }
        i3 = i12;
        i4 = i13;
        j = 1;
        boolean z9 = !z3 && i15 == 1;
        if (i10 <= 0 || j2 == 0 || (i10 >= i15 - 1 && !z9 && i16 <= 1)) {
            i5 = 0;
        } else {
            float bitCount = Long.bitCount(j2);
            if (z9) {
                i5 = 0;
            } else {
                if ((j2 & j) != 0) {
                    i5 = 0;
                    if (!((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                        bitCount -= 0.5f;
                    }
                } else {
                    i5 = 0;
                }
                int i30 = childCount - 1;
                if ((j2 & (1 << i30)) != 0 && !((LayoutParams) getChildAt(i30).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
            }
            int i31 = bitCount > 0.0f ? (int) ((i10 * i3) / bitCount) : i5;
            for (int i32 = i5; i32 < childCount; i32++) {
                if ((j2 & (1 << i32)) != 0) {
                    View childAt3 = getChildAt(i32);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.extraPixels = i31;
                        layoutParams4.expanded = true;
                        if (i32 == 0 && !layoutParams4.preventEdgeOffset) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i31) / 2;
                        }
                        z6 = true;
                    } else if (layoutParams4.isOverflowButton) {
                        layoutParams4.extraPixels = i31;
                        layoutParams4.expanded = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i31) / 2;
                        z6 = true;
                    } else {
                        if (i32 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i31 / 2;
                        }
                        if (i32 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i31 / 2;
                        }
                    }
                }
            }
        }
        if (z6) {
            for (int i33 = i5; i33 < childCount; i33++) {
                View childAt4 = getChildAt(i33);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.cellsUsed * i3) + layoutParams5.extraPixels, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        d dVar = this.mPresenter;
        if (dVar != null) {
            dVar.b();
            qw qwVar = dVar.N;
            if (qwVar != null) {
                qwVar.a();
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.mMenu = menuBuilder;
            menuBuilder.setCallback(new e(this, 0));
            d dVar = new d(context);
            this.mPresenter = dVar;
            dVar.F = true;
            dVar.G = true;
            wm10 wm10Var = this.mActionMenuPresenterCallback;
            if (wm10Var == null) {
                wm10Var = new omy0();
            }
            dVar.x = wm10Var;
            this.mMenu.addMenuPresenter(dVar, this.mPopupContext);
            d dVar2 = this.mPresenter;
            dVar2.A = this;
            initialize(dVar2.c);
        }
        return this.mMenu;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        d dVar = this.mPresenter;
        ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = dVar.C;
        if (actionMenuPresenter$OverflowMenuButton != null) {
            return actionMenuPresenter$OverflowMenuButton.getDrawable();
        }
        if (dVar.E) {
            return dVar.D;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public boolean hasSupportDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof sw)) {
            z = ((sw) childAt).needsDividerAfter();
        }
        return (i <= 0 || !(childAt2 instanceof sw)) ? z : ((sw) childAt2).needsDividerBefore() | z;
    }

    public boolean hideOverflowMenu() {
        d dVar = this.mPresenter;
        return dVar != null && dVar.b();
    }

    @Override // defpackage.xn10
    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    @Override // defpackage.tj10
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    public boolean isOverflowMenuShowPending() {
        d dVar = this.mPresenter;
        if (dVar != null) {
            return dVar.O != null || dVar.c();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        d dVar = this.mPresenter;
        return dVar != null && dVar.c();
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d dVar = this.mPresenter;
        if (dVar != null) {
            dVar.updateMenuView(false);
            if (this.mPresenter.c()) {
                this.mPresenter.b();
                this.mPresenter.e();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.mFormatItems) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    hasSupportDividerBeforeChildAt(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = x4e.D(measuredWidth4, ((LinearLayout.LayoutParams) layoutParams3).rightMargin, max, i19);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        MenuBuilder menuBuilder;
        boolean z = this.mFormatItems;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.mFormatItems = z2;
        if (z != z2) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.mFormatItems && (menuBuilder = this.mMenu) != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.mFormatItems && childCount > 0) {
            onMeasureExactFormat(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public MenuBuilder peekMenu() {
        return this.mMenu;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mPresenter.K = z;
    }

    public void setMenuCallbacks(wm10 wm10Var, sj10 sj10Var) {
        this.mActionMenuPresenterCallback = wm10Var;
        this.mMenuBuilderCallback = sj10Var;
    }

    public void setOnMenuItemClickListener(tw twVar) {
        this.mOnMenuItemClickListener = twVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        d dVar = this.mPresenter;
        ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = dVar.C;
        if (actionMenuPresenter$OverflowMenuButton != null) {
            actionMenuPresenter$OverflowMenuButton.setImageDrawable(drawable);
        } else {
            dVar.E = true;
            dVar.D = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.mReserveOverflow = z;
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(d dVar) {
        this.mPresenter = dVar;
        dVar.A = this;
        initialize(dVar.c);
    }

    public boolean showOverflowMenu() {
        d dVar = this.mPresenter;
        return dVar != null && dVar.e();
    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        @ViewDebug.ExportedProperty
        public int cellsUsed;

        @ViewDebug.ExportedProperty
        public boolean expandable;
        boolean expanded;

        @ViewDebug.ExportedProperty
        public int extraPixels;

        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.isOverflowButton = false;
        }

        public LayoutParams(int i, int i2, boolean z) {
            super(i, i2);
            this.isOverflowButton = z;
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
