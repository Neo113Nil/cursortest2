package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.R$dimen;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: BottomNavigationMenuView.java */
/* loaded from: classes13.dex */
public final class x58 extends rw50 {
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public boolean M;
    public final ArrayList N;

    public x58(@NonNull Context context) {
        super(context);
        this.N = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.I = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_item_max_width);
        this.J = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_item_min_width);
        this.K = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_active_item_max_width);
        this.L = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // xsna.rw50
    @NonNull
    public final ow50 e(@NonNull Context context) {
        return new k58(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (getLayoutDirection() == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        androidx.appcompat.view.menu.f menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.N;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        boolean f = rw50.f(getLabelVisibilityMode(), size2);
        int i5 = this.K;
        if (f && this.M) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int i6 = this.L;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), makeMeasureSpec);
                i6 = Math.max(i6, childAt.getMeasuredWidth());
            }
            int i7 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.J * i7), Math.min(i6, i5));
            int i8 = size - min;
            int min2 = Math.min(i8 / (i7 == 0 ? 1 : i7), this.I);
            int i9 = i8 - (i7 * min2);
            int i10 = 0;
            while (i10 < childCount) {
                if (getChildAt(i10).getVisibility() != 8) {
                    i4 = i10 == getSelectedItemPosition() ? min : min2;
                    if (i9 > 0) {
                        i4++;
                        i9--;
                    }
                } else {
                    i4 = 0;
                }
                i10 = tv4.a(arrayList, i4, i10, 1);
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), i5);
            int i11 = size - (size2 * min3);
            int i12 = 0;
            while (i12 < childCount) {
                if (getChildAt(i12).getVisibility() == 8) {
                    i3 = 0;
                } else if (i11 > 0) {
                    i3 = min3 + 1;
                    i11--;
                } else {
                    i3 = min3;
                }
                i12 = tv4.a(arrayList, i3, i12, 1);
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i14)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i13 = childAt2.getMeasuredWidth() + i13;
            }
        }
        setMeasuredDimension(i13, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.M = z;
    }
}
