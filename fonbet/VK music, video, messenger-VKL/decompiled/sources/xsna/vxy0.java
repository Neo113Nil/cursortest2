package xsna;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class vxy0 extends nuy0 {
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View view;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        whz0 whz0Var = this.k;
        r5z0 r5z0Var = this.l;
        phz0 phz0Var = this.g;
        View view2 = this.o;
        ldy0 ldy0Var = this.u;
        int i8 = this.F;
        auy0 auy0Var = this.d;
        int i9 = this.B;
        whz0 whz0Var2 = this.j;
        tjz0 tjz0Var = this.e;
        View view3 = this.p;
        if (i6 < i7) {
            if (auy0Var.getVisibility() == 0) {
                int i10 = i9 - i8;
                c1z0.m(i2 + i10, i6 - i10, auy0Var);
            } else {
                c1z0.m(i2 + i9, i6 - i9, ldy0Var);
            }
            c1z0.r(tjz0Var, i2, i);
            int i11 = i4 - this.G;
            Button button = this.q;
            c1z0.j(button, 0, i11 - button.getMeasuredHeight(), i3, i11);
            c1z0.j(whz0Var2, i, i2, i3, i4);
            TextView textView = this.s;
            int measuredHeight = (i9 / 2) + textView.getMeasuredHeight();
            TextView textView2 = this.r;
            if (textView2.getVisibility() == 0) {
                measuredHeight += textView2.getMeasuredHeight() + i9;
            }
            int i12 = i6 - (i9 * 2);
            int measuredWidth = ((i12 - textView2.getMeasuredWidth()) / 2) + i9;
            int measuredWidth2 = ((i12 - textView.getMeasuredWidth()) / 2) + i9;
            int bottom = whz0Var2.getBottom();
            if (measuredHeight < button.getTop() - bottom) {
                int top = (((button.getTop() - bottom) - measuredHeight) / 2) + bottom;
                c1z0.r(textView2, top, measuredWidth);
                c1z0.r(textView, c1z0.e(top, textView2.getBottom() + this.K), measuredWidth2);
            } else {
                c1z0.u(button.getTop() - i9, measuredWidth2, textView);
                textView2.layout(0, 0, 0, 0);
            }
            int top2 = textView2.getTop() > 0 ? textView2.getTop() : textView.getTop() > 0 ? textView.getTop() : button.getTop();
            c1z0.r(view2, tjz0Var.getTop(), tjz0Var.getLeft());
            c1z0.r(view3, top2 - i9, i);
            phz0Var.c(((double) (whz0Var2.getBottom() - view3.getTop())) > ((double) whz0Var2.getMeasuredHeight()) * 0.1d);
            int i13 = i4 - i9;
            c1z0.s(i13, i3 - i9, r5z0Var);
            c1z0.u(i13, i9, whz0Var);
            return;
        }
        int visibility = auy0Var.getVisibility();
        int i14 = this.J;
        if (visibility == 0) {
            int i15 = i14 - i8;
            view = view3;
            i5 = i7;
            c1z0.m(i2 + i15, i6 - i15, auy0Var);
        } else {
            i5 = i7;
            view = view3;
            c1z0.m(i2 + i14, i6 - i14, ldy0Var);
        }
        boolean c = c(i6);
        View view4 = this.L;
        if (!c) {
            c1z0.r(whz0Var, i14, i14);
            c1z0.u(i5, i, tjz0Var);
            c1z0.j(whz0Var2, i, i2, i3, i4);
            c1z0.j(view4, i, i2, i3, i4);
            this.n.layout(whz0Var2.getLeft(), whz0Var2.getTop(), whz0Var2.getRight(), whz0Var2.getBottom());
            view2.layout(0, 0, 0, 0);
            c1z0.r(view, tjz0Var.getTop(), tjz0Var.getLeft());
            phz0Var.c(true);
            c1z0.s(tjz0Var.getTop() - i9, i3 - i14, r5z0Var);
            return;
        }
        c1z0.j(whz0Var2, i, i2, whz0Var2.getMeasuredWidth() + i, i4);
        int measuredHeight2 = whz0Var.getMeasuredHeight();
        TextView textView3 = this.t;
        c1z0.g(i14, whz0Var2.getRight() + i14, c1z0.e(measuredHeight2, textView3.getMeasuredHeight()) + i8, i8, whz0Var, textView3);
        c1z0.j(view4, i, i2, i + (view4 != null ? view4.getMeasuredWidth() : 0), i4);
        tjz0Var.layout(whz0Var2.getRight(), i2, i3, i4);
        view2.layout(0, 0, 0, 0);
        phz0Var.c(false);
        int left = auy0Var.getVisibility() == 0 ? (auy0Var.getLeft() - i9) + i8 : ldy0Var.getVisibility() == 0 ? ldy0Var.getLeft() - i9 : i3 - i14;
        c1z0.m(i14, left, r5z0Var);
        c1z0.m(i14, left, r5z0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i7 = this.M;
        if (i7 <= 0 || (i6 = this.N) <= 0) {
            i3 = size;
        } else {
            float f = i7;
            float f2 = i6;
            float f3 = f / f2;
            float f4 = size;
            float f5 = f4 / f;
            float f6 = size2;
            if (Math.min(f5, f6 / f2) == f5 && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i4 = (int) (f4 / f3);
                i3 = size;
                whz0 whz0Var = this.j;
                c1z0.i(whz0Var, i3, i4, Integer.MIN_VALUE);
                int i8 = this.H;
                whz0 whz0Var2 = this.k;
                c1z0.i(whz0Var2, i8, i8, Integer.MIN_VALUE);
                int i9 = this.F * 2;
                int i10 = this.E;
                int i11 = i9 + i10;
                c1z0.i(this.d, i11, i11, 1073741824);
                ldy0 ldy0Var = this.u;
                c1z0.i(ldy0Var, i10, i10, 1073741824);
                r5z0 r5z0Var = this.l;
                c1z0.i(r5z0Var, i11, i11, 1073741824);
                TextView textView = this.t;
                View view = this.p;
                View view2 = this.o;
                tjz0 tjz0Var = this.e;
                TextView textView2 = this.s;
                TextView textView3 = this.r;
                if (size >= size2) {
                    tjz0Var.setVisibility(0);
                    view2.setVisibility(0);
                    view.setVisibility(0);
                    textView.setVisibility(8);
                    c1z0.i(tjz0Var, size - i10, size2, Integer.MIN_VALUE);
                    c1z0.i(view2, size, tjz0Var.getMeasuredHeight(), 1073741824);
                    if (whz0Var.getMeasuredHeight() * 1.6d > size2) {
                        textView3.setVisibility(8);
                        if (!TextUtils.isEmpty(textView2.getText())) {
                            textView2.setVisibility(0);
                        }
                    } else {
                        if (TextUtils.isEmpty(textView3.getText())) {
                            i5 = 8;
                            textView3.setVisibility(8);
                        } else {
                            textView3.setVisibility(0);
                            i5 = 8;
                        }
                        if (TextUtils.isEmpty(textView2.getText())) {
                            textView2.setVisibility(i5);
                        } else {
                            textView2.setVisibility(0);
                        }
                    }
                    int i12 = this.B;
                    int i13 = i12 * 2;
                    this.q.measure(View.MeasureSpec.makeMeasureSpec(((size - (i12 * 4)) - r5z0Var.getMeasuredWidth()) - whz0Var2.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.I, 1073741824));
                    int i14 = size - i13;
                    int i15 = size2 - i13;
                    c1z0.i(textView3, i14, i15, Integer.MIN_VALUE);
                    c1z0.i(textView2, i14, i15, Integer.MIN_VALUE);
                    c1z0.i(view, size, size2, 1073741824);
                    c1z0.i(ldy0Var, i10, i10, 1073741824);
                } else {
                    textView3.setVisibility(8);
                    textView2.setVisibility(8);
                    view2.setVisibility(8);
                    tjz0Var.setVisibility(0);
                    if (c(size)) {
                        textView.setVisibility(0);
                        c1z0.i(textView, size, size2, Integer.MIN_VALUE);
                        view.setVisibility(8);
                        View view3 = this.L;
                        int e = size - c1z0.e(view3 != null ? view3.getMeasuredWidth() : 0, whz0Var.getMeasuredWidth());
                        c1z0.i(tjz0Var, e, e, Integer.MIN_VALUE);
                    } else {
                        textView.setVisibility(8);
                        view.setVisibility(0);
                        c1z0.i(tjz0Var, size, size2, Integer.MIN_VALUE);
                    }
                    c1z0.i(view, tjz0Var.getMeasuredWidth(), tjz0Var.getMeasuredHeight(), 1073741824);
                }
                setMeasuredDimension(size, size2);
            }
            i3 = (int) (f6 * f3);
        }
        i4 = size2;
        whz0 whz0Var3 = this.j;
        c1z0.i(whz0Var3, i3, i4, Integer.MIN_VALUE);
        int i82 = this.H;
        whz0 whz0Var22 = this.k;
        c1z0.i(whz0Var22, i82, i82, Integer.MIN_VALUE);
        int i92 = this.F * 2;
        int i102 = this.E;
        int i112 = i92 + i102;
        c1z0.i(this.d, i112, i112, 1073741824);
        ldy0 ldy0Var2 = this.u;
        c1z0.i(ldy0Var2, i102, i102, 1073741824);
        r5z0 r5z0Var2 = this.l;
        c1z0.i(r5z0Var2, i112, i112, 1073741824);
        TextView textView4 = this.t;
        View view4 = this.p;
        View view22 = this.o;
        tjz0 tjz0Var2 = this.e;
        TextView textView22 = this.s;
        TextView textView32 = this.r;
        if (size >= size2) {
        }
        setMeasuredDimension(size, size2);
    }

    @Override // xsna.nuy0, xsna.ary0
    public void setBanner(@NonNull tez0 tez0Var) {
        super.setBanner(tez0Var);
        View view = this.L;
        if (view != null) {
            view.setVisibility(8);
        }
        this.n.setVisibility(8);
    }
}
