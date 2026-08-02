package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.internal.util.NestedHorizontalScrollCompanion;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import java.util.Set;
import xsna.zut0;

/* loaded from: classes7.dex */
public class ScrollableViewPager extends RtlViewPager {

    @Nullable
    private Set<Integer> mDisabledPages;
    private boolean mIsEdgeScrollEnabled;
    private boolean mIsScrollEnabled;
    private boolean mIsScrollLocked;
    private boolean mIsSwipeLocked;
    private final NestedHorizontalScrollCompanion mNestedScrollCompanion;

    @Nullable
    private OnInterceptTouchEventListener mOnInterceptTouchEventListener;

    @Nullable
    private zut0 mViewDragHelper;

    public ScrollableViewPager(@NonNull Context context) {
        this(context, null);
    }

    private boolean processTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!this.mIsEdgeScrollEnabled && this.mViewDragHelper != null) {
            if ((motionEvent.getAction() & 255) == 0) {
                this.mIsSwipeLocked = false;
            }
            this.mViewDragHelper.m(motionEvent);
        }
        Set<Integer> set = this.mDisabledPages;
        if (set != null) {
            this.mIsScrollLocked = this.mIsScrollEnabled && set.contains(Integer.valueOf(getCurrentItem()));
        }
        return (this.mIsSwipeLocked || this.mIsScrollLocked || !this.mIsScrollEnabled) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.mNestedScrollCompanion.dispatchTouchEventAfterSuperCall(motionEvent);
        return dispatchTouchEvent;
    }

    @Nullable
    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.mOnInterceptTouchEventListener;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.mOnInterceptTouchEventListener;
        if (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent) : false) {
            return true;
        }
        return processTouchEvent(motionEvent) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.mNestedScrollCompanion.dispatchOnScrollChanged();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return processTouchEvent(motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setDisabledScrollPages(@Nullable Set<Integer> set) {
        this.mDisabledPages = set;
    }

    public void setEdgeScrollEnabled(boolean z) {
        this.mIsEdgeScrollEnabled = z;
        if (z) {
            return;
        }
        zut0 zut0Var = new zut0(getContext(), this, new zut0.c() { // from class: com.yandex.div.internal.widget.tabs.ScrollableViewPager.1
            @Override // xsna.zut0.c
            public void onEdgeDragStarted(int i, int i2) {
                super.onEdgeDragStarted(i, i2);
                ScrollableViewPager scrollableViewPager = ScrollableViewPager.this;
                boolean z2 = true;
                if ((i & 2) == 0 && (i & 1) == 0) {
                    z2 = false;
                }
                scrollableViewPager.mIsSwipeLocked = z2;
            }

            @Override // xsna.zut0.c
            public boolean tryCaptureView(View view, int i) {
                return false;
            }
        });
        this.mViewDragHelper = zut0Var;
        zut0Var.q = 3;
    }

    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.mOnInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setScrollEnabled(boolean z) {
        this.mIsScrollEnabled = z;
    }

    public ScrollableViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mNestedScrollCompanion = new NestedHorizontalScrollCompanion((ViewPager) this);
        this.mIsScrollEnabled = true;
        this.mIsEdgeScrollEnabled = true;
        this.mIsSwipeLocked = false;
        this.mIsScrollLocked = false;
    }
}
