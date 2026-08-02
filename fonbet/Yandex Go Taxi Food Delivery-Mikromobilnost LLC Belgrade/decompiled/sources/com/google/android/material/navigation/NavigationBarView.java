package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import defpackage.dfz0;
import defpackage.eja1;
import defpackage.g810;
import defpackage.jx81;
import defpackage.org0;
import defpackage.q5z;
import defpackage.s650;
import defpackage.t650;
import defpackage.xl10;
import defpackage.xn10;
import defpackage.yvy0;
import defpackage.z2i0;

/* loaded from: classes11.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final int ACTIVE_INDICATOR_WIDTH_MATCH_PARENT = -1;
    public static final int ACTIVE_INDICATOR_WIDTH_WRAP_CONTENT = -2;
    public static final int ITEM_GRAVITY_CENTER = 17;
    public static final int ITEM_GRAVITY_START_CENTER = 8388627;
    public static final int ITEM_GRAVITY_TOP_CENTER = 49;
    public static final int ITEM_ICON_GRAVITY_START = 1;
    public static final int ITEM_ICON_GRAVITY_TOP = 0;
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;
    private final NavigationBarMenu menu;
    private MenuInflater menuInflater;
    private final NavigationBarMenuView menuView;
    private final NavigationBarPresenter presenter;
    private s650 reselectedListener;
    private t650 selectedListener;

    /* JADX WARN: Removed duplicated region for block: B:51:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(g810.b(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.presenter = navigationBarPresenter;
        Context context2 = getContext();
        dfz0 e = yvy0.e(context2, attributeSet, z2i0.NavigationBarView, i, i2, z2i0.NavigationBarView_itemTextAppearanceInactive, z2i0.NavigationBarView_itemTextAppearanceActive);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount(), isSubMenuSupported());
        this.menu = navigationBarMenu;
        NavigationBarMenuView createNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.menuView = createNavigationBarMenuView;
        createNavigationBarMenuView.setMinimumHeight(getSuggestedMinimumHeight());
        createNavigationBarMenuView.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        navigationBarPresenter.a = createNavigationBarMenuView;
        navigationBarPresenter.c = 1;
        createNavigationBarMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        int i3 = z2i0.NavigationBarView_itemIconTint;
        TypedArray typedArray = e.b;
        if (typedArray.hasValue(i3)) {
            createNavigationBarMenuView.setIconTintList(e.a(z2i0.NavigationBarView_itemIconTint));
        } else {
            createNavigationBarMenuView.setIconTintList(createNavigationBarMenuView.createDefaultColorStateList(R.attr.textColorSecondary));
        }
        setItemIconSize(typedArray.getDimensionPixelSize(z2i0.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(org0.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(z2i0.NavigationBarView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(z2i0.NavigationBarView_itemTextAppearanceInactive, 0));
        }
        if (typedArray.hasValue(z2i0.NavigationBarView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(typedArray.getResourceId(z2i0.NavigationBarView_itemTextAppearanceActive, 0));
        }
        if (typedArray.hasValue(z2i0.NavigationBarView_horizontalItemTextAppearanceInactive)) {
            setHorizontalItemTextAppearanceInactive(typedArray.getResourceId(z2i0.NavigationBarView_horizontalItemTextAppearanceInactive, 0));
        }
        if (typedArray.hasValue(z2i0.NavigationBarView_horizontalItemTextAppearanceActive)) {
            setHorizontalItemTextAppearanceActive(typedArray.getResourceId(z2i0.NavigationBarView_horizontalItemTextAppearanceActive, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(z2i0.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        if (typedArray.hasValue(z2i0.NavigationBarView_itemTextColor)) {
            setItemTextColor(e.a(z2i0.NavigationBarView_itemTextColor));
        }
        Drawable background = getBackground();
        ColorStateList y = q5z.y(background);
        if (background == null || y != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(b.j(context2, attributeSet, i, i2).a());
            if (y != null) {
                materialShapeDrawable.setFillColor(y);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            setBackground(materialShapeDrawable);
        }
        if (typedArray.hasValue(z2i0.NavigationBarView_itemPaddingTop)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(z2i0.NavigationBarView_itemPaddingTop, 0));
        }
        if (typedArray.hasValue(z2i0.NavigationBarView_itemPaddingBottom)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(z2i0.NavigationBarView_itemPaddingBottom, 0));
        }
        if (typedArray.hasValue(z2i0.NavigationBarView_activeIndicatorLabelPadding)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(z2i0.NavigationBarView_activeIndicatorLabelPadding, 0));
        }
        if (typedArray.hasValue(z2i0.NavigationBarView_iconLabelHorizontalSpacing)) {
            setIconLabelHorizontalSpacing(typedArray.getDimensionPixelSize(z2i0.NavigationBarView_iconLabelHorizontalSpacing, 0));
        }
        if (typedArray.hasValue(z2i0.NavigationBarView_elevation)) {
            setElevation(typedArray.getDimensionPixelSize(z2i0.NavigationBarView_elevation, 0));
        }
        getBackground().mutate().setTintList(jx81.n(context2, e, z2i0.NavigationBarView_backgroundTint));
        int i4 = -1;
        setLabelVisibilityMode(typedArray.getInteger(z2i0.NavigationBarView_labelVisibilityMode, -1));
        setItemIconGravity(typedArray.getInteger(z2i0.NavigationBarView_itemIconGravity, 0));
        setItemGravity(typedArray.getInteger(z2i0.NavigationBarView_itemGravity, 49));
        int resourceId = typedArray.getResourceId(z2i0.NavigationBarView_itemBackground, 0);
        if (resourceId != 0) {
            createNavigationBarMenuView.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(jx81.n(context2, e, z2i0.NavigationBarView_itemRippleColor));
        }
        setMeasureBottomPaddingFromLabelBaseline(typedArray.getBoolean(z2i0.NavigationBarView_measureBottomPaddingFromLabelBaseline, true));
        setLabelFontScalingEnabled(typedArray.getBoolean(z2i0.NavigationBarView_labelFontScalingEnabled, false));
        setLabelMaxLines(typedArray.getInteger(z2i0.NavigationBarView_labelMaxLines, 1));
        int resourceId2 = typedArray.getResourceId(z2i0.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, z2i0.NavigationBarActiveIndicator);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(z2i0.NavigationBarActiveIndicator_android_width, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(z2i0.NavigationBarActiveIndicator_android_height, 0));
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(z2i0.NavigationBarActiveIndicator_marginHorizontal, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = obtainStyledAttributes.getString(z2i0.NavigationBarActiveIndicator_expandedWidth);
            if (string != null) {
                if (!String.valueOf(-1).equals(string)) {
                    if (!String.valueOf(-2).equals(string)) {
                        i4 = obtainStyledAttributes.getDimensionPixelSize(z2i0.NavigationBarActiveIndicator_expandedWidth, -2);
                    }
                }
                setItemActiveIndicatorExpandedWidth(i4);
                setItemActiveIndicatorExpandedHeight(obtainStyledAttributes.getDimensionPixelSize(z2i0.NavigationBarActiveIndicator_expandedHeight, dimensionPixelSize));
                setItemActiveIndicatorExpandedMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(z2i0.NavigationBarActiveIndicator_expandedMarginHorizontal, dimensionPixelOffset));
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(org0.m3_navigation_item_leading_trailing_space);
                int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(z2i0.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingStart, dimensionPixelSize2);
                int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(z2i0.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingEnd, dimensionPixelSize2);
                setItemActiveIndicatorExpandedPadding(getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, obtainStyledAttributes.getDimensionPixelOffset(z2i0.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingTop, 0), getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, obtainStyledAttributes.getDimensionPixelOffset(z2i0.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingBottom, 0));
                setItemActiveIndicatorColor(jx81.o(context2, obtainStyledAttributes, z2i0.NavigationBarActiveIndicator_android_color));
                setItemActiveIndicatorShapeAppearance(b.g(context2, obtainStyledAttributes.getResourceId(z2i0.NavigationBarActiveIndicator_shapeAppearance, 0), 0).a());
                obtainStyledAttributes.recycle();
            }
            i4 = -2;
            setItemActiveIndicatorExpandedWidth(i4);
            setItemActiveIndicatorExpandedHeight(obtainStyledAttributes.getDimensionPixelSize(z2i0.NavigationBarActiveIndicator_expandedHeight, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(z2i0.NavigationBarActiveIndicator_expandedMarginHorizontal, dimensionPixelOffset));
            int dimensionPixelSize22 = getResources().getDimensionPixelSize(org0.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset22 = obtainStyledAttributes.getDimensionPixelOffset(z2i0.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingStart, dimensionPixelSize22);
            int dimensionPixelOffset32 = obtainStyledAttributes.getDimensionPixelOffset(z2i0.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingEnd, dimensionPixelSize22);
            setItemActiveIndicatorExpandedPadding(getLayoutDirection() != 1 ? dimensionPixelOffset32 : dimensionPixelOffset22, obtainStyledAttributes.getDimensionPixelOffset(z2i0.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingTop, 0), getLayoutDirection() != 1 ? dimensionPixelOffset32 : dimensionPixelOffset22, obtainStyledAttributes.getDimensionPixelOffset(z2i0.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingBottom, 0));
            setItemActiveIndicatorColor(jx81.o(context2, obtainStyledAttributes, z2i0.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(b.g(context2, obtainStyledAttributes.getResourceId(z2i0.NavigationBarActiveIndicator_shapeAppearance, 0), 0).a());
            obtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(z2i0.NavigationBarView_menu)) {
            inflateMenu(typedArray.getResourceId(z2i0.NavigationBarView_menu, 0));
        }
        e.g();
        if (!shouldAddMenuView()) {
            addView(createNavigationBarMenuView);
        }
        navigationBarMenu.setCallback(new xl10(this));
    }

    public static /* synthetic */ s650 access$000(NavigationBarView navigationBarView) {
        navigationBarView.getClass();
        return null;
    }

    public static /* synthetic */ t650 access$100(NavigationBarView navigationBarView) {
        navigationBarView.getClass();
        return null;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.menuView.setMeasurePaddingFromLabelBaseline(z);
    }

    public abstract NavigationBarMenuView createNavigationBarMenuView(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.menuView.getActiveIndicatorLabelPadding();
    }

    public BadgeDrawable getBadge(int i) {
        return this.menuView.getBadge(i);
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.menuView.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.menuView.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.menuView.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.menuView.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.menuView.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.menuView.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.menuView.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorMarginHorizontal();
    }

    public b getItemActiveIndicatorShapeAppearance() {
        return this.menuView.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.menuView.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.menuView.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.menuView.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.menuView.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.menuView.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.menuView.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelMaxLines(int i) {
        return this.menuView.getLabelMaxLines();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.menu;
    }

    public xn10 getMenuView() {
        return this.menuView;
    }

    public ViewGroup getMenuViewGroup() {
        return this.menuView;
    }

    public BadgeDrawable getOrCreateBadge(int i) {
        return this.menuView.getOrCreateBadge(i);
    }

    public NavigationBarPresenter getPresenter() {
        return this.presenter;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.menuView.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int i) {
        this.presenter.b = true;
        getMenuInflater().inflate(i, this.menu);
        NavigationBarPresenter navigationBarPresenter = this.presenter;
        navigationBarPresenter.b = false;
        navigationBarPresenter.updateMenuView(true);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.menuView.getItemActiveIndicatorEnabled();
    }

    public boolean isSubMenuSupported() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        eja1.C(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuPresenterState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeBadge(int i) {
        this.menuView.removeBadge(i);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.menuView.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        eja1.A(this, f);
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.menuView.setHorizontalItemTextAppearanceActive(i);
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.menuView.setHorizontalItemTextAppearanceInactive(i);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.menuView.setIconLabelHorizontalSpacing(i);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.menuView.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.menuView.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.menuView.setItemActiveIndicatorExpandedHeight(i);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.menuView.setItemActiveIndicatorExpandedMarginHorizontal(i);
    }

    public void setItemActiveIndicatorExpandedPadding(int i, int i2, int i3, int i4) {
        this.menuView.setItemActiveIndicatorExpandedPadding(i, i2, i3, i4);
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.menuView.setItemActiveIndicatorExpandedWidth(i);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.menuView.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.menuView.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(b bVar) {
        this.menuView.setItemActiveIndicatorShapeAppearance(bVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.menuView.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.menuView.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.menuView.setItemBackgroundRes(i);
    }

    public void setItemGravity(int i) {
        if (this.menuView.getItemGravity() != i) {
            this.menuView.setItemGravity(i);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconGravity(int i) {
        if (this.menuView.getItemIconGravity() != i) {
            this.menuView.setItemIconGravity(i);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconSize(int i) {
        this.menuView.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(i, onTouchListener);
    }

    public void setItemPaddingBottom(int i) {
        this.menuView.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.menuView.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.menuView.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.menuView.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.menuView.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.menuView.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.menuView.setLabelFontScalingEnabled(z);
    }

    public void setLabelMaxLines(int i) {
        this.menuView.setLabelMaxLines(i);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.menuView.getLabelVisibilityMode() != i) {
            this.menuView.setLabelVisibilityMode(i);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(s650 s650Var) {
    }

    public void setOnItemSelectedListener(t650 t650Var) {
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.menu.findItem(i);
        if (findItem != null) {
            boolean performItemAction = this.menu.performItemAction(findItem, this.presenter, 0);
            if (findItem.isCheckable()) {
                if (!performItemAction || findItem.isChecked()) {
                    this.menuView.setCheckedItem(findItem);
                }
            }
        }
    }

    public boolean shouldAddMenuView() {
        return false;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        Bundle menuPresenterState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        private void readFromParcel(Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuPresenterState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
