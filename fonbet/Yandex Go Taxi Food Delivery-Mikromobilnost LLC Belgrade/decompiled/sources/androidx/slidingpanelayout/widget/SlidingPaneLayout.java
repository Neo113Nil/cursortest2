package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.customview.view.AbsSavedState;
import defpackage.ag1;
import defpackage.bvf0;
import defpackage.g7u;
import defpackage.hi6;
import defpackage.n651;
import defpackage.n751;
import defpackage.ny61;
import defpackage.o651;
import defpackage.ooc;
import defpackage.op31;
import defpackage.pzt0;
import defpackage.qgn0;
import defpackage.rxr;
import defpackage.sxr;
import defpackage.tje;
import defpackage.tps0;
import defpackage.txr;
import defpackage.u1w;
import defpackage.yqb;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public class SlidingPaneLayout extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.slidingpanelayout.widget.SlidingPaneLayout";
    public static final int LOCK_MODE_LOCKED = 3;
    public static final int LOCK_MODE_LOCKED_CLOSED = 2;
    public static final int LOCK_MODE_LOCKED_OPEN = 1;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final String TAG = "SlidingPaneLayout";
    private static boolean sEdgeSizeUsingSystemGestureInsets = true;
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private boolean mDisplayListReflectionLoaded;
    final androidx.customview.widget.a mDragHelper;
    private boolean mFirstLayout;
    rxr mFoldingFeature;
    private txr mFoldingFeatureObserver;
    private Method mGetDisplayList;
    private float mInitialMotionX;
    private float mInitialMotionY;
    boolean mIsUnableToDrag;
    private int mLockMode;
    private sxr mOnFoldingFeatureChangeListener;
    private tps0 mPanelSlideListener;
    private final List<tps0> mPanelSlideListeners;
    private int mParallaxBy;
    private float mParallaxOffset;
    final ArrayList<Object> mPostedRunnables;
    boolean mPreservedOpenState;
    private Field mRecreateDisplayList;
    private Drawable mShadowDrawableLeft;
    private Drawable mShadowDrawableRight;
    float mSlideOffset;
    int mSlideRange;
    View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;

    public static class TouchBlocker extends FrameLayout {
        public TouchBlocker(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSliderFadeColor = 0;
        this.mSlideOffset = 1.0f;
        this.mPanelSlideListeners = new CopyOnWriteArrayList();
        this.mFirstLayout = true;
        this.mTmpRect = new Rect();
        this.mPostedRunnables = new ArrayList<>();
        this.mOnFoldingFeatureChangeListener = new qgn0(24, this);
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        androidx.core.view.b.p(this, new yqb(this));
        setImportantForAccessibility(1);
        androidx.customview.widget.a aVar = new androidx.customview.widget.a(getContext(), this, new c(this));
        aVar.b = (int) (2.0f * aVar.b);
        this.mDragHelper = aVar;
        aVar.n = f * 400.0f;
        o651.E4.getClass();
        setFoldingFeatureObserver(new txr(n651.a(context), context.getMainExecutor()));
    }

    private boolean closePane(int i) {
        if (!this.mCanSlide) {
            this.mPreservedOpenState = false;
        }
        if (!this.mFirstLayout && !smoothSlideTo(1.0f, i)) {
            return false;
        }
        this.mPreservedOpenState = false;
        return true;
    }

    private static Activity getActivityOrNull(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private static Rect getFoldBoundsInView(rxr rxrVar, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, view.getWidth() + iArr[1]);
        Rect rect2 = new Rect(((g7u) rxrVar).a.c());
        boolean intersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !intersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    private static int getMinimumWidth(View view) {
        if (!(view instanceof TouchBlocker)) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            return view.getMinimumWidth();
        }
        View childAt = ((TouchBlocker) view).getChildAt(0);
        WeakHashMap weakHashMap2 = androidx.core.view.b.a;
        return childAt.getMinimumWidth();
    }

    private u1w getSystemGestureInsets() {
        if (!sEdgeSizeUsingSystemGestureInsets) {
            return null;
        }
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        n751 a = op31.a(this);
        if (a != null) {
            return a.a.k();
        }
        return null;
    }

    private static int measureChildHeight(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return (((ViewGroup.MarginLayoutParams) layoutParams).width != 0 || layoutParams.weight <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
    }

    private boolean openPane(int i) {
        if (!this.mCanSlide) {
            this.mPreservedOpenState = true;
        }
        if (!this.mFirstLayout && !smoothSlideTo(0.0f, i)) {
            return false;
        }
        this.mPreservedOpenState = true;
        return true;
    }

    private void parallaxOtherViews(float f) {
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.mSlideableView) {
                float f2 = 1.0f - this.mParallaxOffset;
                int i2 = this.mParallaxBy;
                this.mParallaxOffset = f;
                int i3 = ((int) (f2 * i2)) - ((int) ((1.0f - f) * i2));
                if (isLayoutRtlSupport) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
            }
        }
    }

    private void setFoldingFeatureObserver(txr txrVar) {
        this.mFoldingFeatureObserver = txrVar;
        txrVar.d = this.mOnFoldingFeatureChangeListener;
    }

    private ArrayList<Rect> splitViewPositions() {
        Rect foldBoundsInView;
        rxr rxrVar = this.mFoldingFeature;
        if (rxrVar == null || !((g7u) rxrVar).a() || ((g7u) this.mFoldingFeature).a.c().left == 0 || ((g7u) this.mFoldingFeature).a.c().top != 0 || (foldBoundsInView = getFoldBoundsInView(this.mFoldingFeature, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), foldBoundsInView.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(rect, new Rect(Math.min(width, foldBoundsInView.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    private static boolean viewIsOpaque(View view) {
        return view.isOpaque();
    }

    public void addPanelSlideListener(tps0 tps0Var) {
        this.mPanelSlideListeners.add(tps0Var);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new TouchBlocker(view), i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z) {
            return false;
        }
        if (!isLayoutRtlSupport()) {
            i = -i;
        }
        return view.canScrollHorizontally(i);
    }

    @Deprecated
    public boolean canSlide() {
        return this.mCanSlide;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void close() {
        closePane();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mDragHelper.h()) {
            if (!this.mCanSlide) {
                this.mDragHelper.a();
            } else {
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                postInvalidateOnAnimation();
            }
        }
    }

    public void dispatchOnPanelClosed(View view) {
        Iterator<tps0> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        sendAccessibilityEvent(32);
    }

    public void dispatchOnPanelOpened(View view) {
        Iterator<tps0> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        sendAccessibilityEvent(32);
    }

    public void dispatchOnPanelSlide(View view) {
        Iterator<tps0> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        Drawable drawable = isLayoutRtlSupport() ? this.mShadowDrawableRight : this.mShadowDrawableLeft;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (isLayoutRtlSupport()) {
            i2 = childAt.getRight();
            i = intrinsicWidth + i2;
        } else {
            int left = childAt.getLeft();
            int i3 = left - intrinsicWidth;
            i = left;
            i2 = i3;
        }
        drawable.setBounds(i2, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean isLayoutRtlSupport = isLayoutRtlSupport() ^ isOpen();
        androidx.customview.widget.a aVar = this.mDragHelper;
        if (isLayoutRtlSupport) {
            aVar.q = 1;
            u1w systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                androidx.customview.widget.a aVar2 = this.mDragHelper;
                aVar2.o = Math.max(aVar2.p, systemGestureInsets.a);
            }
        } else {
            aVar.q = 2;
            u1w systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                androidx.customview.widget.a aVar3 = this.mDragHelper;
                aVar3.o = Math.max(aVar3.p, systemGestureInsets2.c);
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.mCanSlide && !layoutParams.slideable && this.mSlideableView != null) {
            canvas.getClipBounds(this.mTmpRect);
            boolean isLayoutRtlSupport2 = isLayoutRtlSupport();
            Rect rect = this.mTmpRect;
            if (isLayoutRtlSupport2) {
                rect.left = Math.max(rect.left, this.mSlideableView.getRight());
            } else {
                rect.right = Math.min(rect.right, this.mSlideableView.getLeft());
            }
            canvas.clipRect(this.mTmpRect);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.mCoveredFadeColor;
    }

    public final int getLockMode() {
        return this.mLockMode;
    }

    public int getParallaxDistance() {
        return this.mParallaxBy;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.mSliderFadeColor;
    }

    public void invalidateChildRegion(View view) {
        Paint paint = ((LayoutParams) view.getLayoutParams()).dimPaint;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        view.setLayerPaint(paint);
    }

    public boolean isDimmed(View view) {
        if (view == null) {
            return false;
        }
        return this.mCanSlide && ((LayoutParams) view.getLayoutParams()).dimWhenOffset && this.mSlideOffset > 0.0f;
    }

    public boolean isLayoutRtlSupport() {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        return getLayoutDirection() == 1;
    }

    public boolean isOpen() {
        return !this.mCanSlide || this.mSlideOffset == 0.0f;
    }

    public boolean isSlideable() {
        return this.mCanSlide;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Activity activityOrNull;
        super.onAttachedToWindow();
        this.mFirstLayout = true;
        if (this.mFoldingFeatureObserver == null || (activityOrNull = getActivityOrNull(getContext())) == null) {
            return;
        }
        txr txrVar = this.mFoldingFeatureObserver;
        pzt0 pzt0Var = txrVar.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        txrVar.c = tje.N(bvf0.a(ooc.o(txrVar.b)), null, null, new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(txrVar, activityOrNull, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        pzt0 pzt0Var;
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
        txr txrVar = this.mFoldingFeatureObserver;
        if (txrVar != null && (pzt0Var = txrVar.c) != null) {
            pzt0Var.a(null);
        }
        int size = this.mPostedRunnables.size();
        ArrayList<Object> arrayList = this.mPostedRunnables;
        if (size <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            ny61.u();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.mCanSlide && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            androidx.customview.widget.a aVar = this.mDragHelper;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            aVar.getClass();
            this.mPreservedOpenState = androidx.customview.widget.a.k(x, y, childAt);
        }
        if (!this.mCanSlide || (this.mIsUnableToDrag && actionMasked != 0)) {
            this.mDragHelper.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.mDragHelper.b();
            return false;
        }
        if (actionMasked == 0) {
            this.mIsUnableToDrag = false;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.mInitialMotionX = x2;
            this.mInitialMotionY = y2;
            androidx.customview.widget.a aVar2 = this.mDragHelper;
            View view = this.mSlideableView;
            aVar2.getClass();
            if (androidx.customview.widget.a.k((int) x2, (int) y2, view) && isDimmed(this.mSlideableView)) {
                z = true;
                return !this.mDragHelper.s(motionEvent) || z;
            }
        } else if (actionMasked == 2) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float abs = Math.abs(x3 - this.mInitialMotionX);
            float abs2 = Math.abs(y3 - this.mInitialMotionY);
            androidx.customview.widget.a aVar3 = this.mDragHelper;
            if (abs > aVar3.b && abs2 > abs) {
                aVar3.b();
                this.mIsUnableToDrag = true;
                return false;
            }
        }
        z = false;
        if (this.mDragHelper.s(motionEvent)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rxr rxrVar;
        int i10;
        ag1 ag1Var = ag1.k;
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        int i11 = i3 - i;
        int paddingRight = isLayoutRtlSupport ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = isLayoutRtlSupport ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.mFirstLayout) {
            this.mSlideOffset = (this.mCanSlide && this.mPreservedOpenState) ? 0.0f : 1.0f;
        }
        int i12 = paddingRight;
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                z2 = isLayoutRtlSupport;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.slideable) {
                    int i14 = i11 - paddingLeft;
                    int min = (Math.min(paddingRight, i14) - i12) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.mSlideRange = min;
                    int i15 = isLayoutRtlSupport ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    z2 = isLayoutRtlSupport;
                    layoutParams.dimWhenOffset = (measuredWidth / 2) + ((i12 + i15) + min) > i14;
                    float f = min;
                    int i16 = (int) (this.mSlideOffset * f);
                    i5 = i15 + i16 + i12;
                    this.mSlideOffset = i16 / f;
                } else {
                    z2 = isLayoutRtlSupport;
                    if (!this.mCanSlide || (i6 = this.mParallaxBy) == 0) {
                        i5 = paddingRight;
                    } else {
                        i7 = (int) ((1.0f - this.mSlideOffset) * i6);
                        i5 = paddingRight;
                        if (z2) {
                            i8 = i5 - i7;
                            i9 = i8 + measuredWidth;
                        } else {
                            i9 = (i11 - i5) + i7;
                            i8 = i9 - measuredWidth;
                        }
                        childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                        rxrVar = this.mFoldingFeature;
                        if (rxrVar != null) {
                            hi6 hi6Var = ((g7u) rxrVar).a;
                            if ((hi6Var.b() > hi6Var.a() ? ag1.l : ag1Var) == ag1Var && ((g7u) this.mFoldingFeature).a()) {
                                i10 = ((g7u) this.mFoldingFeature).a.c().width();
                                paddingRight = Math.abs(i10) + childAt.getWidth() + paddingRight;
                                i12 = i5;
                            }
                        }
                        i10 = 0;
                        paddingRight = Math.abs(i10) + childAt.getWidth() + paddingRight;
                        i12 = i5;
                    }
                }
                i7 = 0;
                if (z2) {
                }
                childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                rxrVar = this.mFoldingFeature;
                if (rxrVar != null) {
                }
                i10 = 0;
                paddingRight = Math.abs(i10) + childAt.getWidth() + paddingRight;
                i12 = i5;
            }
            i13++;
            isLayoutRtlSupport = z2;
        }
        if (this.mFirstLayout) {
            if (this.mCanSlide && this.mParallaxBy != 0) {
                parallaxOtherViews(this.mSlideOffset);
            }
            updateObscuredViewsVisibility(this.mSlideableView);
        }
        this.mFirstLayout = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r7).width == 0) goto L18;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            i3 = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = i3;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = 0;
        }
        int max = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e(TAG, "onMeasure: More than two child views are not supported.");
        }
        this.mSlideableView = null;
        int i8 = 0;
        boolean z = false;
        int i9 = max;
        float f = 0.0f;
        while (true) {
            i4 = 8;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int i10 = max;
            if (childAt.getVisibility() == 8) {
                layoutParams.dimWhenOffset = false;
            } else {
                float f2 = layoutParams.weight;
                if (f2 > 0.0f) {
                    f += f2;
                }
                int max2 = Math.max(i10 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), 0);
                int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                i7 = i8;
                childAt.measure(i11 == -2 ? View.MeasureSpec.makeMeasureSpec(max2, mode == 0 ? mode : Integer.MIN_VALUE) : i11 == -1 ? View.MeasureSpec.makeMeasureSpec(max2, mode) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    if (mode2 == Integer.MIN_VALUE) {
                        i3 = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        i3 = measuredHeight;
                    }
                }
                i9 -= measuredWidth;
                if (i7 != 0) {
                    boolean z2 = i9 < 0;
                    layoutParams.slideable = z2;
                    z |= z2;
                    if (z2) {
                        this.mSlideableView = childAt;
                    }
                }
                i8 = i7 + 1;
                max = i10;
            }
            i7 = i8;
            i8 = i7 + 1;
            max = i10;
        }
        int i12 = max;
        if (z || f > 0.0f) {
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getVisibility() != i4) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    int measuredWidth2 = (((ViewGroup.MarginLayoutParams) layoutParams2).width != 0 || layoutParams2.weight <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z) {
                        i5 = i12 - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    } else if (layoutParams2.weight > 0.0f) {
                        i5 = ((int) ((layoutParams2.weight * Math.max(0, i9)) / f)) + measuredWidth2;
                        i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    } else {
                        i5 = measuredWidth2;
                        i6 = 0;
                    }
                    int measureChildHeight = measureChildHeight(childAt2, i2, getPaddingBottom() + getPaddingTop());
                    if (measuredWidth2 != i5) {
                        childAt2.measure(i6, measureChildHeight);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > i3) {
                            if (mode2 == Integer.MIN_VALUE) {
                                i3 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                                i3 = measuredHeight2;
                            }
                        }
                    }
                }
                i13++;
                i4 = 8;
            }
        }
        ArrayList<Rect> splitViewPositions = splitViewPositions();
        if (splitViewPositions != null && !z) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = splitViewPositions.get(i14);
                    LayoutParams layoutParams3 = (LayoutParams) childAt3.getLayoutParams();
                    int i15 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), makeMeasureSpec);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (getMinimumWidth(childAt3) != 0 && rect.width() < getMinimumWidth(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(i12 - i15, 1073741824), makeMeasureSpec);
                        if (i14 != 0) {
                            layoutParams3.slideable = true;
                            this.mSlideableView = childAt3;
                            z = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), makeMeasureSpec);
                    }
                }
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i3);
        this.mCanSlide = z;
        androidx.customview.widget.a aVar = this.mDragHelper;
        if (aVar.a == 0 || z) {
            return;
        }
        aVar.a();
    }

    public void onPanelDragged(int i) {
        if (this.mSlideableView == null) {
            this.mSlideOffset = 0.0f;
            return;
        }
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        int width = this.mSlideableView.getWidth();
        if (isLayoutRtlSupport) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = (i - ((isLayoutRtlSupport ? getPaddingRight() : getPaddingLeft()) + (isLayoutRtlSupport ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / this.mSlideRange;
        this.mSlideOffset = paddingRight;
        if (this.mParallaxBy != 0) {
            parallaxOtherViews(paddingRight);
        }
        dispatchOnPanelSlide(this.mSlideableView);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.isOpen) {
            openPane();
        } else {
            closePane();
        }
        this.mPreservedOpenState = savedState.isOpen;
        setLockMode(savedState.mLockMode);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.isOpen = isSlideable() ? isOpen() : this.mPreservedOpenState;
        savedState.mLockMode = this.mLockMode;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.mFirstLayout = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mCanSlide) {
            return super.onTouchEvent(motionEvent);
        }
        this.mDragHelper.l(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionX = x;
            this.mInitialMotionY = y;
            return true;
        }
        if (actionMasked == 1 && isDimmed(this.mSlideableView)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.mInitialMotionX;
            float f2 = y2 - this.mInitialMotionY;
            int i = this.mDragHelper.b;
            if ((f2 * f2) + (f * f) < i * i) {
                if (androidx.customview.widget.a.k((int) x2, (int) y2, this.mSlideableView)) {
                    closePane(0);
                }
            }
        }
        return true;
    }

    public void open() {
        openPane();
    }

    public void removePanelSlideListener(tps0 tps0Var) {
        this.mPanelSlideListeners.remove(tps0Var);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view.getParent() instanceof TouchBlocker) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.mCanSlide) {
            return;
        }
        this.mPreservedOpenState = view == this.mSlideableView;
    }

    public void setAllChildrenVisible() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Deprecated
    public void setCoveredFadeColor(int i) {
        this.mCoveredFadeColor = i;
    }

    public final void setLockMode(int i) {
        this.mLockMode = i;
    }

    @Deprecated
    public void setPanelSlideListener(tps0 tps0Var) {
        tps0 tps0Var2 = this.mPanelSlideListener;
        if (tps0Var2 != null) {
            removePanelSlideListener(tps0Var2);
        }
        if (tps0Var != null) {
            addPanelSlideListener(tps0Var);
        }
        this.mPanelSlideListener = tps0Var;
    }

    public void setParallaxDistance(int i) {
        this.mParallaxBy = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.mShadowDrawableLeft = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.mShadowDrawableRight = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(getContext().getDrawable(i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(getContext().getDrawable(i));
    }

    @Deprecated
    public void setSliderFadeColor(int i) {
        this.mSliderFadeColor = i;
    }

    @Deprecated
    public void smoothSlideClosed() {
        closePane();
    }

    @Deprecated
    public void smoothSlideOpen() {
        openPane();
    }

    public boolean smoothSlideTo(float f, int i) {
        int paddingLeft;
        if (!this.mCanSlide) {
            return false;
        }
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        if (isLayoutRtlSupport) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            paddingLeft = (int) (getWidth() - (((f * this.mSlideRange) + paddingRight) + this.mSlideableView.getWidth()));
        } else {
            paddingLeft = (int) ((f * this.mSlideRange) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
        }
        androidx.customview.widget.a aVar = this.mDragHelper;
        View view = this.mSlideableView;
        if (!aVar.t(paddingLeft, view.getTop(), view)) {
            return false;
        }
        setAllChildrenVisible();
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        postInvalidateOnAnimation();
        return true;
    }

    public void updateObscuredViewsVisibility(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        View view2 = view;
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        int width = isLayoutRtlSupport ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = isLayoutRtlSupport ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !viewIsOpaque(view2)) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i = view2.getLeft();
            i2 = view2.getRight();
            i3 = view2.getTop();
            i4 = view2.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt == view2) {
                return;
            }
            if (childAt.getVisibility() == 8) {
                z = isLayoutRtlSupport;
            } else {
                z = isLayoutRtlSupport;
                childAt.setVisibility((Math.max(isLayoutRtlSupport ? paddingLeft : width, childAt.getLeft()) < i || Math.max(paddingTop, childAt.getTop()) < i3 || Math.min(isLayoutRtlSupport ? width : paddingLeft, childAt.getRight()) > i2 || Math.min(height, childAt.getBottom()) > i4) ? 0 : 4);
            }
            i5++;
            view2 = view;
            isLayoutRtlSupport = z;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        boolean isOpen;
        int mLockMode;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isOpen = parcel.readInt() != 0;
            this.mLockMode = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.isOpen ? 1 : 0);
            parcel.writeInt(this.mLockMode);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] ATTRS = {R.attr.layout_weight};
        Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;
        public float weight;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.weight = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
            this.weight = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.weight = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.weight = 0.0f;
            this.weight = layoutParams.weight;
        }

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }
    }

    public boolean openPane() {
        return openPane(0);
    }

    public boolean closePane() {
        return closePane(0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }
}
