package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.MaterialShapeDrawable;
import defpackage.cxg0;
import defpackage.eja1;
import defpackage.eng0;
import defpackage.etp0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.iog0;
import defpackage.jvh0;
import defpackage.jx81;
import defpackage.leh0;
import defpackage.mj2;
import defpackage.mmp0;
import defpackage.org0;
import defpackage.v5a1;
import defpackage.vez0;
import defpackage.vng;
import defpackage.w511;
import defpackage.wd2;
import defpackage.yvy0;
import defpackage.z2i0;
import defpackage.z610;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class SearchBar extends Toolbar {
    private static final float ADAPTIVE_MAX_WIDTH_PERCENT_AFTER_BREAKPOINT = 0.5f;
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = g2i0.Widget_Material3_SearchBar;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    static final int NO_RES_ID = -1;
    private final boolean adaptiveMaxWidthEnabled;
    private final int adaptiveMaxWidthParentBreakpoint;
    private final int backgroundColor;
    private MaterialShapeDrawable backgroundShape;
    private View centerView;
    private final boolean defaultMarginsEnabled;
    private final Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private int endSiblingViewId;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private final AppBarLayout.c liftColorListener;
    private boolean liftOnScroll;
    private final ColorStateList liftOnScrollColor;
    private int maxWidth;
    private int menuResId;
    private ActionMenuView menuView;
    private ImageButton navIconButton;
    private Integer navigationIconTint;
    private Drawable originalNavigationIconBackground;
    private final TextView placeholderTextView;
    private final b searchBarAnimationHelper;
    private int startSiblingViewId;
    private boolean textCentered;
    private final TextView textView;
    private final FrameLayout textViewContainer;
    private final boolean tintNavigationIcon;

    public static abstract class a {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r5), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.menuResId = -1;
        this.liftColorListener = new etp0(this);
        Context context2 = getContext();
        validateAttributes(attributeSet);
        this.adaptiveMaxWidthParentBreakpoint = getResources().getDimensionPixelSize(org0.m3_searchbar_parent_width_breakpoint);
        this.defaultNavigationIcon = vng.t(getDefaultNavigationIconResource(), context2);
        this.searchBarAnimationHelper = new b();
        TypedArray d = yvy0.d(context2, attributeSet, z2i0.SearchBar, i, i2, new int[0]);
        com.google.android.material.shape.b a2 = com.google.android.material.shape.b.j(context2, attributeSet, i, i2).a();
        int color = d.getColor(z2i0.SearchBar_backgroundTint, 0);
        this.backgroundColor = color;
        this.liftOnScrollColor = jx81.o(context2, d, z2i0.SearchBar_liftOnScrollColor);
        float dimension = d.getDimension(z2i0.SearchBar_elevation, 0.0f);
        this.defaultMarginsEnabled = d.getBoolean(z2i0.SearchBar_defaultMarginsEnabled, true);
        this.defaultScrollFlagsEnabled = d.getBoolean(z2i0.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z = d.getBoolean(z2i0.SearchBar_hideNavigationIcon, false);
        this.forceDefaultNavigationOnClickListener = d.getBoolean(z2i0.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.tintNavigationIcon = d.getBoolean(z2i0.SearchBar_tintNavigationIcon, true);
        if (d.hasValue(z2i0.SearchBar_navigationIconTint)) {
            this.navigationIconTint = Integer.valueOf(d.getColor(z2i0.SearchBar_navigationIconTint, -1));
        }
        int resourceId = d.getResourceId(z2i0.SearchBar_android_textAppearance, -1);
        String string = d.getString(z2i0.SearchBar_android_text);
        String string2 = d.getString(z2i0.SearchBar_android_hint);
        float dimension2 = d.getDimension(z2i0.SearchBar_strokeWidth, -1.0f);
        int color2 = d.getColor(z2i0.SearchBar_strokeColor, 0);
        this.textCentered = d.getBoolean(z2i0.SearchBar_textCentered, false);
        this.liftOnScroll = d.getBoolean(z2i0.SearchBar_liftOnScroll, false);
        this.maxWidth = d.getDimensionPixelSize(z2i0.SearchBar_android_maxWidth, -1);
        this.adaptiveMaxWidthEnabled = d.getBoolean(z2i0.SearchBar_adaptiveMaxWidthEnabled, false);
        this.startSiblingViewId = d.getResourceId(z2i0.SearchBar_startSiblingViewId, -1);
        this.endSiblingViewId = d.getResourceId(z2i0.SearchBar_endSiblingViewId, -1);
        d.recycle();
        if (!z) {
            initNavigationIcon();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(jvh0.mtrl_search_bar, this);
        this.layoutInflated = true;
        this.textView = (TextView) findViewById(leh0.open_search_bar_text_view);
        this.placeholderTextView = (TextView) findViewById(leh0.open_search_bar_placeholder_text_view);
        this.textViewContainer = (FrameLayout) findViewById(leh0.open_search_bar_text_view_container);
        setElevation(dimension);
        initTextView(resourceId, string, string2);
        initBackground(a2, color, dimension, dimension2, color2);
    }

    private void addLiftOnScrollProgressListener() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists == null || this.liftOnScrollColor == null) {
            return;
        }
        appBarLayoutParentIfExists.addLiftOnScrollProgressListener(this.liftColorListener);
    }

    private int defaultIfZero(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    private ActionMenuView findOrGetMenuView() {
        if (this.menuView == null) {
            this.menuView = v5a1.b(this);
        }
        return this.menuView;
    }

    private ImageButton findOrGetNavView() {
        if (this.navIconButton == null) {
            this.navIconButton = v5a1.d(this);
        }
        return this.navIconButton;
    }

    private void initBackground(com.google.android.material.shape.b bVar, int i, float f, float f2, int i2) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(bVar);
        this.backgroundShape = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.backgroundShape.setElevation(f);
        if (f2 >= 0.0f) {
            this.backgroundShape.setStroke(f2, i2);
        }
        int T = vez0.T(getContext(), z610.e(iog0.colorControlHighlight, this));
        this.backgroundShape.setFillColor(ColorStateList.valueOf(i));
        ColorStateList valueOf = ColorStateList.valueOf(T);
        MaterialShapeDrawable materialShapeDrawable2 = this.backgroundShape;
        RippleDrawable rippleDrawable = new RippleDrawable(valueOf, materialShapeDrawable2, materialShapeDrawable2);
        FocusRingDrawable.layer(getContext(), rippleDrawable, this.backgroundShape);
        setBackground(rippleDrawable);
    }

    private void initNavigationIcon() {
        setNavigationIcon(getNavigationIcon() == null ? this.defaultNavigationIcon : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    private void initTextView(int i, String str, String str2) {
        if (i != -1) {
            this.textView.setTextAppearance(i);
            this.placeholderTextView.setTextAppearance(i);
        }
        setText(str);
        setHint(str2);
        setTextCentered(this.textCentered);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startOnLoadAnimation$0() {
        final b bVar = this.searchBarAnimationHelper;
        Iterator it = bVar.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).getClass();
        }
        TextView textView = getTextView();
        final View centerView = getCenterView();
        ActionMenuView b = v5a1.b(this);
        View childAt = (b == null || b.getChildCount() <= 1) ? null : b.getChildAt(0);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(textView));
        LinearInterpolator linearInterpolator = mj2.a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(250L);
        animatorSet.play(ofFloat);
        if (childAt != null) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(MultiViewUpdateListener.alphaListener(childAt));
            ofFloat2.setInterpolator(linearInterpolator);
            ofFloat2.setDuration(250L);
            animatorSet.play(ofFloat2);
        }
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Iterator it2 = b.this.a.iterator();
                while (it2.hasNext()) {
                    ((SearchBar.a) it2.next()).getClass();
                }
            }
        });
        bVar.d = animatorSet;
        textView.setAlpha(0.0f);
        if (childAt != null) {
            childAt.setAlpha(0.0f);
        }
        if (centerView == null) {
            animatorSet.start();
            return;
        }
        centerView.setAlpha(0.0f);
        centerView.setVisibility(0);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(MultiViewUpdateListener.alphaListener(centerView));
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(bVar.h ? 250L : 0L);
        ofFloat3.setStartDelay(bVar.h ? 500L : 0L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat4.addUpdateListener(MultiViewUpdateListener.alphaListener(centerView));
        ofFloat4.setInterpolator(linearInterpolator);
        ofFloat4.setDuration(250L);
        ofFloat4.setStartDelay(750L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(ofFloat3, ofFloat4);
        bVar.e = animatorSet2;
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                centerView.setVisibility(8);
                animatorSet.start();
            }
        });
        animatorSet2.start();
    }

    private void layoutChild(View view, int i, int i2, int i3, int i4) {
        if (getLayoutDirection() == 1) {
            view.layout(getMeasuredWidth() - i3, i2, getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    private void layoutTextViewCenterAvoidToolbarViewsAndPadding() {
        int measuredWidth = (getMeasuredWidth() / 2) - (this.textViewContainer.getMeasuredWidth() / 2);
        int measuredWidth2 = this.textViewContainer.getMeasuredWidth() + measuredWidth;
        int measuredHeight = (getMeasuredHeight() / 2) - (this.textViewContainer.getMeasuredHeight() / 2);
        int measuredHeight2 = this.textViewContainer.getMeasuredHeight() + measuredHeight;
        boolean z = getLayoutDirection() == 1;
        ActionMenuView findOrGetMenuView = findOrGetMenuView();
        ImageButton findOrGetNavView = findOrGetNavView();
        int measuredWidth3 = (this.textViewContainer.getMeasuredWidth() / 2) - (this.textView.getMeasuredWidth() / 2);
        int measuredWidth4 = this.textView.getMeasuredWidth() + measuredWidth3;
        int i = measuredWidth3 + measuredWidth;
        int i2 = measuredWidth4 + measuredWidth;
        ActionMenuView actionMenuView = z ? findOrGetMenuView : findOrGetNavView;
        if (z) {
            findOrGetMenuView = findOrGetNavView;
        }
        int max = actionMenuView != null ? Math.max(actionMenuView.getRight() - i, 0) : 0;
        int i3 = i + max;
        int i4 = i2 + max;
        int max2 = findOrGetMenuView != null ? Math.max(i4 - findOrGetMenuView.getLeft(), 0) : 0;
        int i5 = i3 - max2;
        int i6 = i4 - max2;
        int max3 = ((max - max2) + Math.max(Math.max(getPaddingLeft() - i5, getContentInsetLeft() - i5), 0)) - Math.max(Math.max(i6 - (getMeasuredWidth() - getPaddingRight()), i6 - (getMeasuredWidth() - getContentInsetRight())), 0);
        this.textViewContainer.layout(measuredWidth + max3, measuredHeight, measuredWidth2 + max3, measuredHeight2);
    }

    private void layoutViewInCenter(View view) {
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i = measuredWidth2 + measuredWidth;
        int measuredHeight = view.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        layoutChild(view, measuredWidth2, measuredHeight2, i, measuredHeight2 + measuredHeight);
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable) {
        int T;
        if (!this.tintNavigationIcon || drawable == null) {
            return drawable;
        }
        Integer num = this.navigationIconTint;
        if (num != null) {
            T = num.intValue();
        } else {
            T = vez0.T(getContext(), z610.e(drawable == this.defaultNavigationIcon ? eng0.colorOnSurfaceVariant : eng0.colorOnSurface, this));
        }
        Drawable mutate = drawable.mutate();
        mutate.setTint(T);
        return mutate;
    }

    private void measureCenterView(int i, int i2) {
        View view = this.centerView;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    private void removeLiftOnScrollProgressListener() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.removeLiftOnScrollProgressListener(this.liftColorListener);
        }
    }

    private void setDefaultMargins() {
        if (this.defaultMarginsEnabled && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(org0.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = defaultIfZero(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = defaultIfZero(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = defaultIfZero(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = defaultIfZero(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void setHandwritingBoundsInsets() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton d = v5a1.d(this);
        int width = (d == null || !d.isClickable()) ? 0 : z ? getWidth() - d.getLeft() : d.getRight();
        ActionMenuView b = v5a1.b(this);
        int right = b != null ? z ? b.getRight() : getWidth() - b.getLeft() : 0;
        float f = -(z ? right : width);
        if (!z) {
            width = right;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -width, 0.0f);
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton d = v5a1.d(this);
        if (d == null) {
            return;
        }
        d.setClickable(!z);
        d.setFocusable(!z);
        Drawable background = d.getBackground();
        if (background != null) {
            this.originalNavigationIconBackground = background;
        }
        d.setBackgroundDrawable(z ? null : this.originalNavigationIconBackground);
        setHandwritingBoundsInsets();
    }

    private void setOrClearDefaultScrollFlags() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.defaultScrollFlagsEnabled) {
                if (layoutParams.getScrollFlags() == 0) {
                    layoutParams.setScrollFlags(53);
                }
            } else if (layoutParams.getScrollFlags() == 53) {
                layoutParams.setScrollFlags(0);
            }
        }
    }

    private void validateAttributes(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(NAMESPACE_APP, "title") != null) {
            w511.x("SearchBar does not support title. Use hint or text instead.");
        } else {
            if (attributeSet.getAttributeValue(NAMESPACE_APP, "subtitle") == null) {
                return;
            }
            w511.x("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    public void addCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.c.add(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.b.add(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(a aVar) {
        this.searchBarAnimationHelper.a.add(aVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated && this.centerView == null && !(view instanceof ActionMenuView)) {
            this.centerView = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    public void clearText() {
        this.textView.setText("");
        this.placeholderTextView.setText("");
    }

    public boolean collapse(View view, AppBarLayout appBarLayout, boolean z) {
        AnimatorSet animatorSet;
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        final b bVar = this.searchBarAnimationHelper;
        if (bVar.f && (animatorSet = bVar.i) != null) {
            animatorSet.cancel();
        }
        bVar.g = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        com.google.android.material.internal.a a2 = b.a(this, view, appBarLayout);
        a2.f = 250L;
        a2.c.add(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper$6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.setVisibility(0);
                b.this.g = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.stopOnLoadAnimation();
            }
        });
        AnimatorSet b = a2.b();
        ArrayList e = com.google.android.material.internal.e.e(this);
        if (getCenterView() != null) {
            e.remove(getCenterView());
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(e));
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(mj2.a);
        animatorSet2.playSequentially(b, ofFloat);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper$5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                b.this.i = null;
            }
        });
        Iterator it = bVar.c.iterator();
        while (it.hasNext()) {
            animatorSet2.addListener((AnimatorListenerAdapter) it.next());
        }
        if (z) {
            animatorSet2.setDuration(0L);
        }
        animatorSet2.start();
        bVar.i = animatorSet2;
        return true;
    }

    public boolean expand(final View view, final AppBarLayout appBarLayout, final boolean z) {
        AnimatorSet animatorSet;
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        final b bVar = this.searchBarAnimationHelper;
        if (bVar.g && (animatorSet = bVar.i) != null) {
            animatorSet.cancel();
        }
        bVar.f = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.google.android.material.search.a
            @Override // java.lang.Runnable
            public final void run() {
                final b bVar2 = b.this;
                bVar2.getClass();
                AnimatorSet animatorSet2 = new AnimatorSet();
                final SearchBar searchBar = this;
                ArrayList e = com.google.android.material.internal.e.e(searchBar);
                if (searchBar.getCenterView() != null) {
                    e.remove(searchBar.getCenterView());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(e));
                View view2 = view;
                ofFloat.addUpdateListener(new wd2(view2, 11));
                ofFloat.setDuration(75L);
                ofFloat.setInterpolator(mj2.a);
                com.google.android.material.internal.a a2 = b.a(searchBar, view2, appBarLayout);
                a2.f = 300L;
                a2.c.add(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper$4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        b.this.f = false;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        searchBar.setVisibility(4);
                    }
                });
                animatorSet2.playSequentially(ofFloat, a2.c());
                animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper$3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        b.this.i = null;
                    }
                });
                Iterator it = bVar2.b.iterator();
                while (it.hasNext()) {
                    animatorSet2.addListener((AnimatorListenerAdapter) it.next());
                }
                if (z) {
                    animatorSet2.setDuration(0L);
                }
                animatorSet2.start();
                bVar2.i = animatorSet2;
            }
        });
        return true;
    }

    public AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    public View getCenterView() {
        return this.centerView;
    }

    public float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        return materialShapeDrawable != null ? materialShapeDrawable.getElevation() : getElevation();
    }

    public float getCornerSize() {
        return this.backgroundShape.getTopLeftCornerResolvedSize();
    }

    public int getDefaultMarginVerticalResource() {
        return org0.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return cxg0.ic_search_black_24;
    }

    public int getEndSiblingViewId() {
        return this.endSiblingViewId;
    }

    public CharSequence getHint() {
        return this.textView.getHint();
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMenuResId() {
        return this.menuResId;
    }

    public TextView getPlaceholderTextView() {
        return this.placeholderTextView;
    }

    public int getStartSiblingViewId() {
        return this.startSiblingViewId;
    }

    public int getStrokeColor() {
        return this.backgroundShape.getStrokeColor().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.backgroundShape.getStrokeWidth();
    }

    public CharSequence getText() {
        return this.textView.getText();
    }

    public boolean getTextCentered() {
        return this.textCentered;
    }

    public TextView getTextView() {
        return this.textView;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i) {
        super.inflateMenu(i);
        this.menuResId = i;
    }

    public boolean isCollapsing() {
        return this.searchBarAnimationHelper.g;
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.defaultScrollFlagsEnabled;
    }

    public boolean isExpanding() {
        return this.searchBarAnimationHelper.f;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.searchBarAnimationHelper.h;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        eja1.B(this, this.backgroundShape);
        setDefaultMargins();
        setOrClearDefaultScrollFlags();
        if (this.liftOnScroll) {
            addLiftOnScrollProgressListener();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeLiftOnScrollProgressListener();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(isEmpty);
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.centerView;
        if (view != null) {
            layoutViewInCenter(view);
        }
        setHandwritingBoundsInsets();
        if (this.textView == null || !this.textCentered) {
            return;
        }
        layoutTextViewCenterAvoidToolbarViewsAndPadding();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i4 = this.maxWidth;
        if (i4 >= 0 && size > i4) {
            i = View.MeasureSpec.makeMeasureSpec(i4, mode);
        } else if (this.adaptiveMaxWidthEnabled && size > (i3 = this.adaptiveMaxWidthParentBreakpoint)) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max(i3, Math.round(size * 0.5f)), mode);
        }
        super.onMeasure(i, i2);
        measureCenterView(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.text = text == null ? null : text.toString();
        return savedState;
    }

    public boolean removeCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.c.remove(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.b.remove(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(a aVar) {
        return this.searchBarAnimationHelper.a.remove(aVar);
    }

    public void setCenterView(View view) {
        View view2 = this.centerView;
        if (view2 != null) {
            removeView(view2);
            this.centerView = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.defaultScrollFlagsEnabled = z;
        setOrClearDefaultScrollFlags();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    public void setEndSiblingViewId(int i) {
        this.endSiblingViewId = i;
    }

    public void setHint(CharSequence charSequence) {
        this.textView.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z) {
        this.liftOnScroll = z;
        if (z) {
            addLiftOnScrollProgressListener();
        } else {
            removeLiftOnScrollProgressListener();
        }
    }

    public void setMaxWidth(int i) {
        if (this.maxWidth != i) {
            this.maxWidth = i;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.forceDefaultNavigationOnClickListener) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.searchBarAnimationHelper.h = z;
    }

    public void setPlaceholderText(String str) {
        this.placeholderTextView.setText(str);
    }

    public void setStartSiblingViewId(int i) {
        this.startSiblingViewId = i;
    }

    public void setStrokeColor(int i) {
        if (getStrokeColor() != i) {
            this.backgroundShape.setStrokeColor(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() != f) {
            this.backgroundShape.setStrokeWidth(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
        this.placeholderTextView.setText(charSequence);
    }

    public void setTextCentered(boolean z) {
        this.textCentered = z;
        TextView textView = this.textView;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z) {
            layoutParams.gravity = 1;
            this.textView.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            this.textView.setGravity(0);
        }
        this.textView.setLayoutParams(layoutParams);
        this.placeholderTextView.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void startOnLoadAnimation() {
        post(new mmp0(2, this));
    }

    public void stopOnLoadAnimation() {
        b bVar = this.searchBarAnimationHelper;
        AnimatorSet animatorSet = bVar.d;
        if (animatorSet != null) {
            animatorSet.end();
        }
        AnimatorSet animatorSet2 = bVar.e;
        if (animatorSet2 != null) {
            animatorSet2.end();
        }
        View centerView = getCenterView();
        if (centerView != null) {
            centerView.setAlpha(0.0f);
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        public boolean z;

        public ScrollingViewBehavior() {
            this.z = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.e(coordinatorLayout, view, view2);
            if (!this.z && (view2 instanceof AppBarLayout)) {
                this.z = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setTouchscreenBlocksFocus(false);
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.z = false;
        }
    }

    public void setHint(int i) {
        this.textView.setHint(i);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchBar.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        String text;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.text);
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setText(int i) {
        this.textView.setText(i);
        this.placeholderTextView.setText(i);
    }

    public boolean expand(View view, AppBarLayout appBarLayout) {
        return expand(view, appBarLayout, false);
    }

    public boolean expand(View view) {
        return expand(view, null);
    }

    public boolean collapse(View view, AppBarLayout appBarLayout) {
        return collapse(view, appBarLayout, false);
    }

    public boolean collapse(View view) {
        return collapse(view, null);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.materialSearchBarStyle);
    }

    public SearchBar(Context context) {
        this(context, null);
    }
}
