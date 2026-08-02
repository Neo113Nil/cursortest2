package com.vkontakte.android.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.dhr0;
import xsna.iah0;
import xsna.j6r0;
import xsna.m33;
import xsna.too0;

/* loaded from: classes7.dex */
public class EdgeSlidingPaneLayout extends SlidingPaneLayout implements too0 {
    public static final int D;
    public Paint A;
    public int B;
    public Drawable C;

    static {
        WeakHashMap weakHashMap = j6r0.a;
        D = iah0.a(40.0f);
    }

    public EdgeSlidingPaneLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.A = paint;
        paint.setColor(dhr0.t.c(R.attr.vk_ui_header_background));
        this.C = m33.a(R.drawable.shadow_menu_tablet_inner, getContext());
    }

    @Override // xsna.too0
    public final void Ng() {
        this.A.setColor(dhr0.t.c(R.attr.vk_ui_header_background));
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getChildCount() < 2) {
            return;
        }
        canvas.drawRect(getChildAt(1).getLeft(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), this.B, this.A);
        this.C.setBounds(getChildAt(1).getLeft() - this.C.getIntrinsicWidth(), 0, getChildAt(1).getLeft(), getHeight());
        this.C.draw(canvas);
    }

    @Override // android.view.View
    @TargetApi(21)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getFitsSystemWindows()) {
                SlidingPaneLayout.e eVar = (SlidingPaneLayout.e) childAt.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = -systemWindowInsetTop;
                childAt.setLayoutParams(eVar);
                childAt.dispatchApplyWindowInsets(windowInsets);
            }
        }
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        this.B = Math.min(systemWindowInsetTop, onApplyWindowInsets.getSystemWindowInsetTop());
        return onApplyWindowInsets;
    }

    @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (d()) {
            if (getChildCount() > 1) {
                if (motionEvent.getX() > getChildAt(1).getLeft() + D) {
                    return false;
                }
            }
        } else if (getChildCount() > 0) {
            if (motionEvent.getX() > getChildAt(0).getWidth()) {
                boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
                if (!onInterceptTouchEvent && motionEvent.getActionMasked() != 0) {
                    e();
                }
                return onInterceptTouchEvent;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            SlidingPaneLayout.e eVar = (SlidingPaneLayout.e) childAt.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) eVar).topMargin != 0) {
                childAt.layout(childAt.getLeft(), childAt.getTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getRight(), childAt.getBottom());
            }
        }
    }

    @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() < 1) {
            return;
        }
        getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) ((SlidingPaneLayout.e) getChildAt(0).getLayoutParams())).width, 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        for (int i3 = 1; i3 < getChildCount(); i3++) {
            int size = View.MeasureSpec.getSize(i2);
            if (!getChildAt(i3).getFitsSystemWindows()) {
                size = (size - getPaddingTop()) - getPaddingBottom();
            }
            SlidingPaneLayout.e eVar = (SlidingPaneLayout.e) getChildAt(i3).getLayoutParams();
            getChildAt(i3).measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }
    }

    public void setStatusBarColor(int i) {
        this.A.setColor(i);
        invalidate();
    }
}
