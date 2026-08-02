package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat$Api21Impl;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.cot;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.h2i0;
import defpackage.hbc;
import defpackage.ibc;
import defpackage.im91;
import defpackage.ip2;
import defpackage.jx81;
import defpackage.kp50;
import defpackage.leh0;
import defpackage.mj2;
import defpackage.n751;
import defpackage.org0;
import defpackage.rxi;
import defpackage.ts31;
import defpackage.vez0;
import defpackage.yqn;
import defpackage.yvy0;
import defpackage.z2i0;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int COLLAPSED_TITLE_GRAVITY_AVAILABLE_SPACE = 1;
    private static final int COLLAPSED_TITLE_GRAVITY_ENTIRE_SPACE = 0;
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = g2i0.Widget_Design_CollapsingToolbar;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;
    private final int collapsedTitleGravityMode;
    final hbc collapsingSubtitleHelper;
    private boolean collapsingTitleEnabled;
    final hbc collapsingTitleHelper;
    private Drawable contentScrim;
    int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;
    final yqn elevationOverlayProvider;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    private int expandedTitleSpacing;
    private int extraHeightForTitles;
    private boolean extraMultilineHeightEnabled;
    private int extraMultilineSubtitleHeight;
    private int extraMultilineTitleHeight;
    private boolean forceApplySystemWindowInsetTop;
    n751 lastInsets;
    private ip2 onOffsetChangedListener;
    private boolean refreshToolbar;
    private int screenOrientation;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private final TimeInterpolator scrimAnimationFadeInInterpolator;
    private final TimeInterpolator scrimAnimationFadeOutInterpolator;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;
    Drawable statusBarScrim;
    private int titleCollapseMode;
    private final Rect tmpRect;
    private ViewGroup toolbar;
    private View toolbarDirectChild;
    private int toolbarId;
    private int topInsetApplied;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r4), attributeSet, i);
        ColorStateList o;
        ColorStateList o2;
        int i2 = DEF_STYLE_RES;
        this.refreshToolbar = true;
        this.tmpRect = new Rect();
        this.scrimVisibleHeightTrigger = -1;
        this.topInsetApplied = 0;
        this.extraMultilineTitleHeight = 0;
        this.extraMultilineSubtitleHeight = 0;
        this.extraHeightForTitles = 0;
        Context context2 = getContext();
        this.screenOrientation = getResources().getConfiguration().orientation;
        hbc hbcVar = new hbc(this);
        this.collapsingTitleHelper = hbcVar;
        DecelerateInterpolator decelerateInterpolator = mj2.e;
        hbcVar.X = decelerateInterpolator;
        hbcVar.l(false);
        hbcVar.K = false;
        this.elevationOverlayProvider = new yqn(context2);
        int[] iArr = z2i0.CollapsingToolbarLayout;
        yvy0.a(context2, attributeSet, i, i2);
        yvy0.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        int i3 = obtainStyledAttributes.getInt(z2i0.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        int i4 = obtainStyledAttributes.getInt(z2i0.CollapsingToolbarLayout_collapsedTitleGravity, NavigationBarView.ITEM_GRAVITY_START_CENTER);
        this.collapsedTitleGravityMode = obtainStyledAttributes.getInt(z2i0.CollapsingToolbarLayout_collapsedTitleGravityMode, 1);
        hbcVar.x(i3);
        hbcVar.s(i4);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(z2i0.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.expandedMarginBottom = dimensionPixelSize;
        this.expandedMarginEnd = dimensionPixelSize;
        this.expandedMarginTop = dimensionPixelSize;
        this.expandedMarginStart = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.expandedMarginStart = obtainStyledAttributes.getDimensionPixelSize(z2i0.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.expandedMarginEnd = obtainStyledAttributes.getDimensionPixelSize(z2i0.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.expandedMarginTop = obtainStyledAttributes.getDimensionPixelSize(z2i0.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.expandedMarginBottom = obtainStyledAttributes.getDimensionPixelSize(z2i0.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_expandedTitleSpacing)) {
            this.expandedTitleSpacing = obtainStyledAttributes.getDimensionPixelSize(z2i0.CollapsingToolbarLayout_expandedTitleSpacing, 0);
        }
        this.collapsingTitleEnabled = obtainStyledAttributes.getBoolean(z2i0.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(obtainStyledAttributes.getText(z2i0.CollapsingToolbarLayout_title));
        hbcVar.w(g2i0.TextAppearance_Design_CollapsingToolbar_Expanded);
        hbcVar.q(h2i0.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            hbcVar.w(obtainStyledAttributes.getResourceId(z2i0.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            hbcVar.q(obtainStyledAttributes.getResourceId(z2i0.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_titleTextEllipsize)) {
            setTitleEllipsize(convertEllipsizeToTruncateAt(obtainStyledAttributes.getInt(z2i0.CollapsingToolbarLayout_titleTextEllipsize, -1)));
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_expandedTitleTextColor) && hbcVar.o != (o2 = jx81.o(context2, obtainStyledAttributes, z2i0.CollapsingToolbarLayout_expandedTitleTextColor))) {
            hbcVar.o = o2;
            hbcVar.l(false);
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_collapsedTitleTextColor)) {
            hbcVar.r(jx81.o(context2, obtainStyledAttributes, z2i0.CollapsingToolbarLayout_collapsedTitleTextColor));
        }
        this.scrimVisibleHeightTrigger = obtainStyledAttributes.getDimensionPixelSize(z2i0.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_titleMaxLines)) {
            hbcVar.v(obtainStyledAttributes.getInt(z2i0.CollapsingToolbarLayout_titleMaxLines, 1));
        } else if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_maxLines)) {
            hbcVar.v(obtainStyledAttributes.getInt(z2i0.CollapsingToolbarLayout_maxLines, 1));
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_titlePositionInterpolator)) {
            hbcVar.W = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(z2i0.CollapsingToolbarLayout_titlePositionInterpolator, 0));
            hbcVar.l(false);
        }
        hbc hbcVar2 = new hbc(this);
        this.collapsingSubtitleHelper = hbcVar2;
        hbcVar2.X = decelerateInterpolator;
        hbcVar2.l(false);
        hbcVar2.K = false;
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_subtitle)) {
            setSubtitle(obtainStyledAttributes.getText(z2i0.CollapsingToolbarLayout_subtitle));
        }
        hbcVar2.x(i3);
        hbcVar2.s(i4);
        hbcVar2.w(h2i0.TextAppearance_AppCompat_Headline);
        hbcVar2.q(h2i0.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_expandedSubtitleTextAppearance)) {
            hbcVar2.w(obtainStyledAttributes.getResourceId(z2i0.CollapsingToolbarLayout_expandedSubtitleTextAppearance, 0));
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_collapsedSubtitleTextAppearance)) {
            hbcVar2.q(obtainStyledAttributes.getResourceId(z2i0.CollapsingToolbarLayout_collapsedSubtitleTextAppearance, 0));
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_expandedSubtitleTextColor) && hbcVar2.o != (o = jx81.o(context2, obtainStyledAttributes, z2i0.CollapsingToolbarLayout_expandedSubtitleTextColor))) {
            hbcVar2.o = o;
            hbcVar2.l(false);
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_collapsedSubtitleTextColor)) {
            hbcVar2.r(jx81.o(context2, obtainStyledAttributes, z2i0.CollapsingToolbarLayout_collapsedSubtitleTextColor));
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_subtitleMaxLines)) {
            hbcVar2.v(obtainStyledAttributes.getInt(z2i0.CollapsingToolbarLayout_subtitleMaxLines, 1));
        }
        if (obtainStyledAttributes.hasValue(z2i0.CollapsingToolbarLayout_titlePositionInterpolator)) {
            hbcVar2.W = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(z2i0.CollapsingToolbarLayout_titlePositionInterpolator, 0));
            hbcVar2.l(false);
        }
        this.scrimAnimationDuration = obtainStyledAttributes.getInt(z2i0.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.scrimAnimationFadeInInterpolator = kp50.P(context2, eng0.motionEasingStandardInterpolator, mj2.c);
        this.scrimAnimationFadeOutInterpolator = kp50.P(context2, eng0.motionEasingStandardInterpolator, mj2.d);
        setContentScrim(obtainStyledAttributes.getDrawable(z2i0.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(z2i0.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(obtainStyledAttributes.getInt(z2i0.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.toolbarId = obtainStyledAttributes.getResourceId(z2i0.CollapsingToolbarLayout_toolbarId, -1);
        this.forceApplySystemWindowInsetTop = obtainStyledAttributes.getBoolean(z2i0.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.extraMultilineHeightEnabled = obtainStyledAttributes.getBoolean(z2i0.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        cot cotVar = new cot(12, this);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(this, cotVar);
    }

    private void animateScrim(int i) {
        ensureToolbar();
        ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.scrimAnimator = valueAnimator2;
            valueAnimator2.setInterpolator(i > this.scrimAlpha ? this.scrimAnimationFadeInInterpolator : this.scrimAnimationFadeOutInterpolator);
            this.scrimAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.scrimAnimator.cancel();
        }
        this.scrimAnimator.setDuration(this.scrimAnimationDuration);
        this.scrimAnimator.setIntValues(this.scrimAlpha, i);
        this.scrimAnimator.start();
    }

    private TextUtils.TruncateAt convertEllipsizeToTruncateAt(int i) {
        return i != 0 ? i != 1 ? i != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    private void disableLiftOnScrollIfNeeded(AppBarLayout appBarLayout) {
        if (isTitleCollapseFadeMode()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void ensureToolbar() {
        if (this.refreshToolbar) {
            ViewGroup viewGroup = null;
            this.toolbar = null;
            this.toolbarDirectChild = null;
            int i = this.toolbarId;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.toolbar = viewGroup2;
                if (viewGroup2 != null) {
                    this.toolbarDirectChild = findDirectChild(viewGroup2);
                }
            }
            if (this.toolbar == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (isToolbar(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i2++;
                }
                this.toolbar = viewGroup;
            }
            updateDummyView();
            this.refreshToolbar = false;
        }
    }

    private View findDirectChild(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList z = vez0.z(eng0.colorSurfaceContainer, getContext());
        if (z != null) {
            return z.getDefaultColor();
        }
        float dimension = getResources().getDimension(org0.design_appbar_elevation);
        yqn yqnVar = this.elevationOverlayProvider;
        return yqnVar.a(dimension, yqnVar.d);
    }

    private static int getHeightWithMargins(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static CharSequence getToolbarSubtitle(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getSubtitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getSubtitle();
        }
        return null;
    }

    private static CharSequence getToolbarTitle(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    public static ts31 getViewOffsetHelper(View view) {
        ts31 ts31Var = (ts31) view.getTag(leh0.view_offset_helper);
        if (ts31Var != null) {
            return ts31Var;
        }
        ts31 ts31Var2 = new ts31(view);
        view.setTag(leh0.view_offset_helper, ts31Var2);
        return ts31Var2;
    }

    private boolean isTitleCollapseFadeMode() {
        return this.titleCollapseMode == 1;
    }

    private static boolean isToolbar(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean isToolbarChild(View view) {
        View view2 = this.toolbarDirectChild;
        return (view2 == null || view2 == this) ? view == this.toolbar : view == view2;
    }

    private void maybeSetPendingActionCollapsed() {
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (appBarLayout.getPendingAction() == 0) {
                appBarLayout.setPendingAction(2);
            }
        }
    }

    private void updateCollapsedBounds(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        View view = this.toolbarDirectChild;
        if (view == null) {
            view = this.toolbar;
        }
        int maxOffsetForPinChild = getMaxOffsetForPinChild(view);
        rxi.a(this, this.dummyView, this.tmpRect);
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i = toolbar.getTitleMarginStart();
            i3 = toolbar.getTitleMarginEnd();
            i4 = toolbar.getTitleMarginTop();
            i2 = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i = toolbar2.getTitleMarginStart();
            i3 = toolbar2.getTitleMarginEnd();
            i4 = toolbar2.getTitleMarginTop();
            i2 = toolbar2.getTitleMarginBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        Rect rect = this.tmpRect;
        int i5 = rect.left + (z ? i3 : i);
        int i6 = rect.right - (z ? i : i3);
        int i7 = rect.top + maxOffsetForPinChild + i4;
        int i8 = (rect.bottom + maxOffsetForPinChild) - i2;
        hbc hbcVar = this.collapsingSubtitleHelper;
        TextPaint textPaint = hbcVar.V;
        textPaint.setTextSize(hbcVar.n);
        textPaint.setTypeface(hbcVar.x);
        textPaint.setLetterSpacing(hbcVar.g0);
        int descent = (int) (i8 - (textPaint.descent() + (-textPaint.ascent())));
        hbc hbcVar2 = this.collapsingTitleHelper;
        TextPaint textPaint2 = hbcVar2.V;
        textPaint2.setTextSize(hbcVar2.n);
        textPaint2.setTypeface(hbcVar2.x);
        textPaint2.setLetterSpacing(hbcVar2.g0);
        int descent2 = (int) (textPaint2.descent() + (-textPaint2.ascent()) + i7);
        boolean isEmpty = TextUtils.isEmpty(this.collapsingSubtitleHelper.H);
        hbc hbcVar3 = this.collapsingTitleHelper;
        if (isEmpty) {
            hbcVar3.o(i5, i7, i6, i8);
        } else {
            hbcVar3.o(i5, i7, i6, descent);
            this.collapsingSubtitleHelper.o(i5, descent2, i6, i8);
        }
        if (this.collapsedTitleGravityMode == 0) {
            rxi.a(this, this, this.tmpRect);
            Rect rect2 = this.tmpRect;
            int i9 = rect2.left + (z ? i3 : i);
            int i10 = rect2.right;
            if (!z) {
                i = i3;
            }
            int i11 = i10 - i;
            boolean isEmpty2 = TextUtils.isEmpty(this.collapsingSubtitleHelper.H);
            hbc hbcVar4 = this.collapsingTitleHelper;
            if (isEmpty2) {
                hbcVar4.p(i9, i7, i11, i8);
            } else {
                hbcVar4.p(i9, i7, i11, descent);
                this.collapsingSubtitleHelper.p(i9, descent2, i11, i8);
            }
        }
    }

    private void updateContentDescriptionFromTitle() {
        setContentDescription(getTitle());
    }

    private void updateContentScrimBounds(Drawable drawable, View view, int i, int i2) {
        if (isTitleCollapseFadeMode() && view != null && this.collapsingTitleEnabled) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private void updateDummyView() {
        View view;
        if (!this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.dummyView);
            }
        }
        if (!this.collapsingTitleEnabled || this.toolbar == null) {
            return;
        }
        if (this.dummyView == null) {
            this.dummyView = new View(getContext());
        }
        if (this.dummyView.getParent() == null) {
            this.toolbar.addView(this.dummyView, -1, -1);
        }
    }

    private void updateTextBounds(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (!this.collapsingTitleEnabled || (view = this.dummyView) == null) {
            return;
        }
        boolean z2 = view.isAttachedToWindow() && this.dummyView.getVisibility() == 0;
        this.drawCollapsingTitle = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            updateCollapsedBounds(z3);
            int i5 = z3 ? this.expandedMarginEnd : this.expandedMarginStart;
            int i6 = this.tmpRect.top + this.expandedMarginTop;
            int i7 = (i3 - i) - (z3 ? this.expandedMarginStart : this.expandedMarginEnd);
            int i8 = (i4 - i2) - this.expandedMarginBottom;
            boolean isEmpty = TextUtils.isEmpty(this.collapsingSubtitleHelper.H);
            hbc hbcVar = this.collapsingTitleHelper;
            if (isEmpty) {
                hbcVar.u(i5, i6, i7, i8, true);
                this.collapsingTitleHelper.l(z);
            } else {
                hbcVar.u(i5, i6, i7, (int) ((i8 - (this.collapsingSubtitleHelper.i() + this.extraMultilineSubtitleHeight)) - this.expandedTitleSpacing), false);
                this.collapsingSubtitleHelper.u(i5, (int) (this.collapsingTitleHelper.i() + this.extraMultilineTitleHeight + i6 + this.expandedTitleSpacing), i7, i8, false);
                this.collapsingTitleHelper.l(z);
                this.collapsingSubtitleHelper.l(z);
            }
        }
    }

    private void updateTitleFromToolbarIfNeeded() {
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup == null || !this.collapsingTitleEnabled) {
            return;
        }
        CharSequence toolbarTitle = getToolbarTitle(viewGroup);
        if (TextUtils.isEmpty(this.collapsingTitleHelper.H) && !TextUtils.isEmpty(toolbarTitle)) {
            setTitle(toolbarTitle);
        }
        CharSequence toolbarSubtitle = getToolbarSubtitle(this.toolbar);
        if (!TextUtils.isEmpty(this.collapsingSubtitleHelper.H) || TextUtils.isEmpty(toolbarSubtitle)) {
            return;
        }
        setSubtitle(toolbarSubtitle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        ensureToolbar();
        if (this.toolbar == null && (drawable = this.contentScrim) != null && this.scrimAlpha > 0) {
            drawable.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
        }
        if (this.collapsingTitleEnabled && this.drawCollapsingTitle) {
            if (this.toolbar != null && this.contentScrim != null && this.scrimAlpha > 0 && isTitleCollapseFadeMode()) {
                hbc hbcVar = this.collapsingTitleHelper;
                if (hbcVar.b < hbcVar.e) {
                    int save = canvas.save();
                    canvas.clipRect(this.contentScrim.getBounds(), Region.Op.DIFFERENCE);
                    this.collapsingTitleHelper.f(canvas);
                    this.collapsingSubtitleHelper.f(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.collapsingTitleHelper.f(canvas);
            this.collapsingSubtitleHelper.f(canvas);
        }
        if (this.statusBarScrim == null || this.scrimAlpha <= 0) {
            return;
        }
        n751 n751Var = this.lastInsets;
        int d = n751Var != null ? n751Var.d() : 0;
        if (d > 0) {
            this.statusBarScrim.setBounds(0, -this.currentOffset, getWidth(), d - this.currentOffset);
            this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
            this.statusBarScrim.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.contentScrim == null || this.scrimAlpha <= 0 || !isToolbarChild(view)) {
            z = false;
        } else {
            updateContentScrimBounds(this.contentScrim, view, getWidth(), getHeight());
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarScrim;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        hbc hbcVar = this.collapsingTitleHelper;
        if (hbcVar != null) {
            hbcVar.S = drawableState;
            ColorStateList colorStateList2 = hbcVar.p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = hbcVar.o) != null && colorStateList.isStateful())) {
                hbcVar.l(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public float getCollapsedSubtitleTextSize() {
        return this.collapsingSubtitleHelper.n;
    }

    public Typeface getCollapsedSubtitleTypeface() {
        Typeface typeface = this.collapsingSubtitleHelper.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTitleHelper.l;
    }

    public float getCollapsedTitleTextSize() {
        return this.collapsingTitleHelper.n;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.collapsingTitleHelper.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public float getExpandedSubtitleTextSize() {
        return this.collapsingSubtitleHelper.m;
    }

    public Typeface getExpandedSubtitleTypeface() {
        Typeface typeface = this.collapsingSubtitleHelper.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTitleHelper.k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    public int getExpandedTitleSpacing() {
        return this.expandedTitleSpacing;
    }

    public float getExpandedTitleTextSize() {
        return this.collapsingTitleHelper.m;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.collapsingTitleHelper.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.collapsingTitleHelper.s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.collapsingTitleHelper.j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.collapsingTitleHelper.j0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.collapsingTitleHelper.j0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.collapsingTitleHelper.o0;
    }

    public final int getMaxOffsetForPinChild(View view) {
        return ((getHeight() - getViewOffsetHelper(view).b) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.scrimVisibleHeightTrigger;
        if (i >= 0) {
            return i + this.topInsetApplied + this.extraMultilineTitleHeight + this.extraMultilineSubtitleHeight + this.extraHeightForTitles;
        }
        n751 n751Var = this.lastInsets;
        int d = n751Var != null ? n751Var.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + d, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    public CharSequence getSubtitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingSubtitleHelper.H;
        }
        return null;
    }

    public CharSequence getTitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingTitleHelper.H;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.titleCollapseMode;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.collapsingTitleHelper.W;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.collapsingTitleHelper.G;
    }

    public boolean isExtraMultilineHeightEnabled() {
        return this.extraMultilineHeightEnabled;
    }

    public boolean isForceApplySystemWindowInsetTop() {
        return this.forceApplySystemWindowInsetTop;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.collapsingTitleHelper.K;
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            disableLiftOnScrollIfNeeded(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new b(this);
            }
            appBarLayout.addOnOffsetChangedListener(this.onOffsetChangedListener);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTitleHelper.k(configuration);
        if (this.screenOrientation != configuration.orientation && this.extraMultilineHeightEnabled && this.collapsingTitleHelper.b == 1.0f) {
            maybeSetPendingActionCollapsed();
        }
        this.screenOrientation = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        ip2 ip2Var = this.onOffsetChangedListener;
        if (ip2Var != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(ip2Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n751 n751Var = this.lastInsets;
        if (n751Var != null) {
            int d = n751Var.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < d) {
                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                    childAt.offsetTopAndBottom(d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            ts31 viewOffsetHelper = getViewOffsetHelper(getChildAt(i6));
            View view = viewOffsetHelper.a;
            viewOffsetHelper.b = view.getTop();
            viewOffsetHelper.c = view.getLeft();
        }
        updateTextBounds(i, i2, i3, i4, false);
        updateTitleFromToolbarIfNeeded();
        updateScrimVisibility();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            getViewOffsetHelper(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        ensureToolbar();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        n751 n751Var = this.lastInsets;
        int d = n751Var != null ? n751Var.d() : 0;
        if ((mode == 0 || this.forceApplySystemWindowInsetTop) && d > 0) {
            this.topInsetApplied = d;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d, 1073741824));
        }
        updateTitleFromToolbarIfNeeded();
        if (!this.collapsingTitleEnabled || TextUtils.isEmpty(this.collapsingTitleHelper.H)) {
            collapsingToolbarLayout = this;
        } else {
            int measuredHeight = getMeasuredHeight();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.updateTextBounds(0, 0, getMeasuredWidth(), measuredHeight, true);
            int i3 = (int) (collapsingToolbarLayout.collapsingTitleHelper.i() + collapsingToolbarLayout.topInsetApplied + collapsingToolbarLayout.expandedMarginTop + (TextUtils.isEmpty(collapsingToolbarLayout.collapsingSubtitleHelper.H) ? 0.0f : collapsingToolbarLayout.expandedTitleSpacing + collapsingToolbarLayout.collapsingSubtitleHelper.i()) + collapsingToolbarLayout.expandedMarginBottom);
            if (i3 > measuredHeight) {
                collapsingToolbarLayout.extraHeightForTitles = i3 - measuredHeight;
            } else {
                collapsingToolbarLayout.extraHeightForTitles = 0;
            }
            if (collapsingToolbarLayout.extraMultilineHeightEnabled) {
                hbc hbcVar = collapsingToolbarLayout.collapsingTitleHelper;
                if (hbcVar.o0 > 1) {
                    int i4 = hbcVar.q;
                    if (i4 > 1) {
                        collapsingToolbarLayout.extraMultilineTitleHeight = (i4 - 1) * Math.round(hbcVar.i());
                    } else {
                        collapsingToolbarLayout.extraMultilineTitleHeight = 0;
                    }
                }
                hbc hbcVar2 = collapsingToolbarLayout.collapsingSubtitleHelper;
                if (hbcVar2.o0 > 1) {
                    int i5 = hbcVar2.q;
                    if (i5 > 1) {
                        collapsingToolbarLayout.extraMultilineSubtitleHeight = (i5 - 1) * Math.round(hbcVar2.i());
                    } else {
                        collapsingToolbarLayout.extraMultilineSubtitleHeight = 0;
                    }
                }
            }
            int i6 = collapsingToolbarLayout.extraHeightForTitles;
            int i7 = collapsingToolbarLayout.extraMultilineTitleHeight;
            int i8 = collapsingToolbarLayout.extraMultilineSubtitleHeight;
            if (i6 + i7 + i8 > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight + i6 + i7 + i8, 1073741824));
            }
        }
        ViewGroup viewGroup = collapsingToolbarLayout.toolbar;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.toolbarDirectChild;
            if (view == null || view == collapsingToolbarLayout) {
                collapsingToolbarLayout.setMinimumHeight(getHeightWithMargins(viewGroup));
            } else {
                collapsingToolbarLayout.setMinimumHeight(getHeightWithMargins(view));
            }
        }
        if (collapsingToolbarLayout.extraMultilineHeightEnabled) {
            hbc hbcVar3 = collapsingToolbarLayout.collapsingTitleHelper;
            if (hbcVar3.o0 <= 1 || hbcVar3.b != 1.0f) {
                return;
            }
            collapsingToolbarLayout.maybeSetPendingActionCollapsed();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.contentScrim;
        if (drawable != null) {
            updateContentScrimBounds(drawable, i, i2);
        }
    }

    public n751 onWindowInsetChanged(n751 n751Var) {
        n751 n751Var2 = getFitsSystemWindows() ? n751Var : null;
        if (!Objects.equals(this.lastInsets, n751Var2)) {
            this.lastInsets = n751Var2;
            requestLayout();
        }
        return n751Var.a.c();
    }

    public void setCollapsedSubtitleTextAppearance(int i) {
        this.collapsingSubtitleHelper.q(i);
    }

    public void setCollapsedSubtitleTextColor(int i) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedSubtitleTextSize(float f) {
        hbc hbcVar = this.collapsingSubtitleHelper;
        if (hbcVar.n != f) {
            hbcVar.n = f;
            hbcVar.l(false);
        }
    }

    public void setCollapsedSubtitleTypeface(Typeface typeface) {
        hbc hbcVar = this.collapsingSubtitleHelper;
        if (hbcVar.t(typeface)) {
            hbcVar.l(false);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.collapsingTitleHelper.s(i);
        this.collapsingSubtitleHelper.s(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.collapsingTitleHelper.q(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        hbc hbcVar = this.collapsingTitleHelper;
        if (hbcVar.n != f) {
            hbcVar.n = f;
            hbcVar.l(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        hbc hbcVar = this.collapsingTitleHelper;
        if (hbcVar.t(typeface)) {
            hbcVar.l(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.contentScrim = mutate;
            if (mutate != null) {
                updateContentScrimBounds(mutate, getWidth(), getHeight());
                this.contentScrim.setCallback(this);
                this.contentScrim.setAlpha(this.scrimAlpha);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedSubtitleColor(int i) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedSubtitleTextAppearance(int i) {
        this.collapsingSubtitleHelper.w(i);
    }

    public void setExpandedSubtitleTextColor(ColorStateList colorStateList) {
        hbc hbcVar = this.collapsingSubtitleHelper;
        if (hbcVar.o != colorStateList) {
            hbcVar.o = colorStateList;
            hbcVar.l(false);
        }
    }

    public void setExpandedSubtitleTextSize(float f) {
        this.collapsingSubtitleHelper.y(f);
    }

    public void setExpandedSubtitleTypeface(Typeface typeface) {
        hbc hbcVar = this.collapsingSubtitleHelper;
        if (hbcVar.z(typeface)) {
            hbcVar.l(false);
        }
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.collapsingTitleHelper.x(i);
        this.collapsingSubtitleHelper.x(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.expandedMarginStart = i;
        this.expandedMarginTop = i2;
        this.expandedMarginEnd = i3;
        this.expandedMarginBottom = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.expandedMarginBottom = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.expandedMarginEnd = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.expandedMarginStart = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.expandedMarginTop = i;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i) {
        this.expandedTitleSpacing = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.collapsingTitleHelper.w(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        hbc hbcVar = this.collapsingTitleHelper;
        if (hbcVar.o != colorStateList) {
            hbcVar.o = colorStateList;
            hbcVar.l(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        this.collapsingTitleHelper.y(f);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        hbc hbcVar = this.collapsingTitleHelper;
        if (hbcVar.z(typeface)) {
            hbcVar.l(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.extraMultilineHeightEnabled = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.forceApplySystemWindowInsetTop = z;
    }

    public void setHyphenationFrequency(int i) {
        this.collapsingTitleHelper.s0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.collapsingTitleHelper.q0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.collapsingTitleHelper.r0 = f;
    }

    public void setMaxLines(int i) {
        this.collapsingTitleHelper.v(i);
        this.collapsingSubtitleHelper.v(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.collapsingTitleHelper.K = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.scrimAlpha) {
            if (this.contentScrim != null && (viewGroup = this.toolbar) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.scrimAlpha = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.scrimAnimationDuration = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.scrimVisibleHeightTrigger != i) {
            this.scrimVisibleHeightTrigger = i;
            updateScrimVisibility();
        }
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.scrimsAreShown != z) {
            if (z2) {
                animateScrim(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.scrimsAreShown = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(ibc ibcVar) {
        hbc hbcVar = this.collapsingTitleHelper;
        hbcVar.getClass();
        if (ibcVar != null) {
            hbcVar.l(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.statusBarScrim = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.statusBarScrim.setState(getDrawableState());
                }
                im91.i(this.statusBarScrim, getLayoutDirection());
                this.statusBarScrim.setVisible(getVisibility() == 0, false);
                this.statusBarScrim.setCallback(this);
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.collapsingSubtitleHelper.B(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.collapsingTitleHelper.B(charSequence);
        updateContentDescriptionFromTitle();
    }

    public void setTitleCollapseMode(int i) {
        this.titleCollapseMode = i;
        boolean isTitleCollapseFadeMode = isTitleCollapseFadeMode();
        this.collapsingTitleHelper.c = isTitleCollapseFadeMode;
        this.collapsingSubtitleHelper.c = isTitleCollapseFadeMode;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            disableLiftOnScrollIfNeeded((AppBarLayout) parent);
        }
        if (isTitleCollapseFadeMode && this.contentScrim == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        hbc hbcVar = this.collapsingTitleHelper;
        hbcVar.G = truncateAt;
        hbcVar.l(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = z;
            updateContentDescriptionFromTitle();
            updateDummyView();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        hbc hbcVar = this.collapsingTitleHelper;
        hbcVar.W = timeInterpolator;
        hbcVar.l(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.statusBarScrim;
        if (drawable != null && drawable.isVisible() != z) {
            this.statusBarScrim.setVisible(z, false);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.contentScrim.setVisible(z, false);
    }

    public final void updateScrimVisibility() {
        if (this.contentScrim == null && this.statusBarScrim == null) {
            return;
        }
        setScrimsShown(getHeight() + this.currentOffset < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.contentScrim || drawable == this.statusBarScrim;
    }

    public void setCollapsedSubtitleTextColor(ColorStateList colorStateList) {
        this.collapsingSubtitleHelper.r(colorStateList);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.collapsingTitleHelper.r(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    private void updateContentScrimBounds(Drawable drawable, int i, int i2) {
        updateContentScrimBounds(drawable, this.toolbar, i, i2);
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, isLaidOut() && !isInEditMode());
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        int collapseMode;
        float parallaxMult;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.CollapsingToolbarLayout_Layout);
            this.collapseMode = obtainStyledAttributes.getInt(z2i0.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(obtainStyledAttributes.getFloat(z2i0.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }

        public void setCollapseMode(int i) {
            this.collapseMode = i;
        }

        public void setParallaxMultiplier(float f) {
            this.parallaxMult = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2, i3);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            this.collapseMode = layoutParams.collapseMode;
            this.parallaxMult = layoutParams.parallaxMult;
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.collapsingToolbarLayoutStyle);
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }
}
