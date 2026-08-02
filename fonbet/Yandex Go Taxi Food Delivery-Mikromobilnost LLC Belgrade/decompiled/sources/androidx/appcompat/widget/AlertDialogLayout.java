package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import defpackage.fah0;
import defpackage.x4e;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    private void forceUniformWidth(int i, int i2) {
        AlertDialogLayout alertDialogLayout;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View childAt = this.getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = childAt.getMeasuredHeight();
                    alertDialogLayout = this;
                    i3 = i2;
                    alertDialogLayout.measureChildWithMargins(childAt, makeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i5;
                    i4++;
                    this = alertDialogLayout;
                    i2 = i3;
                }
            }
            alertDialogLayout = this;
            i3 = i2;
            i4++;
            this = alertDialogLayout;
            i2 = i3;
        }
    }

    private static int resolveMinimumHeight(View view) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return resolveMinimumHeight(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    private boolean tryOnMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == fah0.topPanel) {
                    view = childAt;
                } else if (id == fah0.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != fah0.contentPanel && id != fah0.customPanel) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i4 = resolveMinimumHeight(view2);
            i5 = view2.getMeasuredHeight() - i4;
            paddingBottom += i4;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i6 = view3.getMeasuredHeight();
            paddingBottom += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i8 = size - paddingBottom;
        if (view2 != null) {
            int i9 = paddingBottom - i4;
            int min = Math.min(i8, i5);
            if (min > 0) {
                i8 -= min;
                i4 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            paddingBottom = i9 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i8 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i6 + i8, mode));
            paddingBottom = (paddingBottom - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                i10 = Math.max(i10, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i10, i, i3), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        forceUniformWidth(childCount, i2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int c;
        int i5;
        int i6;
        AlertDialogLayout alertDialogLayout = this;
        int paddingLeft = alertDialogLayout.getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - alertDialogLayout.getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - alertDialogLayout.getPaddingRight();
        int measuredHeight = alertDialogLayout.getMeasuredHeight();
        int childCount = alertDialogLayout.getChildCount();
        int gravity = alertDialogLayout.getGravity();
        int i8 = gravity & 112;
        int i9 = gravity & 8388615;
        int paddingTop = i8 != 16 ? i8 != 80 ? alertDialogLayout.getPaddingTop() : ((alertDialogLayout.getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + alertDialogLayout.getPaddingTop();
        Drawable dividerDrawable = alertDialogLayout.getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        int i10 = 0;
        while (i10 < childCount) {
            int i11 = paddingTop;
            View childAt = alertDialogLayout.getChildAt(i10);
            if (childAt == null || childAt.getVisibility() == 8) {
                paddingTop = i11;
            } else {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                int i12 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i12 < 0) {
                    i12 = i9;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, alertDialogLayout.getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    c = x4e.c(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    i5 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                } else if (absoluteGravity != 5) {
                    i6 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    if (alertDialogLayout.hasDividerBeforeChildAt(i10)) {
                        i11 += intrinsicHeight;
                    }
                    int i13 = i11 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    alertDialogLayout.setChildFrame(childAt, i6, i13, measuredWidth, measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i13;
                } else {
                    c = paddingRight - measuredWidth;
                    i5 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                }
                i6 = c - i5;
                if (alertDialogLayout.hasDividerBeforeChildAt(i10)) {
                }
                int i132 = i11 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                alertDialogLayout.setChildFrame(childAt, i6, i132, measuredWidth, measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i132;
            }
            i10++;
            alertDialogLayout = this;
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        if (tryOnMeasure(i, i2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
