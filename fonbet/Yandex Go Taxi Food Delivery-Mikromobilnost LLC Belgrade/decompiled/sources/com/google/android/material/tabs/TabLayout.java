package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import defpackage.b64;
import defpackage.e890;
import defpackage.eja1;
import defpackage.eng0;
import defpackage.fuz0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.jvh0;
import defpackage.jx81;
import defpackage.kp50;
import defpackage.kxh0;
import defpackage.l6e0;
import defpackage.m6e0;
import defpackage.mj2;
import defpackage.n4i0;
import defpackage.n6e0;
import defpackage.nqn;
import defpackage.ny61;
import defpackage.org0;
import defpackage.ph;
import defpackage.pp31;
import defpackage.q5z;
import defpackage.qke;
import defpackage.th;
import defpackage.tt91;
import defpackage.uh;
import defpackage.vng;
import defpackage.yvy0;
import defpackage.z2i0;
import defpackage.z610;
import defpackage.zs31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

@zs31
/* loaded from: classes11.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    private static final String LOG_TAG = "TabLayout";
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int SELECTED_INDICATOR_HEIGHT_DEFAULT = -1;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private b adapterChangeListener;
    private int contentInsetStart;
    private c currentVpSelectedListener;
    private final int defaultTabTextAppearance;
    int indicatorPosition;
    boolean inlineLabel;
    int mode;
    private e pageChangeListener;
    private e890 pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private c selectedListener;
    private final ArrayList<c> selectedListeners;
    private a selectedTab;
    private int selectedTabTextAppearance;
    float selectedTabTextSize;
    private boolean setupViewPagerImplicitly;
    final SlidingTabIndicator slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    int tabIndicatorAnimationMode;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabIndicatorHeight;
    private com.google.android.material.tabs.a tabIndicatorInterpolator;
    private final TimeInterpolator tabIndicatorTimeInterpolator;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    ColorStateList tabRippleColorStateList;
    Drawable tabSelectedIndicator;
    private int tabSelectedIndicatorColor;
    private final int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final l6e0 tabViewPool;
    private final ArrayList<a> tabs;
    boolean unboundedRipple;
    ViewPager viewPager;
    private int viewPagerScrollState;
    private static final int DEF_STYLE_RES = g2i0.Widget_Design_TabLayout;
    private static final l6e0 tabPool = new n6e0(16);

    public class PagerAdapterObserver extends DataSetObserver {
        public PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }
    }

    public class SlidingTabIndicator extends LinearLayout {
        ValueAnimator indicatorAnimator;
        private int layoutDirection;

        public SlidingTabIndicator(Context context) {
            super(context);
            this.layoutDirection = -1;
            setWillNotDraw(false);
        }

        private void jumpIndicatorToIndicatorPosition() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.indicatorPosition == -1) {
                tabLayout.indicatorPosition = tabLayout.getSelectedTabPosition();
            }
            jumpIndicatorToPosition(TabLayout.this.indicatorPosition);
        }

        private void jumpIndicatorToPosition(int i) {
            if (TabLayout.this.viewPagerScrollState == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i);
                com.google.android.material.tabs.a aVar = TabLayout.this.tabIndicatorInterpolator;
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.tabSelectedIndicator;
                aVar.getClass();
                RectF a = com.google.android.material.tabs.a.a(tabLayout, childAt);
                drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
                TabLayout.this.indicatorPosition = i;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jumpIndicatorToSelectedPosition() {
            jumpIndicatorToPosition(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tweenIndicatorPosition(View view, View view2, float f) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.tabSelectedIndicator;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.tabSelectedIndicator.getBounds().bottom);
            } else {
                com.google.android.material.tabs.a aVar = TabLayout.this.tabIndicatorInterpolator;
                TabLayout tabLayout = TabLayout.this;
                aVar.b(tabLayout, view, view2, f, tabLayout.tabSelectedIndicator);
            }
            postInvalidateOnAnimation();
        }

        private void updateOrRecreateIndicatorAnimation(boolean z, int i, int i2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.indicatorPosition == i) {
                return;
            }
            final View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            final View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                jumpIndicatorToSelectedPosition();
                return;
            }
            TabLayout.this.indicatorPosition = i;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SlidingTabIndicator.this.tweenIndicatorPosition(childAt, childAt2, valueAnimator.getAnimatedFraction());
                }
            };
            if (!z) {
                this.indicatorAnimator.removeAllUpdateListeners();
                this.indicatorAnimator.addUpdateListener(animatorUpdateListener);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.indicatorAnimator = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.tabIndicatorTimeInterpolator);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(animatorUpdateListener);
            valueAnimator.start();
        }

        public void animateIndicatorToPosition(int i, int i2) {
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.indicatorPosition != i) {
                this.indicatorAnimator.cancel();
            }
            updateOrRecreateIndicatorAnimation(true, i, i2);
        }

        public boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int height2 = TabLayout.this.tabSelectedIndicator.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.tabSelectedIndicator.getIntrinsicHeight();
            }
            int i = TabLayout.this.tabIndicatorGravity;
            if (i == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    height2 = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (TabLayout.this.tabSelectedIndicator.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
                TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.tabSelectedIndicator.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                jumpIndicatorToIndicatorPosition();
            } else {
                updateOrRecreateIndicatorAnimation(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) com.google.android.material.internal.e.d(16, getContext())) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.tabGravity = 0;
                    tabLayout2.updateTabViews(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }

        public void setIndicatorPositionFromTabPosition(int i, float f) {
            TabLayout.this.indicatorPosition = Math.round(i + f);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.indicatorAnimator.cancel();
            }
            tweenIndicatorPosition(getChildAt(i), getChildAt(i + 1), f);
        }

        public void setSelectedIndicatorHeight(int i) {
            Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
            TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }
    }

    public final class TabView extends LinearLayout {
        private View badgeAnchorView;
        private BadgeDrawable badgeDrawable;
        private Drawable baseBackgroundDrawable;
        private ImageView customIconView;
        private TextView customTextView;
        private View customView;
        private int defaultMaxLines;
        private ImageView iconView;
        private a tab;
        private TextView textView;

        public TabView(Context context) {
            super(context);
            this.defaultMaxLines = 2;
            updateBackgroundDrawable(context);
            setPaddingRelative(TabLayout.this.tabPaddingStart, TabLayout.this.tabPaddingTop, TabLayout.this.tabPaddingEnd, TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            setClickable(true);
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            pp31.a(this, systemIcon);
        }

        private void addOnLayoutChangeListener(final View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (view.getVisibility() == 0) {
                        TabView.this.tryUpdateBadgeDrawableBounds(view);
                    }
                }
            });
        }

        private float approximateLineWidth(Layout layout, int i, float f) {
            return (f / layout.getPaint().getTextSize()) * layout.getLineWidth(i);
        }

        private void clipViewToPaddingForBadge(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void drawBackground(Canvas canvas) {
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.baseBackgroundDrawable.draw(canvas);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BadgeDrawable getBadge() {
            return this.badgeDrawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BadgeDrawable getOrCreateBadge() {
            if (this.badgeDrawable == null) {
                this.badgeDrawable = BadgeDrawable.create(getContext());
            }
            tryUpdateBadgeAnchor();
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            ny61.r("Unable to create badge");
            return null;
        }

        private boolean hasBadgeDrawable() {
            return this.badgeDrawable != null;
        }

        private void inflateAndAddDefaultIconView() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(jvh0.design_layout_tab_icon, (ViewGroup) this, false);
            this.iconView = imageView;
            addView(imageView, 0);
        }

        private void inflateAndAddDefaultTextView() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(jvh0.design_layout_tab_text, (ViewGroup) this, false);
            this.textView = textView;
            addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBadge() {
            if (this.badgeAnchorView != null) {
                tryRemoveBadgeFromAnchor();
            }
            this.badgeDrawable = null;
        }

        private void tryAttachBadgeToAnchor(View view) {
            if (hasBadgeDrawable() && view != null) {
                clipViewToPaddingForBadge(false);
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
                this.badgeAnchorView = view;
            }
        }

        private void tryRemoveBadgeFromAnchor() {
            if (hasBadgeDrawable()) {
                clipViewToPaddingForBadge(true);
                View view = this.badgeAnchorView;
                if (view != null) {
                    BadgeDrawable badgeDrawable = this.badgeDrawable;
                    if (badgeDrawable != null) {
                        if (badgeDrawable.getCustomBadgeParent() != null) {
                            badgeDrawable.getCustomBadgeParent().setForeground(null);
                        } else {
                            view.getOverlay().remove(badgeDrawable);
                        }
                    }
                    this.badgeAnchorView = null;
                }
            }
        }

        private void tryUpdateBadgeAnchor() {
            a aVar;
            if (hasBadgeDrawable()) {
                if (this.customView != null) {
                    tryRemoveBadgeFromAnchor();
                    return;
                }
                ImageView imageView = this.iconView;
                if (imageView != null && (aVar = this.tab) != null && aVar.a != null) {
                    if (this.badgeAnchorView == imageView) {
                        tryUpdateBadgeDrawableBounds(imageView);
                        return;
                    } else {
                        tryRemoveBadgeFromAnchor();
                        tryAttachBadgeToAnchor(this.iconView);
                        return;
                    }
                }
                TextView textView = this.textView;
                if (textView == null || this.tab == null) {
                    tryRemoveBadgeFromAnchor();
                } else if (this.badgeAnchorView == textView) {
                    tryUpdateBadgeDrawableBounds(textView);
                } else {
                    tryRemoveBadgeFromAnchor();
                    tryAttachBadgeToAnchor(this.textView);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tryUpdateBadgeDrawableBounds(View view) {
            if (hasBadgeDrawable() && view == this.badgeAnchorView) {
                BadgeDrawable badgeDrawable = this.badgeDrawable;
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                badgeDrawable.setBounds(rect);
                badgeDrawable.updateBadgeCoordinates(view, (FrameLayout) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.google.android.material.tabs.TabLayout$TabView] */
        /* JADX WARN: Type inference failed for: r6v1, types: [android.graphics.drawable.Drawable] */
        public void updateBackgroundDrawable(Context context) {
            int i = TabLayout.this.tabBackgroundResId;
            if (i != 0) {
                Drawable t = vng.t(i, context);
                this.baseBackgroundDrawable = t;
                if (t != null && t.isStateful()) {
                    this.baseBackgroundDrawable.setState(getDrawableState());
                }
            } else {
                this.baseBackgroundDrawable = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.tabRippleColorStateList != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList c = tt91.c(TabLayout.this.tabRippleColorStateList);
                if (TabLayout.this.unboundedRipple) {
                    gradientDrawable = FocusRingDrawable.wrap(context, new RippleDrawable(c, null, null));
                } else {
                    ?? rippleDrawable = new RippleDrawable(c, gradientDrawable, gradientDrawable2);
                    FocusRingDrawable.layer(context, rippleDrawable);
                    gradientDrawable = rippleDrawable;
                }
            }
            setBackground(gradientDrawable);
            TabLayout.this.invalidate();
        }

        private void updateTextAndIcon(TextView textView, ImageView imageView, boolean z) {
            boolean z2;
            Drawable drawable;
            a aVar = this.tab;
            Drawable mutate = (aVar == null || (drawable = aVar.a) == null) ? null : drawable.mutate();
            if (mutate != null) {
                mutate.setTintList(TabLayout.this.tabIconTint);
                PorterDuff.Mode mode = TabLayout.this.tabIconTintMode;
                if (mode != null) {
                    mutate.setTintMode(mode);
                }
            }
            a aVar2 = this.tab;
            CharSequence charSequence = aVar2 != null ? aVar2.b : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (isEmpty) {
                    z2 = false;
                } else {
                    this.tab.getClass();
                    z2 = true;
                }
                textView.setText(!isEmpty ? charSequence : null);
                textView.setVisibility(z2 ? 0 : 8);
                if (!isEmpty) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int d = (z2 && imageView.getVisibility() == 0) ? (int) com.google.android.material.internal.e.d(8, getContext()) : 0;
                if (TabLayout.this.inlineLabel) {
                    if (d != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(d);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (d != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = d;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            a aVar3 = this.tab;
            CharSequence charSequence2 = aVar3 != null ? aVar3.c : null;
            if (isEmpty) {
                charSequence = charSequence2;
            }
            fuz0.a(this, charSequence);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.baseBackgroundDrawable;
            if ((drawable == null || !drawable.isStateful()) ? false : this.baseBackgroundDrawable.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        public a getTab() {
            return this.tab;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(this.badgeDrawable.getContentDescription());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) uh.a(0, 1, this.tab.d, 1, false, isSelected()).a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) ph.g.a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(kxh0.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.textView != null) {
                float f = TabLayout.this.tabTextSize;
                if (isSelected() && TabLayout.this.selectedTabTextAppearance != -1) {
                    f = TabLayout.this.selectedTabTextSize;
                }
                int i3 = this.defaultMaxLines;
                ImageView imageView = this.iconView;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.textView;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.tabTextMultiLineSize;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int maxLines = this.textView.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.mode != 1 || f <= textSize || lineCount != 1 || ((layout = this.textView.getLayout()) != null && approximateLineWidth(layout, 0, f) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.textView.setTextSize(0, f);
                        this.textView.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.tab == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            a aVar = this.tab;
            TabLayout tabLayout = aVar.f;
            if (tabLayout != null) {
                tabLayout.selectTab(aVar);
                return true;
            }
            ny61.g("Tab not attached to a TabLayout");
            return false;
        }

        public void reset() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.textView;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.iconView;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.customView;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(a aVar) {
            if (aVar != this.tab) {
                this.tab = aVar;
                update();
            }
        }

        public final void update() {
            updateTab();
            a aVar = this.tab;
            setSelected(aVar != null && aVar.a());
        }

        public final void updateOrientation() {
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            TextView textView = this.customTextView;
            if (textView == null && this.customIconView == null) {
                updateTextAndIcon(this.textView, this.iconView, true);
            } else {
                updateTextAndIcon(textView, this.customIconView, false);
            }
        }

        public final void updateTab() {
            ViewParent parent;
            a aVar = this.tab;
            View view = aVar != null ? aVar.e : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.customView;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.customView);
                    }
                    addView(view);
                }
                this.customView = view;
                TextView textView = this.textView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.iconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.iconView.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.customTextView = textView2;
                if (textView2 != null) {
                    this.defaultMaxLines = textView2.getMaxLines();
                }
                this.customIconView = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.customView;
                if (view3 != null) {
                    removeView(view3);
                    this.customView = null;
                }
                this.customTextView = null;
                this.customIconView = null;
            }
            if (this.customView == null) {
                if (this.iconView == null) {
                    inflateAndAddDefaultIconView();
                }
                if (this.textView == null) {
                    inflateAndAddDefaultTextView();
                    this.defaultMaxLines = this.textView.getMaxLines();
                }
                this.textView.setTextAppearance(TabLayout.this.defaultTabTextAppearance);
                if (!isSelected() || TabLayout.this.selectedTabTextAppearance == -1) {
                    this.textView.setTextAppearance(TabLayout.this.tabTextAppearance);
                } else {
                    this.textView.setTextAppearance(TabLayout.this.selectedTabTextAppearance);
                }
                ColorStateList colorStateList = TabLayout.this.tabTextColors;
                if (colorStateList != null) {
                    this.textView.setTextColor(colorStateList);
                }
                updateTextAndIcon(this.textView, this.iconView, true);
                tryUpdateBadgeAnchor();
                addOnLayoutChangeListener(this.iconView);
                addOnLayoutChangeListener(this.textView);
            } else {
                TextView textView3 = this.customTextView;
                if (textView3 != null || this.customIconView != null) {
                    updateTextAndIcon(textView3, this.customIconView, false);
                }
            }
            if (aVar == null || TextUtils.isEmpty(aVar.c)) {
                return;
            }
            setContentDescription(aVar.c);
        }
    }

    public static class a {
        public Drawable a;
        public CharSequence b;
        public CharSequence c;
        public int d = -1;
        public View e;
        public TabLayout f;
        public TabView g;

        public final boolean a() {
            TabLayout tabLayout = this.f;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                return selectedTabPosition != -1 && selectedTabPosition == this.d;
            }
            ny61.g("Tab not attached to a TabLayout");
            return false;
        }

        public final void b() {
            TabView tabView = this.g;
            if (tabView != null) {
                tabView.update();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r4), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.indicatorPosition = -1;
        this.tabs = new ArrayList<>();
        this.selectedTabTextAppearance = -1;
        this.tabSelectedIndicatorColor = 0;
        this.tabMaxWidth = Integer.MAX_VALUE;
        this.tabIndicatorHeight = -1;
        this.selectedListeners = new ArrayList<>();
        this.tabViewPool = new m6e0(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.slidingTabIndicator = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d = yvy0.d(context2, attributeSet, z2i0.TabLayout, i, i2, z2i0.TabLayout_tabTextAppearance);
        ColorStateList y = q5z.y(getBackground());
        if (y != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(y);
            materialShapeDrawable.initializeElevationOverlay(context2);
            materialShapeDrawable.setElevation(getElevation());
            setBackground(materialShapeDrawable);
        }
        setSelectedTabIndicator(jx81.q(context2, d, z2i0.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(d.getColor(z2i0.TabLayout_tabIndicatorColor, 0));
        slidingTabIndicator.setSelectedIndicatorHeight(d.getDimensionPixelSize(z2i0.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(d.getInt(z2i0.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(d.getInt(z2i0.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(d.getBoolean(z2i0.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = d.getDimensionPixelSize(z2i0.TabLayout_tabPadding, 0);
        this.tabPaddingBottom = dimensionPixelSize;
        this.tabPaddingEnd = dimensionPixelSize;
        this.tabPaddingTop = dimensionPixelSize;
        this.tabPaddingStart = dimensionPixelSize;
        this.tabPaddingStart = d.getDimensionPixelSize(z2i0.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.tabPaddingTop = d.getDimensionPixelSize(z2i0.TabLayout_tabPaddingTop, this.tabPaddingTop);
        this.tabPaddingEnd = d.getDimensionPixelSize(z2i0.TabLayout_tabPaddingEnd, this.tabPaddingEnd);
        this.tabPaddingBottom = d.getDimensionPixelSize(z2i0.TabLayout_tabPaddingBottom, this.tabPaddingBottom);
        if (z610.c(context2.getTheme(), eng0.isMaterial3Theme, false)) {
            this.defaultTabTextAppearance = eng0.textAppearanceTitleSmall;
        } else {
            this.defaultTabTextAppearance = eng0.textAppearanceButton;
        }
        int resourceId = d.getResourceId(z2i0.TabLayout_tabTextAppearance, g2i0.TextAppearance_Design_Tab);
        this.tabTextAppearance = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, n4i0.TextAppearance);
        try {
            this.tabTextSize = obtainStyledAttributes.getDimensionPixelSize(n4i0.TextAppearance_android_textSize, 0);
            this.tabTextColors = jx81.o(context2, obtainStyledAttributes, n4i0.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (d.hasValue(z2i0.TabLayout_tabSelectedTextAppearance)) {
                this.selectedTabTextAppearance = d.getResourceId(z2i0.TabLayout_tabSelectedTextAppearance, resourceId);
            }
            int i3 = this.selectedTabTextAppearance;
            if (i3 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i3, n4i0.TextAppearance);
                try {
                    this.selectedTabTextSize = obtainStyledAttributes.getDimensionPixelSize(n4i0.TextAppearance_android_textSize, (int) this.tabTextSize);
                    ColorStateList o = jx81.o(context2, obtainStyledAttributes, n4i0.TextAppearance_android_textColor);
                    if (o != null) {
                        this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), o.getColorForState(new int[]{R.attr.state_selected}, o.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (d.hasValue(z2i0.TabLayout_tabTextColor)) {
                this.tabTextColors = jx81.o(context2, d, z2i0.TabLayout_tabTextColor);
            }
            if (d.hasValue(z2i0.TabLayout_tabSelectedTextColor)) {
                this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), d.getColor(z2i0.TabLayout_tabSelectedTextColor, 0));
            }
            this.tabIconTint = jx81.o(context2, d, z2i0.TabLayout_tabIconTint);
            this.tabIconTintMode = com.google.android.material.internal.e.j(d.getInt(z2i0.TabLayout_tabIconTintMode, -1), null);
            this.tabRippleColorStateList = jx81.o(context2, d, z2i0.TabLayout_tabRippleColor);
            this.tabIndicatorAnimationDuration = d.getInt(z2i0.TabLayout_tabIndicatorAnimationDuration, ANIMATION_DURATION);
            this.tabIndicatorTimeInterpolator = kp50.P(context2, eng0.motionEasingEmphasizedInterpolator, mj2.b);
            this.requestedTabMinWidth = d.getDimensionPixelSize(z2i0.TabLayout_tabMinWidth, -1);
            this.requestedTabMaxWidth = d.getDimensionPixelSize(z2i0.TabLayout_tabMaxWidth, -1);
            this.tabBackgroundResId = d.getResourceId(z2i0.TabLayout_tabBackground, 0);
            this.contentInsetStart = d.getDimensionPixelSize(z2i0.TabLayout_tabContentStart, 0);
            this.mode = d.getInt(z2i0.TabLayout_tabMode, 1);
            this.tabGravity = d.getInt(z2i0.TabLayout_tabGravity, 0);
            this.inlineLabel = d.getBoolean(z2i0.TabLayout_tabInlineLabel, false);
            this.unboundedRipple = d.getBoolean(z2i0.TabLayout_tabUnboundedRipple, false);
            d.recycle();
            Resources resources = getResources();
            this.tabTextMultiLineSize = resources.getDimensionPixelSize(org0.design_tab_text_size_2line);
            this.scrollableTabMinWidth = resources.getDimensionPixelSize(org0.design_tab_scrollable_min_width);
            applyModeAndGravity();
        } finally {
        }
    }

    private void addTabFromItemView(TabItem tabItem) {
        a newTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            if (TextUtils.isEmpty(newTab.c) && !TextUtils.isEmpty(charSequence)) {
                newTab.g.setContentDescription(charSequence);
            }
            newTab.b = charSequence;
            newTab.b();
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            newTab.a = drawable;
            TabLayout tabLayout = newTab.f;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                tabLayout.updateTabViews(true);
            }
            newTab.b();
        }
        int i = tabItem.customLayout;
        if (i != 0) {
            newTab.e = LayoutInflater.from(newTab.g.getContext()).inflate(i, (ViewGroup) newTab.g, false);
            newTab.b();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            newTab.c = tabItem.getContentDescription();
            newTab.b();
        }
        addTab(newTab);
    }

    private void addTabView(a aVar) {
        TabView tabView = aVar.g;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.slidingTabIndicator.addView(tabView, aVar.d, createLayoutParamsForTabs());
    }

    private void addViewInternal(View view) {
        if (view instanceof TabItem) {
            addTabFromItemView((TabItem) view);
        } else {
            ny61.g("Only TabItem instances can be added to TabLayout");
        }
    }

    private void animateToTab(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !isLaidOut() || this.slidingTabIndicator.childrenNeedLayout()) {
            setScrollPosition(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int calculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
        if (scrollX != calculateScrollXForTab) {
            ensureScrollAnimator();
            this.scrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
            this.scrollAnimator.start();
        }
        this.slidingTabIndicator.animateIndicatorToPosition(i, this.tabIndicatorAnimationDuration);
    }

    private void applyGravityForModeScrollable(int i) {
        if (i != 0) {
            if (i == 1) {
                this.slidingTabIndicator.setGravity(1);
                return;
            } else if (i != 2) {
                return;
            }
        }
        this.slidingTabIndicator.setGravity(8388611);
    }

    private void applyModeAndGravity() {
        int i = this.mode;
        this.slidingTabIndicator.setPaddingRelative((i == 0 || i == 2) ? Math.max(0, this.contentInsetStart - this.tabPaddingStart) : 0, 0, 0, 0);
        int i2 = this.mode;
        if (i2 == 0) {
            applyGravityForModeScrollable(this.tabGravity);
        } else if (i2 == 1 || i2 == 2) {
            this.slidingTabIndicator.setGravity(1);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i, float f) {
        View childAt;
        int i2 = this.mode;
        if ((i2 != 0 && i2 != 2) || (childAt = this.slidingTabIndicator.getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < this.slidingTabIndicator.getChildCount() ? this.slidingTabIndicator.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    private void configureTab(a aVar, int i) {
        aVar.d = i;
        this.tabs.add(i, aVar);
        int size = this.tabs.size();
        int i2 = -1;
        for (int i3 = i + 1; i3 < size; i3++) {
            if (this.tabs.get(i3).d == this.indicatorPosition) {
                i2 = i3;
            }
            this.tabs.get(i3).d = i3;
        }
        this.indicatorPosition = i2;
    }

    private static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    private TabView createTabView(a aVar) {
        l6e0 l6e0Var = this.tabViewPool;
        TabView tabView = l6e0Var != null ? (TabView) l6e0Var.a() : null;
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(aVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(aVar.c)) {
            tabView.setContentDescription(aVar.b);
            return tabView;
        }
        tabView.setContentDescription(aVar.c);
        return tabView;
    }

    private void dispatchTabReselected(a aVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).getClass();
        }
    }

    private void dispatchTabSelected(a aVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).a(aVar);
        }
    }

    private void dispatchTabUnselected(a aVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).b(aVar);
        }
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(this.tabIndicatorTimeInterpolator);
            this.scrollAnimator.setDuration(this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.tabs.get(i);
            if (aVar != null && aVar.a != null && !TextUtils.isEmpty(aVar.b)) {
                if (this.inlineLabel) {
                    return 48;
                }
                return DEFAULT_HEIGHT_WITH_TEXT_ICON;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.requestedTabMinWidth;
        if (i != -1) {
            return i;
        }
        int i2 = this.mode;
        if (i2 == 0 || i2 == 2) {
            return this.scrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private boolean isScrollingEnabled() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void removeTabViewAt(int i) {
        TabView tabView = (TabView) this.slidingTabIndicator.getChildAt(i);
        this.slidingTabIndicator.removeViewAt(i);
        if (tabView != null) {
            tabView.reset();
            this.tabViewPool.a0(tabView);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i) {
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.slidingTabIndicator.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).updateTab();
                    }
                }
                i2++;
            }
        }
    }

    private void setupWithViewPager(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            e eVar = this.pageChangeListener;
            if (eVar != null) {
                viewPager2.removeOnPageChangeListener(eVar);
            }
            b bVar = this.adapterChangeListener;
            if (bVar != null) {
                this.viewPager.removeOnAdapterChangeListener(bVar);
            }
        }
        c cVar = this.currentVpSelectedListener;
        if (cVar != null) {
            removeOnTabSelectedListener(cVar);
            this.currentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.viewPager = viewPager;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new e(this);
            }
            e eVar2 = this.pageChangeListener;
            eVar2.c = 0;
            eVar2.b = 0;
            viewPager.addOnPageChangeListener(eVar2);
            f fVar = new f(viewPager);
            this.currentVpSelectedListener = fVar;
            addOnTabSelectedListener((c) fVar);
            e890 adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new b(this);
            }
            b bVar2 = this.adapterChangeListener;
            bVar2.a = z;
            viewPager.addOnAdapterChangeListener(bVar2);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z2;
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            this.tabs.get(i).b();
        }
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    @Deprecated
    public void addOnTabSelectedListener(c cVar) {
        if (this.selectedListeners.contains(cVar)) {
            return;
        }
        this.selectedListeners.add(cVar);
    }

    public void addTab(a aVar, int i, boolean z) {
        if (aVar.f != this) {
            ny61.g("Tab belongs to a different TabLayout.");
            return;
        }
        configureTab(aVar, i);
        addTabView(aVar);
        if (z) {
            TabLayout tabLayout = aVar.f;
            if (tabLayout != null) {
                tabLayout.selectTab(aVar);
            } else {
                ny61.g("Tab not attached to a TabLayout");
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    public a createTabFromPool() {
        a aVar = (a) tabPool.a();
        return aVar == null ? new a() : aVar;
    }

    public int getSelectedTabPosition() {
        a aVar = this.selectedTab;
        if (aVar != null) {
            return aVar.d;
        }
        return -1;
    }

    public a getTabAt(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.tabs.get(i);
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorAnimationMode() {
        return this.tabIndicatorAnimationMode;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    public a newTab() {
        a createTabFromPool = createTabFromPool();
        createTabFromPool.f = this;
        createTabFromPool.g = createTabView(createTabFromPool);
        return createTabFromPool;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        eja1.C(this);
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) th.a(1, getTabCount(), 1, false).a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isScrollingEnabled() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int round = Math.round(com.google.android.material.internal.e.d(getDefaultHeight(), getContext()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.requestedTabMaxWidth;
            if (i3 <= 0) {
                i3 = (int) (size - com.google.android.material.internal.e.d(56, getContext()));
            }
            this.tabMaxWidth = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.mode;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || isScrollingEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        e890 e890Var = this.pagerAdapter;
        if (e890Var != null) {
            int b = e890Var.b();
            for (int i = 0; i < b; i++) {
                a newTab = newTab();
                this.pagerAdapter.getClass();
                if (TextUtils.isEmpty(newTab.c) && !TextUtils.isEmpty(null)) {
                    newTab.g.setContentDescription(null);
                }
                newTab.b = null;
                newTab.b();
                addTab(newTab, false);
            }
            ViewPager viewPager = this.viewPager;
            if (viewPager == null || b <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            selectTab(getTabAt(currentItem));
        }
    }

    public boolean releaseFromTabPool(a aVar) {
        return tabPool.a0(aVar);
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<a> it = this.tabs.iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            next.f = null;
            next.g = null;
            next.a = null;
            next.b = null;
            next.c = null;
            next.d = -1;
            next.e = null;
            releaseFromTabPool(next);
        }
        this.selectedTab = null;
    }

    @Deprecated
    public void removeOnTabSelectedListener(c cVar) {
        this.selectedListeners.remove(cVar);
    }

    public void removeTab(a aVar) {
        if (aVar.f == this) {
            removeTabAt(aVar.d);
        } else {
            ny61.g("Tab does not belong to this TabLayout.");
        }
    }

    public void removeTabAt(int i) {
        a aVar = this.selectedTab;
        int i2 = aVar != null ? aVar.d : 0;
        removeTabViewAt(i);
        a remove = this.tabs.remove(i);
        int i3 = -1;
        if (remove != null) {
            remove.f = null;
            remove.g = null;
            remove.a = null;
            remove.b = null;
            remove.c = null;
            remove.d = -1;
            remove.e = null;
            releaseFromTabPool(remove);
        }
        int size = this.tabs.size();
        for (int i4 = i; i4 < size; i4++) {
            if (this.tabs.get(i4).d == this.indicatorPosition) {
                i3 = i4;
            }
            this.tabs.get(i4).d = i4;
        }
        this.indicatorPosition = i3;
        if (i2 == i) {
            selectTab(this.tabs.isEmpty() ? null : this.tabs.get(Math.max(0, i - 1)));
        }
    }

    public void selectTab(a aVar, boolean z) {
        a aVar2 = this.selectedTab;
        if (aVar2 == aVar) {
            if (aVar2 != null) {
                dispatchTabReselected(aVar);
                animateToTab(aVar.d);
                return;
            }
            return;
        }
        int i = aVar != null ? aVar.d : -1;
        if (z) {
            if ((aVar2 == null || aVar2.d == -1) && i != -1) {
                setScrollPosition(i, 0.0f, true);
            } else {
                animateToTab(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.selectedTab = aVar;
        if (aVar2 != null && aVar2.f != null) {
            dispatchTabUnselected(aVar2);
        }
        if (aVar != null) {
            dispatchTabSelected(aVar);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        eja1.A(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.inlineLabel != z) {
            this.inlineLabel = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.selectedListener;
        if (cVar2 != null) {
            removeOnTabSelectedListener(cVar2);
        }
        this.selectedListener = cVar;
        if (cVar != null) {
            addOnTabSelectedListener(cVar);
        }
    }

    public void setPagerAdapter(e890 e890Var, boolean z) {
        DataSetObserver dataSetObserver;
        e890 e890Var2 = this.pagerAdapter;
        if (e890Var2 != null && (dataSetObserver = this.pagerAdapterObserver) != null) {
            e890Var2.k(dataSetObserver);
        }
        this.pagerAdapter = e890Var;
        if (z && e890Var != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new PagerAdapterObserver();
            }
            e890Var.g(this.pagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2, boolean z3) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.slidingTabIndicator.getChildCount()) {
            return;
        }
        if (z2) {
            this.slidingTabIndicator.setIndicatorPositionFromTabPosition(i, f);
        }
        ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.scrollAnimator.cancel();
        }
        int calculateScrollXForTab = calculateScrollXForTab(i, f);
        int scrollX = getScrollX();
        boolean z4 = (i < getSelectedTabPosition() && calculateScrollXForTab >= scrollX) || (i > getSelectedTabPosition() && calculateScrollXForTab <= scrollX) || i == getSelectedTabPosition();
        if (getLayoutDirection() == 1) {
            z4 = (i < getSelectedTabPosition() && calculateScrollXForTab <= scrollX) || (i > getSelectedTabPosition() && calculateScrollXForTab >= scrollX) || i == getSelectedTabPosition();
        }
        if (z4 || this.viewPagerScrollState == 1 || z3) {
            if (i < 0) {
                calculateScrollXForTab = 0;
            }
            scrollTo(calculateScrollXForTab, 0);
        }
        if (z) {
            setSelectedTabView(round);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.tabSelectedIndicator = mutate;
        int i = this.tabSelectedIndicatorColor;
        if (i != 0) {
            mutate.setTint(i);
        } else {
            mutate.setTintList(null);
        }
        int i2 = this.tabIndicatorHeight;
        if (i2 == -1) {
            i2 = this.tabSelectedIndicator.getIntrinsicHeight();
        }
        this.slidingTabIndicator.setSelectedIndicatorHeight(i2);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.tabSelectedIndicatorColor = i;
        Drawable drawable = this.tabSelectedIndicator;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        updateTabViews(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.tabIndicatorGravity != i) {
            this.tabIndicatorGravity = i;
            this.slidingTabIndicator.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.tabIndicatorHeight = i;
        this.slidingTabIndicator.setSelectedIndicatorHeight(i);
    }

    public void setTabGravity(int i) {
        if (this.tabGravity != i) {
            this.tabGravity = i;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(qke.m(i, getContext()));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.tabIndicatorAnimationMode = i;
        if (i == 0) {
            this.tabIndicatorInterpolator = new com.google.android.material.tabs.a();
            return;
        }
        if (i == 1) {
            this.tabIndicatorInterpolator = new nqn(0);
        } else if (i == 2) {
            this.tabIndicatorInterpolator = new nqn(1);
        } else {
            ny61.g(b64.e(i, " is not a valid TabIndicatorAnimationMode"));
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.tabIndicatorFullWidth = z;
        this.slidingTabIndicator.jumpIndicatorToSelectedPosition();
        this.slidingTabIndicator.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.mode) {
            this.mode = i;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(qke.m(i, getContext()));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(e890 e890Var) {
        setPagerAdapter(e890Var, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.unboundedRipple != z) {
            this.unboundedRipple = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void updateTabViews(boolean z) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void updateViewPagerScrollState(int i) {
        this.viewPagerScrollState = i;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        addViewInternal(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void removeOnTabSelectedListener(d dVar) {
        removeOnTabSelectedListener((c) dVar);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public void addOnTabSelectedListener(d dVar) {
        addOnTabSelectedListener((c) dVar);
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void addTab(a aVar, int i) {
        addTab(aVar, i, this.tabs.isEmpty());
    }

    public void addTab(a aVar, boolean z) {
        addTab(aVar, this.tabs.size(), z);
    }

    public void addTab(a aVar) {
        addTab(aVar, this.tabs.isEmpty());
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(vng.t(i, getContext()));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void selectTab(a aVar) {
        selectTab(aVar, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        setupWithViewPager(viewPager, z, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        setScrollPosition(i, f, z, z2, true);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.tabStyle);
    }

    public TabLayout(Context context) {
        this(context, null);
    }
}
