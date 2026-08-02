package com.google.android.material.listitem;

import android.R;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.customview.widget.a;
import com.google.android.material.listitem.ListItemLayout;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.gyw0;
import defpackage.hsy;
import defpackage.mj2;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.p2k0;
import defpackage.ph;
import defpackage.r52;
import defpackage.w511;
import defpackage.wh;
import defpackage.xeb1;

/* loaded from: classes11.dex */
public class ListItemLayout extends FrameLayout {
    private static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    public static final int POSITION_FIRST = 0;
    public static final int POSITION_LAST = 2;
    public static final int POSITION_MIDDLE = 1;
    public static final int POSITION_SINGLE = 3;
    private static final int SETTLING_DURATION = 350;
    private p2k0 activeSwipeToRevealLayout;
    private View contentView;
    private GestureDetector gestureDetector;
    private int lastStableSwipeState;
    private boolean originalClipToPadding;
    private int originalContentViewLeft;
    private int[] positionState;
    private int revealViewOffset;
    private final hsy stateSettlingTracker;
    private View.AccessibilityDelegate swipeAccessibilityDelegate;
    private int swipeState;
    private View swipeToRevealLayoutLeft;
    private View swipeToRevealLayoutRight;
    private a viewDragHelper;
    private static final int[] FIRST_STATE_SET = {R.attr.state_first};
    private static final int[] MIDDLE_STATE_SET = {R.attr.state_middle};
    private static final int[] LAST_STATE_SET = {R.attr.state_last};
    private static final int[] SINGLE_STATE_SET = {R.attr.state_single};
    private static final TimeInterpolator CUBIC_BEZIER_INTERPOLATOR = new PathInterpolator(0.42f, 1.67f, 0.21f, 0.9f);

    public ListItemLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(g810.b(context, attributeSet, i, i2), attributeSet, i);
        this.swipeState = 3;
        this.lastStableSwipeState = 3;
        this.stateSettlingTracker = new hsy(this);
        getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends View & p2k0> T castToView(p2k0 p2k0Var) {
        return (T) ((View) p2k0Var);
    }

    private GestureDetector createGestureDetector() {
        return new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.listitem.ListItemLayout.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (ListItemLayout.this.getParent() == null) {
                    return false;
                }
                ListItemLayout.this.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
    }

    private View.AccessibilityDelegate createSwipeAccessibilityDelegate() {
        return new View.AccessibilityDelegate() { // from class: com.google.android.material.listitem.ListItemLayout.3
            private void addSwipeAccessibilityActions(View view, wh whVar) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (shouldAddAccessibilityAction(childAt)) {
                            whVar.b(new ph(getAccessibilityActionId(childAt), childAt.getContentDescription()));
                        }
                    }
                }
            }

            private int getAccessibilityActionId(View view) {
                return view.getId();
            }

            private boolean performRevealViewAction(View view, int i) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (getAccessibilityActionId(childAt) == i) {
                            return childAt.performClick();
                        }
                    }
                }
                return false;
            }

            private boolean shouldAddAccessibilityAction(View view) {
                return view.isClickable() && view.getContentDescription() != null && view.isEnabled() && view.getVisibility() == 0;
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                wh whVar = new wh(accessibilityNodeInfo);
                addSwipeAccessibilityActions(ListItemLayout.this.swipeToRevealLayoutLeft, whVar);
                addSwipeAccessibilityActions(ListItemLayout.this.swipeToRevealLayoutRight, whVar);
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                if (performRevealViewAction(ListItemLayout.this.swipeToRevealLayoutLeft, i) || performRevealViewAction(ListItemLayout.this.swipeToRevealLayoutRight, i)) {
                    return true;
                }
                return super.performAccessibilityAction(view, i, bundle);
            }
        };
    }

    private a createViewDragHelper() {
        return new a(getContext(), this, new r52(2, this));
    }

    private boolean ensureSwipeToRevealSetupIfNeeded() {
        if (!swipeToRevealLayoutExists() || this.contentView == null) {
            return false;
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = createViewDragHelper();
        }
        if (this.gestureDetector == null) {
            this.gestureDetector = createGestureDetector();
        }
        if (this.swipeAccessibilityDelegate == null) {
            View.AccessibilityDelegate createSwipeAccessibilityDelegate = createSwipeAccessibilityDelegate();
            this.swipeAccessibilityDelegate = createSwipeAccessibilityDelegate;
            this.contentView.setAccessibilityDelegate(createSwipeAccessibilityDelegate);
        }
        if (!getClipToPadding()) {
            return true;
        }
        this.originalClipToPadding = getClipToPadding();
        setClipToPadding(false);
        return true;
    }

    private int getAbsoluteHorizontalGravity(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        if (absoluteGravity == 3) {
            return 3;
        }
        return (absoluteGravity != 5 && getLayoutDirection() == 1) ? 3 : 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getAbsoluteRevealGravity(View view) {
        return xeb1.a(view) ? 5 : 3;
    }

    private int getOffsetForSwipeState(int i, int i2) {
        if (!swipeToRevealLayoutExistsForGravity(i2)) {
            ny61.g(oyr.i(i2, "No RevealableListItem with gravity "));
            return 0;
        }
        if (i == 3) {
            return getSwipeViewClosedOffset();
        }
        if (i == 4) {
            return getSwipeRevealViewRevealedOffset(i2);
        }
        if (i == 5) {
            return getSwipeToActionOffset(i2);
        }
        ny61.g(oyr.i(i, "Invalid state to get swipe offset: "));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public int getSwipeRevealViewRevealedOffset(int i) {
        View view = isRevealGravityLeft(i) ? this.swipeToRevealLayoutLeft : this.swipeToRevealLayoutRight;
        if (view == 0) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return ((isRevealGravityLeft(i) ? 1 : -1) * (((p2k0) view).getIntrinsicWidth() + layoutParams.leftMargin + layoutParams.rightMargin)) + this.originalContentViewLeft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getSwipeToActionOffset(int i) {
        View view = this.contentView;
        if (view == null) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return ((isRevealGravityLeft(i) ? 1 : -1) * (this.contentView.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin)) + this.originalContentViewLeft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getSwipeViewClosedOffset() {
        return this.originalContentViewLeft;
    }

    private boolean isRevealGravityLeft(int i) {
        return getAbsoluteHorizontalGravity(i) == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSwipeState$0(boolean z, int i, int i2) {
        if (z) {
            startSettling(this.contentView, i, i2);
            return;
        }
        a aVar = this.viewDragHelper;
        if (aVar != null) {
            aVar.a();
        }
        int offsetForSwipeState = getOffsetForSwipeState(i, i2);
        View view = this.contentView;
        view.offsetLeftAndRight(offsetForSwipeState - view.getLeft());
        updateSwipeProgress(offsetForSwipeState);
        setSwipeStateInternal(i, i2);
    }

    private void layoutRevealView(View view, int i, int i2) {
        int i3;
        int measuredWidth;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (xeb1.a(view)) {
            measuredWidth = i2 - layoutParams.rightMargin;
            i3 = measuredWidth - view.getMeasuredWidth();
        } else {
            i3 = layoutParams.leftMargin + i;
            measuredWidth = view.getMeasuredWidth() + i3;
        }
        view.layout(i3, view.getTop(), measuredWidth, view.getBottom());
    }

    private void maybeSwapRevealLayoutsForGravity() {
        View view = this.swipeToRevealLayoutLeft;
        boolean z = false;
        boolean z2 = view != null && xeb1.a(view);
        View view2 = this.swipeToRevealLayoutRight;
        if (view2 != null && !xeb1.a(view2)) {
            z = true;
        }
        if (z2 && z) {
            View view3 = this.swipeToRevealLayoutLeft;
            this.swipeToRevealLayoutLeft = this.swipeToRevealLayoutRight;
            this.swipeToRevealLayoutRight = view3;
            this.revealViewOffset *= -1;
            return;
        }
        if (z2) {
            if (this.swipeToRevealLayoutRight != null) {
                ny61.r("Cannot have more than one RevealableListItem with the same absolute gravity.");
                return;
            }
            this.swipeToRevealLayoutRight = this.swipeToRevealLayoutLeft;
            this.swipeToRevealLayoutLeft = null;
            this.revealViewOffset *= -1;
            return;
        }
        if (z) {
            if (this.swipeToRevealLayoutLeft != null) {
                ny61.r("Cannot have more than one RevealableListItem with the same absolute gravity.");
                return;
            }
            this.swipeToRevealLayoutLeft = this.swipeToRevealLayoutRight;
            this.swipeToRevealLayoutRight = null;
            this.revealViewOffset *= -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setSwipeStateInternal(int i, int i2) {
        p2k0 p2k0Var;
        Object obj;
        int absoluteHorizontalGravity = getAbsoluteHorizontalGravity(i2);
        if (i == this.swipeState && ((obj = this.activeSwipeToRevealLayout) == null || getAbsoluteRevealGravity((View) obj) == absoluteHorizontalGravity)) {
            return;
        }
        if (i == 3 || swipeToRevealLayoutExistsForGravity(absoluteHorizontalGravity)) {
            if (i == 5 && ((p2k0Var = this.activeSwipeToRevealLayout) == null || p2k0Var.getPrimaryActionSwipeMode() == 0)) {
                return;
            }
            p2k0 p2k0Var2 = isRevealGravityLeft(absoluteHorizontalGravity) ? (p2k0) this.swipeToRevealLayoutLeft : (p2k0) this.swipeToRevealLayoutRight;
            this.activeSwipeToRevealLayout = p2k0Var2;
            this.swipeState = i;
            if (i != 1 && i != 2) {
                this.lastStableSwipeState = i;
            }
            if (p2k0Var2 != 0) {
                absoluteHorizontalGravity = ((FrameLayout.LayoutParams) ((View) p2k0Var2).getLayoutParams()).gravity;
            }
            gyw0 gyw0Var = (gyw0) this.contentView;
            View castToView = castToView(this.activeSwipeToRevealLayout);
            if (absoluteHorizontalGravity == -1) {
                absoluteHorizontalGravity = 8388613;
            }
            gyw0Var.onSwipeStateChanged(i, castToView, absoluteHorizontalGravity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i, int i2) {
        boolean t;
        if (this.viewDragHelper == null) {
            return;
        }
        int offsetForSwipeState = getOffsetForSwipeState(i, i2);
        a aVar = this.viewDragHelper;
        if (i == 4) {
            int top = view.getTop();
            Interpolator interpolator = (Interpolator) CUBIC_BEZIER_INTERPOLATOR;
            aVar.t = view;
            aVar.c = -1;
            OverScroller overScroller = aVar.r;
            int left = view.getLeft();
            int top2 = aVar.t.getTop();
            int i3 = offsetForSwipeState - left;
            int i4 = top - top2;
            if (i3 == 0 && i4 == 0) {
                overScroller.abortAnimation();
                t = false;
                aVar.q(0);
            } else {
                if (interpolator != null) {
                    aVar.w = interpolator;
                } else {
                    aVar.w = a.y;
                }
                overScroller.startScroll(left, top2, i3, i4, SETTLING_DURATION);
                aVar.q(2);
                t = true;
            }
            if (!t && aVar.a == 0 && aVar.t != null) {
                aVar.t = null;
            }
        } else {
            t = aVar.t(offsetForSwipeState, view.getTop(), view);
        }
        if (!t) {
            setSwipeStateInternal(i, i2);
            return;
        }
        setSwipeStateInternal(2, i2);
        hsy hsyVar = this.stateSettlingTracker;
        hsyVar.a = i;
        hsyVar.b = i2;
        if (hsyVar.c) {
            return;
        }
        hsyVar.e.post(hsyVar.d);
        hsyVar.c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean swipeToRevealLayoutExists() {
        return (this.swipeToRevealLayoutLeft instanceof p2k0) || (this.swipeToRevealLayoutRight instanceof p2k0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean swipeToRevealLayoutExistsForGravity(int i) {
        maybeSwapRevealLayoutsForGravity();
        return isRevealGravityLeft(i) ? this.swipeToRevealLayoutLeft instanceof p2k0 : this.swipeToRevealLayoutRight instanceof p2k0;
    }

    private void updateAlphaFade(int i, int i2) {
        int swipeViewClosedOffset = i2 == i ? (getSwipeViewClosedOffset() + i) / 2 : (i2 + i) / 2;
        this.contentView.setAlpha(mj2.a(1.0f, 0.0f, (this.revealViewOffset - swipeViewClosedOffset) / (i - swipeViewClosedOffset)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateSwipeProgress(int i) {
        View view;
        View view2;
        if ((this.contentView instanceof gyw0) && swipeToRevealLayoutExists()) {
            int i2 = i - this.originalContentViewLeft;
            this.revealViewOffset = i2;
            boolean z = i2 > 0;
            boolean z2 = i2 < 0;
            if (z) {
                KeyEvent.Callback callback = this.swipeToRevealLayoutLeft;
                if (callback instanceof p2k0) {
                    this.activeSwipeToRevealLayout = (p2k0) callback;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.contentView.getLayoutParams();
                    view = this.swipeToRevealLayoutLeft;
                    if (view instanceof p2k0) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                        int max = Math.max(0, ((Math.abs(this.originalContentViewLeft - this.contentView.getLeft()) - layoutParams.leftMargin) - layoutParams2.getMarginStart()) - layoutParams2.getMarginEnd());
                        if (!z) {
                            max = 0;
                        }
                        ((p2k0) this.swipeToRevealLayoutLeft).setRevealedWidth(max);
                    }
                    view2 = this.swipeToRevealLayoutRight;
                    if (view2 instanceof p2k0) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                        ((p2k0) this.swipeToRevealLayoutRight).setRevealedWidth(z2 ? Math.max(0, ((Math.abs(this.originalContentViewLeft - this.contentView.getLeft()) - layoutParams.rightMargin) - layoutParams3.getMarginStart()) - layoutParams3.getMarginEnd()) : 0);
                    }
                    ((gyw0) this.contentView).onSwipe(this.revealViewOffset);
                    if (!z2 && (this.swipeToRevealLayoutRight instanceof p2k0)) {
                        updateAlphaFade(getSwipeToActionOffset(5), getSwipeRevealViewRevealedOffset(5));
                        return;
                    } else if (z || !(this.swipeToRevealLayoutLeft instanceof p2k0)) {
                        this.contentView.setAlpha(1.0f);
                    } else {
                        updateAlphaFade(getSwipeToActionOffset(3), getSwipeRevealViewRevealedOffset(3));
                        return;
                    }
                }
            }
            if (z2) {
                KeyEvent.Callback callback2 = this.swipeToRevealLayoutRight;
                if (callback2 instanceof p2k0) {
                    this.activeSwipeToRevealLayout = (p2k0) callback2;
                }
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.contentView.getLayoutParams();
            view = this.swipeToRevealLayoutLeft;
            if (view instanceof p2k0) {
            }
            view2 = this.swipeToRevealLayoutRight;
            if (view2 instanceof p2k0) {
            }
            ((gyw0) this.contentView).onSwipe(this.revealViewOffset);
            if (!z2) {
            }
            if (z) {
            }
            this.contentView.setAlpha(1.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (!(view instanceof p2k0)) {
            if (this.contentView != null && (view instanceof gyw0)) {
                w511.x("Only one SwipeableListItem view is allowed in a ListItemLayout.");
                return;
            } else {
                if (view instanceof gyw0) {
                    this.contentView = view;
                    return;
                }
                return;
            }
        }
        if (xeb1.a(view)) {
            if (this.swipeToRevealLayoutRight != null) {
                w511.x("Only one RevealableListItem with end gravity is supported.");
                return;
            }
            this.swipeToRevealLayoutRight = view;
        } else {
            if (this.swipeToRevealLayoutLeft != null) {
                w511.x("Only one RevealableListItem with start gravity is supported.");
                return;
            }
            this.swipeToRevealLayoutLeft = view;
        }
        ((p2k0) view).setRevealedWidth(0);
        view.setElevation(getElevation() - 1.0f);
    }

    public int getSwipeState() {
        return this.swipeState;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        return this.positionState == null ? super.onCreateDrawableState(i) : View.mergeDrawableStates(super.onCreateDrawableState(i + 1), this.positionState);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!ensureSwipeToRevealSetupIfNeeded()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 1) {
            this.viewDragHelper.b();
            return false;
        }
        this.gestureDetector.onTouchEvent(motionEvent);
        return this.viewDragHelper.s(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        maybeSwapRevealLayoutsForGravity();
        if (this.contentView != null && swipeToRevealLayoutExists() && ensureSwipeToRevealSetupIfNeeded()) {
            this.originalContentViewLeft = this.contentView.getLeft();
            int right = this.contentView.getRight();
            this.contentView.offsetLeftAndRight(this.revealViewOffset);
            View view = this.swipeToRevealLayoutLeft;
            if (view != null) {
                layoutRevealView(view, this.originalContentViewLeft, right);
            }
            View view2 = this.swipeToRevealLayoutRight;
            if (view2 != null) {
                layoutRevealView(view2, this.originalContentViewLeft, right);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (ensureSwipeToRevealSetupIfNeeded()) {
            this.viewDragHelper.l(motionEvent);
            this.gestureDetector.onTouchEvent(motionEvent);
            if (this.viewDragHelper.a == 1) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.swipeToRevealLayoutLeft) {
            this.swipeToRevealLayoutLeft = null;
        } else if (view == this.swipeToRevealLayoutRight) {
            this.swipeToRevealLayoutRight = null;
        } else if (this.contentView == view) {
            this.contentView = null;
        }
        if (!swipeToRevealLayoutExists() || this.contentView == null) {
            this.viewDragHelper = null;
            this.gestureDetector = null;
            this.swipeAccessibilityDelegate = null;
            setClipToPadding(this.originalClipToPadding);
        }
    }

    public void setSwipeState(final int i, final int i2, final boolean z) {
        if (i != 3 && i != 4 && i != 5) {
            ny61.g(oyr.i(i, "Invalid swipe state: "));
            return;
        }
        if (!(this.contentView instanceof gyw0) || !swipeToRevealLayoutExists()) {
            ny61.g("ListItemLayout must have a SwipeableListItem child and a RevealableListItem child to be swiped.");
            return;
        }
        if (i != 3 && !swipeToRevealLayoutExistsForGravity(i2)) {
            ny61.g(oyr.i(i2, "No RevealableListItem is defined for the given gravity: "));
            return;
        }
        Runnable runnable = new Runnable() { // from class: gsy
            @Override // java.lang.Runnable
            public final void run() {
                ListItemLayout.this.lambda$setSwipeState$0(z, i, i2);
            }
        };
        if (isLaidOut()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    public void updateAppearance(int i, int i2) {
        if (i < 0 || i2 < 0) {
            this.positionState = null;
        } else if (i2 == 1) {
            this.positionState = SINGLE_STATE_SET;
        } else if (i == 0) {
            this.positionState = FIRST_STATE_SET;
        } else if (i == i2 - 1) {
            this.positionState = LAST_STATE_SET;
        } else {
            this.positionState = MIDDLE_STATE_SET;
        }
        refreshDrawableState();
    }

    public ListItemLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.listItemLayoutStyle);
    }

    public ListItemLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, g2i0.Widget_Material3_ListItemLayout);
    }

    public ListItemLayout(Context context) {
        this(context, null);
    }

    public void updateAppearance(int i) {
        if (i == 0) {
            this.positionState = FIRST_STATE_SET;
        } else if (i == 1) {
            this.positionState = MIDDLE_STATE_SET;
        } else if (i == 2) {
            this.positionState = LAST_STATE_SET;
        } else if (i == 3) {
            this.positionState = SINGLE_STATE_SET;
        }
        refreshDrawableState();
    }

    public <T extends View & p2k0> void setSwipeState(int i, T t, boolean z) {
        if (t != this.swipeToRevealLayoutLeft && t != this.swipeToRevealLayoutRight) {
            ny61.g("revealView must be a child of ListItemLayout.");
        } else {
            setSwipeState(i, ((FrameLayout.LayoutParams) t.getLayoutParams()).gravity, z);
        }
    }

    public void setSwipeState(int i, int i2) {
        setSwipeState(i, i2, true);
    }

    public <T extends View & p2k0> void setSwipeState(int i, T t) {
        setSwipeState(i, (int) t, true);
    }
}
