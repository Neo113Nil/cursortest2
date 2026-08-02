package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.d;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import defpackage.b64;
import defpackage.eng0;
import defpackage.iog0;
import defpackage.jjh0;
import defpackage.kp50;
import defpackage.l6e0;
import defpackage.mj2;
import defpackage.n6e0;
import defpackage.ny61;
import defpackage.q650;
import defpackage.qke;
import defpackage.th;
import defpackage.xn10;
import java.util.HashSet;

/* loaded from: classes11.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements xn10 {
    private static final int DEFAULT_COLLAPSED_MAX_COUNT = 7;
    private static final int NO_PADDING = -1;
    private static final int NO_SELECTED_ITEM = -1;
    private final SparseArray<BadgeDrawable> badgeDrawables;
    private q650[] buttons;
    private MenuItem checkedItem;
    private int collapsedMaxItemCount;
    private boolean dividersEnabled;
    private boolean expanded;
    private int horizontalItemTextAppearanceActive;
    private int horizontalItemTextAppearanceInactive;
    private int iconLabelHorizontalSpacing;
    private ColorStateList itemActiveIndicatorColor;
    private boolean itemActiveIndicatorEnabled;
    private int itemActiveIndicatorExpandedHeight;
    private int itemActiveIndicatorExpandedMarginHorizontal;
    private final Rect itemActiveIndicatorExpandedPadding;
    private int itemActiveIndicatorExpandedWidth;
    private int itemActiveIndicatorHeight;
    private int itemActiveIndicatorLabelPadding;
    private int itemActiveIndicatorMarginHorizontal;
    private boolean itemActiveIndicatorResizeable;
    private b itemActiveIndicatorShapeAppearance;
    private int itemActiveIndicatorWidth;
    private Drawable itemBackground;
    private int itemBackgroundRes;
    private int itemGravity;
    private int itemIconGravity;
    private int itemIconSize;
    private ColorStateList itemIconTint;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private l6e0 itemPool;
    private int itemPoolSize;
    private ColorStateList itemRippleColor;
    private int itemTextAppearanceActive;
    private boolean itemTextAppearanceActiveBoldEnabled;
    private int itemTextAppearanceInactive;
    private final ColorStateList itemTextColorDefault;
    private ColorStateList itemTextColorFromUser;
    private int labelMaxLines;
    private int labelVisibilityMode;
    private boolean measurePaddingFromLabelBaseline;
    private a menu;
    private final View.OnClickListener onClickListener;
    private final SparseArray<View.OnTouchListener> onTouchListeners;
    private NavigationBarPresenter presenter;
    private boolean scaleLabelWithFont;
    private int selectedItemId;
    private int selectedItemPosition;
    private final TransitionSet set;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};

    public NavigationBarMenuView(Context context) {
        super(context);
        this.onTouchListeners = new SparseArray<>();
        this.selectedItemId = -1;
        this.selectedItemPosition = -1;
        this.badgeDrawables = new SparseArray<>();
        this.itemPaddingTop = -1;
        this.itemPaddingBottom = -1;
        this.itemActiveIndicatorLabelPadding = -1;
        this.iconLabelHorizontalSpacing = -1;
        this.itemGravity = 49;
        this.itemActiveIndicatorResizeable = false;
        this.labelMaxLines = 1;
        this.itemPoolSize = 0;
        this.checkedItem = null;
        this.collapsedMaxItemCount = 7;
        this.dividersEnabled = false;
        this.itemActiveIndicatorExpandedPadding = new Rect();
        this.itemTextColorDefault = createDefaultColorStateList(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.set = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.set = autoTransition;
            autoTransition.d0(0);
            autoTransition.v();
            autoTransition.P(kp50.O(getContext(), eng0.motionDurationMedium4, getResources().getInteger(jjh0.material_motion_duration_long_1)));
            autoTransition.R(kp50.P(getContext(), eng0.motionEasingStandard, mj2.b));
            autoTransition.Z(new d());
        }
        this.onClickListener = new View.OnClickListener() { // from class: com.google.android.material.navigation.NavigationBarMenuView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MenuItemImpl itemData = ((NavigationBarItemView) view).getItemData();
                a aVar = NavigationBarMenuView.this.menu;
                boolean performItemAction = aVar.a.performItemAction(itemData, NavigationBarMenuView.this.presenter, 0);
                if (itemData == null || !itemData.isCheckable()) {
                    return;
                }
                if (!performItemAction || itemData.isChecked()) {
                    NavigationBarMenuView.this.setCheckedItem(itemData);
                }
            }
        };
        setImportantForAccessibility(1);
    }

    private Drawable createItemActiveIndicatorDrawable() {
        if (this.itemActiveIndicatorShapeAppearance == null || this.itemActiveIndicatorColor == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.itemActiveIndicatorShapeAppearance);
        materialShapeDrawable.setFillColor(this.itemActiveIndicatorColor);
        return materialShapeDrawable;
    }

    private NavigationBarItemView createMenuItem(int i, MenuItemImpl menuItemImpl, boolean z, boolean z2) {
        this.presenter.b = true;
        menuItemImpl.setCheckable(true);
        this.presenter.b = false;
        NavigationBarItemView newItem = getNewItem();
        newItem.setShifting(z);
        newItem.setLabelMaxLines(this.labelMaxLines);
        newItem.setIconTintList(this.itemIconTint);
        newItem.setIconSize(this.itemIconSize);
        newItem.setTextColor(this.itemTextColorDefault);
        newItem.setTextAppearanceInactive(this.itemTextAppearanceInactive);
        newItem.setTextAppearanceActive(this.itemTextAppearanceActive);
        newItem.setHorizontalTextAppearanceInactive(this.horizontalItemTextAppearanceInactive);
        newItem.setHorizontalTextAppearanceActive(this.horizontalItemTextAppearanceActive);
        newItem.setTextAppearanceActiveBoldEnabled(this.itemTextAppearanceActiveBoldEnabled);
        newItem.setTextColor(this.itemTextColorFromUser);
        int i2 = this.itemPaddingTop;
        if (i2 != -1) {
            newItem.setItemPaddingTop(i2);
        }
        int i3 = this.itemPaddingBottom;
        if (i3 != -1) {
            newItem.setItemPaddingBottom(i3);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.measurePaddingFromLabelBaseline);
        newItem.setLabelFontScalingEnabled(this.scaleLabelWithFont);
        int i4 = this.itemActiveIndicatorLabelPadding;
        if (i4 != -1) {
            newItem.setActiveIndicatorLabelPadding(i4);
        }
        int i5 = this.iconLabelHorizontalSpacing;
        if (i5 != -1) {
            newItem.setIconLabelHorizontalSpacing(i5);
        }
        newItem.setActiveIndicatorWidth(this.itemActiveIndicatorWidth);
        newItem.setActiveIndicatorHeight(this.itemActiveIndicatorHeight);
        newItem.setActiveIndicatorExpandedWidth(this.itemActiveIndicatorExpandedWidth);
        newItem.setActiveIndicatorExpandedHeight(this.itemActiveIndicatorExpandedHeight);
        newItem.setActiveIndicatorMarginHorizontal(this.itemActiveIndicatorMarginHorizontal);
        newItem.setItemGravity(this.itemGravity);
        newItem.setActiveIndicatorExpandedPadding(this.itemActiveIndicatorExpandedPadding);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.itemActiveIndicatorExpandedMarginHorizontal);
        newItem.setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
        newItem.setActiveIndicatorResizeable(this.itemActiveIndicatorResizeable);
        newItem.setActiveIndicatorEnabled(this.itemActiveIndicatorEnabled);
        Drawable drawable = this.itemBackground;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.itemBackgroundRes);
        }
        newItem.setItemRippleColor(this.itemRippleColor);
        newItem.setLabelVisibilityMode(this.labelVisibilityMode);
        newItem.setItemIconGravity(this.itemIconGravity);
        newItem.setOnlyShowWhenExpanded(z2);
        newItem.setExpanded(this.expanded);
        newItem.initialize(menuItemImpl, 0);
        newItem.setItemPosition(i);
        int itemId = menuItemImpl.getItemId();
        newItem.setOnTouchListener(this.onTouchListeners.get(itemId));
        newItem.setOnClickListener(this.onClickListener);
        int i6 = this.selectedItemId;
        if (i6 != 0 && itemId == i6) {
            this.selectedItemPosition = i;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.collapsedMaxItemCount, this.menu.e);
    }

    private NavigationBarItemView getNewItem() {
        l6e0 l6e0Var = this.itemPool;
        NavigationBarItemView navigationBarItemView = l6e0Var != null ? (NavigationBarItemView) l6e0Var.a() : null;
        return navigationBarItemView == null ? createNavigationBarItemView(getContext()) : navigationBarItemView;
    }

    private boolean isMenuStructureSame() {
        a aVar;
        if (this.buttons != null && (aVar = this.menu) != null && aVar.b.size() == this.buttons.length) {
            int i = 0;
            while (true) {
                if (i >= this.buttons.length) {
                    return true;
                }
                if ((this.menu.a(i) instanceof DividerMenuItem) && !(this.buttons[i] instanceof NavigationBarDividerView)) {
                    break;
                }
                boolean z = this.menu.a(i).hasSubMenu() && !(this.buttons[i] instanceof NavigationBarSubheaderView);
                boolean z2 = (this.menu.a(i).hasSubMenu() || (this.buttons[i] instanceof NavigationBarItemView)) ? false : true;
                if (!(this.menu.a(i) instanceof DividerMenuItem) && (z || z2)) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    private boolean isValidId(int i) {
        return i != -1;
    }

    private void releaseItemPool() {
        q650[] q650VarArr = this.buttons;
        if (q650VarArr == null || this.itemPool == null) {
            return;
        }
        for (q650 q650Var : q650VarArr) {
            if (q650Var instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) q650Var;
                this.itemPool.a0(navigationBarItemView);
                navigationBarItemView.clear();
            }
        }
    }

    private void removeUnusedBadges() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.menu.b.size(); i++) {
            hashSet.add(Integer.valueOf(this.menu.a(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.badgeDrawables.size(); i2++) {
            int keyAt = this.badgeDrawables.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.badgeDrawables.delete(keyAt);
            }
        }
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id = navigationBarItemView.getId();
        if (isValidId(id) && (badgeDrawable = this.badgeDrawables.get(id)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    private void validateMenuItemId(int i) {
        if (isValidId(i)) {
            return;
        }
        ny61.g(b64.e(i, " is not a valid view id"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildMenuView() {
        NavigationBarItemView navigationBarItemView;
        removeAllViews();
        releaseItemPool();
        this.presenter.b = true;
        this.menu.b();
        this.presenter.b = false;
        int i = this.menu.c;
        if (i == 0) {
            this.selectedItemId = 0;
            this.selectedItemPosition = 0;
            this.buttons = null;
            this.itemPool = null;
            return;
        }
        if (this.itemPool == null || this.itemPoolSize != i) {
            this.itemPoolSize = i;
            this.itemPool = new n6e0(i);
        }
        removeUnusedBadges();
        int size = this.menu.b.size();
        this.buttons = new q650[size];
        boolean isShifting = isShifting(this.labelVisibilityMode, getCurrentVisibleContentItemCount());
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem a = this.menu.a(i4);
            boolean z = a instanceof DividerMenuItem;
            if (z) {
                NavigationBarDividerView navigationBarDividerView = new NavigationBarDividerView(getContext());
                navigationBarDividerView.setOnlyShowWhenExpanded(true);
                navigationBarDividerView.setDividersEnabled(this.dividersEnabled);
                navigationBarItemView = navigationBarDividerView;
            } else if (a.hasSubMenu()) {
                if (i2 > 0) {
                    ny61.g("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                    return;
                }
                NavigationBarSubheaderView navigationBarSubheaderView = new NavigationBarSubheaderView(getContext());
                int i5 = this.horizontalItemTextAppearanceActive;
                if (i5 == 0) {
                    i5 = this.itemTextAppearanceActive;
                }
                navigationBarSubheaderView.setTextAppearance(i5);
                navigationBarSubheaderView.setTextColor(this.itemTextColorFromUser);
                navigationBarSubheaderView.setOnlyShowWhenExpanded(true);
                navigationBarSubheaderView.initialize((MenuItemImpl) a, 0);
                i2 = a.getSubMenu().size();
                navigationBarItemView = navigationBarSubheaderView;
            } else if (i2 > 0) {
                i2--;
                navigationBarItemView = createMenuItem(i4, (MenuItemImpl) a, isShifting, true);
            } else {
                MenuItemImpl menuItemImpl = (MenuItemImpl) a;
                boolean z2 = i3 >= this.collapsedMaxItemCount;
                i3++;
                navigationBarItemView = createMenuItem(i4, menuItemImpl, isShifting, z2);
            }
            if (!z && a.isCheckable() && this.selectedItemPosition == -1) {
                this.selectedItemPosition = i4;
            }
            this.buttons[i4] = navigationBarItemView;
            addView(navigationBarItemView);
        }
        int min = Math.min(size - 1, this.selectedItemPosition);
        this.selectedItemPosition = min;
        setCheckedItem(this.buttons[min].getItemData());
    }

    public ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList m = qke.m(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(iog0.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = m.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, ViewGroup.EMPTY_STATE_SET}, new int[]{m.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public abstract NavigationBarItemView createNavigationBarItemView(Context context);

    public NavigationBarItemView findItemView(int i) {
        validateMenuItemId(i);
        q650[] q650VarArr = this.buttons;
        if (q650VarArr == null) {
            return null;
        }
        for (q650 q650Var : q650VarArr) {
            if (q650Var instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) q650Var;
                if (navigationBarItemView.getId() == i) {
                    return navigationBarItemView;
                }
            }
        }
        return null;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.itemActiveIndicatorLabelPadding;
    }

    public BadgeDrawable getBadge(int i) {
        return this.badgeDrawables.get(i);
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.badgeDrawables;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.expanded ? this.menu.d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.horizontalItemTextAppearanceActive;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.horizontalItemTextAppearanceInactive;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.iconLabelHorizontalSpacing;
    }

    public ColorStateList getIconTintList() {
        return this.itemIconTint;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.itemActiveIndicatorColor;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.itemActiveIndicatorEnabled;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.itemActiveIndicatorExpandedHeight;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.itemActiveIndicatorExpandedMarginHorizontal;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.itemActiveIndicatorExpandedWidth;
    }

    public int getItemActiveIndicatorHeight() {
        return this.itemActiveIndicatorHeight;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.itemActiveIndicatorMarginHorizontal;
    }

    public b getItemActiveIndicatorShapeAppearance() {
        return this.itemActiveIndicatorShapeAppearance;
    }

    public int getItemActiveIndicatorWidth() {
        return this.itemActiveIndicatorWidth;
    }

    public Drawable getItemBackground() {
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null && q650VarArr.length > 0) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    return ((NavigationBarItemView) q650Var).getBackground();
                }
            }
        }
        return this.itemBackground;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.itemBackgroundRes;
    }

    public int getItemGravity() {
        return this.itemGravity;
    }

    public int getItemIconGravity() {
        return this.itemIconGravity;
    }

    public int getItemIconSize() {
        return this.itemIconSize;
    }

    public int getItemPaddingBottom() {
        return this.itemPaddingBottom;
    }

    public int getItemPaddingTop() {
        return this.itemPaddingTop;
    }

    public ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    public int getItemTextAppearanceActive() {
        return this.itemTextAppearanceActive;
    }

    public int getItemTextAppearanceInactive() {
        return this.itemTextAppearanceInactive;
    }

    public ColorStateList getItemTextColor() {
        return this.itemTextColorFromUser;
    }

    public int getLabelMaxLines() {
        return this.labelMaxLines;
    }

    public int getLabelVisibilityMode() {
        return this.labelVisibilityMode;
    }

    public a getMenu() {
        return this.menu;
    }

    public BadgeDrawable getOrCreateBadge(int i) {
        validateMenuItemId(i);
        BadgeDrawable badgeDrawable = this.badgeDrawables.get(i);
        if (badgeDrawable == null) {
            badgeDrawable = BadgeDrawable.create(getContext());
            this.badgeDrawables.put(i, badgeDrawable);
        }
        NavigationBarItemView findItemView = findItemView(i);
        if (findItemView != null) {
            findItemView.setBadge(badgeDrawable);
        }
        return badgeDrawable;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.scaleLabelWithFont;
    }

    public int getSelectedItemId() {
        return this.selectedItemId;
    }

    public int getSelectedItemPosition() {
        return this.selectedItemPosition;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.xn10
    public void initialize(MenuBuilder menuBuilder) {
        this.menu = new a(menuBuilder);
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean isItemActiveIndicatorResizeable() {
        return this.itemActiveIndicatorResizeable;
    }

    public boolean isShifting(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) th.a(1, getCurrentVisibleContentItemCount(), 1, false).a);
    }

    public void removeBadge(int i) {
        validateMenuItemId(i);
        NavigationBarItemView findItemView = findItemView(i);
        if (findItemView != null) {
            findItemView.removeBadge();
        }
        this.badgeDrawables.put(i, null);
    }

    public void restoreBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (this.badgeDrawables.indexOfKey(keyAt) < 0) {
                this.badgeDrawables.append(keyAt, sparseArray.get(keyAt));
            }
        }
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) q650Var;
                    BadgeDrawable badgeDrawable = this.badgeDrawables.get(navigationBarItemView.getId());
                    if (badgeDrawable != null) {
                        navigationBarItemView.setBadge(badgeDrawable);
                    }
                }
            }
        }
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.itemActiveIndicatorLabelPadding = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setActiveIndicatorLabelPadding(i);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.checkedItem == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.checkedItem;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.checkedItem.setChecked(false);
        }
        menuItem.setChecked(true);
        this.checkedItem = menuItem;
    }

    public void setCollapsedMaxItemCount(int i) {
        this.collapsedMaxItemCount = i;
    }

    public void setExpanded(boolean z) {
        this.expanded = z;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                q650Var.setExpanded(z);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.horizontalItemTextAppearanceActive = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setHorizontalTextAppearanceActive(i);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.horizontalItemTextAppearanceInactive = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setHorizontalTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.iconLabelHorizontalSpacing = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setIconLabelHorizontalSpacing(i);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.itemIconTint = colorStateList;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.itemActiveIndicatorColor = colorStateList;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.itemActiveIndicatorEnabled = z;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setActiveIndicatorEnabled(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.itemActiveIndicatorExpandedHeight = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setActiveIndicatorExpandedHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.itemActiveIndicatorExpandedMarginHorizontal = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setActiveIndicatorExpandedMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedPadding(int i, int i2, int i3, int i4) {
        Rect rect = this.itemActiveIndicatorExpandedPadding;
        rect.left = i;
        rect.top = i2;
        rect.right = i3;
        rect.bottom = i4;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setActiveIndicatorExpandedPadding(this.itemActiveIndicatorExpandedPadding);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.itemActiveIndicatorExpandedWidth = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setActiveIndicatorExpandedWidth(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.itemActiveIndicatorHeight = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setActiveIndicatorHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.itemActiveIndicatorMarginHorizontal = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setActiveIndicatorMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.itemActiveIndicatorResizeable = z;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setActiveIndicatorResizeable(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(b bVar) {
        this.itemActiveIndicatorShapeAppearance = bVar;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.itemActiveIndicatorWidth = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setActiveIndicatorWidth(i);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.itemBackground = drawable;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.itemBackgroundRes = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setItemBackground(i);
                }
            }
        }
    }

    public void setItemGravity(int i) {
        this.itemGravity = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setItemGravity(i);
                }
            }
        }
    }

    public void setItemIconGravity(int i) {
        this.itemIconGravity = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setItemIconGravity(i);
                }
            }
        }
    }

    public void setItemIconSize(int i) {
        this.itemIconSize = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setIconSize(i);
                }
            }
        }
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        SparseArray<View.OnTouchListener> sparseArray = this.onTouchListeners;
        if (onTouchListener == null) {
            sparseArray.remove(i);
        } else {
            sparseArray.put(i, onTouchListener);
        }
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if ((q650Var instanceof NavigationBarItemView) && q650Var.getItemData() != null && q650Var.getItemData().getItemId() == i) {
                    ((NavigationBarItemView) q650Var).setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.itemPaddingBottom = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setItemPaddingBottom(this.itemPaddingBottom);
                }
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.itemPaddingTop = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setItemPaddingTop(i);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.itemTextAppearanceActive = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setTextAppearanceActive(i);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.itemTextAppearanceActiveBoldEnabled = z;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setTextAppearanceActiveBoldEnabled(z);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.itemTextAppearanceInactive = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.itemTextColorFromUser = colorStateList;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.scaleLabelWithFont = z;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setLabelFontScalingEnabled(z);
                }
            }
        }
    }

    public void setLabelMaxLines(int i) {
        this.labelMaxLines = i;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setLabelMaxLines(i);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.labelVisibilityMode = i;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z) {
        this.measurePaddingFromLabelBaseline = z;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).setMeasureBottomPaddingFromLabelBaseline(z);
                }
            }
        }
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.presenter = navigationBarPresenter;
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.dividersEnabled == z) {
            return;
        }
        this.dividersEnabled = z;
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarDividerView) {
                    ((NavigationBarDividerView) q650Var).setDividersEnabled(z);
                }
            }
        }
    }

    public void tryRestoreSelectedItemId(int i) {
        int size = this.menu.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem a = this.menu.a(i2);
            if (i == a.getItemId()) {
                this.selectedItemId = i;
                this.selectedItemPosition = i2;
                setCheckedItem(a);
                return;
            }
        }
    }

    public void updateActiveIndicator(int i) {
        q650[] q650VarArr = this.buttons;
        if (q650VarArr != null) {
            for (q650 q650Var : q650VarArr) {
                if (q650Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) q650Var).updateActiveIndicatorLayoutParams(i);
                }
            }
        }
    }

    public void updateMenuView() {
        TransitionSet transitionSet;
        a aVar = this.menu;
        if (aVar == null || this.buttons == null) {
            return;
        }
        this.presenter.b = true;
        aVar.b();
        this.presenter.b = false;
        if (!isMenuStructureSame()) {
            buildMenuView();
            return;
        }
        int i = this.selectedItemId;
        int size = this.menu.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem a = this.menu.a(i2);
            if (a.isChecked()) {
                setCheckedItem(a);
                this.selectedItemId = a.getItemId();
                this.selectedItemPosition = i2;
            }
        }
        if (i != this.selectedItemId && (transitionSet = this.set) != null) {
            TransitionManager.a(transitionSet, this);
        }
        boolean isShifting = isShifting(this.labelVisibilityMode, getCurrentVisibleContentItemCount());
        for (int i3 = 0; i3 < size; i3++) {
            this.presenter.b = true;
            this.buttons[i3].setExpanded(this.expanded);
            q650 q650Var = this.buttons[i3];
            if (q650Var instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) q650Var;
                navigationBarItemView.setLabelVisibilityMode(this.labelVisibilityMode);
                navigationBarItemView.setItemIconGravity(this.itemIconGravity);
                navigationBarItemView.setItemGravity(this.itemGravity);
                navigationBarItemView.setShifting(isShifting);
            }
            if (this.menu.a(i3) instanceof MenuItemImpl) {
                this.buttons[i3].initialize((MenuItemImpl) this.menu.a(i3), 0);
            }
            this.presenter.b = false;
        }
    }
}
