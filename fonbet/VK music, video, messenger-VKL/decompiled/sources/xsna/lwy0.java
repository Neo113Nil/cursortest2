package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class lwy0 extends nuy0 {
    public final int R;

    public lwy0(boolean z, tjz0 tjz0Var, gdy0 gdy0Var, phz0 phz0Var, View view, riz0 riz0Var, Context context) {
        super(tjz0Var, gdy0Var, phz0Var, view, riz0Var, context);
        if (z) {
            this.R = 0;
        } else {
            this.R = 1;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        int i8 = this.J;
        r5z0 r5z0Var = this.l;
        View view = this.p;
        View view2 = this.o;
        ldy0 ldy0Var = this.u;
        int i9 = this.F;
        auy0 auy0Var = this.d;
        int i10 = this.B;
        tjz0 tjz0Var = this.e;
        View view3 = this.L;
        if (i6 >= i7) {
            if (auy0Var.getVisibility() == 0) {
                int i11 = i8 - i9;
                c1z0.m(i2 + i11, i6 - i11, auy0Var);
            } else {
                c1z0.m(i2 + i8, i6 - i8, ldy0Var);
            }
            c1z0.u(i4, i, tjz0Var);
            c1z0.u(tjz0Var.getTop(), 0, view3);
            view2.layout(0, 0, 0, 0);
            c1z0.r(view, view3 != null ? view3.getBottom() : i4, 0);
            c1z0.s(tjz0Var.getTop() - i10, i3 - i8, r5z0Var);
            return;
        }
        if (auy0Var.getVisibility() == 0) {
            int i12 = i10 - i9;
            c1z0.m(i2 + i12, i6 - i12, auy0Var);
        } else {
            c1z0.m(i2 + i10, i6 - i10, ldy0Var);
        }
        c1z0.r(tjz0Var, i2, i);
        whz0 whz0Var = this.k;
        int measuredHeight = (i4 - whz0Var.getMeasuredHeight()) - i10;
        Button button = this.q;
        c1z0.j(button, 0, measuredHeight - button.getMeasuredHeight(), i3, measuredHeight);
        int i13 = this.R;
        if (i13 == 1) {
            c1z0.j(view3, i, tjz0Var.getBottom(), i3, i4);
        }
        int top = button.getTop() - i10;
        TextView textView = this.s;
        c1z0.j(textView, 0, top - textView.getMeasuredHeight(), i3, top);
        int top2 = (textView.getVisibility() == 0 ? textView.getTop() : top + textView.getMeasuredHeight()) - i10;
        TextView textView2 = this.r;
        c1z0.j(textView2, 0, top2 - textView2.getMeasuredHeight(), i3, top2);
        if (i13 == 0) {
            c1z0.j(view3, i, tjz0Var.getBottom(), i3, textView.getTop());
            if (view3 != null) {
                i5 = view3.getBottom();
                c1z0.r(view2, tjz0Var.getTop(), tjz0Var.getLeft());
                c1z0.r(view, i5, i);
                c1z0.s(i4 - i10, i3 - i10, r5z0Var);
                c1z0.u(i4 - i8, i8, whz0Var);
            }
        }
        i5 = i4;
        c1z0.r(view2, tjz0Var.getTop(), tjz0Var.getLeft());
        c1z0.r(view, i5, i);
        c1z0.s(i4 - i10, i3 - i10, r5z0Var);
        c1z0.u(i4 - i8, i8, whz0Var);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        r5z0 r5z0Var = this.l;
        View view = this.p;
        View view2 = this.L;
        TextView textView = this.r;
        View view3 = this.o;
        TextView textView2 = this.s;
        int i6 = this.B;
        int i7 = this.E;
        tjz0 tjz0Var = this.e;
        if (size < size2) {
            tjz0Var.setVisibility(0);
            view3.setVisibility(0);
            c1z0.i(tjz0Var, size - i7, size2, Integer.MIN_VALUE);
            c1z0.i(view3, size, tjz0Var.getMeasuredHeight(), 1073741824);
            if (TextUtils.isEmpty(textView.getText())) {
                i4 = 8;
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                i4 = 8;
            }
            if (TextUtils.isEmpty(textView2.getText())) {
                textView2.setVisibility(i4);
            } else {
                textView2.setVisibility(0);
            }
            Button button = this.q;
            int i8 = this.R;
            if (i8 == 0) {
                int i9 = i6 * 2;
                i5 = i6;
                button.measure(View.MeasureSpec.makeMeasureSpec(((size - (i6 * 4)) - r5z0Var.getMeasuredWidth()) - this.k.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.I, 1073741824));
                int i10 = size - i9;
                int i11 = size2 - i9;
                c1z0.i(textView, i10, i11, Integer.MIN_VALUE);
                c1z0.i(textView2, i10, i11, Integer.MIN_VALUE);
                view.setVisibility(0);
                c1z0.i(view, size, size2, 1073741824);
            } else {
                i5 = i6;
                view.setVisibility(8);
            }
            if (i8 == 1) {
                c1z0.i(view2, size, (size2 - view3.getMeasuredHeight()) - (i5 * 2), Integer.MIN_VALUE);
            } else if (i8 == 0) {
                c1z0.i(view2, size, ((((size2 - tjz0Var.getMeasuredHeight()) - textView.getMeasuredHeight()) - button.getMeasuredHeight()) - textView2.getMeasuredHeight()) - (i5 * 8), Integer.MIN_VALUE);
            }
            i3 = 1073741824;
        } else {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            view3.setVisibility(8);
            tjz0Var.setVisibility(0);
            view.setVisibility(0);
            c1z0.i(tjz0Var, size, size2, Integer.MIN_VALUE);
            i3 = 1073741824;
            c1z0.i(view, tjz0Var.getMeasuredWidth(), tjz0Var.getMeasuredHeight(), 1073741824);
            c1z0.i(view2, size, (size2 - tjz0Var.getMeasuredHeight()) - (i6 * 2), 1073741824);
        }
        c1z0.i(this.u, i7, i7, i3);
        int i12 = (this.F * 2) + i7;
        c1z0.i(this.d, i12, i12, i3);
        c1z0.i(r5z0Var, i12, i12, i3);
        setMeasuredDimension(size, size2);
    }

    @Override // xsna.nuy0, xsna.ary0
    public void setBanner(@NonNull tez0 tez0Var) {
        super.setBanner(tez0Var);
        this.g.c(true);
        View view = this.L;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
