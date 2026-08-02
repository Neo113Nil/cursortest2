package com.yandex.plus.webview.core;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.b;
import defpackage.bvf0;
import defpackage.jn50;
import defpackage.qn50;
import defpackage.sn50;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public class VerticalNestedWebView extends WebView implements qn50 {
    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private final sn50 mChildHelper;
    private EdgeEffect mEdgeGlowBottom;
    private EdgeEffect mEdgeGlowTop;
    private boolean mIsBeingDragged;
    private int mLastMotionY;
    private int mLastScrollerY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private final jn50 mNestedScrollDetector;
    private int mNestedYOffset;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    private OverScroller mScroller;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    public VerticalNestedWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mNestedScrollDetector = new jn50();
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mIsBeingDragged = false;
        this.mActivePointerId = -1;
        setOverScrollMode(2);
        this.mEdgeGlowTop = bvf0.p(context, attributeSet);
        this.mEdgeGlowBottom = bvf0.p(context, attributeSet);
        initScrollView();
        this.mChildHelper = new sn50(this);
        setNestedScrollingEnabled(true);
    }

    private void abortAnimatedScroll() {
        this.mScroller.abortAnimation();
        stopNestedScroll(1);
    }

    private boolean edgeEffectFling(int i) {
        if (bvf0.z(this.mEdgeGlowTop) != 0.0f) {
            this.mEdgeGlowTop.onAbsorb(i);
            return true;
        }
        if (bvf0.z(this.mEdgeGlowBottom) == 0.0f) {
            return false;
        }
        this.mEdgeGlowBottom.onAbsorb(-i);
        return true;
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        recycleVelocityTracker();
        stopNestedScroll(0);
        this.mEdgeGlowTop.onRelease();
        this.mEdgeGlowBottom.onRelease();
    }

    private void fling(int i) {
        this.mScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
        runAnimatedScroll(true);
    }

    private void initScrollView() {
        this.mScroller = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void initVelocityTrackerIfNotExists() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionY = (int) motionEvent.getY(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean overScrollByCompat(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int i9;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i10 = i3 + i;
        int i11 = !z6 ? 0 : i7;
        int i12 = i4 + i2;
        int i13 = !z7 ? 0 : i8;
        int i14 = -i11;
        int i15 = i11 + i5;
        int i16 = -i13;
        int i17 = i13 + i6;
        if (i10 > i15) {
            i10 = i15;
            z2 = true;
        } else if (i10 < i14) {
            z2 = true;
            i10 = i14;
        } else {
            z2 = false;
        }
        if (i12 > i17) {
            i12 = i17;
            z3 = true;
        } else if (i12 < i16) {
            z3 = true;
            i12 = i16;
        } else {
            z3 = false;
        }
        if (!z3 || hasNestedScrollingParent(1)) {
            i9 = i10;
        } else {
            int i18 = i10;
            this.mScroller.springBack(i18, i12, 0, 0, 0, getScrollRange());
            i9 = i18;
        }
        onOverScrolled(i9, i12, z2, z3);
        return z2 || z3;
    }

    private void recycleVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int releaseVerticalGlow(int i, float f) {
        float K;
        int round;
        float width = f / getWidth();
        float height = i / getHeight();
        float f2 = 0.0f;
        if (bvf0.z(this.mEdgeGlowTop) == 0.0f) {
            if (bvf0.z(this.mEdgeGlowBottom) != 0.0f) {
                K = bvf0.K(this.mEdgeGlowBottom, height, 1.0f - width);
                if (bvf0.z(this.mEdgeGlowBottom) == 0.0f) {
                    this.mEdgeGlowBottom.onRelease();
                }
            }
            round = Math.round(f2 * getHeight());
            if (round != 0) {
                invalidate();
            }
            return round;
        }
        K = -bvf0.K(this.mEdgeGlowTop, -height, width);
        if (bvf0.z(this.mEdgeGlowTop) == 0.0f) {
            this.mEdgeGlowTop.onRelease();
        }
        f2 = K;
        round = Math.round(f2 * getHeight());
        if (round != 0) {
        }
        return round;
    }

    private void runAnimatedScroll(boolean z) {
        if (z) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.mLastScrollerY = getScrollY();
        WeakHashMap weakHashMap = b.a;
        postInvalidateOnAnimation();
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        int i;
        if (this.mScroller.isFinished()) {
            return;
        }
        this.mScroller.computeScrollOffset();
        int currY = this.mScroller.getCurrY();
        int i2 = currY - this.mLastScrollerY;
        this.mLastScrollerY = currY;
        int[] iArr = this.mScrollConsumed;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, i2, iArr, null, 1);
        int i3 = i2 - this.mScrollConsumed[1];
        int scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY = getScrollY();
            overScrollByCompat(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i4 = i3 - scrollY2;
            int[] iArr2 = this.mScrollConsumed;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i4, this.mScrollOffset, 1, iArr2);
            i3 = i4 - this.mScrollConsumed[1];
        } else {
            i = scrollRange;
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i > 0)) {
                if (i3 < 0) {
                    if (this.mEdgeGlowTop.isFinished()) {
                        this.mEdgeGlowTop.onAbsorb((int) this.mScroller.getCurrVelocity());
                    }
                } else if (this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onAbsorb((int) this.mScroller.getCurrVelocity());
                }
            }
            abortAnimatedScroll();
        }
        if (this.mScroller.isFinished()) {
            stopNestedScroll(1);
        } else {
            WeakHashMap weakHashMap = b.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mChildHelper.a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mChildHelper.b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mChildHelper.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 2;
    }

    public int getScrollRange() {
        return computeVerticalScrollRange();
    }

    @Override // defpackage.qn50
    public boolean hasNestedScrollingParent(int i) {
        return this.mChildHelper.f(i);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNestedTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        initVelocityTrackerIfNotExists();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            this.mNestedYOffset = 0;
            this.mScrollOffset[1] = 0;
        }
        obtain.offsetLocation(0.0f, this.mNestedYOffset);
        if (actionMasked == 0) {
            if (this.mIsBeingDragged && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.mScroller.isFinished()) {
                abortAnimatedScroll();
            }
            this.mLastMotionY = (int) motionEvent.getY();
            this.mActivePointerId = motionEvent.getPointerId(0);
            startNestedScroll(2, 0);
        } else if (actionMasked == 1) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int yVelocity = (int) velocityTracker.getYVelocity(this.mActivePointerId);
            if (Math.abs(yVelocity) >= this.mMinimumVelocity) {
                if (!edgeEffectFling(yVelocity)) {
                    int i = -yVelocity;
                    float f = i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        fling(i);
                    }
                }
            } else if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap = b.a;
                postInvalidateOnAnimation();
            }
            this.mActivePointerId = -1;
            endDrag();
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
            if (findPointerIndex != -1) {
                int y = (int) motionEvent.getY(findPointerIndex);
                int i2 = this.mLastMotionY - y;
                int releaseVerticalGlow = i2 - releaseVerticalGlow(i2, motionEvent.getX(findPointerIndex));
                if (!this.mIsBeingDragged && Math.abs(releaseVerticalGlow) > this.mTouchSlop) {
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    this.mIsBeingDragged = true;
                    int i3 = this.mTouchSlop;
                    releaseVerticalGlow = releaseVerticalGlow > 0 ? releaseVerticalGlow - i3 : releaseVerticalGlow + i3;
                }
                int i4 = releaseVerticalGlow;
                if (this.mIsBeingDragged) {
                    if (dispatchNestedPreScroll(0, i4, this.mScrollConsumed, this.mScrollOffset, 0)) {
                        i4 -= this.mScrollConsumed[1];
                        this.mNestedYOffset += this.mScrollOffset[1];
                    }
                    this.mLastMotionY = y - this.mScrollOffset[1];
                    int scrollY = getScrollY();
                    int scrollRange = getScrollRange();
                    int overScrollMode = getOverScrollMode();
                    boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                    int i5 = i4;
                    boolean z3 = overScrollByCompat(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(0);
                    int scrollY2 = getScrollY() - scrollY;
                    int[] iArr = this.mScrollConsumed;
                    iArr[1] = 0;
                    dispatchNestedScroll(0, scrollY2, 0, i5 - scrollY2, this.mScrollOffset, 0, iArr);
                    int i6 = this.mLastMotionY;
                    int i7 = this.mScrollOffset[1];
                    this.mLastMotionY = i6 - i7;
                    this.mNestedYOffset += i7;
                    if (z2) {
                        int i8 = i5 - this.mScrollConsumed[1];
                        int i9 = scrollY + i8;
                        if (i9 < 0) {
                            bvf0.K(this.mEdgeGlowTop, (-i8) / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                            if (!this.mEdgeGlowBottom.isFinished()) {
                                this.mEdgeGlowBottom.onRelease();
                            }
                        } else if (i9 > scrollRange) {
                            bvf0.K(this.mEdgeGlowBottom, i8 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                            if (!this.mEdgeGlowTop.isFinished()) {
                                this.mEdgeGlowTop.onRelease();
                            }
                        }
                        if (!this.mEdgeGlowTop.isFinished() || !this.mEdgeGlowBottom.isFinished()) {
                            WeakHashMap weakHashMap2 = b.a;
                            postInvalidateOnAnimation();
                            if (z) {
                                this.mVelocityTracker.clear();
                            }
                        }
                    }
                    z = z3;
                    if (z) {
                    }
                }
            }
        } else if (actionMasked == 3) {
            if (this.mIsBeingDragged && this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap3 = b.a;
                postInvalidateOnAnimation();
            }
            this.mActivePointerId = -1;
            endDrag();
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.mLastMotionY = (int) motionEvent.getY(actionIndex);
            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
        } else if (actionMasked == 6) {
            onSecondaryPointerUp(motionEvent);
            if (motionEvent.findPointerIndex(this.mActivePointerId) != -1) {
                this.mLastMotionY = (int) motionEvent.getY(motionEvent.findPointerIndex(this.mActivePointerId));
            }
        }
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        jn50 jn50Var = this.mNestedScrollDetector;
        if (jn50Var.a) {
            jn50Var.b = true;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        jn50 jn50Var = this.mNestedScrollDetector;
        if (jn50Var.a) {
            jn50Var.b = true;
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        if (r0.b == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r1 != 3) goto L40;
     */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        jn50 jn50Var = this.mNestedScrollDetector;
        jn50Var.getClass();
        int action = motionEvent.getAction();
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(jn50Var.e);
                    Float f = jn50Var.d;
                    Float f2 = jn50Var.c;
                    if (findPointerIndex != -1 && f != null && f2 != null) {
                        boolean z2 = (f2.floatValue() - motionEvent.getX(findPointerIndex) == 0.0f && f.floatValue() - motionEvent.getY(findPointerIndex) == 0.0f) ? false : true;
                        if (!jn50Var.a && z2) {
                            jn50Var.a = true;
                        }
                        if (jn50Var.a) {
                        }
                    }
                }
            }
            r5 = jn50Var.a && !jn50Var.b;
            jn50Var.c = null;
            jn50Var.d = null;
            jn50Var.e = -1;
            jn50Var.a = false;
            jn50Var.b = false;
            z = r5;
        } else {
            jn50Var.c = null;
            jn50Var.d = null;
            jn50Var.e = -1;
            jn50Var.a = false;
            jn50Var.b = false;
            jn50Var.c = Float.valueOf(motionEvent.getX());
            jn50Var.d = Float.valueOf(motionEvent.getY());
            jn50Var.e = motionEvent.getPointerId(0);
        }
        if (!z) {
            onNestedTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (this.mIsBeingDragged) {
            return true;
        }
        overScrollByCompat(i, i2, i3, i4, i5, i6, i7, i8, z);
        return true;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.mChildHelper.g(z);
    }

    @Override // defpackage.qn50
    public boolean startNestedScroll(int i, int i2) {
        return this.mChildHelper.h(i, i2);
    }

    @Override // defpackage.qn50
    public void stopNestedScroll(int i) {
        this.mChildHelper.i(i);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // defpackage.qn50
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.mChildHelper.c(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.mChildHelper.d(i, i2, i3, i4, iArr, i5, null);
    }

    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.mChildHelper.d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public VerticalNestedWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.webViewStyle);
    }

    public VerticalNestedWebView(Context context) {
        this(context, null);
    }
}
