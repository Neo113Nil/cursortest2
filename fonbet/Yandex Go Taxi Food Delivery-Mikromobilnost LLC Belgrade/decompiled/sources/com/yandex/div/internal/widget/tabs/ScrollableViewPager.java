package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import defpackage.bn50;
import defpackage.dab1;
import defpackage.r52;
import defpackage.ty60;
import java.util.Set;

/* loaded from: classes.dex */
public class ScrollableViewPager extends RtlViewPager {
    private Set<Integer> mDisabledPages;
    private boolean mIsEdgeScrollEnabled;
    private boolean mIsScrollEnabled;
    private boolean mIsScrollLocked;
    private boolean mIsSwipeLocked;
    private final bn50 mNestedScrollCompanion;
    private ty60 mOnInterceptTouchEventListener;
    private androidx.customview.widget.a mViewDragHelper;

    public ScrollableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mNestedScrollCompanion = new bn50(this, ViewConfiguration.get(getContext()).getScaledTouchSlop());
        this.mIsScrollEnabled = true;
        this.mIsEdgeScrollEnabled = true;
        this.mIsSwipeLocked = false;
        this.mIsScrollLocked = false;
    }

    private boolean processTouchEvent(MotionEvent motionEvent) {
        if (!this.mIsEdgeScrollEnabled && this.mViewDragHelper != null) {
            if ((motionEvent.getAction() & 255) == 0) {
                this.mIsSwipeLocked = false;
            }
            this.mViewDragHelper.l(motionEvent);
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
        this.mNestedScrollCompanion.a(motionEvent);
        return dispatchTouchEvent;
    }

    public ty60 getOnInterceptTouchEventListener() {
        return this.mOnInterceptTouchEventListener;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ty60 ty60Var = this.mOnInterceptTouchEventListener;
        if (ty60Var != null) {
            ((dab1) ty60Var).n(this, motionEvent);
        }
        return processTouchEvent(motionEvent) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.mNestedScrollCompanion.b = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return processTouchEvent(motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setDisabledScrollPages(Set<Integer> set) {
        this.mDisabledPages = set;
    }

    public void setEdgeScrollEnabled(boolean z) {
        this.mIsEdgeScrollEnabled = z;
        if (z) {
            return;
        }
        androidx.customview.widget.a aVar = new androidx.customview.widget.a(getContext(), this, new r52(3, this));
        this.mViewDragHelper = aVar;
        aVar.q = 3;
    }

    public void setOnInterceptTouchEventListener(ty60 ty60Var) {
        this.mOnInterceptTouchEventListener = ty60Var;
    }

    public void setScrollEnabled(boolean z) {
        this.mIsScrollEnabled = z;
    }

    public ScrollableViewPager(Context context) {
        this(context, null);
    }
}
