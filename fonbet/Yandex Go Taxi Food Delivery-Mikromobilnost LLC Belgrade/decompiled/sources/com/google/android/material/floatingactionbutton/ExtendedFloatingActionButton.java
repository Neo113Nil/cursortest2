package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import defpackage.ab30;
import defpackage.dk2;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.jdj;
import defpackage.jln;
import defpackage.mum;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rxi;
import defpackage.vwo;
import defpackage.yvy0;
import defpackage.z2i0;
import defpackage.zrm;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements androidx.coordinatorlayout.widget.a {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int DEF_STYLE_RES = g2i0.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    private static final int EXTEND = 3;
    private static final int EXTEND_STRATEGY_AUTO = 0;
    private static final int EXTEND_STRATEGY_MATCH_PARENT = 2;
    private static final int EXTEND_STRATEGY_WRAP_CONTENT = 1;
    static final Property<View, Float> HEIGHT;
    private static final int HIDE = 1;
    static final Property<View, Float> PADDING_END;
    static final Property<View, Float> PADDING_START;
    private static final int SHOW = 0;
    private static final int SHRINK = 2;
    static final Property<View, Float> WIDTH;
    private int animState;
    private boolean animateShowBeforeLayout;
    private boolean animationEnabled;
    private final CoordinatorLayout.a behavior;
    private final dk2 changeVisibilityTracker;
    private int collapsedSize;
    private final g extendStrategy;
    private final int extendStrategyType;
    private int extendedPaddingEnd;
    private int extendedPaddingStart;
    private final g hideStrategy;
    private boolean isExtended;
    private boolean isTransforming;
    private int originalHeight;
    protected ColorStateList originalTextCsl;
    private int originalWidth;
    private final g showStrategy;
    private final g shrinkStrategy;

    public static abstract class a {
    }

    static {
        Class<Float> cls = Float.class;
        WIDTH = new Property<View, Float>(cls, "width") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.6
            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(view.getLayoutParams().width);
            }

            @Override // android.util.Property
            public void set(View view, Float f) {
                view.getLayoutParams().width = f.intValue();
                view.requestLayout();
            }
        };
        HEIGHT = new Property<View, Float>(cls, "height") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.7
            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(view.getLayoutParams().height);
            }

            @Override // android.util.Property
            public void set(View view, Float f) {
                view.getLayoutParams().height = f.intValue();
                view.requestLayout();
            }
        };
        PADDING_START = new Property<View, Float>(cls, "paddingStart") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.8
            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(view.getPaddingStart());
            }

            @Override // android.util.Property
            public void set(View view, Float f) {
                view.setPaddingRelative(f.intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
            }
        };
        PADDING_END = new Property<View, Float>(cls, "paddingEnd") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.9
            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(view.getPaddingEnd());
            }

            @Override // android.util.Property
            public void set(View view, Float f) {
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r5), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.animState = 0;
        this.animationEnabled = true;
        dk2 dk2Var = new dk2();
        this.changeVisibilityTracker = dk2Var;
        d dVar = new d(this, dk2Var);
        this.showStrategy = dVar;
        c cVar = new c(this, dk2Var);
        this.hideStrategy = cVar;
        this.isExtended = true;
        this.isTransforming = false;
        this.animateShowBeforeLayout = false;
        Context context2 = getContext();
        this.behavior = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray d = yvy0.d(context2, attributeSet, z2i0.ExtendedFloatingActionButton, i, i2, new int[0]);
        ab30 a2 = ab30.a(context2, d, z2i0.ExtendedFloatingActionButton_showMotionSpec);
        ab30 a3 = ab30.a(context2, d, z2i0.ExtendedFloatingActionButton_hideMotionSpec);
        ab30 a4 = ab30.a(context2, d, z2i0.ExtendedFloatingActionButton_extendMotionSpec);
        ab30 a5 = ab30.a(context2, d, z2i0.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.collapsedSize = d.getDimensionPixelSize(z2i0.ExtendedFloatingActionButton_collapsedSize, -1);
        int i3 = d.getInt(z2i0.ExtendedFloatingActionButton_extendStrategy, 1);
        this.extendStrategyType = i3;
        this.extendedPaddingStart = getPaddingStart();
        this.extendedPaddingEnd = getPaddingEnd();
        dk2 dk2Var2 = new dk2();
        b bVar = new b(this, dk2Var2, getSizeFromExtendStrategyType(i3), true);
        this.extendStrategy = bVar;
        b bVar2 = new b(this, dk2Var2, new jln(13, this), false);
        this.shrinkStrategy = bVar2;
        dVar.f = a2;
        cVar.f = a3;
        bVar.f = a4;
        bVar2.f = a5;
        d.recycle();
        setShapeAppearanceModel(com.google.android.material.shape.b.h(context2, attributeSet, i, i2, com.google.android.material.shape.b.m).a());
        saveOriginalTextCsl();
    }

    private vwo getSizeFromExtendStrategyType(int i) {
        mum mumVar = new mum(this);
        zrm zrmVar = new zrm(this, mumVar);
        return i != 1 ? i != 2 ? new jdj(this, zrmVar, mumVar, false, 21) : zrmVar : mumVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOrWillBeHidden() {
        int visibility = getVisibility();
        int i = this.animState;
        return visibility == 0 ? i == 1 : i != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOrWillBeShown() {
        int visibility = getVisibility();
        int i = this.animState;
        return visibility != 0 ? i == 2 : i != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performMotion(int i, final a aVar) {
        final g gVar;
        if (i == 0) {
            gVar = this.showStrategy;
        } else if (i == 1) {
            gVar = this.hideStrategy;
        } else if (i == 2) {
            gVar = this.shrinkStrategy;
        } else {
            if (i != 3) {
                ny61.r(oyr.i(i, "Unknown strategy type: "));
                return;
            }
            gVar = this.extendStrategy;
        }
        if (gVar.b()) {
            return;
        }
        if (!shouldAnimateVisibilityChange()) {
            gVar.e();
            return;
        }
        if (i == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.originalWidth = layoutParams.width;
                this.originalHeight = layoutParams.height;
            } else {
                this.originalWidth = getWidth();
                this.originalHeight = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet d = gVar.d();
        d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.cancelled = true;
                gVar.f();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                gVar.a();
                if (this.cancelled) {
                    return;
                }
                gVar.getClass();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                gVar.onAnimationStart(animator);
                this.cancelled = false;
            }
        });
        Iterator it = ((com.google.android.material.floatingactionbutton.a) gVar).c.iterator();
        while (it.hasNext()) {
            d.addListener((Animator.AnimatorListener) it.next());
        }
        d.start();
    }

    private void saveOriginalTextCsl() {
        this.originalTextCsl = getTextColors();
    }

    private boolean shouldAnimateVisibilityChange() {
        if (this.animationEnabled) {
            return (isLaidOut() || (!isOrWillBeShown() && this.animateShowBeforeLayout)) && !isInEditMode();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTooltip() {
        CharSequence charSequence;
        if (this.isExtended || !isClickable()) {
            charSequence = null;
        } else {
            charSequence = getText();
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = getContentDescription();
            }
        }
        if (TextUtils.equals(getTooltipText(), charSequence)) {
            return;
        }
        setTooltipText(charSequence);
    }

    public void addOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.extendStrategy).c.add(animatorListener);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.hideStrategy).c.add(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.showStrategy).c.add(animatorListener);
    }

    public void addOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.shrinkStrategy).c.add(animatorListener);
    }

    public void extend() {
        performMotion(3, null);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.a getBehavior() {
        return this.behavior;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.collapsedSize;
        if (i >= 0) {
            return i;
        }
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public int getCurrentOriginalTextColor() {
        return this.originalTextCsl.getColorForState(getDrawableState(), 0);
    }

    public ab30 getExtendMotionSpec() {
        return ((com.google.android.material.floatingactionbutton.a) this.extendStrategy).f;
    }

    public ab30 getHideMotionSpec() {
        return ((com.google.android.material.floatingactionbutton.a) this.hideStrategy).f;
    }

    public ColorStateList getOriginalTextColor() {
        return this.originalTextCsl;
    }

    public ab30 getShowMotionSpec() {
        return ((com.google.android.material.floatingactionbutton.a) this.showStrategy).f;
    }

    public ab30 getShrinkMotionSpec() {
        return ((com.google.android.material.floatingactionbutton.a) this.shrinkStrategy).f;
    }

    public void hide() {
        performMotion(1, null);
    }

    public boolean isAnimationEnabled() {
        return this.animationEnabled;
    }

    public final boolean isExtended() {
        return this.isExtended;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.isExtended || !TextUtils.isEmpty(getText()) || getIcon() == null) {
            updateTooltip();
        } else {
            this.isExtended = false;
            this.shrinkStrategy.e();
        }
    }

    public void removeOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.extendStrategy).c.remove(animatorListener);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.hideStrategy).c.remove(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.showStrategy).c.remove(animatorListener);
    }

    public void removeOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.shrinkStrategy).c.remove(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.animateShowBeforeLayout = z;
    }

    public void setAnimationEnabled(boolean z) {
        this.animationEnabled = z;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        updateTooltip();
    }

    public void setCollapsedSize(int i) {
        this.collapsedSize = i;
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        updateTooltip();
    }

    public void setExtendMotionSpec(ab30 ab30Var) {
        ((com.google.android.material.floatingactionbutton.a) this.extendStrategy).f = ab30Var;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(ab30.b(i, getContext()));
    }

    public void setExtended(boolean z) {
        if (this.isExtended == z) {
            return;
        }
        g gVar = z ? this.extendStrategy : this.shrinkStrategy;
        if (gVar.b()) {
            return;
        }
        gVar.e();
    }

    public void setHideMotionSpec(ab30 ab30Var) {
        ((com.google.android.material.floatingactionbutton.a) this.hideStrategy).f = ab30Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(ab30.b(i, getContext()));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = getPaddingStart();
        this.extendedPaddingEnd = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = i;
        this.extendedPaddingEnd = i3;
    }

    public void setShowMotionSpec(ab30 ab30Var) {
        ((com.google.android.material.floatingactionbutton.a) this.showStrategy).f = ab30Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(ab30.b(i, getContext()));
    }

    public void setShrinkMotionSpec(ab30 ab30Var) {
        ((com.google.android.material.floatingactionbutton.a) this.shrinkStrategy).f = ab30Var;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(ab30.b(i, getContext()));
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        updateTooltip();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        saveOriginalTextCsl();
    }

    public void show() {
        performMotion(0, null);
    }

    public void shrink() {
        performMotion(2, null);
    }

    public void silentlyUpdateTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public void extend(a aVar) {
        performMotion(3, aVar);
    }

    public void hide(a aVar) {
        performMotion(1, aVar);
    }

    public void show(a aVar) {
        performMotion(0, aVar);
    }

    public void shrink(a aVar) {
        performMotion(2, aVar);
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        saveOriginalTextCsl();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.a {
        public Rect a;
        public final boolean b;
        public final boolean c;

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.ExtendedFloatingActionButton_Behavior_Layout);
            this.b = obtainStyledAttributes.getBoolean(z2i0.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.c = obtainStyledAttributes.getBoolean(z2i0.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final /* bridge */ /* synthetic */ boolean a(View view, Rect rect) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final void d(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                u(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) {
                    v(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = dependencies.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) && v(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (u(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if ((!z && !z2) || layoutParams.getAnchorId() != appBarLayout.getId()) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            rxi.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                extendedFloatingActionButton.performMotion(z2 ? 2 : 1, null);
            } else {
                extendedFloatingActionButton.performMotion(z2 ? 3 : 0, null);
            }
            return true;
        }

        public final boolean v(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if ((!z && !z2) || layoutParams.getAnchorId() != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                extendedFloatingActionButton.performMotion(z2 ? 2 : 1, null);
            } else {
                extendedFloatingActionButton.performMotion(z2 ? 3 : 0, null);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }
}
