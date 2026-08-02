package xsna;

import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* compiled from: OneDirectionViewPager.kt */
/* loaded from: classes.dex */
public class ni80 extends ViewPager {
    public rln0 b;

    public int getAllowedSwipeDirection() {
        return 0;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        rln0 rln0Var = this.b;
        if (rln0Var != null) {
            rln0Var.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        int allowedSwipeDirection = getAllowedSwipeDirection();
        PagerAdapter adapter = getAdapter();
        if (adapter != null) {
            adapter.getCount();
        }
        if (allowedSwipeDirection == 1 && getScrollX() + i < 0) {
            i = 0;
        }
        if (allowedSwipeDirection == 2 && getScrollX() + i > 0) {
            i = 0;
        }
        super.scrollTo(allowedSwipeDirection != 3 ? i : 0, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        PagerAdapter adapter = getAdapter();
        int count = adapter != null ? adapter.getCount() : 0;
        if (count > 2) {
            int allowedSwipeDirection = getAllowedSwipeDirection();
            if (i == count - 1 && allowedSwipeDirection == 2) {
                i = count - 2;
            } else if (i == 0 && allowedSwipeDirection == 1) {
                i = 1;
            }
        }
        super.setCurrentItemInternal(i, z, z2, i2);
    }

    public final void setOnSwipedListener(ec80 ec80Var) {
        this.b = ec80Var != null ? new rln0(this) : null;
    }
}
