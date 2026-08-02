package androidx.slidingpanelayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import defpackage.kq31;

/* loaded from: classes10.dex */
public final class c extends kq31 {
    public final /* synthetic */ SlidingPaneLayout a;

    public c(SlidingPaneLayout slidingPaneLayout) {
        this.a = slidingPaneLayout;
    }

    @Override // defpackage.kq31
    public final int a(View view, int i) {
        SlidingPaneLayout slidingPaneLayout = this.a;
        SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) slidingPaneLayout.mSlideableView.getLayoutParams();
        if (!slidingPaneLayout.isLayoutRtlSupport()) {
            int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i, paddingLeft), slidingPaneLayout.mSlideRange + paddingLeft);
        }
        int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.mSlideableView.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        return Math.max(Math.min(i, width), width - slidingPaneLayout.mSlideRange);
    }

    @Override // defpackage.kq31
    public final int b(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // defpackage.kq31
    public final int c(View view) {
        return this.a.mSlideRange;
    }

    @Override // defpackage.kq31
    public final void e(int i, int i2) {
        if (l()) {
            SlidingPaneLayout slidingPaneLayout = this.a;
            slidingPaneLayout.mDragHelper.c(i2, slidingPaneLayout.mSlideableView);
        }
    }

    @Override // defpackage.kq31
    public final void f(int i) {
        if (l()) {
            SlidingPaneLayout slidingPaneLayout = this.a;
            slidingPaneLayout.mDragHelper.c(i, slidingPaneLayout.mSlideableView);
        }
    }

    @Override // defpackage.kq31
    public final void g(int i, View view) {
        this.a.setAllChildrenVisible();
    }

    @Override // defpackage.kq31
    public final void h(int i) {
        SlidingPaneLayout slidingPaneLayout = this.a;
        if (slidingPaneLayout.mDragHelper.a == 0) {
            float f = slidingPaneLayout.mSlideOffset;
            View view = slidingPaneLayout.mSlideableView;
            if (f != 1.0f) {
                slidingPaneLayout.dispatchOnPanelOpened(view);
                slidingPaneLayout.mPreservedOpenState = true;
            } else {
                slidingPaneLayout.updateObscuredViewsVisibility(view);
                slidingPaneLayout.dispatchOnPanelClosed(slidingPaneLayout.mSlideableView);
                slidingPaneLayout.mPreservedOpenState = false;
            }
        }
    }

    @Override // defpackage.kq31
    public final void i(View view, int i, int i2) {
        SlidingPaneLayout slidingPaneLayout = this.a;
        slidingPaneLayout.onPanelDragged(i);
        slidingPaneLayout.invalidate();
    }

    @Override // defpackage.kq31
    public final void j(View view, float f, float f2) {
        int paddingLeft;
        SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        SlidingPaneLayout slidingPaneLayout = this.a;
        if (slidingPaneLayout.isLayoutRtlSupport()) {
            int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            if (f < 0.0f || (f == 0.0f && slidingPaneLayout.mSlideOffset > 0.5f)) {
                paddingRight += slidingPaneLayout.mSlideRange;
            }
            paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.mSlideableView.getWidth();
        } else {
            paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + slidingPaneLayout.getPaddingLeft();
            if (f > 0.0f || (f == 0.0f && slidingPaneLayout.mSlideOffset > 0.5f)) {
                paddingLeft += slidingPaneLayout.mSlideRange;
            }
        }
        slidingPaneLayout.mDragHelper.r(paddingLeft, view.getTop());
        slidingPaneLayout.invalidate();
    }

    @Override // defpackage.kq31
    public final boolean k(int i, View view) {
        if (l()) {
            return ((SlidingPaneLayout.LayoutParams) view.getLayoutParams()).slideable;
        }
        return false;
    }

    public final boolean l() {
        SlidingPaneLayout slidingPaneLayout = this.a;
        if (slidingPaneLayout.mIsUnableToDrag || slidingPaneLayout.getLockMode() == 3) {
            return false;
        }
        if (slidingPaneLayout.isOpen() && slidingPaneLayout.getLockMode() == 1) {
            return false;
        }
        return slidingPaneLayout.isOpen() || slidingPaneLayout.getLockMode() != 2;
    }
}
