package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vkontakte.android.R;

/* compiled from: SkeletonMultilineTextView.kt */
/* loaded from: classes6.dex */
public final class ryj0 extends LinearLayout {
    public int b;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(cn70.b(12), 1073741824);
        float f = 1.0f;
        int i3 = 0;
        while (true) {
            if (i3 < getChildCount()) {
                int i4 = i3 + 1;
                View childAt = getChildAt(i3);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (size * f), 1073741824), makeMeasureSpec);
                if (f > 0.5f) {
                    f *= 0.9f;
                    if (f >= 0.5f) {
                        i3 = i4;
                    }
                }
                f = 0.5f;
                i3 = i4;
            } else {
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int i5 = 0;
                while (true) {
                    if (!(i5 < getChildCount())) {
                        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                        return;
                    }
                    int i6 = i5 + 1;
                    View childAt2 = getChildAt(i5);
                    if (childAt2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    int measuredHeight = childAt2.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    int i7 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    paddingBottom += i7 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
                    i5 = i6;
                }
            }
        }
    }

    public final void setLinesCount(int i) {
        this.b = i;
        int i2 = 0;
        while (true) {
            if (!(i2 < getChildCount())) {
                int i3 = this.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    View view = new View(getContext());
                    view.setLayoutParams(new LinearLayout.LayoutParams(-1, cn70.b(12)));
                    view.setBackgroundResource(R.drawable.vk_bg_skeleton_4dp);
                    if (i4 < this.b - 1) {
                        f4m.q(cn70.b(12), view);
                    }
                    addView(view);
                }
                return;
            }
            int i5 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            removeView(childAt);
            i2 = i5;
        }
    }
}
