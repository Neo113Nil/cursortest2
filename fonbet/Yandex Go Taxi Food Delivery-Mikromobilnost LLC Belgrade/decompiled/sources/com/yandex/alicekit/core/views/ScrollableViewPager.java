package com.yandex.alicekit.core.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.customview.widget.a;
import androidx.viewpager.widget.ViewPager;
import defpackage.cn50;
import defpackage.r52;
import java.util.Set;

/* loaded from: classes11.dex */
public class ScrollableViewPager extends ViewPager {
    private Set<Integer> mDisabledPages;
    private boolean mIsEdgeScrollEnabled;
    private boolean mIsScrollEnabled;
    private boolean mIsScrollLocked;
    private boolean mIsSwipeLocked;
    private final cn50 mNestedScrollCompanion;
    private a mViewDragHelper;

    public ScrollableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mNestedScrollCompanion = new cn50(this, ViewConfiguration.get(getContext()).getScaledTouchSlop());
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
        a aVar = new a(getContext(), this, new r52(4, this));
        this.mViewDragHelper = aVar;
        aVar.q = 3;
    }

    public void setScrollEnabled(boolean z) {
        this.mIsScrollEnabled = z;
    }

    public ScrollableViewPager(Context context) {
        this(context, null);
    }
}
