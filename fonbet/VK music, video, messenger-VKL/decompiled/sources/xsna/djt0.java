package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.zut0;

/* compiled from: VideoSwipeLayout.kt */
/* loaded from: classes2.dex */
public final class djt0 extends ViewGroup {
    public float b;
    public float c;
    public izs<? super Context, ? extends View> d;
    public final LinkedHashSet e;
    public izs<? super djt0, s3q0> f;
    public final a g;
    public final zut0 h;
    public final int i;
    public boolean j;

    /* compiled from: VideoSwipeLayout.kt */
    public final class a extends zut0.c {
        public boolean a;

        public a() {
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            djt0 djt0Var = djt0.this;
            if (djt0Var.getBackView() == null || Math.abs(djt0Var.getMaxOffset()) == 0) {
                return xwk.b(i, (-djt0Var.getFrontView().getMeasuredWidth()) / 2, 0);
            }
            return xwk.b(i, djt0Var.getMaxOffset() + djt0Var.getBaseLeft(), djt0Var.getBaseLeft());
        }

        @Override // xsna.zut0.c
        public final int getViewHorizontalDragRange(View view) {
            djt0 djt0Var = djt0.this;
            View backView = djt0Var.getBackView();
            if (backView != null && backView.getMeasuredWidth() > 0) {
                return Math.abs(djt0Var.getMaxOffset());
            }
            if (djt0Var.d != null) {
                return Math.max(1, djt0Var.getFrontView().getMeasuredWidth());
            }
            return 0;
        }

        @Override // xsna.zut0.c
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            djt0 djt0Var = djt0.this;
            if (view != djt0Var.getFrontView()) {
                return;
            }
            int baseLeft = i - djt0Var.getBaseLeft();
            if (djt0Var.getBackView() == null && Math.abs(baseLeft) > djt0Var.i) {
                djt0Var.c();
            }
            int maxOffset = djt0Var.getMaxOffset();
            if (baseLeft == maxOffset && !this.a) {
                this.a = true;
                Iterator it = djt0Var.e.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a(djt0Var);
                }
            } else if (baseLeft != maxOffset) {
                this.a = false;
            }
            View backView = djt0Var.getBackView();
            if (backView != null) {
                backView.setVisibility(baseLeft == 0 ? 4 : 0);
            }
        }

        @Override // xsna.zut0.c
        public final void onViewReleased(View view, float f, float f2) {
            int left = view.getLeft();
            djt0 djt0Var = djt0.this;
            int baseLeft = left - djt0Var.getBaseLeft();
            if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || baseLeft >= djt0Var.getMaxOffset() / 2)) {
                djt0Var.b();
            } else {
                djt0Var.d();
            }
        }

        @Override // xsna.zut0.c
        public final boolean tryCaptureView(View view, int i) {
            djt0 djt0Var = djt0.this;
            if (view != djt0Var.getFrontView()) {
                return false;
            }
            djt0Var.c();
            return true;
        }
    }

    /* compiled from: VideoSwipeLayout.kt */
    public interface b {
        void a(djt0 djt0Var);
    }

    public djt0(Context context) {
        super(context, null, 0);
        this.e = new LinkedHashSet();
        a aVar = new a();
        this.g = aVar;
        zut0 zut0Var = new zut0(getContext(), this, aVar);
        zut0Var.b = (int) (1.0f * zut0Var.b);
        this.h = zut0Var;
        this.i = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBaseLeft() {
        int paddingLeft = getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = getFrontView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return paddingLeft + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
    }

    private final int getBaseTop() {
        int paddingTop = getPaddingTop();
        ViewGroup.LayoutParams layoutParams = getFrontView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
    }

    @Override // android.view.ViewGroup
    @ozl
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() >= 2) {
            throw new IllegalArgumentException("Layout supports only 2 children");
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (!this.j || getCurrentOffset() == 0) {
            return;
        }
        View frontView = getFrontView();
        if (this.h.u(getBaseLeft(), getFrontView().getTop(), frontView)) {
            invalidate();
        }
    }

    public final View c() {
        View invoke;
        View backView = getBackView();
        if (backView != null) {
            return backView;
        }
        izs<? super Context, ? extends View> izsVar = this.d;
        if (izsVar == null || (invoke = izsVar.invoke(getContext())) == null) {
            return null;
        }
        invoke.setVisibility(4);
        if (invoke.getLayoutParams() == null) {
            invoke.setLayoutParams(generateDefaultLayoutParams());
        }
        addView(invoke, 0, invoke.getLayoutParams());
        int measuredWidth = getFrontView().getMeasuredWidth();
        int measuredHeight = getFrontView().getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            invoke.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        izs<? super djt0, s3q0> izsVar2 = this.f;
        if (izsVar2 != null) {
            izsVar2.invoke(this);
        }
        return invoke;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.h.h()) {
            invalidate();
        }
    }

    public final void d() {
        if (this.j) {
            c();
            if (getMaxOffset() == 0) {
                return;
            }
            View frontView = getFrontView();
            if (this.h.u(getMaxOffset() + getBaseLeft(), getFrontView().getTop(), frontView)) {
                invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final View getBackView() {
        if (getChildCount() == 2) {
            return getChildAt(0);
        }
        return null;
    }

    public final boolean getCanSwipe() {
        return this.j;
    }

    public final int getCurrentOffset() {
        return getFrontView().getLeft() - getBaseLeft();
    }

    public final View getFrontView() {
        return getChildAt(getChildCount() - 1);
    }

    public final int getMaxOffset() {
        View backView = getBackView();
        return -(backView != null ? backView.getMeasuredWidth() : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getBackView() != null) {
            this.h.a();
            this.g.a = false;
            getFrontView().offsetLeftAndRight(-getCurrentOffset());
            View backView = getBackView();
            if (backView != null) {
                backView.setVisibility(4);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        View backView;
        super.onFinishInflate();
        if (getChildCount() != 2 || (backView = getBackView()) == null) {
            return;
        }
        backView.setVisibility(4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        if (r0 != 3) goto L27;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.j) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float abs = Math.abs(motionEvent.getX() - this.b);
                    float abs2 = Math.abs(motionEvent.getY() - this.c);
                    int i = this.i;
                    if (abs > i && abs > abs2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else if (abs2 > i && abs2 > abs) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            this.b = motionEvent.getX();
            this.c = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return this.h.t(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int baseLeft = getBaseLeft();
        int i5 = 0;
        if (getBackView() != null && getMaxOffset() != 0) {
            i5 = swe0.g(getCurrentOffset(), getMaxOffset(), 0);
        }
        int i6 = i5 + baseLeft;
        int baseTop = getBaseTop();
        getFrontView().layout(i6, baseTop, getFrontView().getMeasuredWidth() + i6, getFrontView().getMeasuredHeight() + baseTop);
        View backView = getBackView();
        if (backView != null) {
            int measuredWidth = (getFrontView().getMeasuredWidth() + baseLeft) - backView.getMeasuredWidth();
            dgn.b(backView, baseTop, measuredWidth, baseTop, backView.getMeasuredWidth() + measuredWidth);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChildWithMargins(getFrontView(), i, 0, i2, 0);
        View backView = getBackView();
        if (backView != null) {
            backView.measure(View.MeasureSpec.makeMeasureSpec(getFrontView().getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getFrontView().getMeasuredHeight(), 1073741824));
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + getFrontView().getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = getFrontView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i3 = paddingRight + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = getFrontView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i4 = i3 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
        int paddingBottom = getPaddingBottom() + getPaddingTop() + getFrontView().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams3 = getFrontView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i5 = paddingBottom + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
        ViewGroup.LayoutParams layoutParams4 = getFrontView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i6 = i5 + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
        int measuredState = getFrontView().getMeasuredState();
        View backView2 = getBackView();
        int combineMeasuredStates = View.combineMeasuredStates(measuredState, backView2 != null ? backView2.getMeasuredState() : 0);
        setMeasuredDimension(View.resolveSizeAndState(i4, i, combineMeasuredStates), View.resolveSizeAndState(i6, i2, combineMeasuredStates << 16));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.j) {
            return super.onTouchEvent(motionEvent);
        }
        this.h.m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    public final void setBackView(izs<? super Context, ? extends View> izsVar) {
        this.d = izsVar;
    }

    public final void setCanSwipe(boolean z) {
        if (!z && this.j && getCurrentOffset() < 0) {
            b();
        }
        this.j = z;
    }

    public final void setFrontView(View view) {
        addView(view);
    }

    public final void setOnInflateListener(izs<? super djt0, s3q0> izsVar) {
        this.f = izsVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
