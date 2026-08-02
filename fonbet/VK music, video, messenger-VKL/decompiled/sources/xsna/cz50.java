package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* compiled from: NavigationRailMenuView.java */
/* loaded from: classes13.dex */
public final class cz50 extends rw50 {
    public int I;
    public final FrameLayout.LayoutParams J;

    public cz50(@NonNull Context context) {
        super(context);
        this.I = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.J = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @Override // xsna.rw50
    @NonNull
    public final ow50 e(@NonNull Context context) {
        return new bz50(context);
    }

    public final int g(View view, int i, int i2, int i3) {
        int makeMeasureSpec;
        int i4;
        if (view == null) {
            int max = i2 / Math.max(1, i3);
            int i5 = this.I;
            if (i5 == -1) {
                i5 = View.MeasureSpec.getSize(i);
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i5, max), 0);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i, makeMeasureSpec);
                    i4 = childAt.getMeasuredHeight();
                } else {
                    i4 = 0;
                }
                i6 += i4;
            }
        }
        return i6;
    }

    public int getItemMinimumHeight() {
        return this.I;
    }

    public int getMenuGravity() {
        return this.J.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int g;
        int i3;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = getMenu().l().size();
        if (size2 <= 1 || !rw50.f(getLabelVisibilityMode(), size2)) {
            g = g(null, i, size, size2);
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int max = size / Math.max(1, size2);
                int i4 = this.I;
                if (i4 == -1) {
                    i4 = View.MeasureSpec.getSize(i);
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i4, max), 0);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i, makeMeasureSpec);
                    i3 = childAt.getMeasuredHeight();
                } else {
                    i3 = 0;
                }
                size -= i3;
                size2--;
            } else {
                i3 = 0;
            }
            g = g(childAt, i, size, size2) + i3;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(g, i2, 0));
    }

    public void setItemMinimumHeight(int i) {
        if (this.I != i) {
            this.I = i;
            requestLayout();
        }
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.J;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }
}
