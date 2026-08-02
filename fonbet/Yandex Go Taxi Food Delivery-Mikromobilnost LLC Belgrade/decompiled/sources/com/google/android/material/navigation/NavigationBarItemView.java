package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuItemImpl;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.BaselineLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import defpackage.cxg0;
import defpackage.eng0;
import defpackage.fuz0;
import defpackage.hl7;
import defpackage.jjh0;
import defpackage.jx81;
import defpackage.kp50;
import defpackage.kxh0;
import defpackage.leh0;
import defpackage.mj2;
import defpackage.n4i0;
import defpackage.o650;
import defpackage.org0;
import defpackage.p650;
import defpackage.ph;
import defpackage.q650;
import defpackage.tt91;
import defpackage.uh;
import defpackage.yln;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class NavigationBarItemView extends FrameLayout implements q650 {
    private static final int INVALID_ITEM_POSITION = -1;
    private ValueAnimator activeIndicatorAnimator;
    private int activeIndicatorDesiredHeight;
    private int activeIndicatorDesiredWidth;
    private boolean activeIndicatorEnabled;
    private int activeIndicatorExpandedDesiredHeight;
    private int activeIndicatorExpandedDesiredWidth;
    private int activeIndicatorExpandedMarginHorizontal;
    private int activeIndicatorLabelPadding;
    private int activeIndicatorMarginHorizontal;
    private float activeIndicatorProgress;
    private boolean activeIndicatorResizeable;
    private o650 activeIndicatorTransform;
    private final View activeIndicatorView;
    private BadgeDrawable badgeDrawable;
    private int badgeFixedEdge;
    private boolean boldText;
    private final LinearLayout contentContainer;
    private BaselineLayout currentLabelGroup;
    private boolean expanded;
    private BaselineLayout expandedLabelGroup;
    private float expandedLabelScaleDownFactor;
    private float expandedLabelScaleUpFactor;
    private float expandedLabelShiftAmountY;
    private TextView expandedLargeLabel;
    private TextView expandedSmallLabel;
    private int horizontalTextAppearanceActive;
    private int horizontalTextAppearanceInactive;
    private final ImageView icon;
    private final FrameLayout iconContainer;
    private int iconLabelHorizontalSpacing;
    private ColorStateList iconTint;
    private boolean initialized;
    private final LinearLayout innerContentContainer;
    private boolean isShifting;
    private Rect itemActiveIndicatorExpandedPadding;
    Drawable itemBackground;
    private MenuItemImpl itemData;
    private int itemGravity;
    private int itemIconGravity;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private int itemPosition;
    private ColorStateList itemRippleColor;
    private final BaselineLayout labelGroup;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    private boolean measurePaddingFromBaseline;
    private boolean onlyShowWhenExpanded;
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private boolean scaleLabelSizeWithFont;
    private float scaleUpFactor;
    private float shiftAmountY;
    private final TextView smallLabel;
    private int textAppearanceActive;
    private int textAppearanceInactive;
    private ColorStateList textColor;
    private Drawable wrappedIconDrawable;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final o650 ACTIVE_INDICATOR_LABELED_TRANSFORM = new o650();
    private static final o650 ACTIVE_INDICATOR_UNLABELED_TRANSFORM = new p650();

    public NavigationBarItemView(Context context) {
        super(context);
        this.initialized = false;
        this.itemPosition = -1;
        this.textAppearanceActive = 0;
        this.textAppearanceInactive = 0;
        this.horizontalTextAppearanceActive = 0;
        this.horizontalTextAppearanceInactive = 0;
        this.boldText = false;
        this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        this.activeIndicatorProgress = 0.0f;
        this.activeIndicatorEnabled = false;
        this.activeIndicatorDesiredWidth = 0;
        this.activeIndicatorDesiredHeight = 0;
        this.activeIndicatorExpandedDesiredWidth = -2;
        this.activeIndicatorExpandedDesiredHeight = 0;
        this.activeIndicatorResizeable = false;
        this.activeIndicatorMarginHorizontal = 0;
        this.activeIndicatorExpandedMarginHorizontal = 0;
        this.badgeFixedEdge = 0;
        this.itemGravity = 49;
        this.expanded = false;
        this.onlyShowWhenExpanded = false;
        this.measurePaddingFromBaseline = false;
        this.scaleLabelSizeWithFont = false;
        this.itemActiveIndicatorExpandedPadding = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.contentContainer = (LinearLayout) findViewById(leh0.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(leh0.navigation_bar_item_inner_content_container);
        this.innerContentContainer = linearLayout;
        this.activeIndicatorView = findViewById(leh0.navigation_bar_item_active_indicator_view);
        this.iconContainer = (FrameLayout) findViewById(leh0.navigation_bar_item_icon_container);
        this.icon = (ImageView) findViewById(leh0.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(leh0.navigation_bar_item_labels_group);
        this.labelGroup = baselineLayout;
        TextView textView = (TextView) findViewById(leh0.navigation_bar_item_small_label_view);
        this.smallLabel = textView;
        TextView textView2 = (TextView) findViewById(leh0.navigation_bar_item_large_label_view);
        this.largeLabel = textView2;
        initializeDefaultExpandedLabelGroupViews();
        this.currentLabelGroup = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.itemPaddingTop = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.itemPaddingBottom = baselineLayout.getPaddingBottom();
        this.activeIndicatorLabelPadding = 0;
        this.iconLabelHorizontalSpacing = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.expandedSmallLabel.setImportantForAccessibility(2);
        this.expandedLargeLabel.setImportantForAccessibility(2);
        setFocusable(true);
        calculateTextScaleFactors();
        this.activeIndicatorExpandedDesiredHeight = getResources().getDimensionPixelSize(org0.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new yln(6, this));
    }

    private void addDefaultExpandedLabelGroupViews() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.innerContentContainer.addView(this.expandedLabelGroup, layoutParams);
        setExpandedLabelGroupMargins();
    }

    private void calculateTextScaleFactors() {
        float textSize = this.smallLabel.getTextSize();
        float textSize2 = this.largeLabel.getTextSize();
        this.shiftAmountY = textSize - textSize2;
        this.scaleUpFactor = (textSize2 * 1.0f) / textSize;
        this.scaleDownFactor = (textSize * 1.0f) / textSize2;
        float textSize3 = this.expandedSmallLabel.getTextSize();
        float textSize4 = this.expandedLargeLabel.getTextSize();
        this.expandedLabelShiftAmountY = textSize3 - textSize4;
        this.expandedLabelScaleUpFactor = (textSize4 * 1.0f) / textSize3;
        this.expandedLabelScaleDownFactor = (textSize3 * 1.0f) / textSize4;
    }

    private Drawable createItemBackgroundCompat(ColorStateList colorStateList) {
        return FocusRingDrawable.wrap(getContext(), new RippleDrawable(tt91.c(colorStateList), null, null));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.badgeDrawable.getHorizontalOffset();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.iconContainer.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.icon.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    private boolean hasBadge() {
        return this.badgeDrawable != null;
    }

    private void initializeDefaultExpandedLabelGroupViews() {
        float dimension = getResources().getDimension(org0.default_navigation_text_size);
        float dimension2 = getResources().getDimension(org0.default_navigation_active_text_size);
        BaselineLayout baselineLayout = new BaselineLayout(getContext());
        this.expandedLabelGroup = baselineLayout;
        baselineLayout.setVisibility(8);
        this.expandedLabelGroup.setDuplicateParentStateEnabled(true);
        this.expandedLabelGroup.setMeasurePaddingFromBaseline(this.measurePaddingFromBaseline);
        TextView textView = new TextView(getContext());
        this.expandedSmallLabel = textView;
        textView.setMaxLines(1);
        TextView textView2 = this.expandedSmallLabel;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.expandedSmallLabel.setDuplicateParentStateEnabled(true);
        this.expandedSmallLabel.setIncludeFontPadding(false);
        this.expandedSmallLabel.setGravity(16);
        this.expandedSmallLabel.setTextSize(dimension);
        TextView textView3 = new TextView(getContext());
        this.expandedLargeLabel = textView3;
        textView3.setMaxLines(1);
        this.expandedLargeLabel.setEllipsize(truncateAt);
        this.expandedLargeLabel.setDuplicateParentStateEnabled(true);
        this.expandedLargeLabel.setVisibility(4);
        this.expandedLargeLabel.setIncludeFontPadding(false);
        this.expandedLargeLabel.setGravity(16);
        this.expandedLargeLabel.setTextSize(dimension2);
        this.expandedLabelGroup.addView(this.expandedSmallLabel);
        this.expandedLabelGroup.addView(this.expandedLargeLabel);
    }

    private boolean isActiveIndicatorResizeableAndUnlabeled() {
        return this.activeIndicatorResizeable && this.labelVisibilityMode == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        if (this.icon.getVisibility() == 0) {
            tryUpdateBadgeBounds(this.icon);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.innerContentContainer.getLayoutParams();
        int i9 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
        int i10 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
        boolean z2 = true;
        if (this.itemIconGravity == 1 && this.activeIndicatorExpandedDesiredWidth == -2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.activeIndicatorView.getLayoutParams();
            if (this.activeIndicatorExpandedDesiredWidth != -2 || this.activeIndicatorView.getMeasuredWidth() == i9) {
                z = false;
            } else {
                layoutParams2.width = Math.max(i9, Math.min(this.activeIndicatorDesiredWidth, getMeasuredWidth() - (this.activeIndicatorMarginHorizontal * 2)));
                z = true;
            }
            if (this.activeIndicatorView.getMeasuredHeight() < i10) {
                layoutParams2.height = i10;
            } else {
                z2 = z;
            }
            if (z2) {
                this.activeIndicatorView.setLayoutParams(layoutParams2);
            }
        }
    }

    private void maybeAnimateActiveIndicatorToProgress(final float f) {
        if (!this.activeIndicatorEnabled || !this.initialized || !isAttachedToWindow()) {
            setActiveIndicatorProgress(f, f);
            return;
        }
        ValueAnimator valueAnimator = this.activeIndicatorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.activeIndicatorAnimator = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.activeIndicatorProgress, f);
        this.activeIndicatorAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NavigationBarItemView.this.setActiveIndicatorProgress(((Float) valueAnimator2.getAnimatedValue()).floatValue(), f);
            }
        });
        this.activeIndicatorAnimator.setInterpolator(kp50.P(getContext(), eng0.motionEasingEmphasizedInterpolator, mj2.b));
        this.activeIndicatorAnimator.setDuration(kp50.O(getContext(), eng0.motionDurationLong2, getResources().getInteger(jjh0.material_motion_duration_long_1)));
        this.activeIndicatorAnimator.start();
    }

    private void refreshChecked() {
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    private void refreshItemBackground() {
        Drawable drawable = this.itemBackground;
        boolean z = true;
        if (this.itemRippleColor != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.activeIndicatorEnabled && activeIndicatorDrawable != null) {
                ?? rippleDrawable = new RippleDrawable(tt91.e(this.itemRippleColor), null, activeIndicatorDrawable);
                FocusRingDrawable.layer(getContext(), rippleDrawable, activeIndicatorDrawable instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) activeIndicatorDrawable : null);
                r3 = rippleDrawable;
                z = false;
            } else if (drawable == null) {
                drawable = createItemBackgroundCompat(this.itemRippleColor);
            }
        }
        this.iconContainer.setPadding(0, 0, 0, 0);
        this.iconContainer.setForeground(r3);
        setBackground(drawable);
        setDefaultFocusHighlightEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveIndicatorProgress(float f, float f2) {
        o650 o650Var = this.activeIndicatorTransform;
        View view = this.activeIndicatorView;
        o650Var.getClass();
        view.setScaleX(mj2.a(0.4f, 1.0f, f));
        view.setScaleY(o650Var.a(f));
        view.setAlpha(mj2.b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        this.activeIndicatorProgress = f;
    }

    private void setExpandedLabelGroupMargins() {
        int i = this.icon.getLayoutParams().width > 0 ? this.iconLabelHorizontalSpacing : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.expandedLabelGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    private void setLayoutConfigurationIconAndLabel(View view, View view2, float f, float f2) {
        setViewMarginAndGravity(this.contentContainer, this.itemIconGravity == 0 ? (int) (this.itemPaddingTop + f2) : 0, 0, this.itemGravity);
        LinearLayout linearLayout = this.innerContentContainer;
        int i = this.itemIconGravity;
        setViewMarginAndGravity(linearLayout, i == 0 ? 0 : this.itemActiveIndicatorExpandedPadding.top, i == 0 ? 0 : this.itemActiveIndicatorExpandedPadding.bottom, i == 0 ? 17 : NavigationBarView.ITEM_GRAVITY_START_CENTER);
        updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
        this.currentLabelGroup.setVisibility(0);
        setViewScaleValues(view, 1.0f, 1.0f, 0);
        setViewScaleValues(view2, f, f, 4);
    }

    private void setLayoutConfigurationIconOnly() {
        LinearLayout linearLayout = this.contentContainer;
        int i = this.itemPaddingTop;
        setViewMarginAndGravity(linearLayout, i, i, this.itemIconGravity == 0 ? 17 : this.itemGravity);
        setViewMarginAndGravity(this.innerContentContainer, 0, 0, 17);
        updateViewPaddingBottom(this.labelGroup, 0);
        this.currentLabelGroup.setVisibility(8);
    }

    private void setTextAppearanceForLabel(TextView textView, int i) {
        if (this.scaleLabelSizeWithFont) {
            textView.setTextAppearance(i);
        } else {
            setTextAppearanceWithoutFontScaling(textView, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void setTextAppearanceWithoutFontScaling(TextView textView, int i) {
        int i2;
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, n4i0.TextAppearance);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(n4i0.TextAppearance_android_textSize, typedValue);
            obtainStyledAttributes.recycle();
            if (value) {
                int complexUnit = typedValue.getComplexUnit();
                int i3 = typedValue.data;
                i2 = complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i3) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i3, context.getResources().getDisplayMetrics());
                if (i2 == 0) {
                    textView.setTextSize(0, i2);
                    return;
                }
                return;
            }
        }
        i2 = 0;
        if (i2 == 0) {
        }
    }

    private static void setViewMarginAndGravity(View view, int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private static void setViewScaleValues(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private void tryAttachBadgeToAnchor(View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            badgeDrawable.setBounds(rect);
            badgeDrawable.updateBadgeCoordinates(view, (FrameLayout) null);
            if (badgeDrawable.getCustomBadgeParent() != null) {
                badgeDrawable.getCustomBadgeParent().setForeground(badgeDrawable);
            } else {
                view.getOverlay().add(badgeDrawable);
            }
        }
    }

    private void tryRemoveBadgeFromAnchor(View view) {
        if (hasBadge()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeDrawable badgeDrawable = this.badgeDrawable;
                if (badgeDrawable != null) {
                    if (badgeDrawable.getCustomBadgeParent() != null) {
                        badgeDrawable.getCustomBadgeParent().setForeground(null);
                    } else {
                        view.getOverlay().remove(badgeDrawable);
                    }
                }
            }
            this.badgeDrawable = null;
        }
    }

    private void tryUpdateBadgeBounds(View view) {
        if (hasBadge()) {
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            badgeDrawable.setBounds(rect);
            badgeDrawable.updateBadgeCoordinates(view, (FrameLayout) null);
        }
    }

    private void updateActiveIndicatorTransform() {
        if (isActiveIndicatorResizeableAndUnlabeled()) {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
        } else {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        }
    }

    private void updateActiveLabelBoldness() {
        TextView textView = this.largeLabel;
        textView.setTypeface(textView.getTypeface(), this.boldText ? 1 : 0);
        TextView textView2 = this.expandedLargeLabel;
        textView2.setTypeface(textView2.getTypeface(), this.boldText ? 1 : 0);
    }

    private void updateActiveLabelTextAppearance(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        setTextAppearanceForLabel(textView, i);
        calculateTextScaleFactors();
        textView.setMinimumHeight(jx81.y(i, textView.getContext()));
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        updateActiveLabelBoldness();
    }

    private void updateInactiveLabelTextAppearance(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        setTextAppearanceForLabel(textView, i);
        calculateTextScaleFactors();
        textView.setMinimumHeight(jx81.y(i, textView.getContext()));
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private void updateItemIconGravity() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.badgeFixedEdge = 0;
        this.currentLabelGroup = this.labelGroup;
        int i7 = 8;
        if (this.itemIconGravity == 1) {
            if (this.expandedLabelGroup.getParent() == null) {
                addDefaultExpandedLabelGroupViews();
            }
            Rect rect = this.itemActiveIndicatorExpandedPadding;
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = rect.top;
            i = rect.bottom;
            this.badgeFixedEdge = 1;
            int i11 = this.activeIndicatorExpandedMarginHorizontal;
            this.currentLabelGroup = this.expandedLabelGroup;
            i5 = i10;
            i4 = i9;
            i3 = i8;
            i2 = i11;
            i6 = 0;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 8;
            i7 = 0;
        }
        this.labelGroup.setVisibility(i7);
        this.expandedLabelGroup.setVisibility(i6);
        ((FrameLayout.LayoutParams) this.contentContainer.getLayoutParams()).gravity = this.itemGravity;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.innerContentContainer.getLayoutParams();
        layoutParams.leftMargin = i3;
        layoutParams.rightMargin = i4;
        layoutParams.topMargin = i5;
        layoutParams.bottomMargin = i;
        setPadding(i2, 0, i2, 0);
        updateActiveIndicatorLayoutParams(getWidth());
    }

    private static void updateViewPaddingBottom(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private void updateVisibility() {
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null) {
            setVisibility((!menuItemImpl.isVisible() || (!this.expanded && this.onlyShowWhenExpanded)) ? 8 : 0);
        }
    }

    public void clear() {
        removeBadge();
        this.itemData = null;
        this.activeIndicatorProgress = 0.0f;
        this.initialized = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.activeIndicatorEnabled) {
            this.iconContainer.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.activeIndicatorView.getBackground();
    }

    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.expandedLabelGroup;
    }

    public int getItemBackgroundResId() {
        return cxg0.mtrl_navigation_bar_item_background;
    }

    @Override // defpackage.wn10
    public MenuItemImpl getItemData() {
        return this.itemData;
    }

    public int getItemDefaultMarginResId() {
        return org0.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.itemPosition;
    }

    public BaselineLayout getLabelGroup() {
        return this.labelGroup;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.contentContainer.getLayoutParams();
        return this.contentContainer.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.itemIconGravity == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.innerContentContainer.getLayoutParams();
            return this.innerContentContainer.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.labelGroup.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    @Override // defpackage.wn10
    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.itemData = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        fuz0.a(this, !TextUtils.isEmpty(menuItemImpl.getTooltipText()) ? menuItemImpl.getTooltipText() : menuItemImpl.getTitle());
        updateVisibility();
        this.initialized = true;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean isOnlyVisibleWhenExpanded() {
        return this.onlyShowWhenExpanded;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.itemData.getTitle();
            if (!TextUtils.isEmpty(this.itemData.getContentDescription())) {
                title = this.itemData.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + Extension.FIX_SPACE + ((Object) this.badgeDrawable.getContentDescription()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) uh.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) ph.g.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(kxh0.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new hl7(this, i, 3));
    }

    @Override // defpackage.wn10
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.activeIndicatorView.setBackground(drawable);
        refreshItemBackground();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.activeIndicatorEnabled = z;
        refreshItemBackground();
        this.activeIndicatorView.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i) {
        this.activeIndicatorExpandedDesiredHeight = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i) {
        this.activeIndicatorExpandedMarginHorizontal = i;
        if (this.itemIconGravity == 1) {
            setPadding(i, 0, i, 0);
        }
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.itemActiveIndicatorExpandedPadding = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i) {
        this.activeIndicatorExpandedDesiredWidth = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorHeight(int i) {
        this.activeIndicatorDesiredHeight = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.activeIndicatorLabelPadding != i) {
            this.activeIndicatorLabelPadding = i;
            ((LinearLayout.LayoutParams) this.labelGroup.getLayoutParams()).topMargin = i;
            if (this.expandedLabelGroup.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.expandedLabelGroup.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.activeIndicatorMarginHorizontal = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.activeIndicatorResizeable = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.activeIndicatorDesiredWidth = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        ImageView imageView;
        if (this.badgeDrawable == badgeDrawable) {
            return;
        }
        if (hasBadge() && (imageView = this.icon) != null) {
            tryRemoveBadgeFromAnchor(imageView);
        }
        this.badgeDrawable = badgeDrawable;
        badgeDrawable.setBadgeFixedEdge(this.badgeFixedEdge);
        ImageView imageView2 = this.icon;
        if (imageView2 != null) {
            tryAttachBadgeToAnchor(imageView2);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        setLabelPivots(this.largeLabel);
        setLabelPivots(this.smallLabel);
        setLabelPivots(this.expandedLargeLabel);
        setLabelPivots(this.expandedSmallLabel);
        maybeAnimateActiveIndicatorToProgress(z ? 1.0f : 0.0f);
        TextView textView = this.largeLabel;
        TextView textView2 = this.smallLabel;
        float f = this.shiftAmountY;
        float f2 = this.scaleUpFactor;
        float f3 = this.scaleDownFactor;
        if (this.itemIconGravity == 1) {
            textView = this.expandedLargeLabel;
            textView2 = this.expandedSmallLabel;
            f = this.expandedLabelShiftAmountY;
            f2 = this.expandedLabelScaleUpFactor;
            f3 = this.expandedLabelScaleDownFactor;
        }
        int i = this.labelVisibilityMode;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        setLayoutConfigurationIconOnly();
                    }
                } else if (z) {
                    setLayoutConfigurationIconAndLabel(textView, textView2, f2, f);
                } else {
                    setLayoutConfigurationIconAndLabel(textView2, textView, f3, 0.0f);
                }
            } else if (z) {
                setLayoutConfigurationIconAndLabel(textView, textView2, f2, 0.0f);
            } else {
                setLayoutConfigurationIconOnly();
            }
        } else if (this.isShifting) {
            if (z) {
                setLayoutConfigurationIconAndLabel(textView, textView2, f2, 0.0f);
            } else {
                setLayoutConfigurationIconOnly();
            }
        } else if (z) {
            setLayoutConfigurationIconAndLabel(textView, textView2, f2, f);
        } else {
            setLayoutConfigurationIconAndLabel(textView2, textView, f3, 0.0f);
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.smallLabel.setEnabled(z);
        this.largeLabel.setEnabled(z);
        this.expandedSmallLabel.setEnabled(z);
        this.expandedLargeLabel.setEnabled(z);
        this.icon.setEnabled(z);
    }

    @Override // defpackage.q650
    public void setExpanded(boolean z) {
        this.expanded = z;
        updateVisibility();
    }

    public void setHorizontalTextAppearanceActive(int i) {
        this.horizontalTextAppearanceActive = i;
        TextView textView = this.expandedLargeLabel;
        if (i == 0) {
            i = this.textAppearanceActive;
        }
        updateActiveLabelTextAppearance(textView, i);
    }

    public void setHorizontalTextAppearanceInactive(int i) {
        this.horizontalTextAppearanceInactive = i;
        TextView textView = this.expandedSmallLabel;
        if (i == 0) {
            i = this.textAppearanceInactive;
        }
        updateInactiveLabelTextAppearance(textView, i);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.originalIconDrawable) {
            return;
        }
        this.originalIconDrawable = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.wrappedIconDrawable = drawable;
            ColorStateList colorStateList = this.iconTint;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.icon.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        if (this.iconLabelHorizontalSpacing != i) {
            this.iconLabelHorizontalSpacing = i;
            setExpandedLabelGroupMargins();
            requestLayout();
        }
    }

    public void setIconSize(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.icon.setLayoutParams(layoutParams);
        setExpandedLabelGroupMargins();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData == null || (drawable = this.wrappedIconDrawable) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.wrappedIconDrawable.invalidateSelf();
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.itemBackground = drawable;
        refreshItemBackground();
    }

    public void setItemGravity(int i) {
        this.itemGravity = i;
        requestLayout();
    }

    public void setItemIconGravity(int i) {
        if (this.itemIconGravity != i) {
            this.itemIconGravity = i;
            updateItemIconGravity();
            refreshItemBackground();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.itemPaddingBottom != i) {
            this.itemPaddingBottom = i;
            refreshChecked();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.itemPaddingTop != i) {
            this.itemPaddingTop = i;
            refreshChecked();
        }
    }

    public void setItemPosition(int i) {
        this.itemPosition = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        refreshItemBackground();
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.scaleLabelSizeWithFont = z;
        setTextAppearanceActive(this.textAppearanceActive);
        setTextAppearanceInactive(this.textAppearanceInactive);
        setHorizontalTextAppearanceActive(this.horizontalTextAppearanceActive);
        setHorizontalTextAppearanceInactive(this.horizontalTextAppearanceInactive);
    }

    public void setLabelMaxLines(int i) {
        this.smallLabel.setMaxLines(i);
        this.largeLabel.setMaxLines(i);
        this.expandedSmallLabel.setMaxLines(i);
        this.expandedLargeLabel.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            this.smallLabel.setGravity(17);
            this.largeLabel.setGravity(17);
        } else {
            TextView textView = this.smallLabel;
            if (i > 1) {
                textView.setEllipsize(null);
                this.largeLabel.setEllipsize(null);
                this.smallLabel.setGravity(17);
                this.largeLabel.setGravity(17);
            } else {
                textView.setGravity(16);
                this.largeLabel.setGravity(16);
            }
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.labelVisibilityMode != i) {
            this.labelVisibilityMode = i;
            updateActiveIndicatorTransform();
            updateActiveIndicatorLayoutParams(getWidth());
            refreshChecked();
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.measurePaddingFromBaseline = z;
        this.labelGroup.setMeasurePaddingFromBaseline(z);
        this.smallLabel.setIncludeFontPadding(z);
        this.largeLabel.setIncludeFontPadding(z);
        this.expandedLabelGroup.setMeasurePaddingFromBaseline(z);
        this.expandedSmallLabel.setIncludeFontPadding(z);
        this.expandedLargeLabel.setIncludeFontPadding(z);
        requestLayout();
    }

    @Override // defpackage.q650
    public void setOnlyShowWhenExpanded(boolean z) {
        this.onlyShowWhenExpanded = z;
        updateVisibility();
    }

    public void setShifting(boolean z) {
        if (this.isShifting != z) {
            this.isShifting = z;
            refreshChecked();
        }
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(int i) {
        this.textAppearanceActive = i;
        updateActiveLabelTextAppearance(this.largeLabel, i);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        this.boldText = z;
        setTextAppearanceActive(this.textAppearanceActive);
        setHorizontalTextAppearanceActive(this.horizontalTextAppearanceActive);
        updateActiveLabelBoldness();
    }

    public void setTextAppearanceInactive(int i) {
        this.textAppearanceInactive = i;
        updateInactiveLabelTextAppearance(this.smallLabel, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
            this.expandedSmallLabel.setTextColor(colorStateList);
            this.expandedLargeLabel.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        this.expandedSmallLabel.setText(charSequence);
        this.expandedLargeLabel.setText(charSequence);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.itemData;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.itemData.getTooltipText();
        }
        fuz0.a(this, charSequence);
    }

    public boolean showsIcon() {
        return true;
    }

    public void updateActiveIndicatorLayoutParams(int i) {
        if (i > 0 || getVisibility() != 0) {
            int min = Math.min(this.activeIndicatorDesiredWidth, i - (this.activeIndicatorMarginHorizontal * 2));
            int i2 = this.activeIndicatorDesiredHeight;
            if (this.itemIconGravity == 1) {
                int i3 = i - (this.activeIndicatorExpandedMarginHorizontal * 2);
                int i4 = this.activeIndicatorExpandedDesiredWidth;
                if (i4 != -1) {
                    i3 = i4 == -2 ? this.contentContainer.getMeasuredWidth() : Math.min(i4, i3);
                }
                min = i3;
                i2 = Math.max(this.activeIndicatorExpandedDesiredHeight, this.innerContentContainer.getMeasuredHeight());
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.activeIndicatorView.getLayoutParams();
            if (isActiveIndicatorResizeableAndUnlabeled()) {
                i2 = min;
            }
            layoutParams.height = i2;
            layoutParams.width = Math.max(0, min);
            this.activeIndicatorView.setLayoutParams(layoutParams);
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }
}
