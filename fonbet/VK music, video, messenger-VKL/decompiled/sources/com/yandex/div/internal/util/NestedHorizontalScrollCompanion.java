package com.yandex.div.internal.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;

/* loaded from: classes7.dex */
public class NestedHorizontalScrollCompanion {
    private boolean mCanDispatchNestedScroll;
    private float mDownX;
    private float mDownY;
    private final float mSlop;
    private final View mTarget;

    public NestedHorizontalScrollCompanion(@NonNull View view) {
        this(view, getScaledTouchSlop(view));
    }

    private static int getScaledTouchSlop(@NonNull View view) {
        return ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    public void dispatchOnOverScrolled(boolean z) {
        if (this.mCanDispatchNestedScroll && z) {
            View view = this.mTarget;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.dispatchNestedScroll(0, 0, 1, 0, null);
        }
    }

    public void dispatchOnScrollChanged() {
        this.mCanDispatchNestedScroll = false;
    }

    public void dispatchTouchEventAfterSuperCall(@NonNull MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getX();
            this.mDownY = motionEvent.getY();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float abs = Math.abs(motionEvent.getX() - this.mDownX);
                float abs2 = Math.abs(motionEvent.getY() - this.mDownY);
                if (this.mCanDispatchNestedScroll || abs < this.mSlop || abs <= abs2) {
                    return;
                }
                this.mCanDispatchNestedScroll = true;
                View view = this.mTarget;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.startNestedScroll(1);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.mCanDispatchNestedScroll = false;
        View view2 = this.mTarget;
        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
        view2.stopNestedScroll();
    }

    public NestedHorizontalScrollCompanion(@NonNull View view, float f) {
        this.mTarget = view;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        view.setNestedScrollingEnabled(true);
        this.mSlop = f;
    }

    public NestedHorizontalScrollCompanion(@NonNull ViewPager viewPager) {
        this(viewPager, getScaledTouchSlop(viewPager));
    }
}
