package com.google.android.material.bottomsheet;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.hi;
import defpackage.kxh0;
import defpackage.m6;
import defpackage.mg;
import defpackage.ph;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    private static final int DEF_STYLE_RES = g2i0.Widget_Material3_BottomSheet_DragHandle;
    private final AccessibilityManager accessibilityManager;
    private BottomSheetBehavior<?> bottomSheetBehavior;
    private final BottomSheetBehavior.a bottomSheetCallback;
    private final String clickToCollapseActionLabel;
    private boolean clickToExpand;
    private final String clickToExpandActionLabel;
    private final String clickToHalfExpandActionLabel;
    private final GestureDetector gestureDetector;
    private final GestureDetector.OnGestureListener gestureListener;
    private boolean hasClickListener;
    private boolean hasTouchListener;

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.hasTouchListener = false;
        this.hasClickListener = false;
        this.clickToExpandActionLabel = getResources().getString(kxh0.bottomsheet_action_expand_description);
        this.clickToHalfExpandActionLabel = getResources().getString(kxh0.bottomsheet_action_half_expand_description);
        this.clickToCollapseActionLabel = getResources().getString(kxh0.bottomsheet_action_collapse_description);
        this.bottomSheetCallback = new f(this);
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (BottomSheetDragHandleView.this.bottomSheetBehavior == null || !BottomSheetDragHandleView.this.bottomSheetBehavior.e0) {
                    return super.onDoubleTap(motionEvent);
                }
                BottomSheetDragHandleView.this.bottomSheetBehavior.W(5);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return BottomSheetDragHandleView.this.isClickable();
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                BottomSheetDragHandleView.this.performLongClick(motionEvent.getX(), motionEvent.getY());
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
            }
        };
        this.gestureListener = simpleOnGestureListener;
        Context context2 = getContext();
        setTooltipText(getResources().getString(kxh0.bottomsheet_drag_handle_content_description));
        this.gestureDetector = new GestureDetector(context2, simpleOnGestureListener, new Handler(Looper.getMainLooper()));
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        androidx.core.view.b.p(this, new mg(7, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean expandOrCollapseBottomSheetIfPossible() {
        if (!hasAttachedBehavior()) {
            return false;
        }
        int nextState = getNextState();
        if (nextState == -1) {
            return true;
        }
        this.bottomSheetBehavior.W(nextState);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.material.bottomsheet.BottomSheetDragHandleView] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    private BottomSheetBehavior<?> findParentBottomSheetBehavior() {
        while (true) {
            this = getParentView(this);
            if (this == 0) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) behavior;
                }
            }
        }
    }

    private int getNextState() {
        boolean z;
        if (!hasAttachedBehavior()) {
            return -1;
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior.b) {
            z = false;
        } else {
            bottomSheetBehavior.getClass();
            z = true;
        }
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.bottomSheetBehavior;
        int i = bottomSheetBehavior2.k0;
        if (i == 3) {
            if (z) {
                return 6;
            }
            return bottomSheetBehavior2.z() ? 4 : -1;
        }
        if (i == 4) {
            return z ? 6 : 3;
        }
        if (i != 6) {
            return -1;
        }
        if (this.clickToExpand) {
            return 3;
        }
        return bottomSheetBehavior2.z() ? 4 : -1;
    }

    private static View getParentView(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasAttachedBehavior() {
        return this.bottomSheetBehavior != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onBottomSheetStateChanged$0(View view, hi hiVar) {
        return expandOrCollapseBottomSheetIfPossible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBottomSheetStateChanged(int i) {
        if (i == 4) {
            this.clickToExpand = true;
        } else if (i == 3) {
            this.clickToExpand = false;
        }
        int nextState = getNextState();
        androidx.core.view.b.o(this, ph.g, nextState != 3 ? nextState != 4 ? nextState != 6 ? null : this.clickToHalfExpandActionLabel : this.clickToCollapseActionLabel : this.clickToExpandActionLabel, new m6(21, this));
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.M(this.bottomSheetCallback);
            this.bottomSheetBehavior.O(null);
            this.bottomSheetBehavior.v0 = null;
        }
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.O(this);
            BottomSheetBehavior<?> bottomSheetBehavior3 = this.bottomSheetBehavior;
            bottomSheetBehavior3.getClass();
            bottomSheetBehavior3.v0 = new WeakReference(this);
            onBottomSheetStateChanged(this.bottomSheetBehavior.k0);
            this.bottomSheetBehavior.v(this.bottomSheetCallback);
        }
        setClickable(hasAttachedBehavior());
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(findParentBottomSheetBehavior());
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return !isEnabled() ? super.onKeyDown(i, keyEvent) : (i == 23 || i == 66) ? this.hasClickListener ? performClick() : expandOrCollapseBottomSheetIfPossible() : super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.hasClickListener || this.hasTouchListener) ? super.onTouchEvent(motionEvent) : this.gestureDetector.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.hasClickListener = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.hasTouchListener = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }
}
